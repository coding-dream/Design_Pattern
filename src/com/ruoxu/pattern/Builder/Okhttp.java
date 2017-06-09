package com.ruoxu.pattern.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * oschina mode
 * Created by wangli on 16/3/23.
 * Builder模式
 * new Builder.build()方面里面都是new OKHttpClient,故每次都是一个新的实例对象
 */

public class Okhttp implements Call.Factory{

    final int connectTimeout;
    final int readTimeout;
    final List<String> interceptors;
    final List<String> networkInterceptors;
//  final String cacheJar;

    //这个构造器是为了方便 OkHttpClient okHttpClient = new OkHttpClient();
    public Okhttp() {
        this(new Builder());//调用下面的构造器(默认参数)
    }

    // TODO: 此构造函数即为Build模式的核心构造器 即  new OkHttpClient.Builder().build()方法最终调用的核心
    private Okhttp(Builder builder) {
        this.connectTimeout = builder.connectTimeout;
        this.readTimeout = builder.readTimeout;
        this.interceptors = builder.interceptors;
        this.networkInterceptors = builder.networkInterceptors;
    }

    //此工具方法方便 okHttpClient.newBuilder().addInterceptors(..).build();根据已有的okhttp实例，重新构建一个Builder实例(把当前实例中的参数【this传过去】全部copy给新的Builder)
    public Builder newBuilder() {
        return new Builder(this);
    }


    public int connectTimeoutMillis() {
        return connectTimeout;
    }

    public int readTimeoutMillis() {
        return readTimeout;
    }

    public List<String> interceptors() {
        return interceptors;
    }

    public List<String> networkInterceptors() {
        return networkInterceptors;
    }

    @Override
    public Call newCall(Request request) {
        return new RealCall(this, request);
    }

    public static final class Builder {
        int connectTimeout;
        int readTimeout;
        List<String> interceptors = new ArrayList<>();;
        List<String> networkInterceptors = new ArrayList<>();


        public Builder() {
//	        cookieJar = CookieJar.NO_COOKIES;
//	        socketFactory = SocketFactory.getDefault();
	        connectTimeout = 10_000;
	        readTimeout = 10_000;

        }

        //构建HttpClient对象 OkHttpClient okHttpClient = new OkHttpClient.Builder().url("http://need88.com").build();
        public Okhttp build() {
            return new Okhttp(this);// TODO: =========> 把 最终的build对象作为OKhttpClient的材料构建出来，这就是 Build模式
        }


        //相当于Builder的set方法
        public Builder connectTimeout(long timeout, TimeUnit unit) {
            long millis = unit.toMillis(timeout);
            connectTimeout = (int) millis;
            return this;
        }

        public Builder readTimeout(long timeout, TimeUnit unit) {
            long millis = unit.toMillis(timeout);
            readTimeout = (int) millis;
            return this;
        }

        public Builder addInterceptor(String interceptor) {
            interceptors.add(interceptor);
            return this;
        }
        public Builder addNetworkInterceptor(String interceptor) {
            networkInterceptors.add(interceptor);
            return this;
        }


        Builder(Okhttp okHttpClient) {
            this.interceptors.addAll(okHttpClient.interceptors);
            this.networkInterceptors.addAll(okHttpClient.networkInterceptors);
            this.connectTimeout = okHttpClient.connectTimeout;
            this.readTimeout = okHttpClient.readTimeout;
        }


    }

}
