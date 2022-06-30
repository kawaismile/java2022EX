import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/30/15:26
 * @Description:
 */
public class ZipDivision {
    public static void main(String[] args) {
        //zip文件分割
        String str = "k://test.zip";
        //转化为流
        Stream<String> stream = null;
        try {
            stream = Files.lines(Paths.get(str), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File(str);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                try {
                    Files.copy(file1.toPath(), file1.toPath().resolveSibling(file1.getName()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
