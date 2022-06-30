import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/30/14:34
 * @Description:统计java文件的行数
 */
public class GetLine {
    public static void main(String[] args) {
        //统计java文件的行数
        String str = "k:\\ideacode\\src\\Lingxing.java";
        int count = 0;
        try {
            FileReader fr = new FileReader(str);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                count++;
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
