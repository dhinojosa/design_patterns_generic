package com.xyzcorp.javapatterns.state;

public class SwitchStateFactory {
    private SwitchStateContext switchStateContext;
    private SwitchState onState;
    private SwitchState offState;

    public SwitchStateFactory(SwitchStateContext switchStateContext) {
        this.switchStateContext = switchStateContext;
    }

    protected SwitchState getOnState() {
        if (this.onState == null) {
            this.onState = new SwitchState() {
                @Override
                public void execute() {
                    switchStateContext.setState(getOffState());
                }

                @Override
                public String toString() {
                    return "on";
                }
            };
        }
        return onState;
    }

    protected SwitchState getOffState() {
        if (this.offState == null) {
            this.offState = new SwitchState() {
                @Override
                public void execute() {
                    switchStateContext.setState(getOnState());
                }

                @Override
                public String toString() {
                    return "off";
                }
            };
        }
        return offState;
    }
}
