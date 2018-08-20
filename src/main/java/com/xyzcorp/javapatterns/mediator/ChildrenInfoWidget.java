package com.xyzcorp.javapatterns.mediator;

public class ChildrenInfoWidget implements Component {
    private boolean enabled;

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
