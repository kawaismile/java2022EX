import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/21/21:00
 * @Description:
 */
public class GetType {
    public static void main(String[] args) {
        //判断文件类型
        File file = new File("src/GetType.java");
        String fileName = file.getName();
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println(fileType);
    }
}






