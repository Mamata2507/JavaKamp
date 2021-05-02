package homework2;

public class Main {
	
	 public static void main(String[] args) {
		 
  System.out.println("-------------------------------------------------------------------------------------------------------------");
	            System.out.println(" \t \t \t \t E��TMEN B�LG�LER�");
  System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.seteMail("engin.demirog@gmail.com");
		instructor1.setInstructorNumber(789);
		instructor1.setInstructorCourse("Java");
		instructor1.setInstructorHomework("�nsan Kaynaklar� Projesi");
		instructor1.setCoursePrice(36.99);
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setFirstName("Murat");
		instructor2.setLastName("Y�ceda�");
		instructor2.seteMail("murat.yucedag@gmail.com");
		instructor2.setInstructorNumber(345);
		instructor2.setInstructorCourse("C#");
		instructor2.setInstructorHomework("Al��veri� Sitesi Otomasyon Projesi");
		instructor2.setCoursePrice(27.99);
		
		Instructor[] instructors = {instructor1,instructor2};
		
		for (Instructor instructor : instructors) {
			System.out.println("E�itmenin ad�: " + instructor.getFirstName());
			System.out.println("E�itmenin soyad�: " + instructor.getLastName());
			System.out.println("E�itmenin email adresi: " + instructor.geteMail());
			System.out.println("E�itmenin numaras�: " + instructor.getInstructorNumber());
			System.out.println("E�itmenin verdi�i kurs: " + instructor.getInstructorCourse());
			System.out.println("E�itmenin verdi�i �dev: " + instructor.getInstructorHomework());
			System.out.println("E�itmenin kurs fiyat�: " + instructor.getCoursePrice());
			
    System.out.println("-------------------------------------------------------------------------------------------------------------");
		}
		
    System.out.println("-------------------------------------------------------------------------------------------------------------");
                  System.out.println(" \t \t \t \t ��RENC� B�LG�LER�");
    System.out.println("-------------------------------------------------------------------------------------------------------------");

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Muhammed");
		student1.setLastName("Dibek");
		student1.seteMail("muhammed.dibek@gmail.com");
		student1.setStudentNumber(576432);
		student1.setStudentCourse("Java");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Burak");
		student2.setLastName("Y�lmaz");
		student2.seteMail("burak.y�lmaz@gmail.com");
		student2.setStudentNumber(587961);
		student2.setStudentCourse("C#");
		
		Student[] students = {student1,student2};
		
		for (Student student : students) {
			System.out.println("��rencinin ad�: " + student.getFirstName());
			System.out.println("��rencinin soyad�: " + student.getLastName());
			System.out.println("��rencinin email adresi: " + student.geteMail());
			System.out.println("��rencinin numaras�: " + student.getStudentNumber());
			System.out.println("��rencinin ald��� kurs: " + student.getStudentCourse());
			
    System.out.println("-------------------------------------------------------------------------------------------------------------");
		}
		
    System.out.println("-------------------------------------------------------------------------------------------------------------");
                  System.out.println(" \t \t \t \t E��TMEN OPERASYONLARI");
    System.out.println("-------------------------------------------------------------------------------------------------------------");

		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(instructor2);
	System.out.println("-------------------------------------------------------------------------------------------------------------");
		instructorManager.update(instructor2);
	System.out.println("-------------------------------------------------------------------------------------------------------------");
		instructorManager.delete(instructor2);
	System.out.println("-------------------------------------------------------------------------------------------------------------");
		
	UserList userList1 = new UserList();
	userList1.add(new InstructorManager());
	
	System.out.println("-------------------------------------------------------------------------------------------------------------");
         System.out.println(" \t \t \t \t ��RENC� OPERASYONLARI");
    System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student2);
	System.out.println("-------------------------------------------------------------------------------------------------------------");
		studentManager.update(student2);
	System.out.println("-------------------------------------------------------------------------------------------------------------");
		studentManager.delete(student2);
	System.out.println("-------------------------------------------------------------------------------------------------------------");
	
	UserList userList2 = new UserList();
	userList2.add(new StudentManager());
	System.out.println("-------------------------------------------------------------------------------------------------------------");
	}
	 
}
