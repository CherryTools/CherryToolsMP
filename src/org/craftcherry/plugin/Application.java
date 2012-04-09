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

package org.craftcherry.plugin;

import org.craftcherry.Server;

  /**
  * @author Buddy251
  **/

  public interface Application {
    public boolean byStart(); //Wenn return true; wiedergeben wird ist alles okey, wenn return false; wiedergeben wird ist etwas falsch und das Plugin wird beendet.
    public boolean byStop(); //Hier ebenfalls nur wird hier der Stopp vorgang nicht abbgebrochen sondern es wird eine fehler meldung ausgeworfen.
    public Server getServer(); //Diese Funktion wird nicht vom Plugin in den Server geleitet sondern vom Server in das Plugin -> dies geschieht mit einer Abstracten classe.
    public String getName(); //Bei dieser Funktion muss der Name des Plugins via return PLUGINNAME; wieder gebenewerden.
    public String getVersion(); //Bei dieser Funktion auch jedoch muss die Version des Plugins via return PLUGINNAME; wieder gebenewerden.
    public String[] getAuthors(); //Hier wird die liste der Authoren wiedergeben.
  }
