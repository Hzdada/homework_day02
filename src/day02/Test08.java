package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Gavin
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        Person[] person = operate(item);
    }
    public static Person[] operate(String item){
        String[] split = item.split(";");
        Person[] person = new Person[split.length];
        for (int i = 0; i < split.length; i++) {
            String[] message = split[i].split(",");
            String name = message[0];
            int age = Integer.parseInt(message[1]);
            String gender = message[2];
            int salary = Integer.parseInt(message[3]);
            person[i] = new Person(name,age,gender,salary);
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        return person;
    }
}
