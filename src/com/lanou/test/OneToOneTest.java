package com.lanou.test;

import com.lanou.domain.IDCard;
import com.lanou.domain.Person;
import com.lanou.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dllo on 17/10/18.
 */
public class OneToOneTest {

    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        session = HibernateUtil.getSession();
        transaction = session.beginTransaction();
    }
    @After
    public void destroy(){
        transaction.commit();
        HibernateUtil.closeSession();
    }

    @Test
    public void save(){
        Person person = new Person("洋洋","12332133");
        IDCard idCard = new IDCard("13881818811");
        // 设置对应关联属性
        person.setIdCard(idCard);
        idCard.setPerson(person);

        /**
         * 1. 如果只保存idCard需要通过设置IDCard.hbm.xml中的cascade级联属性才能级联保存person对象
         * 2. 如果只保存person需要设置Person.hbm.xml中的cascade级联idCard对象
         * 3. 维护外键的一方在不设置cascade级联时, 保存单个对象时会抛出异常;
         *      而引用的一方不会抛出异常, 只不过不保存级联对象
         */
//        session.save(idCard);
        session.save(person);
    }

    @Test
    public void find(){
        // 查询某个人的对应的身份证号
        Person person = session.get(Person.class,1);
        System.out.println("1--"+person);
        System.out.println("2--"+person.getIdCard());
        // 查询某个身份证号码所属用户信息
        IDCard idCard = session.get(IDCard.class,1);
        System.out.println("3--"+idCard);
        System.out.println("4--"+idCard.getPerson());
    }
}
