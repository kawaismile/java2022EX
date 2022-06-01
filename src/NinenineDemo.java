/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/01/15:29
 * @Description:
 */
public class NinenineDemo {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();

        }
    }
}
