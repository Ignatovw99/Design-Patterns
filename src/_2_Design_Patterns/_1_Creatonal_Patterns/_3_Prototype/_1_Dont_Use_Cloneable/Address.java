package _2_Design_Patterns._1_Creatonal_Patterns._3_Prototype._1_Dont_Use_Cloneable;

public class Address implements Cloneable {

    private String streetName;

    private Integer houseNumber;

    public Address(String streetName, Integer houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    // This is a deep copy
    @Override
    public Address clone() throws CloneNotSupportedException {
        return new Address(streetName, houseNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
