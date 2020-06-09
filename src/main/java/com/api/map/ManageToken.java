package com.api.map;

public class ManageToken {
	
	private static WeakConcurrentHashMap<String, String> cacheMp = null;
	
	public static void pushToken(String value, int expireIn, String key) {
		cacheMp = new WeakConcurrentHashMap<>(expireIn);
		cacheMp.put(key, value);
		System.out.println("New Token Genearted");
		return;
	}
	
	public static String getToken(String key) {
		if(cacheMp == null || cacheMp.get(key) == null) 
			return null;
		
		System.out.println("Token Available in Cache : "+cacheMp.get(key));
		return cacheMp.get(key);
	}
	
	public static void removeToken(String key) {
		cacheMp.remove(key);
	}

}
