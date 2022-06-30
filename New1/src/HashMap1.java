import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/17/15:21
 * @Description:
 */
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(6);
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "C");
        map.put(5, "C#");
        map.put(6, "JavaScript");
        map.put(10, "Go");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsValue(map.get(2)));
        System.out.println("集合的大小是：" + map.size());
        Set<Integer> keys = map.keySet();
        System.out.println("-".repeat(10));
        //遍历集合的key,方法一
        for(Integer key:keys){
            System.out.printf("%s=%s%n",key,map.get(key));
        }
        System.out.println("-".repeat(10));
        //遍历集合的key,方法二
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("6/2(1+2)="+6/2*(1+2));
    }
}
