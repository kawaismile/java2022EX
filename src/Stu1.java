import org.apache.commons.lang3.StringUtils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/14/10:48
 * @Description:Utils练习
 */
public class Stu1 {
    public static void main(String[] args) {
        //居中打印，参数为字符串，宽度为11，用$填充
        System.out.println(StringUtils.center("hello", 11, "$"));
    }
}
