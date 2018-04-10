package com.netlenskiy.server;

import com.netlenskiy.Server;

import java.util.Date;

public class Proxy implements Server {

    private Server server = new ServerImpl();

    @Override
    public Something requestSomething(String descriptionOfSomething) {
        System.out.println("Logging Proxy has written a record to log file: Requested "
                + descriptionOfSomething + " at " + new Date().toString());
        return server.requestSomething(descriptionOfSomething);
    }
}
