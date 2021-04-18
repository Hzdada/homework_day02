package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Gavin
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /*String str = "192.168.106.99";*/
        String regex = "[\\d]{1,4}[.][\\d]{1,4}[.][\\d]{1,4}[.][\\d]{1,4}";
        if(str.matches(regex)){
            String[] split = str.split("\\.");
            System.out.println(Arrays.toString(split));
        }

    }

}
