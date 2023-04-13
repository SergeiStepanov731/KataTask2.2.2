package web.model;

public class Car {
    private String model;
    private int model_year;
    private String color;

    public Car() {

    }

    public Car(String model, int model_year, String color) {
        this.model = model;
        this.model_year = model_year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModel_year() {
        return model_year;
    }

    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", model_year=" + model_year +
                ", color='" + color + '\'' +
                '}';
    }
}
