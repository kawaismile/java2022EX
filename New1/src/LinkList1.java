import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/16/10:43
 * @Description:链表练习
 */
public class LinkList1 {
    public static void main(String[] args) {
        //创建一个链表
        LinkedList<String> list = new LinkedList();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("c++");
        list.add("python");
        list.add("c#");
        //获取链表的长度
        System.out.println("链表的大小为："+list.size());
        //打印链表的元素
        System.out.println(list);
        //获取指定位置的元素
        System.out.println("链表的第五个元素是："+list.get(5));
        //获取链表的第一个元素
        System.out.println("链表的第一个元素是："+list.getFirst());
        //获取链表的最后一个元素
        System.out.println("链表的最后一个元素是："+list.getLast());
        //删除指定位置的元素
        list.remove(5);
        //删除链表的第一个元素
        list.removeFirst();
        //删除链表的最后一个元素
        list.removeLast();
        //获取链表的长度
        System.out.println("链表的大小为："+list.size());
        //打印链表的元素
        System.out.println(list);
    }
}
