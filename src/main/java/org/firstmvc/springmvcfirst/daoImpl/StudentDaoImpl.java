package org.firstmvc.springmvcfirst.daoImpl;

import org.firstmvc.springmvcfirst.dao.StudentDao;
import org.firstmvc.springmvcfirst.model.Student;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void insert(Student student) {
        Session session=sessionFactory.openSession();
        session.save(student);
        session.beginTransaction().commit();
        session.close();
    }

    public List<Student> getAllStudent() {
        Session session=sessionFactory.openSession();

        Criteria criteria=session.createCriteria(Student.class);
        criteria.addOrder(Order.asc("studentName"));
        List<Student> studentList=criteria.list();
        session.close();
        return studentList;

    }

    public void delete(Student student) {
        Session session=sessionFactory.openSession();
         session.delete(student);
         session.beginTransaction().commit();
         session.close();

    }
}
