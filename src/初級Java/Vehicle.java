package 初級Java;

public class Vehicle {
	int x, y, vx, vy;

	public Vehicle(int x, int y, int vx, int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;

	}

	public void move(MyFrame frame) {

		x += vx;
		y += vy;

		if (x <= -200 || x >= 1200) {
			x = frame.getWidth() / 2;
			y = frame.getHeight() / 2;

		}
	}
	/*
			if (x < 0 || x > frame.getWidth()) {
	
	
				if (vx < 0) {
					vx -= 1;
				} else {
					vx += 1;
	
				}
			}
	
		}
		*/

	public void draw(MyFrame displayCarTrains) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
