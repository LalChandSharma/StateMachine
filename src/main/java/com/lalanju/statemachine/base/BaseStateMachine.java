package com.lalanju.statemachine.base;

import com.lalanju.statemachine.model.DataTransferPojo;
import com.lalanju.statemachine.state.ActionBaseState;
import com.lalanju.statemachine.state.EndBaseState;
import com.lalanju.statemachine.state.InitializationBaseState;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseStateMachine implements IStateMachine {

    private Map<State, IBaseStateMachine> states;

    private IBaseStateMachine currentProcessState;

    private DataTransferPojo dataTransferPojo;

    /**
     * Default Constructor call and
     * Start StateMachine preparation
     */
    public BaseStateMachine() {
        prepareStateMachine();
    }

    /**
     * Prepare states of StateMachine
     * And set initial initializing state
     */
    private void prepareStateMachine(){
        if(states == null || currentProcessState == null || states.isEmpty()){
            states = new HashMap<>();
            states.put(State.INITIAL, new InitializationBaseState());
            states.put(State.ACTION, new ActionBaseState());
            states.put(State.END, new EndBaseState());
        }

        currentProcessState = states.get(State.INITIAL);

    }

    /**
     * Update Data transfer pojo details of StateMachine
     * @param dataTransferPojo State transfer details
     */
    protected void updateDataTransfer(DataTransferPojo dataTransferPojo){
        this.dataTransferPojo = dataTransferPojo;
    }

    /**
     *
     * @return DataTransferPojo
     */
    protected DataTransferPojo getDataTransfer(){
        return this.dataTransferPojo;
    }

    /**
     * Get current active process state in StateMachine
     * @return Set current active process state
     */
    protected IBaseStateMachine getCurrentProcessState(){
        return currentProcessState;
    }

    /**
     * Update state in StateMachine
     * @param state new state
     */
    protected void updateState(State state){
        if(states.containsKey(state)){
            currentProcessState = states.get(state);
        }
    }

    /**
     * StateMachine states enum
     */
    public enum State {
        INITIAL,ACTION,END
    }
}
