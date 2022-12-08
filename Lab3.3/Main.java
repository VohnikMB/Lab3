import servise.*;
import servise.week.WeekDay;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> startList = Storage.getStorage();

        startList = Storage.getAddStorage(startList,"Sausages", 6, 19f, Type.MEAT_PRODUCTS);
        startList = Storage.getAddStorage(startList,"Tomatoes", 22, 15f, Type.VEGETABLES);
        Storage.addProduct(startList, "Tomatoes", 4);

        System.out.println("Методи сотрування\n\nЗа назвою продукту:\n"+Storage.sortedByName(startList)
                +"\nЗа зростанням ціни:\n"+Storage.sortedByPriseMore(startList)
                +"\nЗа спаданням ціни:\n"+Storage.sortedByPriseLess(startList)
                +"\nФільтр по типу продуктів(Фрукти): \n"+Storage.filterByType(startList,Type.FRUITS));

        List<ClientProductList> nadiaList = new ArrayList<>();
        List<ClientProductList> ivanList = new ArrayList<>();
        nadiaList.add(new ClientProductList(new Product("Tomatoes", 22, 15f, Type.VEGETABLES),10));
        Client nadia = new Client("Nadia",nadiaList,startList);
        System.out.println("\nУсі покупки певного користувача:\n"+nadia);
        ivanList.add(new ClientProductList(new Product("Milk", 11, 24.50f, Type.DAIRY_PRODUCTS),8));
        Client ivan = new Client("Ivan",ivanList,startList);
        System.out.println(ivan);

        System.out.println("Середня ціна усіх продуктів: "+Storage.averagePrice(startList)
        +"\nВитрати клієнта за певний період: ");

        ivan.expensesUserOfPeriod(WeekDay.Friday);
        ivan.expensesUserOfPeriod(WeekDay.Monday);
        System.out.println("Найпопулярніший прибуток:");
        System.out.println(ivan.mostIncome(WeekDay.Monday)+"Найпопулярніший продукт:\n"+Storage.mostPopularProduct(startList));
    }
}