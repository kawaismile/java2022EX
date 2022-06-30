import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/30/15:13
 * @Description:拷贝目录
 */
public class CopyMenu {
    public static void main(String[] args) {
        //目录拷贝
        File file = new File("k://test");
        File file2 = new File("k://test2");
        if (!file2.exists()) {
            file2.mkdir();
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                try {
                    Files.copy(file1.toPath(), file2.toPath().resolve(file1.getName()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

