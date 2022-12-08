public class Product {
    private String name;
    private float price;

    private float amount;

    public Product(String name,float amount,float price){
        this.amount=amount;
        this.name=name;
        this.price=price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

   public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount =this.amount + Math.abs(amount);
    }

    public void buyAmount(float amount) {
        this.amount =this.amount - Math.abs(amount);
    }
@Override public String toString(){
        return "Product: " + name+" amount: "+amount+" - "+price+" UAH;\n";
}
}
