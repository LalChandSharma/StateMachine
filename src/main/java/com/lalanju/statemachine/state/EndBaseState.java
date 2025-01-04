package com.lalanju.statemachine.state;

import com.lalanju.statemachine.base.BaseState;
import com.lalanju.statemachine.model.DataTransferPojo;

/**
 * @author lal chand sharma
 * @version 0.00001
 * End/Stop process state of StateMachine
 */
public class EndBaseState extends BaseState implements IEndBaseState {

    /**
     * Call Init function and
     * Initialize DataTransferPojo
     * @param dataTransferPojo data transfer
     */
    @Override
    public void init(DataTransferPojo dataTransferPojo) {
        System.out.println("EndBaseState init...");
        super.init(dataTransferPojo);
    }

    /**
     * If you need and active at starting then use it.
     */
    @Override
    public void start() {
        System.out.println("EndBaseState start...");
        process();
    }

    /**
     * Start State process
     */
    @Override
    public void process() {
        System.out.println("EndBaseState process...");
        stop();
    }

    /**
     * Stop state process and movie in another state and stop
     */
    @Override
    public void stop() {
        System.out.println("EndBaseState stop...");
        stopProcess();
    }
}
