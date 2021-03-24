package builder.pattern;

public class Address {
    private String apartmentNumber;
    private String streetNumber;
    private String streetName;
    private String streetType;
    private String city;
    private String province;
    private String postalCode;


    public Address(String apartmentNumber, String streetNumber, String streetName, String streetType, String city, String province, String postalCode) {
        this.apartmentNumber = apartmentNumber;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.streetType = streetType;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public Address(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Address(String apartmentNumber, String streetNumber) {
        this.apartmentNumber = apartmentNumber;
        this.streetNumber = streetNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
