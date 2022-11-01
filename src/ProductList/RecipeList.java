package ProductList;


import java.util.*;

public class RecipeList {

    public final HashMap<Product,Integer> recipes = new HashMap();

    public void addRecipe(Product product,Integer value) {
        if (value == 0 || value == null ) {
            value =1;
        }
        if (recipes.containsKey(product)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        } else {
            recipes.put(product,value);
        }
    }
    public float getRecipePrice() {
        float sum = 0;
        for (Map.Entry<Product, Integer> entry : recipes.entrySet()) {
            sum += entry.getKey().getPrice()*entry.getValue();
        }
        System.out.println("Стоимость рецепта:");
        return sum;
    }

    public StringBuilder getRecipeProducts() {
        StringBuilder pr = new StringBuilder("");
        String product1 = "";
        String qu = "";
        for (Map.Entry<Product, Integer> entry : recipes.entrySet()) {
            product1 = entry.getKey().getName();
            qu = String.valueOf(entry.getValue()) + "шт. ";
            pr.append(product1).append(qu);
        }
        System.out.println("Состав рецепта: ");
        return pr ;
    }
}
