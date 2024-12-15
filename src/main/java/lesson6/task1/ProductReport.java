package lesson6.task1;

public class ProductReport {

    public int totalCostDefiniteType(Product[] list, ProductType type){
        int cost = 0;
        for (Product product : list){
            if (product.productType == type){
                cost += product.productPrice;
            }
        }
        return cost;
    }

    public int countOfExistingProducts(Product[] list, ProductType type){
        int count = 0;
        for (Product product : list){
            if(product.productType == type && product.productExist == true){
                count++;
            }
        }
        return count;
    }
}
