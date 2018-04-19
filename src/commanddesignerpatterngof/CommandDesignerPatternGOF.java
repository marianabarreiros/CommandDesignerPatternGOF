/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddesignerpatterngof;

import command.Command;
import concretecommand.DepositeCommand;
import concretecommand.WithDrawCommand;
import involker.UndoMeneger;
import java.util.Stack;
import receiver.Account;

/**
 *
 * @author Win-7
 */
public class CommandDesignerPatternGOF {

   public static void main(String[] args) {
        Account account = new Account("1234", 2000);
        Command deposite = new DepositeCommand(account, 400);
        Command deposite1 = new DepositeCommand(account, 500);
//        Command deposite2 = new DepositeCommand(account, 600);
//        Command withdraw = new WithDrawCommand(account, 600);
//        Command withdraw1 = new WithDrawCommand(account, 700);
        
        UndoMeneger meneger = new UndoMeneger();
        meneger.execute(deposite);
        meneger.execute(deposite1);
//        meneger.execute(deposite2);
//        meneger.execute(withdraw);
        meneger.undo();
//        meneger.undo();
//        meneger.redo();
        
        Stack<Command> undoStack = new Stack<Command>();
	Stack<Command> redoStack = new Stack<Command>();
       
        System.out.println(meneger.getUndoStack());
        System.out.println(meneger.getRedoStack());
   }             
 }
