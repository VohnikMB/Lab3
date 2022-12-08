import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Storage {


    public static List<Product> getStorage() {
        return List.of(
                new Product("Milk", 40, 24.50f, Type.DAIRY_PRODUCTS),
                new Product("Yogurt", 35, 12f, Type.DAIRY_PRODUCTS),
                new Product("Apple", 12, 2.50f, Type.FRUITS),
                new Product("Pomegranate", 8, 18.50f, Type.FRUITS),
                new Product("Potato", 27, 3.25f, Type.VEGETABLES),
                new Product("Chicken", 2, 28f, Type.MEAT_PRODUCTS)
        );
    }

    public static List<Product> getAddStorage(List<Product> actualList,String name, float amount, float price, Type type){
        actualList = new ArrayList<>(actualList);
        actualList.add(new Product( name, amount, price,type));
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
    }
    public static List<Product> addProductList(List<Product> products,String name,float i){
        List<Product> productsAdd=new ArrayList<>(filterByProductName(products,name));
        for (Product product:products){
            if (productsAdd.contains(product)){
                product.setAmount(i);
            }
        }
        return products;
    }

    public static void buyProductClient(List<Product> products, String name, float i){
        List<Product> productsAdd=new ArrayList<>(Storage.filterByProductName(products,name));
        for (Product product:products){
            if (productsAdd.contains(product)){
                product.buyAmount(i);
            }
        }
    }




}
