package com.lalanju.statemachine.state;

import com.lalanju.statemachine.base.BaseState;
import com.lalanju.statemachine.base.BaseStateMachine;
import com.lalanju.statemachine.model.DataTransferPojo;

/**
 * @author lal chand sharma
 * @version 0.00001
 * Initialize state of StateMachine,
 * If you need to prepare any process before the action then use it.
 */
public class InitializationBaseState extends BaseState implements IInitializationBaseState {

    /**
     * Call Init function and
     * Initialize DataTransferPojo
     * @param dataTransferPojo data transfer
     */
    @Override
    public void init(DataTransferPojo dataTransferPojo) {
        System.out.println("Initialization BaseState init...");
        super.init(dataTransferPojo);
    }

    /**
     * If you need and active at starting then use it.
     */
    @Override
    public void start() {
        System.out.println("Initialization BaseState start...");
        process();
    }

    /**
     * Start State process
     */
    @Override
    public void process() {
        System.out.println("Initialization BaseState process...");
        stop();
    }

    /**
     * Stop state process and movie in another state
     */
    @Override
    public void stop() {
        System.out.println("Initialization BaseState Stop...");
        movieInNextState(BaseStateMachine.State.ACTION);
    }
}
