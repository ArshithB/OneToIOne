package com.one.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
    Configuration cfg=new Configuration();
    cfg.configure("config.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    MyOrder oOne = new MyOrder();
    oOne.setOrId(66);
    oOne.setOrName("Order 1");
    oOne.setOrName("Order from chennai.");
    
    ProductA pOnee = new ProductA();
    pOnee.setpOne(255);
    pOnee.setpName("Dell");
    pOnee.setpDes("Version: 9.0.2.3");
    oOne.setProducta(pOnee);
    
    //-------------//
    
    MyOrder oTwo = new MyOrder();
    oTwo.setOrId(6555);
    oTwo.setOrName("Order 2");
    oTwo.setOrName("Order from Kerala.");
    
    ProductA pTwoo = new ProductA();
    pTwoo.setpOne(866);
    pTwoo.setpName("HP");
    pTwoo.setpDes("Version: 9.0.2.5.3");
    oTwo.setProducta(pTwoo);
    
    Session session = factory.openSession();
    Transaction tx = session.beginTransaction();    
    
    session.save(oOne);
    session.save(oTwo);
    session.save(pOnee);
    session.save(pTwoo);
    
    tx.commit();
    session.close();
}
}