/**
 * 
 */
package com.first;

/**
 * @author yuemingdeng
 *
 */
import java.io.*;
import java.net.*;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("60.174.236.107",8000);
		InputStream in = s.getInputStream();
		InputStreamReader Inre = new InputStreamReader(in,"UTF-8");
		BufferedReader br = new BufferedReader(Inre);
		System.out.println(br.readLine());
	}
}