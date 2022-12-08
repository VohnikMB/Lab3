import java.util.List;

public class Client {
    private final String name;
    private final List<ClientProductList> buyProduct;

    public Client(String name, List<ClientProductList> buyProduct, List<Product> l) {
        this.name = name;
        this.buyProduct = buyProduct;
        for (ClientProductList productW : buyProduct) {
            Storage.buyProductClient(l, ClientProductList.product.getName(), productW.amount);
        }
    }

    @Override
    public String toString() {
        StringBuilder end= new StringBuilder();
        for (ClientProductList product : buyProduct) {
            end.append(ClientProductList.product.getName()).append(" - ").append(ClientProductList.prise);
        }
        return "Client: " + name + "\nBuy: " + end+"\n";
    }

}


