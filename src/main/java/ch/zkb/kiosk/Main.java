package ch.zkb.kiosk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import spark.Request;
import spark.Response;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

/**
 *
 * @author casa
 */
public class Main implements SparkApplication {

    public void init() {
        String test = "ciao";
        get("/hello", (req, res) -> "Hello World"+test);
        
        get("/", (Request request, Response response) -> {
            int port = request.port();
            return "The port this site is running on Port: "+Integer.toString(port);
        });
    }
}
