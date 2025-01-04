package com.lalanju.statemachine.base;

public interface IStateMachine extends IBaseStateMachine{

    void next(BaseStateMachine.State state);

}
