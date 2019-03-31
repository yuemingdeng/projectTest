package com.first;


import java.io.*;

public class Resume implements Serializable {
    // 目标公司名
    private String tarComp;

    // 自己的名字
    private String name;

    // 工作经验
    private String experience;

    public String getTarComp() {
        return tarComp;
    }

    public void setTarComp(String tarComp) {
        this.tarComp = tarComp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Resume [tarComp=" + tarComp + ", name=" + name + ", experience=" + experience + "]";
    }


    protected Resume deepclone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream ();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream inputStream = new ByteArrayInputStream (outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Resume resume = (Resume) objectInputStream.readObject();
        return resume;
    }



    public static Object deepClone(Object obj)
    {
        // 将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo;
        Object readObject = null;
        try
        {
            oo = new ObjectOutputStream(bo);
            oo.writeObject(obj);// 从流里读出来
            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            readObject = oi.readObject();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return readObject;
    }

}

