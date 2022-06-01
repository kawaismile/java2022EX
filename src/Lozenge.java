/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/01/15:15
 * @Description:
 */
public class Lozenge {

    public static void main(String[] args) {
        Lozenge lozenge = new Lozenge();
        System.out.println(lozenge.getLozenge(10, 10));
    }

    public String getLozenge(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    sb.append("*");
                } else if (j == 0 || j == b - 1) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}








