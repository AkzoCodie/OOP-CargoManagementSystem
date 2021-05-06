

public class Product {
    private int weight;
    private String payment_status;
    private int salary;
    private int unit_price;

    public Product(int weight, String payment_status, int ucret, int unit_price) {
        this.weight = weight;
        this.payment_status = payment_status;
        this.salary = ucret;
        this.unit_price = unit_price;
    }
    public static int calculateSalary(int weight, int unit_price){
        int result = unit_price * weight;
        return result;
    }

    @Override
    public String toString() {
        String result;

        result= weight + "*" + unit_price + "=" + salary + "\n";
        result+="Payment Status: " + payment_status;
        return result;
    }

}
