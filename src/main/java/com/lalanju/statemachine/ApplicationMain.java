package com.lalanju.statemachine;

import com.lalanju.statemachine.base.IStateMachine;
import com.lalanju.statemachine.machine.StateMachine;
import com.lalanju.statemachine.model.DataTransferPojo;

/**
 * @author lal chand sharma
 * @version 0.00001
 * Main Application class
 */
public class ApplicationMain {

    public static void main(String[] args) {

        IStateMachine stateMachine = new StateMachine();
        DataTransferPojo dataTransferPojo = new DataTransferPojo(stateMachine);
        stateMachine.init(dataTransferPojo);

    }
}
