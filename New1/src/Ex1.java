import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/20/11:11
 * @Description:
 */
public class Ex1 {
    public static void main(String[] args) {
        TreeSet<User> treeSet = new TreeSet<>((a, b) -> b.getAge() - a.getAge());
        treeSet.add(new User("张三", 20, 180));
        treeSet.add(new User("李四", 21, 170));
        treeSet.add(new User("王五", 22, 160));
        treeSet.add(new User("赵六", 23, 150));
        treeSet.add(new User("孙七", 24, 140));
        treeSet.add(new User("周八", 25, 130));
        treeSet.add(new User("吴九", 26, 120));
        treeSet.add(new User("郑十", 27, 110));
        System.out.println("集合的大小为："+treeSet.size());
        System.out.println("集合第一个元素是："+treeSet.first());
        System.out.println("删除的下标为3的元素是："+treeSet.remove(new User("孙七", 24, 140)));
        System.out.println("-".repeat(20));
        for (User user : treeSet) {
            System.out.println(user);
        }

    }
}
