import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/24/20:46
 * @Description:
 */
public class Taiji {
    public static <Circle, Triangle> void main(String[] args) {
        //画一个八卦图
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        try {
            Graphics2D g = image.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setColor(Color.gray);
            g.fillRect(0, 0, 600, 600);
            g.setColor(Color.white);
            g.fillOval(150, 150, 300, 300);
            g.setColor(Color.black);
            int x = 150;
            int y = 150;
            g.fillArc(x, y, 300, 300, 90, 180);
            g.fillArc(225,y,150,150,270,180);
            g.setColor(Color.white);
            g.fillArc(225, 300, 150, 150,90,180);
            g.fillOval(275,200,50,50);
            g.setColor(Color.black);
            g.fillOval(275,350,50,50);
            g.dispose();
            ImageIO.write(image, "png", new File("Taiji.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








