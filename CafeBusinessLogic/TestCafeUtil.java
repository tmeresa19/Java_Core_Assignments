import java.util.ArrayList;

public class TestCafeUtil {
    
    public static void main(String[] args) {
        CafeUtil cafeUtil = new CafeUtil();
        int streakGoal = cafeUtil.getStreakGoal();
        System.out.println(streakGoal); // print 55

        streakGoal = cafeUtil.getStreakGoal(12); // for 12 weeks
        System.out.println(streakGoal); // print 78
    
    
        double[] prices = {2.5, 3.75, 1.25, 4.0};
        double total = CafeUtil.getOrderTotal(prices);
        System.out.println("Total order amount: $" + total);
    
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        CafeUtil.displayMenu(menuItems);

        ArrayList<String> customers = new ArrayList<String>();
        CafeUtil.addCustomer(customers);
        CafeUtil.addCustomer(customers);
        CafeUtil.addCustomer(customers);
    
    }

    
}
