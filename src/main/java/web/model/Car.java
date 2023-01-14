package web.model;

import java.util.Objects;

public class Car {

    String model;
    String series;
    int engine;

    public Car() {
    }

    public Car(String model, String series, int engine) {
        this.model = model;
        this.series = series;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine == car.engine && model.equals(car.model) && series.equals(car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", engine=" + engine +
                '}';
    }
}
