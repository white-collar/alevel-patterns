package factory.pattern;

public class Dollar implements Currency{

    @Override
    public String getSymbol() {
        return "USD";
    }
}
