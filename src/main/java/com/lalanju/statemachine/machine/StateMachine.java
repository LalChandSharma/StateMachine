package com.lalanju.statemachine.machine;

import com.lalanju.statemachine.base.BaseStateMachine;
import com.lalanju.statemachine.model.DataTransferPojo;

/**
 * @author lal chand sharma
 * @version 0.00001
 * StateMachine manage data initialization, prepared state process and manage state cycle
 */
public class StateMachine extends BaseStateMachine {

    /**
     * StateMachine data initialization
     * And update Data transfer values
     * After complete all process then start StateMachine
     * @param dataTransferPojo data transfer
     */
    @Override
    public void init(DataTransferPojo dataTransferPojo) {
        System.out.println("StateMachine init...");
        updateDataTransfer(dataTransferPojo);
        start();
    }

    /**
     * Start StateMachine process
     * And call states
     */
    @Override
    public void start() {
          System.out.println("StateMachine start...");
          getCurrentProcessState().init(getDataTransfer());
          getCurrentProcessState().start();
    }

    /**
     * If you need to be change states then call this function/method
     * @param state movie next state
     */
    @Override
    public void next(State state) {
        System.out.println("StateMachine next..."+state);
        updateState(state);
        getCurrentProcessState().init(getDataTransfer());
        getCurrentProcessState().start();
    }

    /**
     * Stop StateMachine process
     * And if you need any data prepared and process after complete process
     * Then set process in this function
     */
    @Override
    public void stop() {
        System.out.println("StateMachine stop...");
    }
}
