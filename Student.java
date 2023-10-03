package day2.classes;


//logical entity, template, java bean -
public class Student {
	
	//properties, variables
	int studentId;
	String studentName;
	
	
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	//Constructor - spl method , having name as class name, - empty constructor
	Student(){
		
		System.out.println(" empty Constructor called");
		studentId = 0;
		studentName = "Demo";
	}
	
	//Parameterised constructor 
	Student(int id, String name){
		
		System.out.println(" Parameter constructor called ");
		this.studentId = id;
		this.studentName = name;
	}
	
	//method  definition
	//return type methodName(){ - method header or signature
	// stmts;
	//}
	void displayStudentDetails() {
		System.out.println(" Id : "+studentId);
		System.out.println(" Name : "+ studentName);
	}
	

}
