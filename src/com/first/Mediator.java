package com.first;

interface AbstractMediator{
    void aChangedB(String str);

    void bChangedA(String str);
}

interface AbstractColleague {
    void setString(String str, AbstractMediator am);

    void changeString(String str);
}

class ConcreteColleagueA implements AbstractColleague {
    // 同事A的字符串属性
    private String strAttribute;

    // 构造函数，构造字符串属性
    public ConcreteColleagueA(String str) {
        this.strAttribute = str;
    }

    /**
     * 被改变的函数
     */
    @Override
    public void changeString(String str) {
        this.strAttribute = this.strAttribute + "这是同事B对我的影响：" + str;

    }

    /**
     * 改变时，通知中介者改变其他同事
     */
    @Override
    public void setString(String str, AbstractMediator am) {
        am.aChangedB(str);
    }

    public String getStrAttribute() {
        return strAttribute;
    }

}

class ConcreteColleagueB implements AbstractColleague {
    private String strAttribute;

    public ConcreteColleagueB(String str) {
        this.strAttribute = str;
    }

    @Override
    public void changeString(String str) {
        this.strAttribute = this.strAttribute + "这是同事A对我的影响：" + str;

    }

    @Override
    public void setString(String str, AbstractMediator am) {
        am.bChangedA(str);
    }

    public String getStrAttribute() {
        return strAttribute;
    }
}

class ConcreteMediator implements AbstractMediator {
    // 持有并维护同事A
    private ConcreteColleagueA colleagueA;
    // 持有并维护同事B
    private ConcreteColleagueB colleagueB;

    // 传入同事A的对象
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    // 传入同事B的对象
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    /**
     * 收到同事A的改变，通知同事B改变
     */
    @Override
    public void aChangedB(String str) {
        colleagueB.changeString(str);

    }

    /**
     * 收到同事B的改变，通知同事A改变
     */
    @Override
    public void bChangedA(String str) {
        colleagueA.changeString(str);

    }

}




public class Mediator {

    public static void main(String[] args) {
        // 实例化同事A、B
        ConcreteColleagueA colleagueA = new ConcreteColleagueA("大家好，我是同事A。");
        ConcreteColleagueB colleagueB = new ConcreteColleagueB("大家好，我是同事B。");

        // 同时把同事A、B传入给中介者
        ConcreteMediator am = new ConcreteMediator();
        am.setColleagueA(colleagueA);
        am.setColleagueB(colleagueB);

        // 同事A影响同事B
        System.out.println(colleagueB.getStrAttribute());
        colleagueA.setString("同事A传递给同事B的值", am);
        System.out.println(colleagueB.getStrAttribute());

        System.out.println("==========================");

        // 同事B影响同事A
        System.out.println(colleagueA.getStrAttribute());
        colleagueB.setString("同事B传递给同事A的值", am);
        System.out.println(colleagueA.getStrAttribute());
    }

}

