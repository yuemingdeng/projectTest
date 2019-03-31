package com.first;

import java.util.Optional;

interface Animal {
    void eat();
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉...");
    }
}

/**
 *下面演示的是普通工厂模式
 */
interface Factory{
    Animal createAnimil();
}

class CatFactory implements Factory {
    @Override
    public Animal createAnimil() {
        return new Cat();
    }
}


class  DogFactory implements Factory {
    @Override
    public Animal createAnimil() {
        return new Dog();
    }
}

/**
 * 下面例子演示的是简单工厂模式
 *
 */
class FactoryMode {
    private static String str;

    FactoryMode(String str) {
        this.str = str;
    }

    public static Animal getAnimal(String str) {
        Animal animal = null;
        if ("cat".equals(str)) {
            animal = new Cat();
        } else if ("dog".equals(str)) {
            animal = new Dog();
        }else {
            animal = null;
        }

        return animal;
    }

    public static void main(String[] args) {
        /*Animal animal = FactoryMode.getAnimal("cat");
        if(null != animal) {
            animal.eat();
        }*/

        CatFactory catFactory = new CatFactory();
        Animal animal = catFactory.createAnimil();
        animal.eat();

    }

}
