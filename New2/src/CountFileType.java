import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/23/14:46
 * @Description:统计所有文件类型的文件个数
 */
public class CountFileType {
    public static void main(String[] args) {
        //统计所有文件类型的文件个数
        File file = new File("k:\\");
        File[] files = file.listFiles();
        Map<String, Integer> map = new HashMap<>();
        for (File f : files) {
            String name = f.getName();
            int index = name.lastIndexOf(".");
            if (index != -1) {
                String type = name.substring(index + 1);
                if (map.containsKey(type)) {
                    map.put(type, map.get(type) + 1);
                }
                else {
                    map.put(type, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}

