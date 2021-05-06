public class Customer {
    private String name;
    private String surname;
    private String tel_no;
    private Adress address_info;
    private Product product_info;


    public Customer(String name, String surname, String tel_no, Adress address_info, Product product_info) {
        this.name = name;
        this.surname = surname;
        this.tel_no = tel_no;
        this.address_info = address_info;
        this.product_info = product_info;
    }

    public String toString(){
        String result;

        result = name + " " + surname + " " + tel_no + "\n";
        result += "Address:\n" + address_info;
        result += "Product:\n" + product_info;
        return result;
    }
}
