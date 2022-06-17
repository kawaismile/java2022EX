import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/13/10:31
 * @Description:
 */
public class Regular1 {
    public static void main(String[] args) {
        //判断输入的字符串是数字还是字母还是其他字符
        System.out.println("请输入一个字符串：");
        //创建一个Scanner对象
        Scanner scanner = new Scanner(System.in);
        //获取用户输入的字符串
        String str = scanner.nextLine();
        //创建一个正则表达式对象
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        //创建一个Matcher对象
        Matcher matcher = pattern.matcher(str);
        //判断是否匹配
        if (matcher.matches()) {
            System.out.println("输入的是字母");
        } else {
            //创建一个正则表达式对象
            pattern = Pattern.compile("[0-9]");
            //创建一个Matcher对象
            matcher = pattern.matcher(str);
            //判断是否匹配
            if (matcher.matches()) {
                System.out.println("输入的是数字");
            } else {
                System.out.println("输入的是其他字符");
            }
        }
    }
}
