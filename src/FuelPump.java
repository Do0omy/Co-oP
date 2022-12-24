abstract class FuelPump {
    private int Pump_Number;
    private static double Petrol80_Litre_Price=8;
    private static double Petrol92_Litre_Price=9.25;
    private static double Petrol95_Litre_Price=10.750;
    private static double Solar_Litre_Price=7.25;
    private static double Gas_M3_Price=3.75;

    public FuelPump(int Pump_Number){
        this.Pump_Number=Pump_Number;
    }

    public int getPump_Number() {
        return Pump_Number;
    }

    public static double getPetrol80_Litre_Price() {
        return Petrol80_Litre_Price;
    }

    public static double getPetrol92_Litre_Price() {
        return Petrol92_Litre_Price;
    }

    public static double getPetrol95_Litre_Price() {
        return Petrol95_Litre_Price;
    }

    public static double getSolar_Litre_Price() {
        return Solar_Litre_Price;
    }

    public static double getGas_M3_Price() {
        return Gas_M3_Price;
    }

    public void setPump_Number(int pump_Number) {
        Pump_Number = pump_Number;
    }

    public static void setPetrol80_Litre_Price(double petrol80_Litre_Price) {
        Petrol80_Litre_Price = petrol80_Litre_Price;
    }

    public static void setPetrol92_Litre_Price(double petrol92_Litre_Price) {
        Petrol92_Litre_Price = petrol92_Litre_Price;
    }

    public static void setPetrol95_Litre_Price(double petrol95_Litre_Price) {
        Petrol95_Litre_Price = petrol95_Litre_Price;
    }

    public static void setSolar_Litre_Price(double solar_Litre_Price) {
        Solar_Litre_Price = solar_Litre_Price;
    }

    public static void setGas_M3_Price(double gas_M3_Price) {
        Gas_M3_Price = gas_M3_Price;
    }

    abstract double PumpFuel(double Units_Fueled);
}

