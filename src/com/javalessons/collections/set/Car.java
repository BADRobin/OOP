package com.javalessons.collections.set;

public class Car {
    private final String carBrand;
    private final String model;
    private final Integer pricePerDay;

    public Car(String carBrand, String model, int pricePerDay) {
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
        Car car = (Car) obj;
        if (!this.model.equals(car.getModel())) {
            return false;
        }
        return this.pricePerDay.equals(car.getPricePerDay());
    }

//    x.equals(x) = true - reflexive
//    x.equals(y) = true y.equals(x) = true
//    a = b and b = c then a = c


    @Override
    public int hashCode() {
        int result = carBrand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + pricePerDay.hashCode();
        return result;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Car car = (Car) o;
//
//        if (carBrand != null ? !carBrand.equals(car.carBrand) : car.carBrand != null) return false;
//        if (model != null ? !model.equals(car.model) : car.model != null) return false;
//        return pricePerDay != null ? pricePerDay.equals(car.pricePerDay) : car.pricePerDay == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = carBrand != null ? carBrand.hashCode() : 0;
//        result = 31 * result + (model != null ? model.hashCode() : 0);
//        result = 31 * result + (pricePerDay != null ? pricePerDay.hashCode() : 0);
//        return result;
//    }
}
