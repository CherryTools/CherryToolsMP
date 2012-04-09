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

  /**
  * @author Buddy251
  **/

  public class Logger {
    public Logger(Server s) {
        
    } 
    
    public void write(L level, String message) {
        switch(level) {
            case INFO: System.out.println("[INFO] " + message);
            case NORMAL: System.out.println("[MESSAGE] " + message);
            case WARNING: System.out.println("[INFO] " + message);
            case CRITICAL: System.out.println("***CRITICAL: " + message + " ***");
            case DEFAULT: System.out.println("[-] " + message);
        }
    }
    
    public void write(String message) {
        System.out.println("[INFO] " + message);
    }
    
  }
