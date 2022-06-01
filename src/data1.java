import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/05/30/10:35
 * @Description:
 */
public class data1 {
    public static void main(String[] args) {
        System.out.println("Hello World 你好世界");
        Date b=new Date();

        long a=System.currentTimeMillis();
        System.out.printf("%tF %tT %tc%n",a,a,a);
        System.out.printf("%tc%n",b);
    }
}
