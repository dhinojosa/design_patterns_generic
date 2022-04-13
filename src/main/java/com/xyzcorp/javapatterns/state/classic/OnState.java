package com.xyzcorp.javapatterns.state.classic;

public class OnState implements SwitchState {

    private final SwitchStateContext context;

    public OnState(SwitchStateContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.setState(new OffState(context));
    }
}
