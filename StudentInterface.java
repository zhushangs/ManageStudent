package studentSystem;

import java.util.List;

public interface StudentInterface {
	
	//display information about students
	void showAll();
	
	//add student information
	boolean addStudent();
	
	//find student by searching student id
	Student findStuBySid(int sid);
	
	//find student by searching name
	List<Student> findStudentByName(String name);
	
	//delete student information
	boolean removeStuBySid(int sid);
	
	//change student information
	boolean modifyStuBySid(int sid);
	

}
