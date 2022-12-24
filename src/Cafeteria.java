public class Cafeteria implements Retailers {

    private String[][] freezer = {
            {"1", "Water", "7"}
            , {"2", "Pepsi", "10"}
            , {"3", "Fanta", "10"}
            , {"4", "Fayrouz", "12"}
            , {"5", "Sprite", "10"}

            , {"6", "Miranda", "10"}
            , {"7", "7-Up", "10"}
            , {"8", "Coca-Cola", "10"}
            , {"9", "Mountain Dew", "12"}
    };
    private String[][] Snacks = {
            {"10", "Doritos", "6"}
            , {"11", "Sheetos", "6"}
            , {"12", "Break", "6"}
            , {"13", "Tiger", "6"}
            , {"14", "Snickers", "5"}
            , {"15", "Moro", "5"}
            , {"16", "Domty", "6"}
            , {"17", "Bake rolls", "5"}
            , {"18", "Bake Sticks", "5"}
    };
    private String[][] CoffeeMachine = {
            {"19", "Coffee", "30"}
            , {"20", "Cappuccino", "35"}
            , {"21", "Tea", "20"}
            , {"22", "Latte", "30"}
            , {"23", "American coffee", "50"}
            , {"24", "American tea", "50"}
            , {"25", "Nescafe", "60"}
            , {"26", "Mint tea", "30"}
            , {"27", "Espresso", "70"}
    };

    @Override
    public void listProducts() {
        for (int i = 0; i < freezer.length; i++) {
            System.out.println("Item number: " + freezer[i][0] + " Item name: " + freezer[i][1] + "-------Costs: $" + freezer[i][2]);
        }
        for (int i = 0; i < Snacks.length; i++) {
            System.out.println("Item number: " + Snacks[i][0] + " Item name: " + Snacks[i][1] + "-------Costs: $" + Snacks[i][2]);
        }
        for (int i = 0; i < CoffeeMachine.length; i++) {
            System.out.println("Item number: " + CoffeeMachine[i][0] + " Item name: " + CoffeeMachine[i][1] + "-------Costs: $" + CoffeeMachine[i][2]);
        }
    }

    @Override
    public double Buy(String[] items) {
        double Total = 0;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < freezer.length; j++) {
                if (items[i].equals(freezer[j][0])) {
                    Total = Total + Integer.parseInt(freezer[j][2]);
                }
            }
        }

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < Snacks.length; j++) {
                if (items[i].equals(Snacks[j][0])) {
                    Total = Total + Integer.parseInt(Snacks[j][2]);
                }
            }
        }

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < CoffeeMachine.length; j++) {
                if (items[i].equals(CoffeeMachine[j][0])) {
                    Total = Total + Integer.parseInt(CoffeeMachine[j][2]);
                }
            }
        }
        System.out.println("Total: "+Total);
        return Total;
    }
}