package com.example.cafe;

public abstract class CondimentDecorator extends Beverage{ //beverage 객체가 들어가는 자리에 들어갈 수 있어야 하므로 확장해야함
    protected Beverage beverage; //데코레이터가 감쌀 음료를 나타내는 Baverage 객체를 지정
    public abstract String getDescription(); //모든 첨가를 데코레이터에 getDescription() 새로 구현하도록 만들 예정
}
