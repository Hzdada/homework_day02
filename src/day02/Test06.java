package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Gavin
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String regex = "[\\d]{3,4}[\\-][\\d]{7,8}";
        Scanner scanner = new Scanner(System.in);
        String tel = scanner.next();
        if(tel.matches(regex)){
            System.out.println("符合电话规则");
        }else{
            System.out.println("不符合");
        }
    }
}
