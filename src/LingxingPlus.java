import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/15/10:11
 * @Description:输出菱形进阶版，当输入的数字大于等于0时，打印菱形，否则打印“输入错误”
 */
public class LingxingPlus {
    public static void main(String[] args) {
        //输出菱形
        System.out.println("请输入菱形的高度，推荐奇数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<0) {
            System.out.println("输入错误");
        }
        for (int i = 1; i <= n; i+=2) {
            //重复输出i个星星，并居中,默认两端用空格填充，每行的的宽度都是n
            System.out.println(StringUtils.center("*".repeat(i), n));
        }
        for (int i = n-2; i >= 1; i-=2) {
            System.out.println(StringUtils.center("*".repeat(i), n));
        }
    }
}
