public class Sergent {
    private ISupportService next = null;

    public void setNext(ServiceRequest next) {
        this.next = (ISupportService) next;
    }

    public void handleRequest(ServiceRequest request){
        if(request.getType() == ETypeRequest.CAPORAL){
            request.setConclusion("Caporal resolved the issue");
        } else {
            if(next != null){
                next.handleRequest(request);
            }
        }
    }

}
