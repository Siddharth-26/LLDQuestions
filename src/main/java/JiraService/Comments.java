package JiraService;


public class Comments {
  String author;
  int messageId;
  String comment;

  public Comments(String author, int messageId, String comment){
    this.author = author;
    this.messageId = messageId;
    this.comment = comment;
  }
}
