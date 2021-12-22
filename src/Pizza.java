

import java.util.ArrayList;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    ArrayList<String> toppings = new ArrayList<String>();

    void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ---\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping: toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
