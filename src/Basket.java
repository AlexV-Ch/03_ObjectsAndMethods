public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    /**Добавьте две статические переменные для хранения общей стоимости и общего
    количества всех товаров во всех корзинах.*/
    public static int countProduct = 0;
    public static int totalPriceProduct = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров :";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    /**Реализуйте статические методы, которые будут увеличивать значения этих переменных
    при добавлении в корзину новых товаров.*/
    public static void increaseCountProduct(int count) {
        Basket.countProduct = Basket.countProduct + count;
    }

    public static int getCountProduct() {
        return countProduct;
    }

    public static void increaseTotalPriceProduct(int price) {
        Basket.totalPriceProduct = Basket.totalPriceProduct + price;
    }

    public static int getTotalPriceProduct() {
        return totalPriceProduct;
    }

    /**Реализуйте статический метод расчёта средней цены товара во всех корзинах.
       Он должен рассчитывать и возвращать отношение общей стоимости всех корзин
       к общему количеству всех товаров.*/
    public static double getAveragePriceProduct() {
        return totalPriceProduct / countProduct;
    }

    /**Реализуйте статический метод расчёта средней стоимости корзины
      (отношение общей стоимости всех корзин к количеству корзин)*/
    public static double getAverageCostBasket() {
        return totalPriceProduct / count;
    }


    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price)
    {
        add(name, price, 1, 0);

    }

    public void add(String name, int price, int count)
    {
        add(name, price, count, 0);

    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
        increaseCountProduct(count);
        increaseTotalPriceProduct(price * count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;}

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общий вес корзины : " + getTotalWeight() + " кг.");
            System.out.println("Общее кол-во товаров: " + getCountProduct() + " шт. на сумму " + getTotalPriceProduct() + " руб.");
            System.out.println("Средняя стоимость одного товара " + getAveragePriceProduct() + " руб.");
            System.out.println("Средняя стоимость корзины " + getAverageCostBasket() + " руб.");
            System.out.println();
        }
    }



}
