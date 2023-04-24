package Encapsulation;

public class AgeInfo {

	public static void main(String[] args) {
		AgeDetails agd = new AgeDetails();
		int age2 = agd.getAge();
		System.out.println("Age is : " + age2);

		agd.setAge(12);
		System.out.println(agd.getAge());

	}

}
