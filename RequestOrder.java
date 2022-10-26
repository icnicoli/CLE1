import java.util.Scanner;

public class RequestOrder extends MenuOption{
    int xorder;
    double quantity[] = new double[999];
    double total;
    String Choice;
    double payment;
    double change;
    Scanner sc = new Scanner(System.in);

    public void DisplayRequestOrder(){

        System.out.print("\nEnter Order No.: ");
        xorder = sc.nextInt();

        if (xorder == productNo[0][0]) {
            System.out.print("Quantity: ");
            quantity[0] = sc.nextInt();
            total = total +(price[0][0] * quantity[0]);
        }

        else if (xorder == productNo[0][1]) {
            System.out.print("Quantity: ");
            quantity[1] = sc.nextInt();
            total = total +(price[0][1] * quantity[1]);
        }

        else if (xorder == productNo[0][2]) {
            System.out.print("Quantity: ");
            quantity[2] = sc.nextInt();
            total = total +(price[0][2] * quantity[2]);
        }

        else if (xorder == productNo[0][3]) {
            System.out.print("Quantity: ");
            quantity[3] = sc.nextInt();
            total = total +(price[0][3] * quantity[3]);
        }

        else if (xorder == productNo[1][0]) {
            System.out.print("Quantity: ");
            quantity[4] = sc.nextInt();
            total = total +(price[1][0] * quantity[4]);
        }

        else if (xorder == productNo[1][1]) {
            System.out.print("Quantity: ");
            quantity[5] = sc.nextInt();
            total = total +(price[1][1] * quantity[5]);
        }

        else if (xorder == productNo[1][2]) {
            System.out.print("Quantity: ");
            quantity[6] = sc.nextInt();
            total = total +(price[1][2] * quantity[6]);
        }

        else if (xorder == productNo[1][3]) {
            System.out.print("Quantity: ");
            quantity[7] = sc.nextInt();
            total = total +(price[1][3] * quantity[7]);
        }
        else {
            System.out.println("Item is not on Menu");
            DisplayRequestOrder();
        }
    }

    public void DisplayChoice(){
        System.out.print("\nDo you want to order another item? Y/N: ");
        Choice = sc.next();

        if (Choice.equalsIgnoreCase("Y")){
            DisplayMenu();
            DisplayRequestOrder();
            DisplayChoice();
        }
        else if(!Choice.equalsIgnoreCase("N")){
            System.out.println("Choice invalid!");
            DisplayChoice();
        }
    }

    public void DisplayPayment(){
        System.out.println("\nTotal Price: ₱" + total);
        System.out.print("Enter amount of payment (Enter 0 to cancel payment): ");
        payment = sc.nextInt();

        if (payment < total && payment > 0){
            System.out.println("Not enough payment!");
            DisplayPayment();
        }
        else if (payment == 0){
            System.out.println("Payment has been cancelled");
            System.exit(0);
        }
        else{
            change = payment - total;
            System.out.println("\nYour change is: ₱" + change);
            System.out.println("Thank you for ordering!");
        }
    }
}
