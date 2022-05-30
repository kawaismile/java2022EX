import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
/**
* @Description:
* @Param: 
* @return: 
* @Author: kawaismile
* @Date: 2022/5/26
*/
public class dict {
 
    public static void main(String[] args) throws IOException {
        String w=JOptionPane.showInputDialog("请输入：");
        //String u="http://youdao.com/w/eng/"+w+"/#keyfrom=dict2.index";
        //String m=Jsoup.connect(u).get().select("div[class=trans-wrapper clearfix]").get(0).text();

        String u="https://fanyi.baidu.com/#en/zh/"+w;
        String m=Jsoup.connect(u).get().select("div[class=dict-comment-mean]").get(0).text();
        JOptionPane.showMessageDialog(null,m);
    }

}

 