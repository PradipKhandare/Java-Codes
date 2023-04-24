package Encapsulation;

public class AgeDetails {

	private int Age = 20;
	private String Name = "Pradip";

	public int getAge() {
		return Age;

	}

	public void setAge(int age) {
		if (age >= 18) {
			this.Age = age;
			System.out.println("You are Mature. But still you can change your age: ");

		} else {
			System.out.println("you are minor, please enter age which is above or equal to 18 . ");
			this.Age = age;
		}
	}

	public static void main(String[] args) {

	}

}
