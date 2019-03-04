package com.jokerkiki.demo.factory;

import com.jokerkiki.demo.entity.Person;
import com.jokerkiki.demo.entity.Student;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

//创建一个spring定义的factoryBean
public class DemoFactory implements FactoryBean<Student> {

    /**
     * 返回一个person对象 这个person会添加到容器中
     * @return
     * @throws Exception
     */
    @Nullable
    @Override
    public Student getObject() throws Exception {
        return new Student();
    }

    /**
     * 返回类型
     * @return
     */
    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    /**
     * 是否单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
