package CourseRegistrationSystem;

import java.util.List;
import java.util.Objects;

public class CourseIdSearchHandler implements SearchHandler{
  private final SearchHandler handler;

  public CourseIdSearchHandler(SearchHandler handler) {
    this.handler = handler;
  }

  @Override
  public List<Course> handleSearch(Request request, List<Course> courseList) {
    if(request.getCourseId()!=null){
      List<Course> filteredList = courseList.stream().filter(course->{
        if(Objects.equals(course.getCourseCode(), request.getCourseId()))
        {
          return true;
        }
        return false;
      }).toList();
      if(this.handler!=null) {
        return this.handler.handleSearch(request, filteredList);
      }
      return filteredList;
    }
    if(this.handler!=null){
      return this.handler.handleSearch(request, courseList);
    }
    return courseList;
  }
}
