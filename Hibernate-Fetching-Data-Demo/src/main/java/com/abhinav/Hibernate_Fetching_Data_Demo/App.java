package com.abhinav.Hibernate_Fetching_Data_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        Student st = null;
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
//        Transaction tx = session.beginTransaction();		//not required while fetching data
        
        
        st = (Student) session.get(Student.class, 101);
        
        System.out.println(st);
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getColor());
//        tx.commit();										//not required while fetching data
    }
}
