import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Storage {

    public static List<Product> getStorage() {
        return List.of(
                new Product("Milk", 40, 24.50f),
                new Product("Yogurt", 35, 12f ),
                new Product("Apple", 12, 2.50f),
                new Product("Pomegranate", 8, 18.50f),
                new Product("Potato", 27, 3.25f),
                new Product("Chicken", 2, 28f)
        );
    }

    public static List<Product> getAddStorage(List<Product> actualList,String name, float amount, float price){
        actualList = new ArrayList<>(actualList);
        actualList.add(new Product( name, amount, price));
        Checked_Exception.saveInTxt(actualList.toString());
        return actualList;
    }
    public static List<Product>filterByProductName(List<Product> products, String name){
        return products.stream()
                .filter(product -> product.getName().equals(name)).collect(Collectors.toList());
    }

    public static void addProduct(List<Product> products, String name, float i){
        List<Product> productsAdd=new ArrayList<>(filterByProductName(products,name));
        for (Product product:products){
            if (productsAdd.contains(product)){
                product.setAmount(i);
            }
        }
        Checked_Exception.saveInTxt(products.toString());
    }
    public static List<Product> addProductList(List<Product> products,String name,float i){
        List<Product> productsAdd=new ArrayList<>(filterByProductName(products,name));
        for (Product product:products){
            if (productsAdd.contains(product)){
                product.setAmount(i);
            }
        }
        Checked_Exception.saveInTxt(products.toString());
        return products;
    }

    public static void buyProductClient(List<Product> products, String name, float i){
        List<Product> productsAdd=new ArrayList<>(Storage.filterByProductName(products,name));
        for (Product product:products){
            if (productsAdd.contains(product)){
                product.buyAmount(i);
            }
        }
        Checked_Exception.saveInTxt(products.toString());
    }

}
