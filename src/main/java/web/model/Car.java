package web.model;

public class Car {
    private int id;
    private String series;
    private String model;
    public Car(){}

    public Car(int id, String series, String model) {
        this.id = id;
        this.series = series;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
