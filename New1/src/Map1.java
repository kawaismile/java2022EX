import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/17/10:56
 * @Description:
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
    }
}
