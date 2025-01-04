package com.lalanju.statemachine.state;

import com.lalanju.statemachine.base.BaseState;
import com.lalanju.statemachine.base.BaseStateMachine;
import com.lalanju.statemachine.model.DataTransferPojo;

/**
 * @author lal chand sharma
 * @version 0.00001
 * Action state of StateMachine
 */
public class ActionBaseState extends BaseState implements IActionBaseState {

    /**
     * Call Init function and
     * Initialize DataTransferPojo
     * @param dataTransferPojo data transfer
     */
    @Override
    public void init(DataTransferPojo dataTransferPojo) {
        System.out.println("ActionBaseState init...");
        super.init(dataTransferPojo);
    }

    /**
     * If you need and active at starting then use it.
     */
    @Override
    public void start() {
        System.out.println("ActionBaseState start...");
        process();
    }

    /**
     * Start State process
     */
    @Override
    public void process() {
        System.out.println("ActionBaseState process...");
        stop();
    }


    /**
     * Stop state process and movie in another state
     */
    @Override
    public void stop() {
        System.out.println("ActionBaseState stop...");
        movieInNextState(BaseStateMachine.State.END);
    }
}
