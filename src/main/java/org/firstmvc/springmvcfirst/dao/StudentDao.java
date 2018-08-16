package org.firstmvc.springmvcfirst.dao;

import org.firstmvc.springmvcfirst.model.Student;

import java.util.List;

public interface StudentDao {
    void insert(Student student);
    List<Student> getAllStudent();
    void delete(Student student);
}
