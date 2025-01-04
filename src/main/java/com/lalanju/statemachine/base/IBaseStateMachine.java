package com.lalanju.statemachine.base;

import com.lalanju.statemachine.model.DataTransferPojo;

public interface IBaseStateMachine {

    void init(DataTransferPojo dataTransferPojo);
    void start();
    void stop();

}
