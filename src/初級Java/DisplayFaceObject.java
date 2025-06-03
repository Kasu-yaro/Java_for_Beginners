package 初級Java;

public class DisplayFaceObject extends MyFrame {
	public void run() {
		Face face1 = new Face(-100, 50, 50, 0);
		Face face2 = new Face(1200, 100, -50, 0);

		for (int j = 0; j <= 100; j++) {
			face1.x = -100;
			face2.x = 1200;
			for (int i = 0; i <= 40; i++) {
				clear();
				face1.draw(this);
				face2.draw(this);

				face1.move();
				face2.move();

				sleep(0.009);
			}
		}

	}

}
