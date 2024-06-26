//package org.example.app.controller;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//class Q{
//    int num;
//    boolean valueSet = false;
//    public synchronized void put(int num)
//    {
//        while(valueSet){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        this.num=num;
//        System.out.println("Put : "+num);
//        valueSet=true;
//        notify();//called by producer, notify consumer
//    }
//    public synchronized void get(){
//        while (!valueSet)
//        {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Get : "+num);
//        valueSet= false;
//        notify();//called by consumer, notify producer
//    }
//}
//class Producer implements Runnable{
//    Q q;
//
//    public Producer(Q q) {
//        this.q = q;
//        new Thread(this, "Producer")
//                .start();
//    }
//
//    @Override
//    public void run() {
//    int i=0;
//    while(true){
//        q.put(i++);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    }
//}
//
//
//class Consumer implements Runnable{
//    Q q;
//
//    public Consumer(Q q) {
//        this.q = q;
//        new Thread(this, "Producer")
//                .start();
//    }
//
//    @Override
//    public void run() {
//        int i=0;
//        while(true){
//            q.get();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//@RestController
//public class InterThread {
//    @RequestMapping(value = "/ipc", method = RequestMethod.GET)
//    public  void interProcessCommunication()
//
//    {
//        //THREAD COMMUNICATION
//        Q q = new Q();
//        Producer p = new Producer(q);
//        Consumer c = new Consumer(q);
//    }
//
//}
