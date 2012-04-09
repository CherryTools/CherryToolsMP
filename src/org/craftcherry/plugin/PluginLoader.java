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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import org.craftcherry.Server;

  /**
  * @author Buddy251
  **/

  public class PluginLoader {
      private final ArrayList<Application> plugins = new ArrayList<Application>();
      public PluginLoader() throws ClassNotFoundException, InstantiationException, IllegalAccessException, MalformedURLException {
      File[] jarFiles = new File("./addons").listFiles();
      URL[] urls = (URL[])null;
      if (jarFiles != null) {
         urls = new URL[jarFiles.length];
      }
      if (urls == null) { Server.getLogger().write("No Plugin is in the \"addons\" folder."); return; }
      for (int i = 0; i < jarFiles.length; i++) {
         urls[i] = jarFiles[i].toURI().toURL();
      }

    ClassLoader loader = new URLClassLoader(urls);

    for (File jarFile : jarFiles) {
            try {
                JarInputStream jaris = new JarInputStream(new FileInputStream(jarFile));
                JarEntry entry;
                while ((entry = jaris.getNextJarEntry()) != null)
                {
                  if (entry.getName().toLowerCase().endsWith(".class")) {
                    String className = entry.getName().substring(0, entry.getName().length() - 6).replace('/', '.');
                    Class cls = loader.loadClass(className);
                    for (Class i : cls.getInterfaces()) {
                      if (i.equals(Application.class)) {
                        this.plugins.add((Application)cls.newInstance());
                        break;
                      }
                    }
                  }
                }
            } catch (IOException ex) {
                
            }
    }

    for (Application plugin : this.plugins) {
      String authors = "";
      for(String b : plugin.getAuthors()) {
          authors = authors + ", " + b;
      }
      System.out.println("[" + plugin.getName() + "] loading " + plugin.getName() + " v" + plugin.getVersion() + " by " + authors + ".");
      if (plugin.byStart()) {
        this.plugins.add(plugin);
      } else {
        System.out.println("[" + plugin.getName() + "] Error while enabling " + plugin.getName() + " v" + plugin.getVersion() + " Plugin returned \"false\" in Method \"byStart();\"" + ".");
          }
        }
      }
      public void handleCommand(String i) {
          boolean sb = false;
          for(Application sa : this.plugins) {
              Server.getCommandMap().isRegistered(null);
          }
      }
    }
