import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class UserGroup {
    
    List<User> users = new ArrayList<>();
    HashMap<String, Double> amounts = new HashMap<>();

    public UserGroup() {
    }

    public void addExpense(Transaction transaction){
        String paidByUser = transaction.getUser().getName();
        Double amountPaid = transaction.getAmount();
        int groupSize = users.size();
        Double split = amountPaid/groupSize;

        for(User user : users){
            String userName = user.getName();
            Double currentAmount = amounts.getOrDefault(userName, 0.0);

            if(user.getName().equals(paidByUser)){
                amounts.put(paidByUser, currentAmount+amountPaid-split);
            }
            else {
                amounts.put(userName, currentAmount-split);
            }
        }
        System.out.println("new expense has been added worth (" + amountPaid +") by user (" + paidByUser + ")");
    }

    public void addUser(User user){
        users.add(user);
        amounts.put(user.getName(),0.0 );
        System.out.println(user.getName() + " has been added to group.");
    }

    public void showSplit(){
        System.out.println("Showing split for the user group \n");
        for(User user:users){
            System.out.println("Split for the user " + user.getName() + " : " + amounts.get(user.getName()) + "\n");
        }
    }
    
}
