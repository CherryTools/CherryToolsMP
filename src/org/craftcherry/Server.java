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

package org.craftcherry;

import org.craftcherry.command.CommandMap;

  /**
  * @author Buddy251
  **/
    
  public class Server {
    private static Logger log;
    private static CommandMap map;
    
    public static void main(String[] args) {
        System.out.println();
        map = new CommandMap();
        
    }
    public static Logger getLogger() {
        return log;
    }
    
    public static CommandMap getCommandMap() {
        return map;
    }
    
  }
