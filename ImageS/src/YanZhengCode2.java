/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/30/14:06
 * @Description:
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

public class YanZhengCode2 {
    public static void main(String[] args) {
        String letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rand = new Random();
        //01 建立图像，定义尺寸，格式
        int width = 160;
        int height = 60;
        int len = 4;
        BufferedImage yz = new BufferedImage(width, height, 2);
        Graphics2D g = yz.createGraphics();
        //抗锯齿
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width - 1, height - 1);
        Font font = new Font("华文彩云", Font.BOLD, 35);
        g.setFont(font);
        StringBuilder s = new StringBuilder(len);
        //循环生成随机数字和字母
        for (int i = 0; i < len; i++) {
            Color c = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), rand.nextInt(100) + 100);
            g.setColor(c);
            int x = i * 35 + 5;
            int y = rand.nextInt(25) + 28;
            font = font.deriveFont(rand.nextInt(3), rand.nextInt(18) + 30);
            g.setFont(font);
            String t = String.valueOf(letter.charAt(rand.nextInt(letter.length())));
            s.append(t);
            double radianPercent = Math.PI * (rand.nextInt(35) / 180D);
            if (rand.nextBoolean()) {
                radianPercent = -radianPercent;
            }
            g.rotate(radianPercent, x, y);
            g.drawString(t, x, y);
            g.rotate(-radianPercent, x, y);
        }
        System.out.println(s.toString());
        /*for (int i = 0; i < 15; i++) {
            Color c = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), rand.nextInt(120) + 120);
            g.setColor(c);
            int x = rand.nextInt(width);
            int y = rand.nextInt(height);
            font = font.deriveFont(rand.nextInt(3), rand.nextInt(8) + 10);
            g.setFont(font);
            String t = String.valueOf(letter.charAt(rand.nextInt(letter.length())));
            g.drawString(t, x, y);
        }
        //干扰图形
        for (int i = 0; i < 10; i++) {
            Color c = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), rand.nextInt(20) + 20);
            g.setColor(c);
            int x = rand.nextInt(width);
            int y = rand.nextInt(height);
            int ss = rand.nextInt(30) + 10;
            g.fillOval(x, y, ss, ss);
        }*/
        //05输出图像
        try {
            ImageIO.write(yz, "png", new File("k://imagetest//y1.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
