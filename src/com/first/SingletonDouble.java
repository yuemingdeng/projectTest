/**
 * 
 */
package com.first;

/**
 * @author yuemingdeng
 *
 */
class SingletonDo {  
    private static volatile SingletonDo instance = null;  
    private SingletonDo(){}
    public static SingletonDo getInstance() {  
        if (instance == null) {  
            synchronized (SingletonDo.class) {  
                if (instance == null) {  
                    instance = new SingletonDo();  
                }  
            }  
        }  
        return instance;  
    }  
}  


public class SingletonDouble {
	public static void main(String[] args) {
//		System.out.println(SingletonDouble.class.getClassLoader());
		
		ClassLoader  classloader = SingletonDouble.class.getClassLoader();
		while(classloader != null) {
			System.out.println(classloader);
			classloader = classloader.getParent();
		}
		
		
		
		
		
		
	}
}