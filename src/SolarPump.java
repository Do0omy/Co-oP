class SolarPump extends FuelPump {


    public SolarPump(int Pump_Number){
        super(Pump_Number);
    }

    @Override
    public double PumpFuel(double Units_Fueled) {
        return Units_Fueled * getSolar_Litre_Price();
    }
}