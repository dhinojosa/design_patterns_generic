# Use a base image with a Linux distribution
FROM mcr.microsoft.com/vscode/devcontainers/base:ubuntu



# Install dependencies
RUN apt-get update && apt-get install -y \
    curl \
    tar \
    unzip \
    && apt-get clean -y && rm -rf /var/lib/apt/lists/*

USER root

# Download and install OpenJDK 22
RUN curl -L -o openjdk-22.0.1_linux-x64_bin.tar.gz https://download.java.net/java/GA/jdk22.0.1/c7ec1332f7bb44aeba2eb341ae18aca4/8/GPL/openjdk-22.0.1_linux-x64_bin.tar.gz \
    && tar -xzf openjdk-22.0.1_linux-x64_bin.tar.gz -C /usr/local/ \
    && rm openjdk-22.0.1_linux-x64_bin.tar.gz \
    && mv /usr/local/jdk-22.0.1 /usr/local/openjdk-22

# Set JAVA_HOME environment variable
ENV JAVA_HOME=/usr/local/openjdk-22
ENV PATH=${JAVA_HOME}/bin:${PATH}

# Download and install Maven
RUN MAVEN_VERSION=3.9.8 \
    && curl -L -o apache-maven-bin.tar.gz https://downloads.apache.org/maven/maven-$(echo $MAVEN_VERSION | cut -d'.' -f1)/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz \
    && tar -xzf apache-maven-bin.tar.gz -C /usr/local/ \
    && rm apache-maven-bin.tar.gz \
    && mv /usr/local/apache-maven-$MAVEN_VERSION /usr/local/maven

# Set MAVEN_HOME environment variable
ENV MAVEN_HOME=/usr/local/maven
ENV PATH=${MAVEN_HOME}/bin:${PATH}

# Switch to vscode user
USER vscode