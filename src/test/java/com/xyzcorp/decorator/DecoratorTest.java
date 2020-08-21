package com.xyzcorp.decorator;

import org.junit.jupiter.api.Test;

import java.awt.Color;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    public class Camera {
        private Color color;

        public Camera(Color color) {
            Objects.requireNonNull(color, "We must color");
            this.color = color;
        }

        public Camera decorate(List<Function<Color, Color>> filters) {
           Function<Color, Color> colorFilters = filters.stream()
                                                        .reduce(Function::compose)
                                                        .orElse(color -> color);
           return new Camera(colorFilters.apply(color));
        }

        public Color getColor() {
            return color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Camera camera = (Camera) o;
            return Objects.equals(color, camera.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Camera{");
            sb.append("color=").append(color);
            sb.append('}');
            return sb.toString();
        }
    }


    @Test
    void testFilter() {
        Camera camera = new Camera(Color.CYAN);
        Camera newCamera = camera.decorate(List.of(Color::darker, Color::darker));

        System.out.println(camera);
        System.out.println(newCamera);
    }


    @Test
    void testFilterWithNoFilters() {
        Camera camera = new Camera(Color.CYAN);
        Camera newCamera = camera.decorate(List.of());

        assertEquals(camera, newCamera);
    }
}
