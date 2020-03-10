package studentSystem;

import java.util.Scanner;

public class TestSudentSys {

	public static void main(String[] args) {
		StudentSystem system = new StudentSystem();
		system.welcome();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			system.showMenu();
			int input = MyUtil.getInputNumber("Select number ", scanner);
			switch(input) {
				case 1:
					system.showAll();
					break;
				case 2:
					system.addStudent();
					break;
				case 3:
					system.findStuBySid();
					break;
				case 4:
					system.findStudentByName();
					break;
				case 5:
					system.removeStuBySid();
					break;
				case 6:
					system.modifyStuBySid();
					break;
				case 7:
					system.exit();
					return;
			}
		}
	}
}
