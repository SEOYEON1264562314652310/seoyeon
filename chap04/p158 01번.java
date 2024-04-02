package chap04;

class Printer {
	int num0fPapers = 0;

	public void print(int amount) {
		num0fPapers -= amount;
	}
}

public class PrinterTest {
	public static void main(String[] args) {

		Printer p = new Printer();
		p.num0fPapers = 100;
		p.print(70);
		System.out.println(p.num0fPapers);
	}

}
