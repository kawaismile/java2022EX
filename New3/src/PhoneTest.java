import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/27/17:27
 * @Description:
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建一个手机对象
        Phone p1 = new Phone();
        //给手机的属性赋值
        p1.band = "华为";
        p1.price = 5000;
        //获取手机的品牌和价格
        System.out.println("手机品牌是：" + p1.band);
        System.out.println("手机价格是：" + p1.price);
        //调用手机的方法
        p1.call();
        p1.play();
    }
}
