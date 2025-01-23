public class General implements ISupportService{
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }


    @Override
    public void handleRequest(ServiceRequest request) {
        if(request.getType() == ETypeRequest.GENERAL) {
            request.setConclusion("Task done");
        }else {
            if(next != null) {
                next.handleRequest(request);
            }
        }
    }
}
