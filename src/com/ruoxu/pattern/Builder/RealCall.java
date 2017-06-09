package com.ruoxu.pattern.builder;

import java.io.IOException;

public class RealCall implements Call {

    public RealCall(Okhttp oKhttpClient, Request request) {

    }

    @Override
    public Request request() {
        return null;
    }

    @Override
    public Response execute() throws IOException {
        return null;
    }

    @Override
    public void enqueue(Call responseCallback) {

    }

    @Override
    public void cancel() {

    }

    @Override
    public boolean isExecuted() {
        return false;
    }

    @Override
    public boolean isCanceled() {
        return false;
    }
}
