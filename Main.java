public class Main{
    public static void main(String [] args){
        System.out.println("Hello from Splitwise!!");

        User user1 = new User("Deepak", "deepakmn@mescn.com", 01);
        User user2 = new User("Muskan", "muskanraj@mescn.com", 02);
        User user3 = new User("xxxx", "xxx@mescn.com", 03);

        Transaction transaction1 = new Transaction(user1, 100.0);
        Transaction transaction2 = new Transaction(user1, 50.0);
        Transaction transaction3 = new Transaction(user2, 60.0);

        Manager manager = new Manager();

        manager.addUserToGroup(user1);
        manager.addUserToGroup(user2);
        manager.addUserToGroup(user3);

        manager.addTransactionToGroup(transaction1);
        manager.addTransactionToGroup(transaction2);
        manager.addTransactionToGroup(transaction3);

        manager.showSplit();
    }
}