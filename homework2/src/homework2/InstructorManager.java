package homework2;

public class InstructorManager extends UserManager{
  
public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmen sisteme katýlmýþtýr.");
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmenin " + instructor.getInstructorCourse() + " kursu için " + instructor.getInstructorHomework()
				+ " ödevi sisteme tanýmlanmýþtýr.");
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmenin " + instructor.getInstructorCourse() + " kursu için " + instructor.getCoursePrice()
				+ " fiyat bilgisi sisteme tanýmlanmýþtýr.");
	}
    
   
public void update(Instructor instructor) {
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmenin " + instructor.getInstructorCourse() + " kurs içeriði güncellenmiþtir.");
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmenin " + instructor.getInstructorCourse() + " kurs fiyatý " + " " + instructor.getCoursePrice() +
				" "  + "TL olarak güncellenmiþtir.");
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmenin " + instructor.getInstructorCourse() + " kursu için " + instructor.getInstructorHomework()
				+ " ödevinin içeriði güncellenmiþtir.");
	}
    
	public void delete(Instructor instructor) {
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmen sistem kaydýndan silinmiþtir." );
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmenin " + instructor.getInstructorCourse() + " kurs içeriði silinmiþtir.");
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "adýnda " + instructor.getInstructorNumber()+
				" " + "numaralý eðitmenin " + " " + instructor.getInstructorCourse() + " kursu için " + instructor.getInstructorHomework()
				+ " ödevinin içeriði silinmiþtir.");
	}
    
	public void list() {
	System.out.println("Eðitmen bilgileri güncellendi.");
	}

}
