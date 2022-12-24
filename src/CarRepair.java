import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarRepair {

    private static String[]CarPart={"Tire","Oil","Engine"};
    private static int[] prices={100,200,400};
    private List<String> SymptomList= Arrays.asList("car not balanced","car heats up","car noise is loud");
    public static void setCarPart(String[] carPart) {
        CarPart = carPart;
    }
    public static String[] getCarPart() {
        return CarPart;
    }

    public String inspectCar(String Symptoms){
        String brokenParts="";
        if(SymptomList.contains(Symptoms)){
            int SIndex=SymptomList.indexOf(Symptoms);
            brokenParts=this.CarPart[SIndex];
            System.out.println(this.CarPart[SIndex]+" is malfunctioning ");
        }
        return brokenParts;
    }

    public void repairCar(String BrokenParts) {
        double total = 0;
        System.out.println("The " + BrokenParts + " has been repaired");
        if (BrokenParts.equals("Tire")) {
            total += prices[0];
        } else if (BrokenParts.equals("Oil")) {
            total += prices[1];
        } else if (BrokenParts.equals("Engine")) {
            total += prices[2];
        }
        System.out.println("Total is: "+total+"\n-----------------------\n");
    }
}

