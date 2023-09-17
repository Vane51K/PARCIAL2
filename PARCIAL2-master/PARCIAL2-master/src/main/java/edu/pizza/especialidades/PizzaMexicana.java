package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaMexicana extends Pizza {
    public PizzaMexicana() {
        super("Mexicana", 110.0, new Topping("Carne de Res", 30.0), new Topping("Salsa Brava", 3.0), new Topping("Pico de Gallo", 5.0), new Topping("Queso", 6.0));
    }
}