package homework1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1, "Tümü");
		Category category2 = new Category(2, "Programlama(3)");
		
		Category[] categorys = {category1,category2};
		
         System.out.println("Kategoriler");
         System.out.println("-------------------------------------------------------------------------------");
         
		for (Category  category :  categorys) {
			
			System.out.println(category.categoryName);
			
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Instructor instructor1 = new Instructor(1, "Tümü");
		Instructor instructor2 = new Instructor(2, "Engin Demiroð");
		
		Instructor[] instructors = {instructor1,instructor2};
		
		System.out.println("Eðitmenler");
		System.out.println("-------------------------------------------------------------------------------");
		
		for (Instructor  instructor :  instructors) {
			
			System.out.println(instructor.instructorName);
			
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		 
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)",
		"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip,döküman ve duyurularýný buradan yapacaðýz."
		, "Engin Demirog", "ÜCRETSÝZ");
		
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",
				"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip,döküman ve duyurularýný buradan yapacaðýz."
				, "Engin Demirog", "ÜCRETSÝZ");
		
		Course course3 = new Course(3, "Programlama Giriþ Ýçin Temel Kurs",
				"PYTHON,JAVA,C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin."
				, "Engin Demirog", "ÜCRETSÝZ");
		
		Course[] courses = {course1,course2,course3};
		
		System.out.println("Kurslar");
		System.out.println("-------------------------------------------------------------------------------");
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		
		System.out.println("Kurs Operasyonlarý");
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
