import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/02/17:13
 * @Description:随机生成一个数组，然后排序
 */
public class Sort1 {
    public static void main(String[] args){
        //随机生成一个数组
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            int a=nums.length;
        }
        System.out.println(Arrays.toString(nums));
        //排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

