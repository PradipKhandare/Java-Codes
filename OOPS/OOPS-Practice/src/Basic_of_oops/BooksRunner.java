package Basic_of_oops;

public class BooksRunner {

	public static void main(String[] args) {
		Books artofComputerPrograming = new Books(1000);
		Books effectiveJava = new Books(1000);
		Books cleanCode = new Books(1000);
		artofComputerPrograming.read();
		effectiveJava.read();
		cleanCode.read();
		artofComputerPrograming.setnoOfCopies(500);
		effectiveJava.setnoOfCopies(200);
		cleanCode.setnoOfCopies(300);
		System.out.println(artofComputerPrograming.getnoOfCopies());
		cleanCode.increaseCopies(300);
		artofComputerPrograming.increaseCopies(100);
		effectiveJava.increaseCopies(400);
		cleanCode.decreaseCopies(300);
		artofComputerPrograming.decreaseCopies(100);
		effectiveJava.decreaseCopies(1000);

		// TODO Auto-generated method stub

	}

}
