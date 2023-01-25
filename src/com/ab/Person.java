package com.ab;

public abstract class Person implements Payable,Comparable<Person>{
    private int id;
    private static int id_gen=1;
    private String name;
    private String surname;

    public Person() {
        id=id_gen++;
    }
    public Person(String name,String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getId() {
        return id;
    }
    public String toString() {
        return getId()+". "+getName()+" "+getSurname();
    }
    public abstract String getPosition();
}
