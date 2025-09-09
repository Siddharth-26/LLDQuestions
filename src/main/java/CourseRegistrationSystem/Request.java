package CourseRegistrationSystem;

public class Request {
  private String courseId;
  private String courseName;
  private String instructor;

  private Request(Builder b){
    this.courseId = b.courseId;
    this.courseName = b.courseName;
    this.instructor = b.instructor;
  }

  public static class Builder{
    private String courseId;
    private String courseName;
    private String instructor;
    public Builder courseId(String courseId){
      this.courseId = courseId;
      return this;
    }
    public Builder courseName(String courseName){
      this.courseName = courseName;
      return this;
    }
    public Builder instructor(String instructor){
      this.instructor = instructor;
      return this;
    }
    public Request build(){
      return new Request(this);
    }
  }

  public String getCourseId() {
    return courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public String getInstructor() {
    return instructor;
  }
}
