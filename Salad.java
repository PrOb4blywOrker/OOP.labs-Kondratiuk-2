import java.util.*;
import java.util.stream.Stream;

public  class Salad {
    private List<Vegetable> ingredients;

    public Salad(Vegetable... _ingredients){
        ingredients = new ArrayList<>();
        ingredients.addAll(Arrays.asList(_ingredients));
    }

    public List<Vegetable> getIngredients() {
       List<Vegetable> lst = new ArrayList<>();
        lst.addAll(ingredients);
       return lst;
    }

    public int getSaladCaloricContent() {
        int caloricContent = 0;
        for (Vegetable v:ingredients) {
            caloricContent += v.getCaloricContent();
        }

        return caloricContent;
    }

    public List<Vegetable> sortVegetablesByKind() {
        ingredients.sort(new VegetableComparator());
        return getIngredients();
    }

    public Vegetable findByCaloricContent(int a, int b) {
        Stream<Vegetable> vegetableStream = ingredients.stream();
        Optional<Vegetable> answer = vegetableStream
                .filter(s -> s.getCaloricContent() >= a && s.getCaloricContent() <= b)
                .findFirst();

        return answer.orElse(null);
    }
}

class VegetableComparator implements Comparator<Vegetable> {

    public int compare(Vegetable a, Vegetable b){

        return a.getKind().toLowerCase().compareTo(b.getKind().toLowerCase());
    }
}