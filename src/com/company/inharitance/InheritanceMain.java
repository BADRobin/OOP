package com.company.inharitance;

import java.util.List;

public class InheritanceMain {
    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);
        Engine busEngine = new Engine(3.5, EngineType.PETROL, 400);

        Auto truck = new Truck("Volvo", "Z360", truckEngine, 300, 500,  10000);
//        truck.start();
//        truck.accelerate(40);
//        truck.fuelUp(50);
//        truck.load();
//        truck.unload();
        System.out.println("\n");

        Auto electricCar = new ElectricCar("Tesla", "Model S", 400, 4);
//        electricCar.start();
//        electricCar.stop();
//        electricCar.charge();
        System.out.println("\n");

//        Bus bus = new Bus("Bogdan", "HZ", busEngine, 160, 32, 20);
        Auto bus = new Bus("Bogdan", "HZ", busEngine, 160, 32, 20);
//        bus.fuelUp();
//        bus.pikUpPassengers(5);
//        bus.start();
//        bus.releasePassengers();

//        Engine engine = bus.getEngine();
//        System.out.println(engine.getEngineType());
//        List<Piston> pistons = engine.getPistons();
//        System.out.println(pistons);

//        Auto auto = new Auto("WV", "Polo", busEngine);

        runCur(bus);
        runCur(truck);
        runCur(electricCar);
//        runCur(auto);
    }
    private static void runCur(Auto auto){
        auto.start();
        auto.stop();
        auto.energize();
//        if(auto instanceof FuelAuto) {
//            FuelAuto fAuto = (FuelAuto) auto;
//            fAuto.fuelUp(50);
//        }
    }
}
