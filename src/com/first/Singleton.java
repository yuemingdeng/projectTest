package com.first;

/**
 * @author yuemingdeng
 *
 *饿汉式单例
 */
 class Singleton {
	Singleton() {}
	private static Singleton sin = new Singleton();
	public static Singleton getSingleton () {
		return sin;
	}

}
 
 class Singletonlan{
	 Singletonlan () {}
	 private static Singletonlan lan = null;
	 public static Singletonlan getlan (){
		 if (lan == null) {
			 lan = new Singletonlan();
		 }
		 
		 return lan;
	 }
	 
 }
