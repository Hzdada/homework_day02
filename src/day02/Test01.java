package day02;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.Z;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Gavin
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String regex = "[\\d]{1,10}[.][\\d]{1,3}";
        String regex1 = "[\\d]{1,20}";
        String regex2 = "[a-zA-Z]{1,20}";
        if(str.matches(regex1)){
            int num = Integer.parseInt(str);
            num = num * 10;
            System.out.println(num);
        }
        if(str.matches(regex)){
            Double num = Double.parseDouble(str);
            num = num * 5;
            System.out.println(num);
        }
        if(str.matches(regex2)){
            System.out.println("不是数字");
        }
    }
}
