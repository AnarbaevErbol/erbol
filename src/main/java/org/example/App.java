package org.example;

import org.example.Util.HibernateUtil;
import org.example.entity.Student;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Student student = new Student("Elina", 16);
        Student student1 = new Student("Mars", 23);
        create(student);
        create(student1);
    }


    public static long create(Student student){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("Added succesfuly" + student);
        return student.getId();
    }



}
