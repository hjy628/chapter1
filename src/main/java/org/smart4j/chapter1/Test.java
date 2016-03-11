package org.smart4j.chapter1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 16-3-10.
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.MINUTES.sleep(10);
                    System.out.println("十分钟到了");
                    System.out.println(new Date());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        },"测试");
      //  thread.setDaemon(true);
        System.out.println(new Date());
        thread.start();



    }
}
