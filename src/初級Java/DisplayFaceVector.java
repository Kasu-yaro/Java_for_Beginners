package 初級Java;

import java.util.Vector;

public class DisplayFaceVector extends MyFrame {
	public void run() {
		Vector<Face> faces = new Vector<Face>();
		/*
		*faces.add(new Face(50, 50, 10, 5));
		*faces.add(new Face(200, 100, -10, -5));
		*/

		/*
		faces.add(new Face(50, 50, 1 + (2 * x), 0));
		faces.add(new Face(50, 100, 2 + (2 * x), 0));
		faces.add(new Face(50, 150, 3 + (2 * x), 0));
		faces.add(new Face(50, 200, 4 + (2 * x), 0));
		faces.add(new Face(50, 250, 5 + (2 * x), 0));
		*/

		/*
		faces.add(new Face(50, 50, 1, 0));
		faces.add(new Face(50, 100, 2 , 0));
		faces.add(new Face(50, 150, 3 , 0));
		faces.add(new Face(50, 200, 4 , 0));
		faces.add(new Face(50, 250, 5 , 0));
		*/
		for (int i = 0; i <= 10; i++) {
			faces.add(new Face(50, -100 + 10 * i, 1 + i, 0));

		}

		for (int x = 0; x < 30; x++) {
			/*
			faces.add(new Face(50, 50, 1 + (2 * x), 0));
			faces.add(new Face(50, 100, 2 + (2 * x), 0));
			faces.add(new Face(50, 150, 3 + (2 * x), 0));
			faces.add(new Face(50, 200, 4 + (2 * x), 0));
			faces.add(new Face(50, 250, 5 + (2 * x), 0));
			*/
			for (int i = 0; i <= 50; i++) {
				clear();
				for (int j = 0; j < faces.size(); j++) {
					faces.get(j).draw(this);
					faces.get(j).move();
				}
				sleep(0.01);

			}
			//faces.clear();

		}

	}

}
