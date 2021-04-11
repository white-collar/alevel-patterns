package chain.of.responsibility;

public class VicePresident extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VP can approve purchase below 1500");
            } else {
                succesor.handleRequest(request);
            }
        }
    }

}
