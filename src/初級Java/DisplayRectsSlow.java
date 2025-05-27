package 初級Java;

public class DisplayRectsSlow extends MyFrame {
	public void run() {
		setColor(0, 0, 0);
		int x = 30;
		while (x <= 170) {

			for (int i = -30; i <= 0; i++) {
				fillRect(x, 80 + x + i, 10, 100);
				sleep(0.018);
			}
			x += 20;
			sleep(0.01);
		}

	}
}
