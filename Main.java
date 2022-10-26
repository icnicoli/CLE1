public class Main extends RequestOrder{
    public static void main(String []args){
        MenuOption mo = new MenuOption();
        RequestOrder ro = new RequestOrder();
        Diner d = new Diner("Name", "Tagline");

        d.setRName("Chilly's Bacolod");
        d.setRTagline("Sir, this isn't Wendy's");
        System.out.println("Welcome to " + d.getRName() + ": " + d.getRTagline() + "!");
        mo.DisplayMenu();
        ro.DisplayRequestOrder();
        ro.DisplayChoice();
        ro.DisplayPayment();
    }
}