package headfirst.designpatterns.state.gumballstatewinner;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState() { }
	
	public GumballMachine insertQuarter(GumballMachine gumballMachine) {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		return gumballMachine;
	}
 
	public GumballMachine ejectQuarter(GumballMachine gumballMachine) {
		System.out.println("You haven't inserted a quarter");
		return gumballMachine;
	}
 
	public GumballMachine turnCrank(GumballMachine gumballMachine) {
		System.out.println("You turned, but there's no quarter");
		return gumballMachine;
	 }
 
	public GumballMachine dispense(GumballMachine gumballMachine) {
		System.out.println("You need to pay first");
		return gumballMachine;
	} 
	
	public GumballMachine refill(GumballMachine gumballMachine) { 
		return gumballMachine;
	}
 
	public String toString() {
		return "waiting for quarter";
	}
}
