package 初級Java;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * グラフィックスを簡単に表示するウィンドウクラス
 */
public class MyFrame extends Frame implements Runnable {
    BufferedImage im;
    Color col = Color.BLACK;
    Thread t;
    public Color bgColor = new Color(255, 255, 255);

    public MyFrame() {
        super();
        setSize(1200, 1200);
        im = new BufferedImage(1200, 1200, BufferedImage.TYPE_INT_ARGB);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(1);
            }
        });
    }

    public synchronized void saveImage(File dst) throws IOException {
        ImageIO.write(im, "png", dst);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(im, 0, 0, null);
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    @Override
    public void update(Graphics g) {
        // 背景クリアを避けてちらつきを減らす
        paint(g);
    }

    public synchronized void fillRect(int x, int y, int w, int h) {
        Graphics g = getImageGraphics();
        if (g != null) {
            g.setColor(col);
            g.fillRect(x, y, w, h);
            g.dispose();
        }
        repaint();
    }

    public synchronized void clear() {
        Color s = col;
        col = bgColor;
        fillRect(0, 0, getWidth(), getHeight());
        col = s;
    }

    public synchronized void fillOval(int x, int y, int w, int h) {
        Graphics g = getImageGraphics();
        if (g != null) {
            g.setColor(col);
            g.fillOval(x, y, w, h);
            g.dispose();
        }
        repaint();
    }

    private Graphics getImageGraphics() {
        return im.getGraphics();
    }

    public void setColor(int red, int green, int blue) {
        red = Math.max(0, Math.min(255, red));
        green = Math.max(0, Math.min(255, green));
        blue = Math.max(0, Math.min(255, blue));
        col = new Color(red, green, blue);
    }

    public void sleep(double time) {
        try {
            Thread.sleep((int) (time * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        // ユーザーが override してアニメーション処理を書く
    }

    public synchronized void fillOval(double x, double y, double w, double h) {
        fillOval((int) x, (int) y, (int) w, (int) h);
    }

    public synchronized void drawString(String str, int x, int y, int size) {
        Graphics g = getImageGraphics();
        if (g != null) {
            g.setColor(col);
            g.setFont(new Font("Monospaced", Font.PLAIN, size));
            g.drawString(str, x, y);
            g.dispose();
        }
        repaint();
    }
}
