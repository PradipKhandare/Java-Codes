package oops_practice;

public class Employee {
	// Properties means variables.
	String ename;
	int eid;
	double salary;

	// Behaviour means methods.
	public void work() {
		System.out.println(ename + "is working");

	}

	public void details() {
		System.out.println("employee name = " + ename);
		System.out.println("employee id = " + eid);
		System.out.println("employee salary = " + salary);
	}

	emp(String n, int i, double s)
    {
	this.ename = n;
	this.eid = i;
	this.salary = s;
    }

}
