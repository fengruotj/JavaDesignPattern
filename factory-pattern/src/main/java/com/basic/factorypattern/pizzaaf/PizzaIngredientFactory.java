package com.basic.factorypattern.pizzaaf;

import com.basic.factorypattern.pizzaaf.ingredient.*;

/**
 * locate com.basic.factorypattern.pizzaaf
 * Created by MasterTj on 2018/12/25.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
