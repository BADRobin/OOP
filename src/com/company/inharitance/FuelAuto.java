package com.company.inharitance;

public abstract class FuelAuto extends Auto {
    private int availablePetrol;
    private int tankVolume;

    public FuelAuto(String producer, String model, Engine engine, int availablePetrol, int tankVolume) {
        super(producer, model, engine);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    public void fuelUp(int petrolVolume){
        availablePetrol+=petrolVolume;
        System.out.println("Fuel is adding");
    }



    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }




}
