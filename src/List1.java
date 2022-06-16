import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/15/9:23
 * @Description:集合的使用
 */
public class List1 {
    public static void main(String[] args) {
        var list1 = new ArrayList<String>();
        list1.add(0, "葱油饼");
        list1.add(1, "手抓饼");
        list1.add(2, "鸡蛋灌饼");
        list1.add(3, "煎饼");
        list1.add(4, "灌汤烧饼");
        list1.addAll(List.of("烧饼","烤饼","华夫饼","千层饼","金丝饼"));
        list1.add("老婆饼");
        System.out.println("集合的大小为："+list1.size());
        System.out.println("集合下标为4的元素是："+list1.get(4));
        System.out.println("删除的下标为3的元素是："+list1.remove(3));
        System.out.println(list1.set(0,"猴菇饼")+"被改为了："+list1.get(0));
        System.out.println("-".repeat(20));
        for (String s : list1) {
            System.out.println(s);
        }
    }
}
