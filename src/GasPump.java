class GasPump extends FuelPump {

    public GasPump(int Pump_Number){
        super(Pump_Number);
    }

    @Override
    public double PumpFuel(double Units_Fueled){
        return Units_Fueled*getGas_M3_Price();
    }
}

