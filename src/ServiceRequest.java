public class ServiceRequest {
    private ETypeEnum type;
    private String request = "";
    private String conclusion = "";

    public ServiceRequest(ETypeEnum type, String request) {
        this.type = type;
        this.request = request;
    }

    public ETypeEnum getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }

    public String getConclusion() {
        return conclusion;
    }
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

}
