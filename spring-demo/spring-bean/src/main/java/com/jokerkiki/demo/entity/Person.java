package com.jokerkiki.demo.entity;

public class Person{
    private Long id ;
    private String name ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("person has been created..................");
    }

    public void init(){
        System.out.println("person init...................");
    }
    public void destroyMethod(){
        System.out.println("person destroyMethod....................");
    }
}
