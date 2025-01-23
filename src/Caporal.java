public class Caporal implements ISupportService {
    private ISupportService next = null;


    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    public void handleRequest(ServiceRequest request){
        if(request.getType() == ETypeRequest.CAPORAL){
            request.setConclusion("The caporal resolved the issue");
        } else {
            if(next != null){
                next.handleRequest(request);
            }
        }
    }
}
