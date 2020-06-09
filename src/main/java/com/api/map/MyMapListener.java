package com.api.map;

public class MyMapListener implements WeakConcurrentHashMapListener {

	@Override
	public void notifyOnAdd(Object key, Object value) {
		System.out.println(key + " : "+value);
		
	}

	@Override
	public void notifyOnRemoval(Object key, Object value) {
		System.out.println(key + " : "+value);
	}
}