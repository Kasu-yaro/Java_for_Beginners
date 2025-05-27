package 初級Java;

public class Animation extends MyFrame {
	
	int z;
	int w;
	
	public void run() {


		for (int j = 0; j <= 10; j++) {
			//Ani0();	
			//Ani1();	
			//Ani2();
			//Ani3();
			//AniEX1();
			//AniEX2();
			AniEX2_1();


		}

	}

	private void Ani0() {
		// TODO 自動生成されたメソッド・スタブ
		while (true) {
			int x = 0;
			int y = 0;
			while (x <= 120) {

				//画面を消す
				clear();
				//	四角形を表示する
				setColor(0, 128, 0);
				//fillRect(x * x / 20, 80, 10, 100);
				fillOval(x * x / 20, y * y / 20, 100, 100);
				x += 1;
				y += 1;

				sleep(0.018);

			}
			while (x >= 0) {

				//画面を消す
				clear();
				//	四角形を表示する
				setColor(0, 128, 0);
				//fillRect(x * x / 20, 80, 10, 100);
				fillOval(x * x / 20, y * y / 20, 100, 100);
				x -= 1;
				y -= 1;

				sleep(0.018);

				//break;

			}
		}
	}

	private void Ani1() {
		// TODO 自動生成されたメソッド・スタブ
		int x = 0;
		int y = 0;

		while (x < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			x += 1;
			sleep(0.018);

		}
		while (y < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			y += 1;
			sleep(0.018);

		}

	}

	private void Ani2() {
		int x = 0;
		int y = 0;

		while (x < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);
			
			x+=1;
			y-=1;
			sleep(0.018);

			
		}
		
		while (x > 0) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);
			
			x-=1;
			sleep(0.018);

			
		}
		
		while (x < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);
			
			x-=1;
			y+=1;
			sleep(0.018);

			
		}
		
	}
	private void Ani3() {
		//Ani0参照
		
	}
	private void AniEX1() {
		int x = 0;
		int y = 0;

		while (x < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			x += 1;
			sleep(0.018);

		}
		while (y < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			y += 1;
			sleep(0.018);

		}
		
		while (x > 0) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			x -= 1;
			sleep(0.018);

		}
		
		while (y > 0) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			y -= 1;
			sleep(0.018);

		}
		
		
		
		
	}
	private void AniEX2() {
		int x = 0;
		int y = 0;

		while (x < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			x += 1;
			sleep(0.018);

		}
		while (y < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			y += 1;
			sleep(0.018);

		}
		
		while (x > 0) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			x -= 1;
			sleep(0.018);

		}
		while (y < 200) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(x * x / 20, y * y / 20, 100, 100);

			y += 1;
			sleep(0.018);

		}
		
		
		
		
	}
	private void AniEX2_1() {
		z = 0;
		w = 0;

		move_X();
	
		move_Y();

	}
	
	private void move_X() {
		while (z < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(z * z / 20, w * w / 20, 100, 100);

			z += 1;
			sleep(0.018);
		}
	}
	
	private void move_Y() {
		while (w < 100) {
			//画面を消す
			clear();
			//	四角形を表示する
			setColor(0, 128, 0);
			//fillRect(x * x / 20, 80, 10, 100);
			fillOval(z * z / 20, w * w / 20, 100, 100);

			w += 1;
			sleep(0.018);
		}
	}

}
