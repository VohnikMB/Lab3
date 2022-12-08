package servise;

import servise.week.WeekDay;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    private final String name;
    private final List<ClientProductList> buyProduct;
    public float amount;

    public List<ClientProductList>  getBuyProduct() {
        return buyProduct;
    }


    public Client(String name, List<ClientProductList> buyProduct, List<Product> l) {
        this.name = name;
        this.buyProduct = buyProduct;
        for (ClientProductList productW : buyProduct) {
            this.amount=productW.amount;
            Storage.buyProductClient(l, ClientProductList.product.getName(), productW.amount);
        }
    }

    public void expensesUserOfPeriod(WeekDay weekDay) {
        float i = 0;
        for (ClientProductList productW : getBuyProduct()) {
            if (productW.getWeekDay().equals(weekDay)) {
                i += ClientProductList.prise;
            }
        }
        System.out.println("In "+weekDay.toString()+" "+name+" spent "+i+" UAH");
    }

    public List<ClientProductList> expensesClientProductListOfPeriod(WeekDay weekDay) {
        return getBuyProduct().stream().filter(buyProduct -> buyProduct.getWeekDay().equals(weekDay))
                .collect(Collectors.toList());
    }
    public ClientProductList mostIncome(WeekDay weekDay){
        return expensesClientProductListOfPeriod(weekDay).stream().max(Comparator
                .comparing(ClientProductList::getPrise)).orElse(null);
    }

    @Override
    public String toString() {
        StringBuilder end = new StringBuilder();
        for (ClientProductList product : buyProduct) {
            end.append(ClientProductList.product.getName()).append(" - ").append(ClientProductList.prise);
        }
        return "Client: " + name + "\nBuy: " + end + "\n";
    }


}


