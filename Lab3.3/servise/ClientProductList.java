package servise;

import servise.week.WeekDay;

public class ClientProductList {
    public static Product product;
    public float amount;
    public static float prise;
    private WeekDay weekDay = WeekDay.Monday;
    public ClientProductList(Product product,float amount){
        this.amount=amount;
        ClientProductList.product =product;
        prise = product.getPrice()*amount;
    }
    public float getPrise() {
        return prise;
    }
    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
    @Override public String toString(){
        return "Product: " + product.getName() +" amount: "+amount+" - "+prise+" UAH ("+weekDay+");\n";
    }
}
