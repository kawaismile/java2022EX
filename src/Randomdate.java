/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/05/31/15:33
 * @Description:
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
public class Randomdate {
    public static void main(String[] args) throws ParseException {
        //设置日期格式
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         var a = "2021-01-01 00:00:00";
         //获取当前时间
         var d1 = sdf.parse(a).getTime();
         //System.out.printf("%1$tF %1$tT%n",946656000000l);
        //获取随机时间
         var b = "2021-11-24 09:23:30";
         //获取当前时间
         var d2 = sdf.parse(b).getTime();
         //System.out.printf("%1$tF %1$tT%n",1451577599000L);
         var r = new Random();
         //0 - num var num = d2-d1+1;
        double num = 0;
        //获取随机时间
        var d3 = d1 + (long)(r.nextDouble()*num);
         System.out.printf("%1$tF %1$tT%n",d3);
    }
    }

