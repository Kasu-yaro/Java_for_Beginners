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

		for (int j = 0; j <= 50; j++) {

			int C = 0;
			int X = 255;

			for (int i = 0; i <= 50; i++) {

				//setColor(255 - (i * 30), 255 - (i * 30), C*10);
				//fillRect(10+(i * 15), 160 + (j * 15), 15, 15);

				if (C <= 255) {
					setColor(C, C, C);
					fillRect(10 + (i * 15), 160 + (j * 15), 15, 15);
					C += 10;
				} else {
					setColor(X, X, X);
					fillRect(10 + (i * 15), 160 + (j * 15), 15, 15);
					X -= 10;

				}
			}
		}

	}
}
