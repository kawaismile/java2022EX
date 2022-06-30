import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/30/14:49
 * @Description:给文件添加行号
 */
public class AddLine {
        //给文件添加行号
        public static void main(String[] args) throws Exception{
        String file = "k://test231.txt";
        List<String> list = Files.readAllLines(Paths.get(file));
        System.out.println(list.size());
        Path f = Paths.get("line1.txt");
        if(!Files.exists(f)){
            Files.createFile(f);
        }
        int num = 0;
        for (String s : list) {
            Files.writeString(f,String.format("%02d - %s%n",++num,s), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }
    }
}
