package com.netlenskiy;

import com.netlenskiy.server.Something;

public class Client {

    public static void main(String[] args) {
        Server server = Server.getNew();
        Something something = server.requestSomething("Something interesting");
        System.out.println("Something requested from server is: " + something.getDescription());
    }
}
