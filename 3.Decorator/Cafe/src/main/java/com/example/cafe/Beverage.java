package com.example.cafe;

public abstract class Beverage { //추상클래스
    protected String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost(); //추상메소드는 추상클래스에서만 사용 가능
    //cost는 서브클래스에서 구현해야 한다
}
