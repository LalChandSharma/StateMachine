package com.lalanju.statemachine.base;

import com.lalanju.statemachine.model.DataTransferPojo;

/**
 * @author lal chand sharma
 * @version 0.00001
 * BaseState of state class's
 */
public abstract class BaseState {

    private DataTransferPojo dataTransferPojo;

    /**
     * Call first init function and initialization DataTransferPojo
     * @param dataTransferPojo data transfer
     */
    protected void init(DataTransferPojo dataTransferPojo) {
        this.dataTransferPojo = dataTransferPojo;
    }

    /**
     * Create StateMachine request for update current state to another state
     * @param nextState next state
     */
    protected void movieInNextState(BaseStateMachine.State nextState) {
        dataTransferPojo.getStateMachine().next(nextState);
    }

    /**
     * Create StateMachine stop process request
     */
    protected void stopProcess(){
        dataTransferPojo.getStateMachine().stop();
    }

}
