import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/01/11:47
 * @Description:
 */
public class Switch1 {
    public static void main(String[] args) {


        var c = Calendar.getInstance();

        int w = c.get(Calendar.DAY_OF_WEEK);

        String wk = "";

        switch (w) {

            case 2:
                wk = "Monday";
                break;
            case 3:
                wk = "Tuesday";
                break;
            case 4:
                wk = "Wednesday";
                break;
            case 5:
                wk = "Thursday";
                break;
            case 6:
                wk = "Friday";
                break;
            case 7:
                wk = "Saturday";
                break;
            case 1:
                wk = "Sunday";
                break;
            default:
                wk = "error";
                break;
        }

        System.out.println(wk);
    }
}
