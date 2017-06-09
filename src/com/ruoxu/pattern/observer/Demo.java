package com.ruoxu.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	private static Observable observable ;
	private static List<Subscriber> subscribers = new ArrayList<>();

	public static void main(String[] args) {
		observable = new ObservableImp();

        Subscriber subscriber;

        for(int i=0;i<10;i++) {
            subscriber = new SubscribeImp("name"+i);

            subscribers.add(subscriber);
            observable.registerObserver(subscriber);
        }

        List<String> list = new ArrayList<>();
        list.add("bean1");
        list.add("bean2");

        observable.setDatas(list);
        observable.notifyDataChange();
		
		
	}
	
	public void onDestroy(){
		 //批量解注册
        for (Subscriber subscriber : subscribers) {
            observable.unregisterObserver(subscriber);
        }
	}
	
	
	
}
