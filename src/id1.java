import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/05/31/10:57
 * @Description:
 */
public class id1 {
    public static void main(String[] args) {
        //创建一个UUID
        UUID id=UUID.randomUUID();
        //输出UUID
        System.out.println(id);
        //获取UUID的字符串形式
        System.out.println(id.toString().length());


    }
}
