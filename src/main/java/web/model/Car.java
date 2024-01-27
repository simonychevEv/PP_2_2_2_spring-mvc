package web.model;

public class Car {
    private String model;
    private String engine;
    private int series;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car(String model, String engine, int series) {
        this.model = model;
        this.engine = engine;
        this.series = series;
    }
}
