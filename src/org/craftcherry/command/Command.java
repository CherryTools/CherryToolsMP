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

import org.craftcherry.plugin.Application;

  /**
  * @author Buddy251
  **/

  public class Command {
      private Application Plugin;
      private String Command;
      private String Permission;
      
      public Command(Application plugin, String command, String permission) {
          Plugin = plugin;
          Command = command;
          Permission = permission;
      }
      
      public Command(Application plugin, String command) {
          Plugin = plugin;
          Command = command;
          Permission = plugin.getName() + "." + command;
      }
      
      public Application getPlugin() {
          return Plugin;
      }
      
      public void setPlugin(Application ap) {
          Plugin = ap;
      }
      
      public String getCommand() {
          return Command;
      }
      
      public String getPermission() {
          return Permission;
      }
  }
