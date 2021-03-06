import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * Created with IntelliJ IDEA.
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/17/10:56
 * @Description:HashMap的使用练习
 */
public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
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
    }
}
