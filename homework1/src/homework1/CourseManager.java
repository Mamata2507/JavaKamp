package homework1;

public class CourseManager {
   public void addToCourse(Course course) {
	   System.out.println("Kurs eklendi => " + course.name);
   }
   public void updateToCourse(Course course) {
	   System.out.println("Kurs g�ncellendi => " + course.name);
   }
   public void deleteToCourse(Course course) {
	   System.out.println("Kurs silindi => " + course.name);
   }
   
}
