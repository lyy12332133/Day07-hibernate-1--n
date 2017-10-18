package com.lanou.test;

import com.lanou.domain.Department;
import com.lanou.domain.Manager;
import com.lanou.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dllo on 17/10/18.
 */
public class OneToOneForeignTest {

    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        session = HibernateUtil.getSession();
        transaction = session.beginTransaction();
    }

    @After
    public void destroy() {
        transaction.commit();
        HibernateUtil.closeSession();
    }


    @Test
    public void save(){
        Department department = new Department("教研部");
        Manager manager = new Manager("洋洋");

        department.setManager(manager);
        manager.setDepartment(department);

        session.save(manager);
    }
}
