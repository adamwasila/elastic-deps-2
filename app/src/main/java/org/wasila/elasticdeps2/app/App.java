package org.wasila.elasticdeps2.app;

import org.wasila.elasticdeps2.library1.Library1;
import org.wasila.elasticdeps2.library2.Library2;

public class App {

    public static void main(String[] args) {
        System.out.printf("App: %s %s", new Library1().getValue(), new Library2().getValue());
    }

}
