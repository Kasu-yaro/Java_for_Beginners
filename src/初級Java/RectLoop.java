package 初級Java;

public class RectLoop extends MyFrame {
	public void run() {

		for (int y = 0; y < 100; y++) {

			for (int x = 0; x < 100; x++) {
				fillRect(20 * x, 80 + 20 * y, 10, 10);

			}
		}
	}

}
