package homework2;

public class Instructor extends User{
      private int instructorNumber;
      private String instructorCourse;
      private String instructorHomework;
      private double coursePrice;
      
      
      public Instructor() {
    	  
      }
      
public Instructor(int id,String firstName,String LastName,String eMail,int instructorNumber,String instructorCourse,String instructorHomework,double coursePrice) {
    	  this.setInstructorNumber(instructorNumber);
    	  this.setInstructorCourse(instructorCourse);
    	  this.setInstructorHomework(instructorHomework);
    	  this.setCoursePrice(coursePrice);
      }

public int getInstructorNumber() {
	return instructorNumber;
}

public void setInstructorNumber(int instructorNumber) {
	this.instructorNumber = instructorNumber;
}

public String getInstructorCourse() {
	return instructorCourse;
}

public void setInstructorCourse(String instructorCourse) {
	this.instructorCourse = instructorCourse;
}

public String getInstructorHomework() {
	return instructorHomework;
}

public void setInstructorHomework(String instructorHomework) {
	this.instructorHomework = instructorHomework;
}

public double getCoursePrice() {
	return coursePrice;
}

public void setCoursePrice(double coursePrice) {
	this.coursePrice = coursePrice;
}
}
