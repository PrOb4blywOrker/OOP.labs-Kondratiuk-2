public class Cucumber extends Vegetable {
    private double length;

    public Cucumber(String kind, int caloricContent, double mass) {
        this.kind = kind;
        this.caloricContent = caloricContent;
        this.mass = mass;
    }

    public Cucumber(String kind, int caloricContent, double mass, double length) {
        this.kind = kind;
        this.caloricContent = caloricContent;
        this.mass = mass;
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getCaloricContent() {
        return this.caloricContent * this.mass / 100;
    }

    @Override
    public String toString() {
        return "Cucumber { kind: \" " + String.valueOf(this.kind) + "\" caloricContent: " +
                String.valueOf(caloricContent) + " (kalories/100 grams) mass: " +
                String.valueOf(this.mass) + " (grams) }";
    }
}
