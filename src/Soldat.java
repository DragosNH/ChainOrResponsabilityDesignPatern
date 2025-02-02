public class Soldat implements ISupportService {
    private ISupportService next = null;


    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    public void handleRequest(ServiceRequest request){
        if (request.getType() == ETypeRequest.SOLDAT){
            request.setConclusion("The soldger resolved the task");
        } else {
            if(next != null){
                next.handleRequest(request);
            } else {
                request.setConclusion("The soldger could not resolve the task this time");
            }
        }
    }
}
