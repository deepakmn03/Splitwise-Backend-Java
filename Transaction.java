public class Transaction {

    User user = new User();
    Double amountPaid;

    Transaction(User user, Double amountPaid){
        this.user = user;
        this.amountPaid = amountPaid;
    }
    Transaction(){
    }
    public User getUser(){
        return user;
    }
    public void setuser(User user){
        this.user = user;
    }
    public Double getAmount(){
        return amountPaid;
    }
    public void setAmount(Double amount){
        this.amountPaid = amount;
    }
}
