/**
 * 
 */
package com.first;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

/**
 * @author yuemingdeng
 *
 */
public class Loader extends ClassLoader{  
    public Class findclass(String name){  
        byte[] b=null;  
        try {  
            b = getbyte( name);  
        } catch (Exception e) {  
              
            e.printStackTrace();  
        }  
        return defineClass(null, b, 0   ,b.length);//重要函数defineClass  
    }  
  
    private byte[] getbyte(String name) throws Exception{  
        FileInputStream in =new FileInputStream(name);  
        byte[] b =new byte[1024];  
        ByteArrayOutputStream out=new ByteArrayOutputStream();//内存流  
        int len=0;  
        while((len=in.read(b))!=-1){  
            out.write(b, 0, len);  
        }  
        out.close();  
        b=out.toByteArray();//把内存流的返回  
        return b;  
    }  
      
      
}  