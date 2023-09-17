package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaItaliana extends Pizza {
    public PizzaItaliana() {
        super("Italiana", 100.0, new Topping("Salami", 5.0), new Topping("Aceitunas", 1.50), new Topping("Tomate", 3.5), new Topping("Queso", 6.0));
    }
}