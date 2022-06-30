import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/22/21:58
 * @Description:
 */
public class IO5 {
    public static void main(String[] args) {
        //建立一个有10个单词的文本
        String[] words = {"Hello", "World", "Java", "is", "a", "good", "language", "for", "programming", "."};
        //建立一个空的List
        List<String> list = new ArrayList<>();
        //遍历words数组，将每个单词添加到list中
        for (String word : words) {
            list.add(word);
        }
        //建立一个输入流
        InputStream in = System.in;
        //建立一个输出流
        System.out.println("请输入一个单词：");
        //建立一个字符数组
        char[] chars = new char[100];
        //建立一个变量，用来记录读取到的字符数
        int count = 0;
        //读取字符
        try {
            count = in.read();
        }
        //如果读取失败，则抛出IOException异常
        catch (IOException e) {
            e.printStackTrace();
        }
        //将读取到的字符数组转换成字符串
        String word = new String(chars, 0, count);
        //将输入的单词添加到list中
        list.add(word);
        //遍历list，输出每个单词
        for (String s : list) {
            System.out.println(s);
        }
 }
}


