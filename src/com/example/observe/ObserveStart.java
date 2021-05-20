package com.example.observe;

/**
 * @author ：xugangkun
 * @description：TODO
 * @date ：2021/5/8 14:49
 */
public class ObserveStart {

    public static void main(String[] args) {
        //1.构造被观察目标。（假如现实场景中的老师）
        MyObservable myObservable = new MyObservable();
        //2.构造2个观察者实现类:添加观察者进观察目标  （现实场景中的学生，每来一个新学生，要加入老师的观察者名录中）
        MyObserver myObserver1 = new MyObserver(myObservable, "张三");
        MyObserver myObserver2 = new MyObserver(myObservable, "李四");
        //3.被观察者（老师）发布今天的作业任务。其注册的观察者们（学生们）响应。
        myObservable.setData("英语作业");
    }
}
