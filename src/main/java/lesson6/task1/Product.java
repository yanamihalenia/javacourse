package lesson6.task1;

public class Product {

    String productName;
    int productPrice;
    boolean productExist;
    ProductType productType;

    public Product(String name, int price, boolean exist, ProductType type){
        this.productName = name;
        this.productPrice = price;
        this.productExist = exist;
        this.productType = type;
    }
}
