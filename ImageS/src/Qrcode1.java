import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.imageio.ImageIO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * Created with IntelliJ IDEA.
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/28/21:11
 * @Description:生成二维码
 */
public class Qrcode1 {
    public static void main(String[] args) {
        String q1="K://imagetest//q1.png";
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        BitMatrix qc = null;
        try {
            qc = new QRCodeWriter().encode("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fi0.hdslb.com%2Fbfs%2Farticle%2F9a02ee61343c57897c2af606fb2355c8ecd21b34.jpg&refer=http%3A%2F%2Fi0.hdslb.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1659015177&t=0948addd92b20bd2a9d5a8b5ed84b3b8", BarcodeFormat.QR_CODE, 200, 200, hints);
        } catch (WriterException e) {
            e.printStackTrace();
        }
        var m= MatrixToImageWriter.toBufferedImage(qc);
        try {
            ImageIO.write(m, "png", new FileOutputStream(q1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Runtime.getRuntime().exec("cmd /k start k://imagetest//q1.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
