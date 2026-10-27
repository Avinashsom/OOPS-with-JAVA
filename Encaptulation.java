//what is it
//it bundles states and behaviour together and protect the object internal state uing controlled access through methods.


class Bank {
    private balance;

    void deposit(int amount){
        if(amount > 0){
            balance += amount;
        }
    }
}

class Main {
    public static void main(String []args){
        Bank bank = new Bank();

        bank.deposit(20000000000);
    }
}