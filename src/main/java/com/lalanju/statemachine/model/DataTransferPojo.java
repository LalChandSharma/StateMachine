package com.lalanju.statemachine.model;

import com.lalanju.statemachine.base.IStateMachine;

/**
 * @author lal chand sharma
 * @version 0.00001
 * StateMachine action as Machine then need to be data transfer Machine one state to another state
 * Using of this class of Data transfer handle
 */
public class DataTransferPojo {

    private final IStateMachine stateMachine;

    /**
     * Handle StateMachine
     * @param stateMachine stateMachine
     */
    public DataTransferPojo(IStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    /**
     * Get stateMachine
     * @return StateMachine reference
     */
    public IStateMachine getStateMachine() {
        return stateMachine;
    }
}
