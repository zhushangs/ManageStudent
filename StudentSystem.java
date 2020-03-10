package studentSystem;

import java.util.*;

public class StudentSystem implements StudentInterface{

	private Map<Integer, Student> students = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void welcome() {
		System.out.println("Student Management System");
		System.out.println("Initializing Student Management System successfully");
	}
	
	public void exit() {
		System.out.print("Exiting Student Management System");
		System.out.print("Exited successfully");
	}
	
	public void showMenu() {
		System.out.println("Menu");
		System.out.println("1. Display all students");
		System.out.println("2. Add student");
		System.out.println("3. Search student by student id");
		System.out.println("4. Search student by student name");
		System.out.println("5. Delete student by student id");
		System.out.println("6. Modify student by student id");
		System.out.println("7. Exit");
		
	}
	
	
	/*
	 * display students information
	 */
	public void showAll() {
		
		Set<Integer> sids = students.keySet();
		Iterator<Integer> iterator = sids.iterator();
		while(iterator.hasNext()) {
			Integer sid = iterator.next();
			Student student = students.get(sid);
			System.out.println(student);
		}
	}

	/*
	 * add student
	 * @return true if added, false if not successfully
	 */
	
	public boolean addStudent() {
		
		int sid = MyUtil.getInputNumber("Student ID, Must Be Integer", scanner);
		String name = MyUtil.getInputString("Student name, Must Be String", scanner);
		int age = MyUtil.getInputNumber("Student age, Must Be Integer", scanner);
		Gender gender = MyUtil.getInputString("Student gender, Must Be String", scanner).equals("male")? Gender.male: Gender.female;
		
		Student s = new Student(sid, name, age, gender);
		students.put(sid, s);
		System.out.println("Successfully added");
		
		return true;
	}

	@Override
	public Student findStuBySid(int sid) {
		Student student = students.get(sid);
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("Not found");
		}
		
		return student;
	}
	
	public Student findStuBySid() {
		int sid = MyUtil.getInputNumber("student id: ", scanner);
		return findStuBySid(sid);
	}

	@Override
	public List<Student> findStudentByName(String name) {
		List<Student> list = new ArrayList<>();
		Collection<Student> stud= students.values();
		Iterator<Student> iterator = stud.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getName().equals(name)) {
				list.add(student);
			}
		}
		return list.size() == 0? null: list;
	}
	
	public void findStudentByName() {
		String name = MyUtil.getInputString("student name: ", scanner);
		List<Student> stud =  findStudentByName(name);
		if(stud == null) {
			System.out.println("Student not exists!");
		}else {
			System.out.println("Results:");
			for(int i = 0; i < stud.size(); i++) {
				System.out.println(stud.get(i));
			}
		}
	}

	@Override
	public boolean removeStuBySid(int sid) {
		Student student = students.remove(sid);
		
		return student == null? false: true;
	}
	
	public void removeStuBySid() {
		int sid = MyUtil.getInputNumber("student id: ", scanner);
		boolean bool =  removeStuBySid(sid);
		if(bool) {
			System.out.println("Delete successful");
		}else {
			System.out.println("Student not found");
		}
	}
	
	

	@Override
	public boolean modifyStuBySid(int sid) {
		Student student = students.get(sid);
		if(student != null) {
			sid = MyUtil.getInputNumber("Student ID, Must Be Integer", scanner);
			String name = MyUtil.getInputString("Student name, Must Be String", scanner);
			int age = MyUtil.getInputNumber("Student age, Must Be Integer", scanner);
			Gender gender = MyUtil.getInputString("Student gender, Must Be String", scanner).equals("male")? Gender.male: Gender.female;
			student.setName(name);
			student.setAge(age);
			student.setGender(gender);
			student.setSid(sid);
			
		}
		return student == null ? false: true;
	}
	
	public void modifyStuBySid() {
		int sid = MyUtil.getInputNumber("student id: ", scanner);
		boolean bool = modifyStuBySid(sid);
		if(bool) {
			System.out.println("Successfully modified");
		}else {
			System.out.println("Student not found");
		}
	}
	

}
