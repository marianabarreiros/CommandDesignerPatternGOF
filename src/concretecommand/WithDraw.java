/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecommand;

import command.Command;
import receiver.Account;

/**
 *
 * @author Win-7
 */
public class WithDraw implements Command{
    private Account account;
    private double amount;

    public WithDraw(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withDraw(amount);
    }

    @Override
    public void undo() {
        account.deposite(amount);
    }

    @Override
    public void redo() {
        execute();
    }
    
    
}
