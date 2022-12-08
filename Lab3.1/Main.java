import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> startList = Storage.getStorage();
        System.out.println(startList);
        startList = Storage.getAddStorage(startList,"Sausages", 6, 19f, Type.MEAT_PRODUCTS);
        startList = Storage.getAddStorage(startList,"Tomatoes", 22, 15f, Type.VEGETABLES);
        System.out.println(startList);
        Storage.addProduct(startList, "Tomatoes", 4);
        System.out.println(startList);
    }
}