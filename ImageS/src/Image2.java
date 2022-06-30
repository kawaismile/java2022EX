import javax.imageio.ImageIO;
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
 * @Date: 2022/06/28/10:47
 * @Description:得到图像的像素值
 */
public class Image2 {
    public static void main(String[] args) {
        File file = new File("k:\\imagetest\\t1.jpg");
        BufferedImage image = null;
        {
            try {
                image = (BufferedImage) ImageIO.read(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(image.getWidth());
            System.out.println(image.getHeight());
        }
    }
}
