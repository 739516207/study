package com.example.observe;

import java.util.Observable;

/**
 * @author ：xugangkun
 * @description：TODO
 * @date ：2021/5/8 14:48
 */
public class MyObservable extends Observable {
    /**
     * 被观察者数据
     */
    private String data;
    public String getData() {
        return data;
    }
    /**
     * 如果有如果改变
     * @param data
     */
    public void setData(String data) {
        //更改变化状态
        setChanged();
        //通知注册的观察者
        notifyObservers(data);
    }
}
