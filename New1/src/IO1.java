import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/20/21:32
 * @Description:
 */
public class IO1 {
    // 统计目录下有多少个java文件
    public static void main(String[] args) {
        // 创建一个File对象
        File file = new File("k:/ideacode/src");
        File[] files = file.listFiles();
        int count = 0;
        for (File f : files) {
            if (f.getName().endsWith(".java")) {
                count++;
                System.out.println(f.getName());
            }
        }
        System.out.println("目录下有" + count + "个java文件");
    }
}

