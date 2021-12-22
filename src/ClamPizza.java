public class ClamPizza extends Pizza {
    private IPizzaIngredientFactory ingredientFactory;

    public ClamPizza(IPizzaIngredientFactory ingredientFactory) {
        ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
