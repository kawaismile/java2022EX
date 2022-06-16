/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/09/9:57
 * @Description:
 */
public class Alipay {
    public static void main(String[] args) {
        //求阶乘
        int n = 5;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.printf("%d!=%d\n", n, sum);

    }
}
