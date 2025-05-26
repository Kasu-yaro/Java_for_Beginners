package 初級Java;

public class RectTest extends MyFrame {
	public void run() {
		setColor(255, 255, 0);
		fillRect(30, 40, 50, 100);

		setColor(255, 0, 255);
		fillRect(130, 40, 50, 100);

		setColor(0, 255, 255);
		fillRect(230, 40, 50, 100);

		setColor(0, 0, 0);
		fillRect(330, 40, 50, 100);

		setColor(100, 100, 100);
		fillRect(360, 40, 50, 100);

		for (int j = 0; j <= 100; j++) {
			for (int i = 0; i <= 100; i++) {
				setColor(255 - (i * 10), 255 - (i * 10), 255 - (i * 10));
				fillRect(90 + (i * 35), 160 + (j * 35), 30, 30);
			}
		}

	}
}
