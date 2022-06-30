/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/02/14:30
 * @Description:
 */

public class Test1 {
    public  static void main(String[] args) {
        //画出双色球
        int[] red = new int[6];
        int[] blue = new int[1];
        for (int i = 0; i < red.length; i++) {
            red[i] = (int) (Math.random() * 33 + 1);
        }
        for (int i = 0; i < blue.length; i++) {
            blue[i] = (int) (Math.random() * 16 + 1);
        }
        for (int j : red) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j : blue) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
