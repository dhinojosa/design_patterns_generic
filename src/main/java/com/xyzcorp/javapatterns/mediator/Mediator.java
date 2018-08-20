package com.xyzcorp.javapatterns.mediator;

public interface Mediator {
    void setUSCitizen(boolean isUSCitizen);
    void setNumberChildren(int children);
    void setMarried(boolean isMarried);
    void registerSpouseInfoWidget(Component component);
    void registerChildrenInfoWidget(Component component);
    void registerUSInfoWidget(Component component);
}
