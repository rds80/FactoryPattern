public class ChicagoStyleVeggiePizza extends Pizza {
    private IPizzaIngredientFactory ingredientFactory;

    public ChicagoStyleVeggiePizza(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public ChicagoStyleVeggiePizza() {
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

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
