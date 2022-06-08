
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/06/14:40
 * @Description:二维数组遍历
 */
public class Array2d1 {
    public static void main(String[] args) {
        int[][] a=new int[][]{{11},{11,12},{11,12,13},{11,12,13,14}};
        for (int[] i:a) {
            System.out.println(Arrays.toString(i));
        }
        a[1][1]=66;
        System.out.println(a[1][1]);
    }
}

