package homework2;

public class InstructorManager extends UserManager{
  
public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmen sisteme kat�lm��t�r.");
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmenin " + instructor.getInstructorCourse() + " kursu i�in " + instructor.getInstructorHomework()
				+ " �devi sisteme tan�mlanm��t�r.");
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmenin " + instructor.getInstructorCourse() + " kursu i�in " + instructor.getCoursePrice()
				+ " fiyat bilgisi sisteme tan�mlanm��t�r.");
	}
    
   
public void update(Instructor instructor) {
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmenin " + instructor.getInstructorCourse() + " kurs i�eri�i g�ncellenmi�tir.");
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmenin " + instructor.getInstructorCourse() + " kurs fiyat� " + " " + instructor.getCoursePrice() +
				" "  + "TL olarak g�ncellenmi�tir.");
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmenin " + instructor.getInstructorCourse() + " kursu i�in " + instructor.getInstructorHomework()
				+ " �devinin i�eri�i g�ncellenmi�tir.");
	}
    
	public void delete(Instructor instructor) {
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmen sistem kayd�ndan silinmi�tir." );
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmenin " + instructor.getInstructorCourse() + " kurs i�eri�i silinmi�tir.");
    	
    	System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "ad�nda " + instructor.getInstructorNumber()+
				" " + "numaral� e�itmenin " + " " + instructor.getInstructorCourse() + " kursu i�in " + instructor.getInstructorHomework()
				+ " �devinin i�eri�i silinmi�tir.");
	}
    
	public void list() {
	System.out.println("E�itmen bilgileri g�ncellendi.");
	}

}
