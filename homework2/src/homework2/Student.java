package homework2;

public class Student  extends User{
	     private int studentNumber;
         private String studentCourse;
         
         
         public Student() {
        	 
         }
         
 public Student(int id,String firstName,String LastName,String eMail,int studentNumber,String studentCourse) {
        	 this.setStudentNumber(studentNumber);
        	 this.setStudentCourse(studentCourse);
         }

 public int getStudentNumber() {
	return studentNumber;
}

 public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
}

 public String getStudentCourse() {
	return studentCourse;
}

 public void setStudentCourse(String studentCourse) {
	this.studentCourse = studentCourse;
}
}
