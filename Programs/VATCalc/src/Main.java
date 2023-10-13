public class Main {
    public static void main(String[] args) {

        // Variables
        final double VATRATE = 0.2;
        double price = 88.90;
        double total;
        double vatPrice;

        //Vat Calculation's
        vatPrice = price * VATRATE;

        System.out.println("Vat Cost = " + vatPrice);

        //Total Calculation's
        total = vatPrice + price;
        System.out.println("Total Cost = " + total);


    }
}