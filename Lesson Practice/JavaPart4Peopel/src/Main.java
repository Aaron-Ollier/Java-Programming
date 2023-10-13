import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People Test = new People("Aaron", "Cheshire, Uk");

        System.out.println("\n");

        System.out.println("-- Person --");

        Scanner name = new Scanner(System.in);
        System.out.print("What is your name? : ");
        String getName = name.next();
        Test.setName(getName);

        System.out.println("\n");

        Scanner address = new Scanner(System.in);
        System.out.print("What is your address? : ");
        String getAddress = address.next();
        Test.setAddress(getAddress);

        System.out.println("\n");

        Test.displayInfo();

        Studant Test1 = new Studant("Aaron", "Cheshire, Uk", 2023, 9500.00, "Computer Science");

        System.out.println("\n");

        System.out.println("-- Studant --");

        Scanner nameSt = new Scanner(System.in);
        System.out.print("What is your name? : ");
        String getName1 = nameSt.next();
        Test1.setName(getName1);

        System.out.println("\n");

        Scanner addressSt = new Scanner(System.in);
        System.out.print("What is your address? : ");
        String getAddressSt = addressSt.next();
        Test1.setAddress(getAddressSt);

        System.out.println("\n");

        Scanner Year = new Scanner(System.in);
        System.out.print("What year are you in? : ");
        int getYear = Year.nextInt();
        Test1.setYear(getYear);

        System.out.println("\n");

        Scanner Program = new Scanner(System.in);
        System.out.print("What program are you taking? : ");
        String getProgram = Program.next();
        Test1.setProgram(getProgram);

        System.out.println("\n");

        Scanner Fee = new Scanner(System.in);
        System.out.print("How much did you pay for this? : ");
        double getFee = Fee.nextDouble();
        Test1.setFee(getFee);

        System.out.println("\n");

        Test1.displayInfoStudant();

        Staff Test2 = new Staff("Aaron", "Cheshire, Uk", "Oxford", 25000);

        System.out.println("\n");

        System.out.println("-- Staff --");

        Scanner nameSS = new Scanner(System.in);
        System.out.print("What is your name? : ");
        String getName2 = nameSS.next();
        Test2.setName(getName2);

        System.out.println("\n");

        Scanner addressSS = new Scanner(System.in);
        System.out.print("What is your address? : ");
        String getAddressSS = addressSS.next();
        Test2.setAddress(getAddressSS);

        System.out.println("\n");

        Scanner school = new Scanner(System.in);
        System.out.print("What school do you work at? : ");
        String getSchool = school.next();
        Test2.setSchool(getSchool);

        System.out.println("\n");

        Scanner pay = new Scanner(System.in);
        System.out.print("What is your annual pay? : ");
        double getPay = pay.nextDouble();
        Test2.setPay(getPay);

        System.out.println("\n");

        Test2.displayInfoStaff();
    }
}