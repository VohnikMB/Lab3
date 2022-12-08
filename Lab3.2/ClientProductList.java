public class ClientProductList {
    public static Product product;
    public float amount;
    public static float prise;
    public ClientProductList(Product product,float amount){
        this.amount=amount;
        ClientProductList.product =product;
        prise = product.getPrice()*amount;
    }
}
