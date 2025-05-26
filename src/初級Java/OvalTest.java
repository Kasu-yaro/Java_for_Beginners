package 初級Java;

public class OvalTest extends MyFrame {
	public void run() {
		fillOval(30, 40, 50, 100);

		for (int i = 0; i <= 10; i++) {
			fillOval(130 + (i * 10), 40, 0 + (i * 5), 100);

		}

		fillRect(30, 200, 150, 10);



	}

}
