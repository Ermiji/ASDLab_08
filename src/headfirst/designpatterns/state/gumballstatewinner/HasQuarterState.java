package headfirst.designpatterns.state.gumballstatewinner;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
 
	public HasQuarterState() { }
  
	public GumballMachine insertQuarter(GumballMachine gumballMachine) {
		System.out.println("You can't insert another quarter");
		return gumballMachine;
	}
	
	public GumballMachine ejectQuarter(GumballMachine gumballMachine) {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		return gumballMachine;
	}
	
	public GumballMachine turnCrank(GumballMachine gumballMachine) {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		return gumballMachine;
	}

    public GumballMachine dispense(GumballMachine gumballMachine) {
        System.out.println("No gumball dispensed");
        return gumballMachine;
    }
    
    public GumballMachine refill(GumballMachine gumballMachine) {
    	return gumballMachine;
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
