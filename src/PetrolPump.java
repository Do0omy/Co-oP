class PetrolPump extends FuelPump {
    int fuelQuality;

    public PetrolPump(int Pump_Number,int fuelQuality){
        super(Pump_Number);
        this.fuelQuality=fuelQuality;
    }

    public int getFuelQuality() {
        return fuelQuality;
    }

    public void setFuelQuality(int fuelQuality) {
        this.fuelQuality = fuelQuality;
    }

    public double PumpFuel(double Units_Fueled) {
        switch (this.fuelQuality) {
            case 80:
            {
                return Units_Fueled*getPetrol80_Litre_Price();
            }
            case 92:
            {
                return Units_Fueled*getPetrol92_Litre_Price();
            }
            case 95:
            {
                return Units_Fueled*getPetrol95_Litre_Price();
            }
        }
        return 0;
    }
}

