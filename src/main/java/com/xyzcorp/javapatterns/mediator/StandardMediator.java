package com.xyzcorp.javapatterns.mediator;

public class StandardMediator implements Mediator {
    private Component spouseInfoWidget;
    private Component childrenInfoWidget;
    private Component usInfoWidget;

    @Override
    public void setUSCitizen(boolean isUSCitizen) {
        if (usInfoWidget != null) {
            if (isUSCitizen) {
                usInfoWidget.setEnabled(true);
            } else {
                usInfoWidget.setEnabled(false);
            }
        }
    }

    @Override
    public void setNumberChildren(int children) {
        if (childrenInfoWidget != null) {
            if (children > 0) {
                childrenInfoWidget.setEnabled(true);
            } else {
                childrenInfoWidget.setEnabled(false);
            }
        }
    }

    @Override
    public void setMarried(boolean isMarried) {
        if (spouseInfoWidget != null) {
            if (isMarried) {
                spouseInfoWidget.setEnabled(true);
            } else {
                spouseInfoWidget.setEnabled(false);
            }
        }
    }

    @Override
    public void registerSpouseInfoWidget(Component component) {
        this.spouseInfoWidget = component;
    }

    @Override
    public void registerChildrenInfoWidget(Component component) {
        this.childrenInfoWidget = component;
    }

    @Override
    public void registerUSInfoWidget(Component component) {
        this.usInfoWidget = component;
    }
}
