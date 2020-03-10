package studentSystem;

public class Student {
	private int sid;
	private String name;
	private int age;
	private Gender gender;

	public Student(){
	}
	
	public Student(int sid, String name, int age, Gender gender) {
		this.setSid(sid);
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Student Infomation: " + sid + " | " + name + " | " + age + " | " + gender;
	}
	
}

enum Gender{
	male, female;
}
