package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Gavin
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(str.contains("+")){
            String[] split = str.split("\\+");
            Double num1 = Double.parseDouble(split[0]);
            Double num2 = Double.parseDouble(split[1]);
            System.out.println("运算结果:" + num1 + "+" + num2 + "=" + (num1+num2));
        }else if(str.contains("-")){
            String[] split = str.split("\\-");
            Double num1 = Double.parseDouble(split[0]);
            Double num2 = Double.parseDouble(split[1]);
            System.out.println("运算结果:" + num1 + "-" + num2 + "=" + (num1-num2));
        }else if(str.contains("*")){
            String[] split = str.split("\\*");
            Double num1 = Double.parseDouble(split[0]);
            Double num2 = Double.parseDouble(split[1]);
            System.out.println("运算结果:" + num1 + "*" + num2 + "=" + (num1*num2));
        }else if(str.contains("/")){
            String[] split = str.split("\\/");
            Double num1 = Double.parseDouble(split[0]);
            Double num2 = Double.parseDouble(split[1]);
            System.out.println("运算结果:" + num1 + "/" + num2 + "=" + (num1/num2));
        }
    }

}
