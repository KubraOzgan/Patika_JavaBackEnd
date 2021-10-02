package java101_StudentInformationSystem;

public class Main {

	public static void main(String[] args) {

		Teacher t1 = new Teacher("Marry", "H", "555");
		Teacher t2 = new Teacher("Jackson", "P", "010");
		Teacher t3 = new Teacher("Ashley", "B", "023");
		
		Course history = new Course("History", "101", "H");
		Course physics = new Course("Physics", "102", "P");
		Course biology = new Course("Biology", "103", "B");
		
		history.addTeacher(t1);
		//history.printTeacher();
		physics.addTeacher(t2);
		biology.addTeacher(t3);
		
		Student s1 = new Student("Chris", "123", "11", history, physics, biology);
		s1.addBulkExamNote(100, 75, 50);
		s1.addVivaNote(18, 66, 100);
		s1.isPass();
		
		Student s2 = new Student("Lilly", "145", "12", history, physics, biology);
		s2.addBulkExamNote(82, 95, 70);
		s2.addVivaNote(49, 12, 28);
		s2.isPass();

	}

}
