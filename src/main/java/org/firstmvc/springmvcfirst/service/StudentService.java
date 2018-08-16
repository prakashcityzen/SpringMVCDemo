package org.firstmvc.springmvcfirst.service;

import org.firstmvc.springmvcfirst.model.Student;

import java.util.List;

public interface StudentService {//method declared inside interface are public and abstract by default
   void insert(Student student);
   List<Student> listallStudent();

     void delete(Student student);
}
