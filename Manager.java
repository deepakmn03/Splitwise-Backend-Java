public class Manager {
    
    UserGroup userGroup = new UserGroup();

    public void addUserToGroup(User user){
        userGroup.addUser(user);
    }

    public void addTransactionToGroup(Transaction transaction){
        userGroup.addExpense(transaction);
    }

    public void showSplit(){
        userGroup.showSplit();
    }
}
