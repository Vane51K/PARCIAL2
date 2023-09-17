package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaVegetariana extends Pizza {
    public PizzaVegetariana() {
        super("Vegetariana", 110.0, new Topping("Chile Dulce", 3.0), new Topping("Gitomates", 2.5), new Topping("Zanahoria", 3.0), new Topping("Queso", 1.0));
    }
}


