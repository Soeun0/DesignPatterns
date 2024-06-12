public class SimplePizzaFactory {
    //해당 클래스에서 하는 일은 클라이언트가 받을 피자를 만드는 것이다.
    public Pizza createPizza(String type) {
        //클라이언트가 새로운 객체 인스턴스를 만들 때 호출하는 메소드
        Pizza pizza = null;

        if (type.equals("cheese")) { //피자 종류 결정하는 코드
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}