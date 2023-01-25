import java.util.Scanner;

public class PSSApplication {
    /** 
     * Application should be a repeating menu capable of adding, displaying, and removing pets
     */
    public static void main(String[] args){
        PetStoreService pss = new PetStoreService();
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        while(go){
            System.out.println("Please choose: Add | Purchase | Exit");
            System.out.println("Current Pets: " + pss.getPets());
            String input = sc.nextLine();
            if(input.equals("Add")){
                System.out.println("Input the name of the pet you would like to Add: ");
                String name = sc.nextLine();
                pss.addPet(name);
            }else if (input.equals("Purchase")){
                System.out.println("Input the name of the pet you would like to purchase: ");
                // String idInput = sc.nextLine();
                // pss.purchasePet(Integer.parseInt(idInput));
                String name = sc.nextLine();
                pss.purchasePet(name);
            }else if(input.equals("Exit")){
                System.out.println("Ending Pet Store, have a nice day!");
                go = false;
            }else{System.out.println("Invalid input.");}
        }
        sc.close();
    }
    
}
