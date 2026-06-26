package cognizant;

class Bank {
    // Variable private hai, isko bahar se direct koi touch nahi kar sakta
    private int balance;

    // Getter method balance check karne ke liye
    public int getBalance() { // Spelling thik kar di: getBalanace -> getBalance
        return balance;
    }

    // Setter/Deposit method balance update karne ke liye rules ke saath
    public void deposit(int amount) { 
     //   if (amount > 0) {
            balance += amount;
//        } else {
//            System.out.println("Bhai, amount 0 se bada hona chahiye!");
//        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // 1. Paise deposit karne ke liye method call karo
        bank.deposit(5000);

        // 2. Balance check karne ke liye getter use karo
        System.out.println("Current Balance: " + bank.getBalance());
        
        // Agar tum 'bank.balance = 200' ya 'bank.amount' likhoge toh compile ERROR aayega.
        // Yahi Encapsulation ki security hai!
    }
}