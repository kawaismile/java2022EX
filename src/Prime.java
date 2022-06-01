/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/01/10:50
 * @Description:
 */
public class Prime {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 100; i++) {
            for ( int j = 1; j <= Math.sqrt(i); j++) {
                if (i%j== 0) {
                    System.out.println(i);
                    num += i;
                    break;
                }

            }

        }
        System.out.println(num);
    }
}