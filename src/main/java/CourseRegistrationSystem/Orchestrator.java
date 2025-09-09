package CourseRegistrationSystem;

import java.util.HashMap;
import java.util.List;

public class Orchestrator {
  private HashMap<String, Course> courseDatabase;
  private HashMap<String, Students> studentsDatabase;
  private SearchHandler searchHandler;
  private RegistrationStrategy registrationStrategy;

  public Orchestrator(HashMap<String, Course>courseDatabase, HashMap<String, Students> studentsDatabase, SearchHandler searchHandler, RegistrationStrategy registrationStrategy){
    this.courseDatabase = courseDatabase;
    this.studentsDatabase = studentsDatabase;
    this.searchHandler = searchHandler;
    this.registrationStrategy = registrationStrategy;
  }
  public List<Course> search(Request request){
    System.out.println(this.courseDatabase.values().stream().toList());
    return this.searchHandler.handleSearch(request, this.courseDatabase.values().stream().toList());
  }
  public boolean registerCourse(Students student, Course course){
  return this.registrationStrategy.register(student, course);
  }
}
