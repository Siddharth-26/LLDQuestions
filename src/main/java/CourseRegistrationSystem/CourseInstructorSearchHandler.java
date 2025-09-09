package CourseRegistrationSystem;

import java.util.List;
import java.util.Objects;

public class CourseInstructorSearchHandler implements SearchHandler{
  private final SearchHandler handler;

  CourseInstructorSearchHandler(SearchHandler handler){
      this.handler = handler;
    }

    @Override
    public List<Course> handleSearch(Request request, List<Course> courseList) {
      if(request.getInstructor()!=null){
        List<Course> filteredCourse = courseList.stream().filter(course -> {
          if(Objects.equals(course.getInstructor(), request.getInstructor())){
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

