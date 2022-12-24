public class McDonald implements Retailers{

    private String[][] menu={
            {"1","Big Mac","100"}
            , {"2","Chicken Mac","105"}
            , {"3","Chicken Fillet","110"}
            , {"4","Filet-o-Fish","115"}
            , {"5","Fries","30"}
            , {"6","Onion rings","30"}
            , {"7","Coca Cola","20"}
            , {"8","Sprite","20"}
            , {"9","Fanta","20"}
            , {"10","Water","15"}
            , {"11","Ice cream","20"}
            , {"12","chicken naggets","50"}
    };

    @Override
    public void listProducts() {
        System.out.println("Our McDonald's Menu Contains: ");
        for (int i=0;i< menu.length;i++){
            System.out.println("Item number: "+menu[i][0]+" Item name: "+menu[i][1]+"-------Costs: $"+menu[i][2]);
        }
    }

    @Override
    public double Buy(String[] items) {
        double Total=0;
        for (int i=0;i<items.length;i++){
            for (int j=0;j< menu.length;j++){
                if(items[i].equals(menu[j][0])){
                    Total=Total+Integer.parseInt(menu[j][2]);
                }
            }
        }
        System.out.println("Total: "+Total);
        return Total;
    }
}