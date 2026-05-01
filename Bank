interface Bank {
    void displayBdetails();
}
class Customer{
    String cusname;
    int cusID;
    Customer(String n, int id){
        this.cusname=n;
        this.cusID=id;
        
    }
    void displayCusInfo(){
            System.out.println("Customer ID: " + cusID);
            System.out.println("Customer Name: " + cusname);
    }
}

class Account extends Customer implements Bank{
    int accNum;
    String accType;
    Account(String n, int id, int an, String at){
        super(n,id);
        this.accNum=an;
        this.accType=at;
    }
    public void displayBdetails(){
        System.out.println("Bank Name: ABC BANK");
        System.out.println("Branch: Newtown");
    }
    void fullDetails(){
        System.out.println("----------ACCOUNT DETAILS---------");
        displayBdetails();
        displayCusInfo();
        System.out.println("Account Number: "+accNum);
        System.out.println("Account Type: "+accType);
    }
}
class demo{
    public static void main(String[] args){
        Account acc = new Account("Bhumika Sasmal",101,123456,"Savings");
        acc.fullDetails();
    }
}
