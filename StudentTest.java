package day2.classes;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//Object creation
			//ClassName objectVariable = new ClassName();
			Student s = new Student();
						
			//getter methods are called
			System.out.println(s.studentId);
			System.out.println(s.studentName);
			
			
			//setter methods are called
			s.studentId = 101;
			s.studentName = "Deen Kumar";
			s.displayStudentDetails();
			
			//Other object
			Student stu = new Student();
			System.out.println(stu.studentId);
			System.out.println(stu.studentName);
			
			stu.studentId = 102;
			stu.studentName = "David ";
			
			stu.displayStudentDetails();
			
			
			//Other object
			Student stu1 = new Student(103, "Sowmya");
			System.out.println(stu1.studentId);
			System.out.println(stu1.studentName);
			stu1.displayStudentDetails();
			
			
			
			
	}

}
