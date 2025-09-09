package CourseRegistrationSystem;

import java.util.List;
import java.util.Objects;

public class CourseNameSearchHandler implements SearchHandler{
  private final SearchHandler handler;

  public CourseNameSearchHandler(SearchHandler handler){
    this.handler = handler;
  }

  @Override
  public List<Course> handleSearch(Request request, List<Course> courseList) {
    System.out.println(courseList);
    if(request.getCourseName()!=null){
      List<Course> filteredCourse = courseList.stream().filter(course -> {
        if(Objects.equals(course.getCourseName(), request.getCourseName())){
          return true;
        }
        return false;
      }).toList();
      if(this.handler!=null){
      return this.handler.handleSearch(request, filteredCourse);
    }
      return filteredCourse;
    }
    if(this.handler!=null){
    return this.handler.handleSearch(request, courseList);
  }
    return courseList;
  }
}
