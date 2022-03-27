package headfirst.designpatterns.state.gumballstatewinner;

public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
 
	State state = soldOutState;
	int count = 0;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState();
		noQuarterState = new NoQuarterState();
		hasQuarterState = new HasQuarterState();
		soldState = new SoldState();
		winnerState = new WinnerState();

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
 
	public GumballMachine insertQuarter() {
		return state.insertQuarter(this);
	}
 
	public GumballMachine ejectQuarter() {
		return state.ejectQuarter(this);
	}
 
	public GumballMachine turnCrank() {
		state.turnCrank(this);
		return state.dispense(this);
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	GumballMachine refill(int count) {
		this.count += count;
		System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
		return state.refill(this);
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
