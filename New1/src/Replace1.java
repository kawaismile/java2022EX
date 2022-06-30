import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/20/21:46
 * @Description:
 */
public class Replace1 {
    public static void main(String[] args) {
        //批量修改图片编号名称
        File file = new File("k:/ideacode/src");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.getName().endsWith(".png")) {
                String name = f.getName();
                String newName = name.substring(0, name.lastIndexOf(".")) + ".jpg";
                f.renameTo(new File("k:/ideacode/src/" + newName));
            }
        }


    }
}
