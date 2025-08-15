package RideMatchingService;

import java.util.UUID;

public class Response {

  private String requestId;
  private RequestStatus requestStatus;

  public Response(String requestId){
    this.requestStatus = RequestStatus.PENDING;
    this.requestId = requestId;
  }

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public RequestStatus getRequestStatus() {
    return requestStatus;
  }

  public void setRequestStatus(RequestStatus requestStatus) {
    this.requestStatus = requestStatus;
  }
}
