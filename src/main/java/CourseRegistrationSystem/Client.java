package CourseRegistrationSystem;

import java.util.HashMap;

public class Client {
  public static void main(String[] args) {
    SearchHandler handler = new CourseNameSearchHandler(new CourseInstructorSearchHandler(new CourseIdSearchHandler(null)));
    Students student = new Students("sid", "sid@gmail.com", "1234567");
    Course course = new Course("Chaman", "CS-101", "101", 23);
    HashMap<String, Course> courseHashMap = new HashMap<>();
    courseHashMap.put("CS-101", course);
    HashMap<String, Students> studentDatabase = new HashMap<>();
    studentDatabase.put("sid", student);
    RegistrationStrategy registrationStrategy = new SimpleRegistrationStrategy();
    Orchestrator orchestrator = new Orchestrator(courseHashMap, studentDatabase, handler, registrationStrategy);
    Request request = new Request.Builder().courseName("CS-101").build();
    System.out.println(request.getCourseName());
    System.out.println(orchestrator.search(request));
  }
}
