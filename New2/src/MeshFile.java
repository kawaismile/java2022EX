import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/23/10:46
 * @Description:
 */
public class MeshFile {
    //合并2个文件
    public static void mergeFile(File file3, File file1, File file2) {
        try (FileInputStream f1 = new FileInputStream(file1);
             FileInputStream f2 = new FileInputStream(file2);
             FileOutputStream f3 = new FileOutputStream(file3)) {
            f3.write(f1.readAllBytes());
            f3.write("\r\n".repeat(3).getBytes());
            f3.write(f2.readAllBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void mergeFile(String file3, String file1, String file2) {
        mergeFile(new File(file3), new File(file1), new File(file2));
    }
}
