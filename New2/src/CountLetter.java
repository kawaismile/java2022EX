import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/23/14:57
 * @Description:统计一个文本中字母出现的次数，只能统计小写字母
 */
public class CountLetter {
    public static void main(String[] args) {
        //读取一个文本
        File file = new File("k:/test233.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                char[] chars = line.toCharArray();
                int[] count = new int[26];
                for (char aChar : chars) {
                    count[aChar - 'a']++;
                }
                for (int i = 0; i < count.length; i++) {
                    System.out.println((char) ('a' + i) + "出现的次数是：" + count[i]);
                }
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}