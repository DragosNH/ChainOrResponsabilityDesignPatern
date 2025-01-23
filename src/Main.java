import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {

        ISupportService general = new General();
        ISupportService sergent = new Sergent();
        ISupportService caporal = new Caporal();
        ISupportService soldat = new Soldat();

        general.setNext(sergent);
        sergent.setNext(caporal);
        caporal.setNext(soldat);

        ServiceRequest Request1 = new ServiceRequest(ETypeRequest.GENERAL, "Not my job");
        ServiceRequest Request2 = new ServiceRequest(ETypeRequest.SERGENT, "Not my job either");
        ServiceRequest Request3 = new ServiceRequest(ETypeRequest.CAPORAL, "Not my problem");
        ServiceRequest Request4 = new ServiceRequest(ETypeRequest.SOLDAT, "If I have to");

        general.handleRequest(Request1);
        general.handleRequest(Request2);
        general.handleRequest(Request3);
        general.handleRequest(Request4);

        System.out.println(Request1.getRequest());
        System.out.println(Request2.getRequest());
        System.out.println(Request3.getRequest());
        System.out.println(Request4.getRequest());


    }
}