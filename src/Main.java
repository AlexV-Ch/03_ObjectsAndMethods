public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk ");
        Basket basket_1 = new Basket();
        basket_1.add("Масло", 80, 2, 10);
        basket_1.print("Масло ");
        Basket basket_2 = new Basket();
        basket_2.add("Молоко", 70, 5);
        basket_2.print("Молоко");
     }
}
