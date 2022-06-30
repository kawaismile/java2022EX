import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/16/14:26
 * @Description:用于测试各种java的语法
 */
public class Test2 {
    public static void main(String[] args) {
        //判断2个文件是否相同
        File file1 = new File("K:\\test\\photo1.jpg");
        File file2 = new File("K:\\test\\picture1.jpg");
        System.out.println(file1.equals(file2));
    }
}
