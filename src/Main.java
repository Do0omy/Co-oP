import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean headFlag=false;
        while (headFlag!=true) {
            System.out.println("Welcome to Co-oP Gas Station\n" +
                    "1.Pump Fuel\n" +
                    "2.Wash your car\n" +
                    "3.Visit Repair Station\n" +
                    "4.visit Cafeteria\n" +
                    "5.visit McDonald's\n" +
                    "6.Exit Co-oP Gas Station\n"
            );

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Choose your Fuel Type\n" +
                            "1.Solar\n" +
                            "2.Petrol\n" +
                            "3.Gas\n" +
                            "4.Exit Pump\n" +
                            "Exit program by choosing any other input");
                    switch (sc.nextInt()){
                        case 1:
                            SolarPump Spump=new SolarPump(1);
                            System.out.println("Enter the Amount to fuel");
                            System.out.println("Price is "+Spump.PumpFuel(sc.nextInt()));
                            break;
                        case 2:
                            System.out.println("Enter your Petrol Quality(80,92,95)");
                            PetrolPump Ppump= new PetrolPump(1,sc.nextInt());
                            System.out.println("Enter the Amount to fuel");
                            System.out.println("Price is "+Ppump.PumpFuel(sc.nextInt()));
                            break;
                        case 3:
                            GasPump Gpump=new GasPump(1);
                            System.out.println("Enter the Amount to fuel");
                            System.out.println("Price is "+Gpump.PumpFuel(sc.nextInt()));
                            break;
                        case 4:
                            break;

                        default:
                            System.out.println("Exiting program");
                            headFlag=true;
                    }
                    break;
                case 2:
                    System.out.println("Welcome to the car wash\n" +
                            "1.Bronze Package-------Costs:50\n" +
                            "2.Silver Package-------Costs:100\n" +
                            "3.Platinum Package-------Costs:200\n" +
                            "4.Return to your car\n");
                    switch (sc.nextInt()){

                        case 1:
                            System.out.println("Welcome to the Bronze Package Price is 50LE\n" +
                                    "please return in 20 minutes\n");
                            break;
                        case 2:
                            System.out.println("Welcome to the Silver Package Price is 100LE\n" +
                                    "please return in 30 minutes\n");
                            break;
                        case 3:
                            System.out.println("Welcome to the Platinum Package Price is 200LE\n" +
                                    "please return in 40 minutes\n");
                            break;

                        case 4:
                            break;

                        default:
                            System.out.println("Exiting program");
                            headFlag=true;
                    }
                    break;

                case 3:
                    System.out.println("what symptoms is your car facing?\n" +
                            "1.car not balanced-------Costs:100\n" +
                            "2.car heats up-------Costs:200\n" +
                            "3.car noise is loud-------Costs:400\n" +
                            "4.exit\n" +
                            "(please write the symptom with the same case in each letter)\n");
                    sc.nextLine();
                    String symp =sc.nextLine();
                    CarRepair repairs=new CarRepair();
                    String broken=repairs.inspectCar(symp);
                    repairs.repairCar(broken);
                    break;
                case 4:
                    System.out.println("Welcome to the Cafeteria\n" +
                            "1.would you like to check our Products?\n" +
                            "(press any button to leave the program)\n");
                    Cafeteria cafe=new Cafeteria();
                    switch (sc.nextInt()){
                        case 1:
                            cafe.listProducts();
                            //no break here because he will attempt to purchase later after reading the menu
                        case 2:
                            System.out.println("How many items would you like to buy?");
                            String items[]=new String[sc.nextInt()];
                            for (int i=0;i<items.length;i++){
                                items[i]= sc.next();
                            }
                            cafe.Buy(items);
                            break;
                        default:
                            headFlag=true;
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Welcome to the Mcdonald's\n" +
                            "1.would you like to check our Products?\n" +
                            "press any button to leave the program\n");
                    McDonald Mac=new McDonald();
                    switch (sc.nextInt()){
                        case 1:
                            Mac.listProducts();
                            //no break here because he will attempt to purchase later after reading the menu
                        case 2:
                            System.out.println("How many items would you like to buy?");
                            String items[]=new String[sc.nextInt()];
                            for (int i=0;i<items.length;i++){
                                items[i]= sc.next();
                            }
                            Mac.Buy(items);
                            break;
                        default:
                            headFlag=true;
                            break;
                    }
                    break;
                case 6:
                    System.out.println("You've Exited Co-oP Gas Station\n");
                    headFlag = true;
                    break;
            }
        }
    }
}