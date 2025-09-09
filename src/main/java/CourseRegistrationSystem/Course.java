package CourseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private String instructor;
  private String courseName;
  private String courseCode;
  private int maxEnrollmentCapacity;
  private List<Students> registeredStudents;

  public Course(String instructor, String courseName, String courseCode, int maxEnrollmentCapacity) {
    this.instructor = instructor;
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.maxEnrollmentCapacity = maxEnrollmentCapacity;
    this.registeredStudents = new ArrayList<>();
  }
  public List<Students> getEnrolledStudents(){
    return this.registeredStudents;
  }

  public String getInstructor() {
    return instructor;
  }

  public void setInstructor(String instructor) {
    this.instructor = instructor;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public int getMaxEnrollmentCapacity() {
    return maxEnrollmentCapacity;
  }
// Added this because in case the course extends the maxEnrollmentCapacity then we should allow the users for that as well. So for now this is not getting used but in future it can be used.
  public void setMaxEnrollmentCapacity(int maxEnrollmentCapacity) {
    this.maxEnrollmentCapacity = maxEnrollmentCapacity;
  }

  public List<Students> getRegisteredStudents() {
    return registeredStudents;
  }

  public void addStudent(Students student){
    this.registeredStudents.add(student);
  }
}
