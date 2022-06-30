import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 * Created with IntelliJ IDEA.
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/27/9:20
 * @Description:
 */
public class Draw1 {
    public static void main(String[] args) {
        //创建一个图片
        java.awt.Image image = null;
        try {
            image = ImageIO.read(new File("k:\\test\\photo1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建一个画布
        assert image != null;
        java.awt.image.BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        //将图片放入画布
        bufferedImage.getGraphics().drawImage(image, 0, 0, null);
        //输出图片
        try {
            ImageIO.write(bufferedImage, "jpg", new File("k:\\test\\test1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
