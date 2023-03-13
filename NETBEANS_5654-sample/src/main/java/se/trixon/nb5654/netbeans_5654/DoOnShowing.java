/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.trixon.nb5654.netbeans_5654;

import org.openide.windows.IOContainer;
import org.openide.windows.OnShowing;
import org.openide.windows.WindowManager;

/**
 *
 * @author Patrik Karlström <patrik@trixon.se>
 */
@OnShowing
public class DoOnShowing implements Runnable {

    @Override
    public void run() {
        var container = IOContainer.getDefault();
        container.open();
        var windowManager = WindowManager.getDefault();
        var outputMode = windowManager.findMode("output");
        var editorMode = windowManager.findMode("editor");
        for (var tc : windowManager.getOpenedTopComponents(outputMode)) {
            editorMode.dockInto(tc);
        }
    }

}
