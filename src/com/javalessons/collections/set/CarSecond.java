package com.javalessons.collections.set;

public class CarSecond implements Comparable<CarSecond> {
    private final String carBrand;
    private final String model;
    private final Integer pricePerDay;

    public CarSecond(String carBrand, String model, int pricePerDay) {
        this.carBrand = carBrand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getModel() {
        return model;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        CarSecond carSecond = (CarSecond) obj;
        if (!this.model.equals(carSecond.getModel())) {
            return false;
        }
        return this.pricePerDay.equals(carSecond.getPricePerDay());
    }

    @Override
    public int hashCode() {
        int result = carBrand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + pricePerDay.hashCode();
        return result;
    }

    @Override
    public int compareTo(CarSecond carSecond) {
        if (pricePerDay < carSecond.getPricePerDay()) {
            return -1;
        }
        if (pricePerDay > carSecond.getPricePerDay()) {
            return 1;
        }
        return 0;
    }
}

