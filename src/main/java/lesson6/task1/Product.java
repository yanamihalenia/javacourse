package lesson6.task1;

public class Product {

    public String productName;
    public int productPrice;
    public boolean productExist;
    public ProductType productType;

    public Product(String name, int price, boolean exist, ProductType type){
        this.productName = name;
        this.productPrice = price;
        this.productExist = exist;
        this.productType = type;
    }
}
