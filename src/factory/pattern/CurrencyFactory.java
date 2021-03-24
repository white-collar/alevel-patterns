package factory.pattern;

public class CurrencyFactory {
    public static Currency getCurrency(String country) {
        switch (country) {
            case "USA": return new Dollar();

            case "AUSTRIA": return new Euro();

            case "UKRAINE": return new Hrivna();
            default:
                throw new IllegalStateException("Unexpected value: " + country);
        }
    }
}
