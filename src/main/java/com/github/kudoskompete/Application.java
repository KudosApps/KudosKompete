package com.github.kudoskompete;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;


public class Application {

    public static void main(String[] args) {
        Logger.getRootLogger().setLevel(Level.OFF);

        get("/hello", (req, res) -> "Hello World");

//        // do this
//        get("/login", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            return new VelocityTemplateEngine().render(
//                    new ModelAndView(model, "login.vtl")
//            );
//        });
        get("/login", (req, res) -> {
            return new ModelAndView(new HashMap<>(), "templates/login.vtl");
        }, new VelocityTemplateEngine());
    }
}
