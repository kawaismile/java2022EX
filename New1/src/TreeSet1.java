import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/20/10:54
 * @Description:TreeSet的练习
 */
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("葱油饼");
        treeSet.add("手抓饼");
        treeSet.add("鸡蛋灌饼");
        treeSet.add("煎饼");
        treeSet.add("灌汤烧饼");
        treeSet.add("烧饼");
        treeSet.add("烤饼");
        treeSet.add("华夫饼");
        treeSet.add("千层饼");
        treeSet.add("金丝饼");
        treeSet.add("老婆饼");
        System.out.println("集合的大小为："+treeSet.size());
        System.out.println("集合第一个元素是："+treeSet.first());
        System.out.println("删除的下标为3的元素是："+treeSet.remove("鸡蛋灌饼"));
        System.out.println("-".repeat(20));
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}

