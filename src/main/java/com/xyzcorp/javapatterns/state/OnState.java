package com.xyzcorp.javapatterns.state;

public class OnState implements SwitchState {

    private SwitchStateContext context;

    public OnState(SwitchStateContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.setState(new OffState(context));
    }
}
