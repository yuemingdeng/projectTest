package com.first;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest {
    /**
     * 涓轰簡鐪嬫竻妤欽ava鍙嶅皠閮ㄥ垎浠ｇ爜锛屾墍鏈夊紓甯告垜閮芥渶鍚庢姏鍑烘潵缁欒櫄鎷熸満澶勭悊锛�
     * @param args
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws NoSuchFieldException
     * @throws SecurityException
     * @throws NoSuchMethodException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, NoSuchFieldException, NoSuchMethodException {
        // TODO Auto-generated method stub

        //Demo1.  閫氳繃Java鍙嶅皠鏈哄埗寰楀埌绫荤殑鍖呭悕鍜岀被鍚�
        Demo1();
        System.out.println("===============================================");

        //Demo2.  楠岃瘉鎵�鏈夌殑绫婚兘鏄疌lass绫荤殑瀹炰緥瀵硅薄
        Demo2();
        System.out.println("===============================================");

        //Demo3.  閫氳繃Java鍙嶅皠鏈哄埗锛岀敤Class 鍒涘缓绫诲璞杩欎篃灏辨槸鍙嶅皠瀛樺湪鐨勬剰涔夋墍鍦╙锛屾棤鍙傛瀯閫�
        Demo3();
        System.out.println("===============================================");

        //Demo4:  閫氳繃Java鍙嶅皠鏈哄埗寰楀埌涓�涓被鐨勬瀯閫犲嚱鏁帮紝骞跺疄鐜版瀯閫犲甫鍙傚疄渚嬪璞�
        Demo4();
        System.out.println("===============================================");

        //Demo5:  閫氳繃Java鍙嶅皠鏈哄埗鎿嶄綔鎴愬憳鍙橀噺, set 鍜� get
        Demo5();
        System.out.println("===============================================");

        //Demo6: 閫氳繃Java鍙嶅皠鏈哄埗寰楀埌绫荤殑涓�浜涘睘鎬э細 缁ф壙鐨勬帴鍙ｏ紝鐖剁被锛屽嚱鏁颁俊鎭紝鎴愬憳淇℃伅锛岀被鍨嬬瓑
        Demo6();
        System.out.println("===============================================");

        //Demo7: 閫氳繃Java鍙嶅皠鏈哄埗璋冪敤绫讳腑鏂规硶
        Demo7();
        System.out.println("===============================================");

        //Demo8: 閫氳繃Java鍙嶅皠鏈哄埗鑾峰緱绫诲姞杞藉櫒
        Demo8();
        System.out.println("===============================================");

    }

    /**
     * Demo1: 閫氳繃Java鍙嶅皠鏈哄埗寰楀埌绫荤殑鍖呭悕鍜岀被鍚�
     */
    public static void Demo1()
    {
        Person person = new Person();
        System.out.println("Demo1: 鍖呭悕: " + person.getClass().getPackage().getName() + "锛�"
                + "瀹屾暣绫诲悕: " + person.getClass().getName());
    }

    /**
     * Demo2: 楠岃瘉鎵�鏈夌殑绫婚兘鏄疌lass绫荤殑瀹炰緥瀵硅薄
     * @throws ClassNotFoundException
     */
    public static void Demo2() throws ClassNotFoundException
    {
        //瀹氫箟涓や釜绫诲瀷閮芥湭鐭ョ殑Class , 璁剧疆鍒濆�间负null, 鐪嬬湅濡備綍缁欏畠浠祴鍊兼垚Person绫�
        Class<?> class1 = null;
        Class<?> class2 = null;

        //鍐欐硶1, 鍙兘鎶涘嚭 ClassNotFoundException [澶氱敤杩欎釜鍐欐硶]
        class1 = Class.forName("cn.lee.demo.Person");
        System.out.println("Demo2:(鍐欐硶1) 鍖呭悕: " + class1.getPackage().getName() + "锛�"
                + "瀹屾暣绫诲悕: " + class1.getName());

        //鍐欐硶2
        class2 = Person.class;
        System.out.println("Demo2:(鍐欐硶2) 鍖呭悕: " + class2.getPackage().getName() + "锛�"
                + "瀹屾暣绫诲悕: " + class2.getName());
    }

    /**
     * Demo3: 閫氳繃Java鍙嶅皠鏈哄埗锛岀敤Class 鍒涘缓绫诲璞杩欎篃灏辨槸鍙嶅皠瀛樺湪鐨勬剰涔夋墍鍦╙
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void Demo3() throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Class<?> class1 = null;
        class1 = Class.forName("cn.lee.demo.Person");
        //鐢变簬杩欓噷涓嶈兘甯﹀弬鏁帮紝鎵�浠ヤ綘瑕佸疄渚嬪寲鐨勮繖涓被Person锛屼竴瀹氳鏈夋棤鍙傛瀯閫犲嚱鏁板搱锝�
        Person person = (Person) class1.newInstance();
        person.setAge(20);
        person.setName("LeeFeng");
        System.out.println("Demo3: " + person.getName() + " : " + person.getAge());
    }

    /**
     * Demo4: 閫氳繃Java鍙嶅皠鏈哄埗寰楀埌涓�涓被鐨勬瀯閫犲嚱鏁帮紝骞跺疄鐜板垱寤哄甫鍙傚疄渚嬪璞�
     * @throws ClassNotFoundException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws IllegalArgumentException
     */
    public static void Demo4() throws ClassNotFoundException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
    {
        Class<?> class1 = null;
        Person person1 = null;
        Person person2 = null;

        class1 = Class.forName("cn.lee.demo.Person");
        //寰楀埌涓�绯诲垪鏋勯�犲嚱鏁伴泦鍚�
        Constructor<?>[] constructors = class1.getConstructors();

        person1 = (Person) constructors[0].newInstance();
        person1.setAge(30);
        person1.setName("leeFeng");

        person2 = (Person) constructors[1].newInstance(20,"leeFeng");

        System.out.println("Demo4: " + person1.getName() + " : " + person1.getAge()
                + "  ,   " + person2.getName() + " : " + person2.getAge()
        );

    }

    /**
     * Demo5: 閫氳繃Java鍙嶅皠鏈哄埗鎿嶄綔鎴愬憳鍙橀噺, set 鍜� get
     *
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws NoSuchFieldException
     * @throws SecurityException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    public static void Demo5() throws IllegalArgumentException, IllegalAccessException, SecurityException, NoSuchFieldException, InstantiationException, ClassNotFoundException
    {
        Class<?> class1 = null;
        class1 = Class.forName("cn.lee.demo.Person");
        Object obj = class1.newInstance();

        Field personNameField = class1.getDeclaredField("name");
        personNameField.setAccessible(true);
        personNameField.set(obj, "鑳栬檸鍏堟．");


        System.out.println("Demo5: 淇敼灞炴�т箣鍚庡緱鍒板睘鎬у彉閲忕殑鍊硷細" + personNameField.get(obj));

    }


    /**
     * Demo6: 閫氳繃Java鍙嶅皠鏈哄埗寰楀埌绫荤殑涓�浜涘睘鎬э細 缁ф壙鐨勬帴鍙ｏ紝鐖剁被锛屽嚱鏁颁俊鎭紝鎴愬憳淇℃伅锛岀被鍨嬬瓑
     * @throws ClassNotFoundException
     */
    public static void Demo6() throws ClassNotFoundException
    {
        Class<?> class1 = null;
        class1 = Class.forName("cn.lee.demo.SuperMan");

        //鍙栧緱鐖剁被鍚嶇О
        Class<?>  superClass = class1.getSuperclass();
        System.out.println("Demo6:  SuperMan绫荤殑鐖剁被鍚�: " + superClass.getName());

        System.out.println("===============================================");


        Field[] fields = class1.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println("绫讳腑鐨勬垚鍛�: " + fields[i]);
        }
        System.out.println("===============================================");


        //鍙栧緱绫绘柟娉�
        Method[] methods = class1.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println("Demo6,鍙栧緱SuperMan绫荤殑鏂规硶锛�");
            System.out.println("鍑芥暟鍚嶏細" + methods[i].getName());
            System.out.println("鍑芥暟杩斿洖绫诲瀷锛�" + methods[i].getReturnType());
            System.out.println("鍑芥暟璁块棶淇グ绗︼細" + Modifier.toString(methods[i].getModifiers()));
            System.out.println("鍑芥暟浠ｇ爜鍐欐硶锛� " + methods[i]);
        }

        System.out.println("===============================================");

        //鍙栧緱绫诲疄鐜扮殑鎺ュ彛,鍥犱负鎺ュ彛绫讳篃灞炰簬Class,鎵�浠ュ緱鍒版帴鍙ｄ腑鐨勬柟娉曚篃鏄竴鏍风殑鏂规硶寰楀埌鍝�
        Class<?> interfaces[] = class1.getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println("瀹炵幇鐨勬帴鍙ｇ被鍚�: " + interfaces[i].getName() );
        }

    }

    /**
     * Demo7: 閫氳繃Java鍙嶅皠鏈哄埗璋冪敤绫绘柟娉�
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws SecurityException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InstantiationException
     */
    public static void Demo7() throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException
    {
        Class<?> class1 = null;
        class1 = Class.forName("cn.lee.demo.SuperMan");

        System.out.println("Demo7: \n璋冪敤鏃犲弬鏂规硶fly()锛�");
        Method method = class1.getMethod("fly");
        method.invoke(class1.newInstance());

        System.out.println("璋冪敤鏈夊弬鏂规硶walk(int m)锛�");
        method = class1.getMethod("walk",int.class);
        method.invoke(class1.newInstance(),100);
    }

    /**
     * Demo8: 閫氳繃Java鍙嶅皠鏈哄埗寰楀埌绫诲姞杞藉櫒淇℃伅
     *
     * 鍦╦ava涓湁涓夌绫荤被鍔犺浇鍣ㄣ�俒杩欐璧勬枡缃戜笂鎴彇]

     1锛塀ootstrap ClassLoader 姝ゅ姞杞藉櫒閲囩敤c++缂栧啓锛屼竴鑸紑鍙戜腑寰堝皯瑙併��

     2锛塃xtension ClassLoader 鐢ㄦ潵杩涜鎵╁睍绫荤殑鍔犺浇锛屼竴鑸搴旂殑鏄痡re\lib\ext鐩綍涓殑绫�

     3锛堿ppClassLoader 鍔犺浇classpath鎸囧畾鐨勭被锛屾槸鏈�甯哥敤鐨勫姞杞藉櫒銆傚悓鏃朵篃鏄痡ava涓粯璁ょ殑鍔犺浇鍣ㄣ��
     *
     * @throws ClassNotFoundException
     */
    public static void Demo8() throws ClassNotFoundException
    {
        Class<?> class1 = null;
        class1 = Class.forName("cn.lee.demo.SuperMan");
        String nameString = class1.getClassLoader().getClass().getName();

        System.out.println("Demo8: 绫诲姞杞藉櫒绫诲悕: " + nameString);
    }



}
/**
 *
 * @author xiaoyaomeng
 *
 */
class  Person{
    private int age;
    private String name;
    public Person(){

    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class SuperMan extends Person implements ActionInterface
{
    private boolean BlueBriefs;

    public void fly()
    {
        System.out.println("瓒呬汉浼氶鑰讹綖锝�");
    }

    public boolean isBlueBriefs() {
        return BlueBriefs;
    }
    public void setBlueBriefs(boolean blueBriefs) {
        BlueBriefs = blueBriefs;
    }

    @Override
    public void walk(int m) {
        // TODO Auto-generated method stub
        System.out.println("瓒呬汉浼氳蛋鑰讹綖锝炶蛋浜�" + m + "绫冲氨璧颁笉鍔ㄤ簡锛�");
    }
}
interface ActionInterface{
    public void walk(int m);
}