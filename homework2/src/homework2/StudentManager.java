package homework2;

public class StudentManager extends UserManager{
	
	 public void add(Student student) {
	 		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "ad�nda " + student.getStudentNumber()+
	 				" " + "numaral� ��renci " + student.getStudentCourse() + " kursuna kat�lm��t�r.");
	 		
	 	}
	     
	    
	 public void update(Student student) {
		 System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "ad�nda " + student.getStudentNumber()+
	 				" " + "numaral� ��rencinin bilgileri sistemde g�ncellenmi�tir.");
		 
		 System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "ad�nda " + student.getStudentNumber()+
	 				" " + "numaral� ��rencinin " + student.getStudentCourse() + " kurs i�eri�i g�ncellenmi�tir.");
		 
	 	}
	   
	 	public void delete(Student student) {
	 		
	 		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "ad�nda " + student.getStudentNumber()+
	 				" " + "numaral� ��renci sistemden silinmi�tir.");
	 		
	 		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "ad�nda " + student.getStudentNumber()+
	 				" " + "numaral� ��rencinin " + student.getStudentCourse() + " kurs i�eri�i silinmi�tir.");
	 	}
	     
	 	public void list() {
	 		System.out.println("��renci bilgileri g�ncellendi.");
	 	}
}
