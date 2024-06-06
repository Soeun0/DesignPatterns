public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore ny = new NYPizzaStore();

        Pizza pizza = ny.orderPizza("cheese");
        System.out.println("소은이 주문한 " + pizza.getName()+"\n");

        pizza = ny.orderPizza("pepperoni");
        System.out.println("민용이 주문한 " + pizza.getName()+"\n");
    }
}
