package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaMariscos extends Pizza {
    public PizzaMariscos() {
        super("Mariscos", 150.0, new Topping("Camarones", 20.0), new Topping("Pedazos de Aleta de Tiburon", 10.0), new Topping("Filetitos de pescado", 10.5), new Topping("Salsa de Tomate", 1.5));
    }
}
