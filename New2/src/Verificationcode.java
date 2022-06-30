import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/25/11:20
 * @Description:
 */
public class Verificationcode {
    public static void main(String[] args) {
        //生成验证码
        String code = getCode();
        //输出验证码
        System.out.println(code);
        //输入验证码
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        //验证验证码
        boolean result = verifyCode(code, input);
        if (result) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }
    }
    //生成验证码
    public static String getCode() {
        String code = "";
        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * 10);
            code += num;
        }
        return code;
    }
    //验证验证码
    public static boolean verifyCode(String code, String input) {
        if (code.equals(input)) {
            return true;
        } else {
            return false;
        }
    }
}                



