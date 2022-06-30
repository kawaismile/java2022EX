/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/23/15:13
 * @Description:
 */
public class Test7 {
    //统计字母出现的次数
    public static void main(String[] args) {
        String str = "hjkbhgbmgcnsdcjdfmskdja";
        char[] chars = str.toCharArray();
        int[] count = new int[26];
        for (char aChar : chars) {
            count[aChar - 'a']++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println((char) ('a' + i) + "出现的次数是：" + count[i]);

        }
    }
}
