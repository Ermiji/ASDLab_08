package headfirst.designpatterns.state.gumballstatewinner;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(10);

		System.out.println(gumballMachine);

		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();
		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();
		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();
		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();
		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();
		gumballMachine = gumballMachine.insertQuarter();
		gumballMachine = gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
