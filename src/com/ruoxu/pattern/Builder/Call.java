package com.ruoxu.pattern.builder;

import java.io.IOException;

public interface Call {
    Request request();
    Response execute() throws IOException;
    void enqueue(Call responseCallback);
    void cancel();

    boolean isExecuted();

    boolean isCanceled();


    interface Factory {
        Call newCall(Request request);
    }


}
