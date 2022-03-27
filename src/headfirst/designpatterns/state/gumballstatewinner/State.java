package headfirst.designpatterns.state.gumballstatewinner;

public interface State {
 
	public GumballMachine insertQuarter(GumballMachine gumballMachine);
	public GumballMachine ejectQuarter(GumballMachine gumballMachine);
	public GumballMachine turnCrank(GumballMachine gumballMachine);
	public GumballMachine dispense(GumballMachine gumballMachine);
	
	public GumballMachine refill(GumballMachine gumballMachine);
}
