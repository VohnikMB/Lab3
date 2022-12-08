import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> startList = Storage.getStorage();
        System.out.println(startList);
        startList = Storage.getAddStorage(startList,"Sausages", 6, 19f);
        startList = Storage.getAddStorage(startList,"Tomatoes", 22, 15f);
        System.out.println(startList);
        Storage.addProduct(startList, "Tomatoes", 4);
        System.out.println(startList);

        List<ClientProductList> nadiaList = new ArrayList<>();
        List<ClientProductList> ivanList = new ArrayList<>();
        nadiaList.add(new ClientProductList(new Product("Tomatoes", 22, 15f),10));
        Client nadia = new Client("Nadia",nadiaList,startList);
        System.out.println(nadia);
        ivanList.add(new ClientProductList(new Product("Milk", 11, 24.50f),8));
        Client ivan = new Client("Ivan",ivanList,startList);
        System.out.println(ivan);
        System.out.println(startList);
    }
}