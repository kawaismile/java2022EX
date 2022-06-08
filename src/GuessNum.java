import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/02/10:42
 * @Description:猜数游戏
 */
public class GuessNum {
    public static void main(String[] args) {
        // 创建一个Scanner对象
        int num = (int) (Math.random() * 100);
        int guess = 0;
        int count = 0;
        while (guess != num) {
            System.out.println("请输入一个数字：");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            count++;
            if (guess < num) {
                System.out.println("猜小了");
            } else if (guess > num) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了");
            }
        }
        System.out.println("你猜了" + count + "次");
    }
}
