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
 * @Date: 2022/06/28/10:19
 * @Description:建立图像
 */
public class Image1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        try {

            ImageIO.write(image, "png", new File("k:\\test\\im1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
