package chain.of.responsibility;

public class UsingChain {
    public static void main(String[] args) {
        Director director = new Director();
        VicePresident vicePresident = new VicePresident();
        CEO ceo = new CEO();

        director.setSuccesor(vicePresident);
        vicePresident.setSuccesor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);
    }
}
