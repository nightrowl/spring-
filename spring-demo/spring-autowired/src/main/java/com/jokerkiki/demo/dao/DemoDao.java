package com.jokerkiki.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DemoDao {

    private String id ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DemoDao(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DemoDao{" +
                "id='" + id + '\'' +
                '}';
    }

    public DemoDao() {
    }
}
