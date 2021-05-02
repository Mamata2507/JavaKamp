package homework2;

public class StudentManager extends UserManager{
	
	 public void add(Student student) {
	 		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "adında " + student.getStudentNumber()+
	 				" " + "numaralı öğrenci " + student.getStudentCourse() + " kursuna katılmıştır.");
	 		
	 	}
	     
	    
	 public void update(Student student) {
		 System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "adında " + student.getStudentNumber()+
	 				" " + "numaralı öğrencinin bilgileri sistemde güncellenmiştir.");
		 
		 System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "adında " + student.getStudentNumber()+
	 				" " + "numaralı öğrencinin " + student.getStudentCourse() + " kurs içeriği güncellenmiştir.");
		 
	 	}
	   
	 	public void delete(Student student) {
	 		
	 		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "adında " + student.getStudentNumber()+
	 				" " + "numaralı öğrenci sistemden silinmiştir.");
	 		
	 		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "adında " + student.getStudentNumber()+
	 				" " + "numaralı öğrencinin " + student.getStudentCourse() + " kurs içeriği silinmiştir.");
	 	}
	     
	 	public void list() {
	 		System.out.println("Öğrenci bilgileri güncellendi.");
	 	}
}
