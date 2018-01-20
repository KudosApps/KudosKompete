package com.github.kudoskompete;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import static spark.Spark.get;


public class Application {

    public static void main(String[] args) {
        Logger.getRootLogger().setLevel(Level.OFF);
        get("/hello", (req, res) -> "Hello World");
    }
}
