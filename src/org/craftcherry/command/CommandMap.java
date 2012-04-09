/* ©2012 CherryTools
* CherryTools is owned by Buddy251 and Everkosus
* This File is part of CherryToolsSMP.
* DO NOT:
* - Copy this File
* - Share this File under other name
* - Copy parts of this file without asking us.
* - Copy files without asking us.
* - Dont share this as your work
* YOU CAN DO:
* - Use this Mod :D
* - Ask us if you want to join CherryTools
* - help us and get Ideas.
* (sorry bad english :D)
*/

package org.craftcherry.command;

import java.util.ArrayList;
import org.craftcherry.plugin.Application;
import org.craftcherry.command.Command;

  /**
  * @author Buddy251
  **/

  public class CommandMap {
    private ArrayList<Command> simplecommandmap = new ArrayList<Command>(); 
    
    public void registerCommand(Application ap, String command, String permission) {
        simplecommandmap.add(new Command(ap, command, permission));
    }
    
    public void registerCommand(Application ap, String command) {
        simplecommandmap.add(new Command(ap, command));
    }
    
    public ArrayList getCommandMap() {
        return simplecommandmap;
    }
    
    public Command[] getSimpleCommandMap() {
        Command[] c = new Command[simplecommandmap.size()];
        for(int i = 0; i > c.length; i++) {
            c[i] = (Command) getCommandMap().get(i);
        }
        return c;
    }
    
    public boolean ex(Command cmd) {
       return getCommandMap().contains(cmd);
    }
    
    public boolean ex(String s) {
        for(Command c : simplecommandmap) {
            if(c.getCommand().equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    } 
  }
