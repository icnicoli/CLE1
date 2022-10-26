public class MenuOption{
    private String label[] = {"No.", "Name", "Price"};
    private String products[][] = {{"Bacon Ranch Quesedillas", "Boneless Buffalo Wings", "Cherry Lime Press", "Chicken Crispers", "Cheesecake"}};
    protected int productNo[][] = {{1, 2, 3, 4, 5}};
    protected double price[][] = {{480.00, 395.00, 125.00, 395.00, 370.00}};


    public void DisplayMenu(){

        System.out.println("\nMenu:");
        System.out.println("*********** Monday Menu *********");
        System.out.println(label[0] + "\t\t" + label[1] + "\t\t\t" + label[2]);
        for (int i = 0; i < 5; i++){
            System.out.println(productNo[0][i] + "\t\t" + products[0][i] +  "\t-\t₱" + price[0][i]);
        }
    }
}
