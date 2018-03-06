package edu.uok.myencrypt.main;

import edu.uok.myencrypt.view.SplashScreen;

/**
 * Created by Renuka on 06/03/2016.
 */
class Main {
    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ignored) {

        }
        new SplashScreen().setVisible(true);
    }
}
