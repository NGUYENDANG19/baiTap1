package baitap1;

public class Student {
	public String name;
	public int  age;
	public String add;
	public String phone ;
	public Double DTB;
	public Student(String name, int age, String add, String phone, Double dTB) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
		this.phone = phone;
		DTB = dTB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Double getDTB() {
		return DTB;
	}
	public void setDTB(Double dTB) {
		DTB = dTB;
	}
	
	
}
