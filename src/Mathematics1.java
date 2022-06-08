/**
 * Created with IntelliJ IDEA.
 *
 * @Progect:IntelliJ IDEA
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/06/11:18
 * @Description:
 */
public class Mathematics1 {
    public static void main(String[] args) {
        //求1-10的阶乘
        int sum=0;
        int m=1;
        for( int i=1;i<=10;i++){
                m=m*i;
            System.out.printf("%d的阶乘是:%d",i,m);
            System.out.printf("\n");
            sum=sum+m;
            }
            System.out.printf("1-10的阶乘的和是:%d",sum);

        }
}
