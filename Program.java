public class Program {
    public static void main(String[] args) {
        Cabbage cabbage = new Cabbage("White cabbage",25,1000);
        Cucumber cucumber1 = new Cucumber("Eropheus", 16, 100);
        Cucumber cucumber2 = new Cucumber("Ant",16,80);
        Cucumber cucumber3 = new Cucumber("Moscow evenings",16,120);
        Carrot carrot1 = new Carrot("Amsterdam", 32,50);
        Carrot carrot2 = new Carrot("Tuchon", 32, 80);
        Salad salad = new Salad(cabbage,cucumber1,cucumber2,cucumber3,carrot1,carrot2);

        salad.getIngredients().forEach(vegetable -> {System.out.println(vegetable.toString()); });

        salad.getIngredients().forEach(vegetable -> {System.out.println(vegetable.getCaloricContent()); });

        System.out.println("Caloric content of salad:" + salad.getSaladCaloricContent());

        Vegetable v = salad.findByCaloricContent(100,300);

        if (v != null) {
            System.out.println(v + "\n");
        } else {
            System.out.println("not found");
        }

        System.out.println("Sorted by kind :");
        salad.sortVegetablesByKind()
                .forEach(vegetable ->
                        System.out.println(vegetable.toString()));
    }
}
