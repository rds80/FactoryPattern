public class NYStyleClamPizza extends Pizza {
    private IPizzaIngredientFactory ingredientFactory;

    public NYStyleClamPizza(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }

    @Override
    void prepare() {
        
    }
}
