public class Main {

    public static void main(String[] args) {


        System.out.println("=======Seller Information=======");
        System.out.println();
        Adress a1 = new Adress("Neighborhood", "Street", 4, "Province", "District");
        Product u1 = new Product(50, "Ödendi", 250, 5);

        Adress a2 = new Adress("Neighborhood", "Street", 5, "Province", "District");

        Customer seller = new Customer("Name1", "Surname1", "0123456789",a1,u1);
        Customer buyer = new Customer("Name2", "Surname2", "9876543210",a2,u1);

        System.out.println(seller);
        System.out.println();
        System.out.println("=======Buyer Information=======");
        System.out.println();
        System.out.println(buyer);


    }

}
