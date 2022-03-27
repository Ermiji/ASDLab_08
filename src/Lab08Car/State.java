package Lab08Car;

public abstract class State {

	private Car car;
	
	public State(Car car) {
		this.car = car;
	}
	public int shift(int speed) {
		int shift = SpeedChecker.shift(speed);
		switch (shift) {
		case 0:
			car.setState(car.getSpeedZeroState());
			break;
		case 1:
			car.setState(car.getSpeedBetweenZeroAndFiveState());
			break;
		case 2:
			car.setState(car.getSpeedBetweenFiveAndTenState());
			break;
		case 3:
			car.setState(car.getSpeedBetweenTenAndThirtyState());
			break;
		case 4:
			car.setState(car.getSpeedBetweenThirtyAndFiftyFiveState());
			break;
		case 5:
			car.setState(car.getSpeedGreaterThanFiftyFiveState());
		}
		return shift;
	}
}
