package chain.of.responsibility;

public abstract class Handler {

    protected Handler succesor;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public abstract void handleRequest(Request request);
}
