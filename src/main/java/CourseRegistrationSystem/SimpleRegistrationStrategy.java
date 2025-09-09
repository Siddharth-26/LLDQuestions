package CourseRegistrationSystem;

public class SimpleRegistrationStrategy implements RegistrationStrategy{
  @Override
  public boolean register(Students student, Course course) {
    synchronized (course){
      synchronized (student){
      if(course.getMaxEnrollmentCapacity()>course.getEnrolledStudents().size()){
        course.addStudent(student);
        student.addCourse(course);
        return true;
      }
      else{
        return false;
      }
      }
    }
  }
}
