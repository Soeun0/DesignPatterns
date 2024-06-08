public abstract class PizzaStore {
 	/* 생산자(Create) 클래스 - 추상 생산자 클래스
	서브클래스에서 제품을 생산하려고 구현하는 팩토리 메소드를 정의
	어떤 객체가 만들어 지는지는 서브 클래스가 결정한다.
	모든 객체를 캡슐화 한다. */

	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
