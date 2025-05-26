package 初級Java;

public class OvalTest extends MyFrame {
	public void run() {
		fillOval(30, 40, 50, 100);

		for (int i = 0; i <= 10; i++) {
			fillOval(130 + (i * 10), 40, 0 + (i * 5), 100);

		}

		fillRect(30, 200, 150, 10);

		fillRect(200, 200, 75, 30);
		fillRect(160, 230, 150, 30);
		fillOval(100, 260, 120, 120);
		fillOval(250, 260, 120, 120);

	}

}
