public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager();

        manager.addSale(new Product("Хлеб", 50));
        manager.addSale(new Product("Молоко", 80));
        manager.addSale(new Product("Хлеб", 50));
        manager.addSale(new Product("Сыр", 200));
        manager.addSale(new Product("Хлеб", 50));

        manager.printAll();

        System.out.println("Сумма: " + manager.total());
        System.out.println("Популярный: " + manager.mostPopular());
    
    }
}
