import java.util.*;
/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/23/14:03
 * @Description:实现字符串分组
 */
public class StringGrouping {
    public static void main(String[] args) {
        //实现字符串分组
        String[] s = {"ate", "tae", "test", "ttes", "tae"};
        System.out.println(new StringGrouping().string1(s));
    }
    public List<List<String>> string1(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
