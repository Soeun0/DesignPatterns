package com.example.cafe.BeverageList;

import com.example.cafe.Beverage;

public class Espresso extends Beverage {
    public Espresso () {
        description = "에스프레소" ;
    }

    public double cost(){
        return 1.99;
    }
}
