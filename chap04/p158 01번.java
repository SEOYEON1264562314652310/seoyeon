class Printer {
	int numOfPapers = 0;
	public void print(int amount) {
		numOfPapers -= amount;
	}
}

public class PrinterTest {
	public static void main(String[] args) {
		Printer p = new Printer();
		p.numOfPapers = 100;
		p.print(70);
		System.out.println(p.numOfPapers);
	}

}
