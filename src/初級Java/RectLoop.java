package 初級Java;

public class RectLoop extends MyFrame {
	public void run() {
/*
		int y=0;
		for (int x = 0; x < 100; x++) {

				fillRect(20 * x, 80 +y, 10, 100);
				
				y +=20;
		}
	*/
		
		int y=0;
		for (int x = 0; x < 20; x++) {

				fillRect(20 * x, 80, 10, 10+y);
				
				y +=10;
		}
	}
}
