/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiver;

/**
 *
 * @author Win-7
 */
public class Account {
    private String id;
    private double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public void deposite(double amount){
        balance += amount;
    }
    
    public void withDraw(double amount){
        if(balance < amount)
            throw new IllegalStateException("Saldo Insuficiente");
        else
            balance -= amount;
    }
}
