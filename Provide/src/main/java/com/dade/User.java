package com.dade;

import java.io.Serializable;

/**
 * Created by Dade on 2016/11/10.
 */
public class User implements Serializable {

    private String Id;
    private String name;
    private Integer age;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
