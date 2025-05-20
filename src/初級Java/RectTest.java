package 初級Java;

public class RectTest extends MyFrame {
	public void run() {

		fillRect(30, 40, 50, 100);

		for (int j = 0; j <= 10; j++) {
			for (int i = 0; i <= 10; i++) {
				fillRect(90 + (i * 35), 160 + (j * 35), 30, 30);
			}
		}

	}
}
