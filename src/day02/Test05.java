package day02;

import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Gavin
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String regex = "[\\w]{1,4}[.][\\w]{1,3}";
		Long t = System.currentTimeMillis();
		String time = String.valueOf(t);
		int index = str.indexOf(".");
		String str1 = str.substring(index);
		if(str.matches(regex)){
			String str2 = time + str1;
			System.out.println(str2);
		}

	}
}
