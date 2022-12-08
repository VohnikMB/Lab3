public class Product {
    private String name;
    private float price;
    private Type type;
    private float amount;

    public Product(String name,float amount,float price,Type type){
        this.amount=amount;
        this.name=name;
        this.price=price;
        this.type=type;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount =this.amount + amount;
    }
@Override public String toString(){
        return "Product: " + name+" amount: "+amount+" - "+price+" UAH ("+type+");\n";
}
}
