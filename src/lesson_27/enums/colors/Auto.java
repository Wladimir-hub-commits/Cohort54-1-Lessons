package lesson_27.enums.colors;

/**
 * Author Waldemar Ilz
 * {code data} 12.12.2024
 */

public class Auto {

    private String model;
    // private String color;
    private Color color;

    public Auto(String model, Color color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color=" + color +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
