package com.javalessons.firststep.inharitance;

public abstract class Auto {
    private String producer;
    private String model;
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;



    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        System.out.println("Auto was initialized");
    }

    public abstract void energize();
    public void start(){
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop(){
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public void accelerate(int kmPerHour){
        currentSpeed+= kmPerHour;
        System.out.println("Accelerating. Current speed is " + currentSpeed + " kPh");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engine +
                ", currentSpeed=" + currentSpeed +
                ", isRunning=" + isRunning +
                '}';
    }
    public static void doSmth(){

    }
}
