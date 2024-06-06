package com.example.cafe.additives;

import com.example.cafe.Beverage;
import com.example.cafe.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    public double cost() {
        return beverage.cost() + .15;
    }

}
