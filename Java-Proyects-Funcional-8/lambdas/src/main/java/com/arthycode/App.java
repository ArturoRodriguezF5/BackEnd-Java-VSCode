package com.arthycode;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String> lista = new ArrayList<>();

        lista.add("Sandia");
        lista.add("Platano");

        lista.stream().map((x) -> {
            return "La: " + x;
        })
            .forEach(x -> System.out.println(x));

    }
}
