package Lab08Car;

public class Car{
	State speedZeroState;
	State speedBetweenZeroAndFiveState;
	State speedBetweenFiveAndTenState;
	State speedBetweenTenAndThirtyState;
	State speedBetweenThirtyAndFiftyFiveState;
	State SpeedGreaterThanFiftyFiveState;
	
	State state = speedZeroState;
	public Car() {
		speedZeroState = new SpeedZeroState(this);
		speedBetweenZeroAndFiveState = new SpeedBetweenZeroAndFiveState(this);
		speedBetweenFiveAndTenState = new SpeedBetweenFiveAndTenState(this);
		speedBetweenTenAndThirtyState = new SpeedBetweenTenAndThirtyState(this);
		speedBetweenThirtyAndFiftyFiveState = new SpeedBetweenThirtyAndFiftyFiveState(this);
		SpeedGreaterThanFiftyFiveState = new SpeedGreaterThanFiftyFiveState(this);
		this.state = speedZeroState;
	}
	
    public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getSpeedZeroState() {
		return speedZeroState;
	}

	public State getSpeedBetweenZeroAndFiveState() {
		return speedBetweenZeroAndFiveState;
	}

	public State getSpeedBetweenFiveAndTenState() {
		return speedBetweenFiveAndTenState;
	}

	public State getSpeedBetweenTenAndThirtyState() {
		return speedBetweenTenAndThirtyState;
	}

	public State getSpeedBetweenThirtyAndFiftyFiveState() {
		return speedBetweenThirtyAndFiftyFiveState;
	}

	public State getSpeedGreaterThanFiftyFiveState() {
		return SpeedGreaterThanFiftyFiveState;
	}

	public int changeSpeed(int speed){
	    return state.shift(speed);
    }
}
    
