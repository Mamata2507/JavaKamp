package homework1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "T�m�");
		Category category2 = new Category(2, "Programlama(3)");
		
		Category[] categorys = {category1,category2};
		
         System.out.println("Kategoriler");
         System.out.println("-------------------------------------------------------------------------------");
         
		for (Category  category :  categorys) {
			
			System.out.println(category.categoryName);
			
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Instructor instructor1 = new Instructor(1, "T�m�");
		Instructor instructor2 = new Instructor(2, "Engin Demiro�");
		
		Instructor[] instructors = {instructor1,instructor2};
		
		System.out.println("E�itmenler");
		System.out.println("-------------------------------------------------------------------------------");
		
		for (Instructor  instructor :  instructors) {
			
			System.out.println(instructor.instructorName);
			
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		 
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)",
		"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip,d�k�man ve duyurular�n� buradan yapaca��z."
		, "Engin Demirog", "�CRETS�Z");
		
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)",
				"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip,d�k�man ve duyurular�n� buradan yapaca��z."
				, "Engin Demirog", "�CRETS�Z");
		
		Course course3 = new Course(3, "Programlama Giri� ��in Temel Kurs",
				"PYTHON,JAVA,C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin."
				, "Engin Demirog", "�CRETS�Z");
		
		Course[] courses = {course1,course2,course3};
		
		System.out.println("Kurslar");
		System.out.println("-------------------------------------------------------------------------------");
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		
		System.out.println("Kurs Operasyonlar�");
		System.out.println("-------------------------------------------------------------------------------");
		 
         CourseManager courseManager = new CourseManager();
         courseManager.addToCourse(course1);
         courseManager.updateToCourse(course1);
         courseManager.deleteToCourse(course1);
         
         System.out.println("-------------------------------------------------------------------------------");
         
         courseManager.addToCourse(course2);
         courseManager.updateToCourse(course2);
         courseManager.deleteToCourse(course2);
         
         System.out.println("--------------------------------------------------------------------------------");
         
         courseManager.addToCourse(course3);
         courseManager.updateToCourse(course3);
         courseManager.deleteToCourse(course3);
	}

}
