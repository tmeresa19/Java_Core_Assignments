import java.util.Arrays;
import java.util.ArrayList;

public class CafeUtil {
    
    public static int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static double getOrderTotal(double[] prices) {
    double total = 0;
    for (double price : prices) {
        total += price;
    }
    return total;
}

public static void displayMenu(ArrayList<String> menuItems) {
    for (int i = 0; i < menuItems.size(); i++) {
        System.out.println(i + ". " + menuItems.get(i));
    }
}

public static void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName + "!");
    int numAhead = customers.size();
    System.out.println("There are " + numAhead + " people in front of you");
    customers.add(userName);
    System.out.println(customers);
}

}
