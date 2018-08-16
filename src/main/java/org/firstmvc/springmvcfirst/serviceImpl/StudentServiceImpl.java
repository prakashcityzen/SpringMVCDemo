package org.firstmvc.springmvcfirst.serviceImpl;

import org.firstmvc.springmvcfirst.dao.StudentDao;
import org.firstmvc.springmvcfirst.model.Student;
import org.firstmvc.springmvcfirst.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //component of spring
@Transactional
public class StudentServiceImpl implements StudentService{
@Autowired
private StudentDao studentDao;

    public void insert(Student student) {

        studentDao.insert(student);
    }

    public List<Student> listallStudent(){

        return  studentDao.getAllStudent();
    }
    public void delete(Student student) {

        studentDao.delete(student);
      //  return studentDao.getAllStudent();
    }
}

