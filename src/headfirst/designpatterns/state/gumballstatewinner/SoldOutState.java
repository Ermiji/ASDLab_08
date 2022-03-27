package headfirst.designpatterns.state.gumballstatewinner;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
 
    public SoldOutState() { }
 
	public GumballMachine insertQuarter(GumballMachine gumballMachine) {
		System.out.println("You can't insert a quarter, the machine is sold out");
		return gumballMachine;
	}
 
	public GumballMachine ejectQuarter(GumballMachine gumballMachine) {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
		return gumballMachine;
	}
 
	public GumballMachine turnCrank(GumballMachine gumballMachine) {
		System.out.println("You turned, but there are no gumballs");
		return gumballMachine;
	}
 
	public GumballMachine dispense(GumballMachine gumballMachine) {
		System.out.println("No gumball dispensed");
		return gumballMachine;
	}
	
	public GumballMachine refill(GumballMachine gumballMachine) { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		return gumballMachine;
	}
 
	public String toString() {
		return "sold out";
	}
}
