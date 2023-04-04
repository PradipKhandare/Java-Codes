package Encapsulation;

public class Student extends School {

	// Properties:---->variables
	String StudentName = "Pradip";
	int RollNumber = 16;
	private int AtmPin = 9876;

	// getter method for Atm pin:
	public int getAtmPin() {
		return AtmPin;
	}

	public void setAtmPin(int NewPin) {
		this.AtmPin = NewPin;
	}
}
