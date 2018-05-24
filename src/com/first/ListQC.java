/**
 * 
 */
package com.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 根据对象属性字段给list集合去重
 *
 * @author Lance
 * @date 2017/03/14
 */
public class ListQC {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("张三", "001");
        userList.add(user1);
        User user2 = new User("李四", "001");
        userList.add(user2);
        User user3 = new User("王五", "002");
        userList.add(user3);
        for (User u : userList) {
            System.out.println(u.getName());
        }
        System.out.println("去重后=======>");
        List<User> userListNoDupAndSort = removeDuplicateUser(userList);
        for (User u : userListNoDupAndSort) {
            System.out.println(u.getName());
        }
    }
    private static ArrayList<User> removeDuplicateUser(List<User> users) {
        Set<User> set = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                //字符串,则按照asicc码升序排列
                return o1.getUserId().compareTo(o2.getUserId());
            }
        });
        set.addAll(users);
        return new ArrayList<User>(set);
    }
}
class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}