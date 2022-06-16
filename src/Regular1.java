import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/16/10:31
 * @Description:
 */
public class Regular1 {
    public static void main(String[] args) {
        //正则表达式
        String str = "hello world";
        //匹配字符串中的单词
        String regex = "\\w+";
        //创建Pattern对象
        Pattern pattern = Pattern.compile(regex);
        //创建Matcher对象
        Matcher matcher = pattern.matcher(str);
        //遍历匹配结果
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
