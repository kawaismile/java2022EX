import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/22/14:09
 * @Description:
 */
public class IO3 {
    public static void main(String[] args) {


        class Test {
            public static void main(String[] args) {
                try {
                    //源文件
                    FileInputStream inputStream = new FileInputStream("C://Users//lxl//Desktop//图片大全//美女露骨背影壁纸.jpg");
                    //目标文件
                    FileOutputStream outputStream = new FileOutputStream("D://2.jpg");
                    //为了传输快，定义一个byte数组
                    byte b[] = new byte[1024*8];
                    //从源文件中剩余字节大小，大于0则继续读取
                    while (true) {
                        try {
                            if (!(inputStream.available() > 0)) break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        //从源文件文件中读取字节，数量由参数决定
                        int len = inputStream.read(b);
                        //将读取到内容写入进目标文件
                        outputStream.write(b,0,len);
                    }
                    /**
                     * close：关流
                     */
                    inputStream.close();
                    outputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
