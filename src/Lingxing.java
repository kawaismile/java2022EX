/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/01/15:35
 * @Description:输出菱形
 */
public class Lingxing {
    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++){
            //循环输出空格对齐
            for(int m=13;m>=i;m--){
                System.out.print(" ");
                m--;
            }
            //循环输出星星
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        //菱形下半部分
        for (int i = 11; i >= 1; i--){
            //输出下半部分每行的空格
            for(int m=13;m>=i;m--){
                System.out.print(" ");
                m--;
            }
            //输出下半部分每行的星星
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //换行
            System.out.println();
            i--;
        }
    }
}

