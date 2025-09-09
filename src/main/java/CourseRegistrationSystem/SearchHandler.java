package CourseRegistrationSystem;

import java.util.List;

public interface SearchHandler {
  public List<Course> handleSearch(Request request, List<Course> courseList);
}
