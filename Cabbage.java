public class Cabbage extends Vegetable {
    private double radius;// mm

    public Cabbage(String kind, int caloricContent, double mass) {
        this.kind = kind;
        this.caloricContent = caloricContent;
        this.mass = mass;
    }

    public Cabbage(String kind, int caloricContent, double mass, double radius) {
        this.kind = kind;
        this.caloricContent = caloricContent;
        this.mass = mass;
        this.radius = radius;
    }

    @Override
    double getCaloricContent() {
        return this.caloricContent * this.mass/100;
    }

    @Override
    public String toString() {
        return "Cabbage { kind:\"" + String.valueOf(this.kind) + "\" caloricContent: " +
                String.valueOf(caloricContent) + " (kalories/100 grams) mass: " +
                String.valueOf(this.mass) + " (grams) }";
    }


}
