/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/06/16:06
 * @Description:    1+2+3+4+5+.....n,当和大于888时，求出n
 */
public class GetN {
    public static void main(String[] args) {
        //求1+2+3+4+5+....+n>888,n=?
        int sum = 0;
        int n = 0;
        //结束值
        int  end = 8888;
        while (sum < end) {
            sum = sum + (++n);
        }
        System.out.printf("n=%d\n", n);
    }
}
