package Basic_of_oops;

public class Books {
	private int noOfCopies;

	Books(int noOfCopies) {
		this.noOfCopies = noOfCopies;
		System.out.println(noOfCopies);
	}

	public int getnoOfCopies() {
		return noOfCopies;
	}

	public void increaseCopies(int howmuch) {

		setnoOfCopies(this.noOfCopies + howmuch);
		System.out.println(noOfCopies);
	}

	public void decreaseCopies(int howmuch) {
		setnoOfCopies(this.noOfCopies - howmuch);
		System.out.println(noOfCopies);
	}

	void read() {
		System.out.println("read books");
	}

	public void setnoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

}
