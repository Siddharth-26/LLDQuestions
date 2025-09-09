package CourseRegistrationSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students {
  private String studentName;
  private String studentEmail;
  private List<Course> registeredCourses;
  private String mobile;

  public Students(String studentName, String studentEmail, String mobile) {
    this.studentName = studentName;
    this.studentEmail = studentEmail;
    this.mobile = mobile;
    this.registeredCourses = Collections.synchronizedList(new ArrayList<>());
  }
  public void addCourse(Course course){
    this.registeredCourses.add(course);
  }

}
