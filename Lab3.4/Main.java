import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Crash crash = new Crash();
        calculation.start();
        //crash.start();
    }
}

class Calculation extends Thread {
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        float y,i,a,b;
        int c;
        do {System.out.println("Прямі витрати: ");
        i = in.nextFloat();} while (i <= 0);

        do {
            System.out.println("Загальновиробничі витрати(1-99%): ");
            y = in.nextFloat();
        } while (y <= 0 || y >= 100);
         i =i+(i*(y/100));
        do {
            System.out.println("Норма прибутку(1-99%): ");
            a = in.nextFloat();
        } while (a <= 0 || a >= 100);
        i =i+(i*(a/100));
        do {
            System.out.println("ПДВ(1-99%): ");
            b = in.nextFloat();
        } while (b <= 0 || b >= 100);
        i =i+(i*(b/100));
        do { System.out.println("Кількість продукції:");
        c=in.nextInt();} while (c <= 0);
        i=i/c;
        System.out.println("Ціна однієї одиниці продукції: "+i);

       Crash crash = new Crash();
       // crash.start();
    }
}

class Crash extends Thread {
    @Override
    public void run() {
        System.out.println("Помилка лише на цьому потоці: ");
        System.out.println(5 / 0);
    }
}