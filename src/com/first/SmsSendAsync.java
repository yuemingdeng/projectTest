package com.first;


import sun.management.VMManagement;

import javax.xml.bind.DatatypeConverter;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SmsSendAsync {
    public static void main(String[] args) throws NoSuchFieldException, UnknownHostException, SocketException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        InetAddress ia = InetAddress.getLocalHost();
        byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
        System.out.println(mac);
        String macStr = DatatypeConverter.printHexBinary(mac);
        System.out.println(macStr);




        //java获取进程ID
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        Field jvm = runtime.getClass().getDeclaredField("jvm");
        jvm.setAccessible(true);
        VMManagement mgmt = (VMManagement) jvm.get(runtime);
        Method pidMethod = mgmt.getClass().getDeclaredMethod("getProcessId");
        pidMethod.setAccessible(true);
        int pid = (Integer) pidMethod.invoke(mgmt);

        System.out.println(pid);




    }

}
