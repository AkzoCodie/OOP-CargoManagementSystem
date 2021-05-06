public class Adress {

    private String neighborhood;
    private String street;
    private int apartment_number;
    private String province;
    private String district;

    public Adress(String neighborhood, String street, int apartment_number, String province, String district) {
        this.neighborhood = neighborhood;
        this.street = street;
        this.apartment_number = apartment_number;
        this.province = province;
        this.district = district;
    }

    @Override
    public String toString() {
        return neighborhood + " " + street + " " + " " + apartment_number + "\n" + province + "/" + district + "\n";
    }
}
