import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/15/20:36
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
//创建一个ArrayList集合
        Integer[] num=new Integer[]{1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list=new ArrayList<Integer>();
        //将数组中的元素添加到ArrayList集合中
        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }
            /*int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        System.out.println(result);
                    }
                }
            }
            System.out.println(result);*/
        }
    }

