package baitap1;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Student [] s = new Student[2];
		
		input(s);
		print(s);
	}

	private static void input(Student[] s) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.println("Sinh vien " + (i+1));
			System.out.println("Name :");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Age :");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Adress :");
			String add = sc.nextLine();
			sc.nextLine();
			System.out.println("Number :");
			String phone = sc.nextLine();
			sc.nextLine();
			System.out.println("Score TB :");
			double diemTB = sc.nextDouble();
			s[i] = new Student(name,age,add,phone,diemTB);
		}
		sc.close();
	}
	

	private static void print(Student[] s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length; i++) {
			System.out.println("Sinh viên " + (i +1));
			System.out.println("Tên :" +s[i].getName());
			System.out.println("Tuổi :" +s[i].getAge());
			System.out.println("Địa chỉ :" + s[i].getAdd());
			System.out.println("số điện thoại : " + s[i].getPhone());
			System.out.println("Điểm TB : " + s[i].getDTB());
		
	}
}
}
