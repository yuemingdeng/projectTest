/**
 * 
 */
package com.first;

/**
 * @author yuemingdeng
 *
 */
public class TestLoader {  
    
    public void getCall(){  
    Loader lo =new Loader();  
    Class c=lo.findclass("E:/ex/Loader.class");  
    //閲岄潰鐨勫瓧绗︿覆鍙互鏄换鎰忕殑甯�.class鏂囦欢鐨勮矾寰�  
    try {  
        Object obj=c.newInstance();  
        System.out.println(obj+"------------");  
        System.out.println(obj.getClass().getClassLoader());  
    }  catch (Exception e) {  
        e.printStackTrace();  
    }     
          
    }  
}  