import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/02/14:09
 * @Description:判断闰年
 */
public class LeepYear {
    public static void main(String[] args) {
        //获取当前年份
        int year = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 2000;i<=year;i++){
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                        System.out.println(i);
            }
        }
    }
}
