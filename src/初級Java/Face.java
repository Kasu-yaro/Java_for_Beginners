package 初級Java;

public class Face {
	int x, y, vx, vy;

	public Face(int x, int y, int vx, int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	public void draw(MyFrame frame) {

		//顔のやつ
		//frame.fillOval(x, y, 50, 100);
		//frame.fillOval(x + 100, y, 50, 100);
		//frame.fillRect(x, y + 160, 150, 10);

		//車のやつ
		frame.fillRect(x + 100, y + 100, 75, 30);
		frame.fillRect(x + 60, y + 130, 150, 30);
		frame.fillOval(x, y + 160, 120, 120);
		frame.fillOval(x + 150, y + 160, 120, 120);

	}

	public void move() {

		x += vx;
		y += vy;

		if (x >= 1600) {
			x = -200;
			v_move();
		}

	}

	public void v_move() {

		vx += 10;

	}

}
