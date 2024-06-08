import java.util.ArrayList;

public abstract class Pizza {
	/* 제품 클래스
	팩토리는 제품을 생산 -> Store는 Pizza를 만든다.
	구현하는 다양한 구상클래스가 존재한다. (피자 종류)*/

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();



	void prepare() {
		System.out.println("준비중: " + name);
		System.out.println("도우를 돌리는 중...");
		System.out.println("소스를 뿌리는 둥...");
		System.out.println("토핑을 올리는 중...");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
  
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
  
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}

 
 
