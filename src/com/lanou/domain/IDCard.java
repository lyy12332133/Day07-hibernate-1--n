package com.lanou.domain;

/**
 * Created by dllo on 17/10/18.
 * 身份证号码表
 */
public class IDCard {
    private int id; //主键id
    private String number; //身份证号码
    private Person person; //所属用户信息

    public IDCard() {
    }

    public IDCard(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public IDCard(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
