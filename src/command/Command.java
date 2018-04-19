/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Win-7
 */
public interface Command {
    void execute();
    void undo();
    void redo();
//    boolean isCollapsible(Command command);
//    void collapse(Command command);
    
    
}
