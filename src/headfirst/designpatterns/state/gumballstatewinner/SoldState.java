package headfirst.designpatterns.state.gumballstatewinner;

public class SoldState implements State {
    GumballMachine gumballMachine;
 
    public SoldState() { }
       
	public GumballMachine insertQuarter(GumballMachine gumballMachine) {
		System.out.println("Please wait, we're already giving you a gumball");
		return gumballMachine;
	}
 
	public GumballMachine ejectQuarter(GumballMachine gumballMachine) {
		System.out.println("Sorry, you already turned the crank");
		return gumballMachine;
	}
 
	public GumballMachine turnCrank(GumballMachine gumballMachine) {
		System.out.println("Turning twice doesn't get you another gumball!");
		return gumballMachine;
	}
	
	public GumballMachine dispense(GumballMachine gumballMachine) {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		return gumballMachine;
	}
	
	public GumballMachine refill(GumballMachine gumballMachine) { 
		return gumballMachine;
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}
