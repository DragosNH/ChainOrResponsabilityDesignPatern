public class Sergent implements ISupportService {
    private ISupportService next = null;


    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request){
        if(request.getType() == ETypeRequest.SERGENT){
            request.setConclusion("The sergent resolved the issue");
        } else {
            if(next != null){
                next.handleRequest(request);
            }
        }
    }

}
