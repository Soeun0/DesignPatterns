public interface PizzaIngredientFactory {
 	/* 모든 구상 팩토리에서 구현해야 하는 인터페이스
 	제품군을 만드는 방법을 정의하는 추상 인터페이스 */

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();

}
