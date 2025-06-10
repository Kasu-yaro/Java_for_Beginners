package 初級Java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener {

	public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) {

		//車のやつ
		frame.fillRect(x + 20, y, 40, 20);
		frame.fillRect(x, y + 20, 80, 20);
		frame.fillOval(x + 10, y + 40, 20, 20);
		frame.fillOval(x + 50, y + 40, 20, 20);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		if (e.getKeyCode() == KeyEvent.VK_A) {
			vx = -5;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			vx = 5;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_W) {
			vy = -5;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			vy = 5;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		if (e.getKeyCode() == KeyEvent.VK_A) {
			vx = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			vx = 0;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_S) {
			vy = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			vy = 0;
		}
	}

}
