package headfirst.designpatterns.state.gumballstatewinner;

public class WinnerState implements State {
    GumballMachine gumballMachine;
 
    public WinnerState() { }
 
	public GumballMachine insertQuarter(GumballMachine gumballMachine) {
		System.out.println("Please wait, we're already giving you a Gumball");
		return gumballMachine;
	}
 
	public GumballMachine ejectQuarter(GumballMachine gumballMachine) {
		System.out.println("Please wait, we're already giving you a Gumball");
		return gumballMachine;
	}
 
	public GumballMachine turnCrank(GumballMachine gumballMachine) {
		System.out.println("Turning again doesn't get you another gumball!");
		return gumballMachine;
	}
 
	public GumballMachine dispense(GumballMachine gumballMachine) {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
		return gumballMachine;
	}
 
	public GumballMachine refill(GumballMachine gumballMachine) { 
		return gumballMachine;
	}
	
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
