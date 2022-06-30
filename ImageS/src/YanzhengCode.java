import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.CubicCurve2D;
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
 * @Date: 2022/06/29/11:29
 * @Description:
 */
public class YanzhengCode {
    public static void main(String[] args) {
        //画虚线
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) image.getGraphics();
        Stroke dash=new BasicStroke(3.5f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,0f,new float[]{4},0f);
        g.setStroke(dash);
        g.setColor(Color.PINK);
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        try {
            ImageIO.write(image, "png", new File("k:\\imagetest\\im1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //画曲线
        CubicCurve2D.Double curve = new CubicCurve2D.Double(60,80,140,-140,140,300,220,80) ;
        g.setColor(Color.BLUE);
        g.draw(curve);
        try {
            ImageIO.write(image, "png", new File("k:\\imagetest\\im2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
