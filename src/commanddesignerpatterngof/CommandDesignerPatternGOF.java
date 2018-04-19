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
        Account account = new Account("1234", 2.000);
        Command deposite = new DepositeCommand(account, 400);
        Command withdraw = new WithDrawCommand(account, 600);
        
        UndoMeneger meneger = new UndoMeneger();
        meneger.execute(deposite);
        meneger.undo();
        meneger.redo();
        
        Stack<Command> undoStack = new Stack<Command>();
	Stack<Command> redoStack = new Stack<Command>();
        
        undoStack = meneger.getUndoStack();
        redoStack = meneger.getRedoStack();
        
        System.out.println(undoStack);
        System.out.println(redoStack);
   }             
 }
