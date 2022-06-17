import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/14/15:41
 * @Description:猜数游戏进阶版,除了提示数字猜大猜小外，还会提示错误的类型，并且输入“exit”可以退出游戏
 */
public class GuessNum1 {
    public static void main(String[] args) {
        //猜数游戏
        int num = (int) (Math.random() * 100 + 1);
        int guess = 0;
        int count = 0;
        System.out.println("请输入一个1-100的数字：");
        Scanner scanner = new Scanner(System.in);
        while (guess != num) {
            try {
                guess = scanner.nextInt();
                count++;
            }
            //输入不匹配异常，即输入的值数据类型与设置的值数据类型不能匹配
            catch (InputMismatchException e) {
                if (scanner.nextLine().equals("exit")) {
                    System.out.println("退出游戏");
                    break;
                } else if (guess % 1 != 0) {
                    System.out.println("您输入的为小数，请输入一个1-100的数字：");
                    continue;
                }
                System.out.println("您输入的为字符或小数，输入错误,请重新输入一个1-100的整数");
                continue;

            }
                if (guess < 0 || guess > 100) {
                    System.out.println("您输入的数字不在1-100范围内，请重新输入一个1-100的整数");
                    continue;
                }
                if (guess < num) {
                    System.out.println("猜小了");
                } else if (guess > num) {
                    System.out.println("猜大了");
                } else if(guess == num){
                    System.out.println("猜对了");
                }
            }
        System.out.println("您一共猜了"+count+"次");
    }
}


