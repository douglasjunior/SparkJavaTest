package com.github.douglasjunior.sparkjavatest;

import static spark.Spark.get;

/**
 *
 * @author Douglas
 */
public class Main {

    private static int i = 0;
    
    public static void main(String[] args) {
        get("/hello", (req, res) -> {
            return "Hello World " + i++;
        });
    }
}
