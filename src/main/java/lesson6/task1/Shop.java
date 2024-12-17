package lesson6.task1;

public class Shop {
    public static void main(String[] args) {

        ProductReport productReport = new ProductReport();

        Product [] list = {
                new Product("Samsung", 340, true, ProductType.MOBILE),
                new Product("AirPods2", 280, true, ProductType.AUDIO),
                new Product("Samsung", 550, false, ProductType.TV),
                new Product("Horizont", 470, true, ProductType.TV),
                new Product("IPhone", 550, false, ProductType.MOBILE),
                new Product("Samsung24", 550, true, ProductType.TV),
        };

        ProductType type = ProductType.TV;
        int total = productReport.totalCostDefiniteType(list, type);
        System.out.println("Total price (defined type): " + total);

        int count = productReport.countOfExistingProducts(list, type);
        System.out.println("Total count of existing product: " + count);

    }
}
