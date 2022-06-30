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
 * @Date: 2022/06/28/15:46
 * @Description:给图像添加水印
 */
public class WaterMark {
    public static void main(String[] args) {
        String file="k:\\imagetest\\t1.jpg";
        try {
            //读取图片
            BufferedImage image = ImageIO.read(new File(file));
            //创建一个画布
            Graphics2D g = image.createGraphics();
            //抗锯齿
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
            //水印文字
            String text = "版权所有©小黑子树枝666";
            //水印文字的颜色
            Color color = Color.BLACK;
            //Color color = new Color(255, 162, 214, 196);
            g.setColor(color);
            //水印文字的字体
            Font font = new Font("浪漫雅圆", Font.BOLD, 30);
            g.setFont(font);
            int x = 330 ;
            int y = 670 ;
            //x = x - (text.length() * font.getSize());
            //y = y - font.getSize();
            //将字符串写到图片上
            g.drawString(text, x, y);
            ImageIO.write(image, "jpg", new File("k:\\imagetest\\cxk.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
