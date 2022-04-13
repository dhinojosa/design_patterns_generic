package com.xyzcorp.javapatterns.state.classic;

public class OffState implements SwitchState {
    private final SwitchStateContext context;

    public OffState(SwitchStateContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        context.setState(new OnState(context));
    }

}
