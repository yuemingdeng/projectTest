package com.first;

import java.util.ArrayList;
import java.util.List;

interface Aggregate {
    /**
     * 返回一个迭代器对象
     */
    Iterator<Number> createIterator();

    void add(Object object);

    void remove(Object object);
}


class ConcreteAggregate implements Aggregate {
    private List<Object> objectList = new ArrayList<>();

    @Override
    public Iterator<Number> createIterator() {
        //创建并返回一个迭代器对象
        return new ConcreteIterator(objectList);
    }

    @Override
    public void add(Object object) {
        objectList.add(object);
    }

    @Override
    public void remove(Object object) {
        objectList.remove(object);
    }
}

interface Iterator<I extends Number> {
    /**
     * 是否有下一个元素
     */
    boolean hasNext();

    /**
     * 返回下一个元素
     */
    Object next();

    /**
     * 移除当前元素
     */
    void remove();
}


class ConcreteIterator implements Iterator<Number> {
    private List<Object> objectList = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<Object> objectList) {
        this.objectList = objectList;
    }

    @Override
    public boolean hasNext() {
        return cursor < objectList.size();
    }

    @Override
    public Object next() {
        if (cursor < objectList.size()) {
            return objectList.get(cursor++);
        }
        return null;
    }

    @Override
    public void remove() {
        objectList.remove(cursor);
    }
}


public class Client {
    public static void main(String[] args) {
        //构造一个聚合对象并添加一些数据
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add(new Student("mingdeng", 'f', 19, 4.2));
        aggregate.add(new Student("mingshong", 'f', 23, 4.2));
        aggregate.add(new Student("mingqing", 'm', 21, 4.2));

        //获取聚合对象的迭代器进行遍历操作
        Iterator<Number> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
