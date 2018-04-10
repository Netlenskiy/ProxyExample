package com.netlenskiy.server;

import com.netlenskiy.Server;

public class ServerImpl implements Server {
    @Override
    public Something requestSomething(String descriptionOfSomething) {
        return new Something(descriptionOfSomething);
    }
}
