package com.netlenskiy;

import com.netlenskiy.server.Proxy;
import com.netlenskiy.server.Something;

public interface Server {
    static Server getNew() {
//        return new ServerImpl();
        return new Proxy();
    }

    Something requestSomething(String descriptionOfSomething);
}
