package com.ye.erkclient.controller;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.andrewoma.dexx.collection.HashMap;
import com.ye.erkclient.feignClient.HelloClient;


@RestController
public class HelloController {
	@Autowired
	HelloClient helloClient;
	@Autowired
	DiscoveryClient client;
	@RequestMapping("/getHello")
	public String hello() {
		/*System.err.println("try to call");
		try {
			Thread.sleep(10000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		List test=client.getInstances("HelloClient");
		return helloClient.hello();
	}
	
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> concurrentHashMap=new ConcurrentHashMap<>();
		concurrentHashMap.put( "fff",null);
		/*BlockingQueue<Runnable> workQueue=new ArrayBlockingQueue<>(6);
		
		ExecutorService cachedThreadPool = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS,
				workQueue, Executors.defaultThreadFactory(), new AbortPolicy());
		for (int i = 0; i < 5; i++) {
			MyThread myThread=new MyThread(i+"name ");
			cachedThreadPool.submit(myThread);
		}
		
			try {
				Thread.sleep(1000);
				cachedThreadPool.shutdown();
				System.out.println("shut");
			} catch (InterruptedException e) {
				
			}
			*/
		
	}
	public static class  MyThread extends Thread{
		public String name;
		public MyThread( String name ) {
			 this.name=name;
		}
		
		@Override
		public void run() {
			try {
				System.out.println(name +" start");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.err.println(name+"innnnnnnnn");
			}
			System.out.println(name +" over");
		}
		
		
	}
	

}

