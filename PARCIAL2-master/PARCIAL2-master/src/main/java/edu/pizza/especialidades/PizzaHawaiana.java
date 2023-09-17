package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaHawaiana extends Pizza {
    public PizzaHawaiana() {
        super("Hawaiana", 90.0, new Topping("Jamón", 5.0), new Topping("Piña", 2.5), new Topping("Queso", 4.0));
    }
}


