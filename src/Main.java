public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Сыр", 140);
        basket.print("Сыр ");
        Basket basket_1 = new Basket();
        basket_1.add("Масло", 80, 2, 10);
        basket_1.print("Масло ");
        Basket basket_2 = new Basket();
        basket_2.add("Молоко", 70, 5);
        basket_2.add("Хлеб", 30, 3);
        basket_2.print("Молоко ");

        System.out.println("Общее кол-во корзин " + Basket.getCount() + " шт.");
        System.out.println("Общее кол-во товаров: " + Basket.getCountProduct() + " шт. на сумму " + Basket.getTotalPriceProduct() + " руб.");
        System.out.println("Средняя стоимость одного товара " + Basket.getAveragePriceProduct() + " руб.");
        System.out.println("Средняя стоимость корзины " + Basket.getAverageCostBasket() + " руб.");


     }
}
