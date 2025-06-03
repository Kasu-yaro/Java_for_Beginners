package 初級Java;

public class DisplayFaceObject extends MyFrame {
	public void run() {
		Face[] faces = new Face[100];
		//Face face = new Face(-100, 50, 50, 0);
		//Face face2 = new Face(1200, 100, -50, 0);

		for (int i = 0; i < faces.length; i++) {

			faces[i] = new Face(-100, 50 + 50 * i, 50, 0);
		}
		for (int i = 0; i < faces.length; i++) {
			faces[i] = new Face(1200, 100 + 100 * i, -50, 0);
		}

		for (int j = 0; j <= 100; j++) {
			for (int v = 0; v <= 40; v++) {
				clear();
				for (int i = 0; i < faces.length; i++) {
					faces[i].draw(this);

				}
				for (int i = 0; i < faces.length; i++) {
					faces[i].move();
				}

				sleep(0.018);
			}
		}

	}

}
