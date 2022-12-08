package servise;

public class Product {
    private String name;
    private float price;
    private Type type;
    private float amount;
    private final float priseOll;

    public Product(String name,float amount,float price,Type type){
        this.amount=amount;
        this.name=name;
        this.price=price;
        this.type=type;
        this.priseOll = price*amount;
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
    public float getPriceOll() {
        return priseOll;
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
        this.amount =this.amount + Math.abs(amount);
    }

    public void buyAmount(float amount) {
        this.amount =this.amount - Math.abs(amount);
    }
@Override public String toString(){
        return "Product: " + name+" amount: "+amount+" - "+price+" UAH ("+type+");\n";
}
}
