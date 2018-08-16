package org.firstmvc.springmvcfirst.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="itn_student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable{

    private static long serialVersionUID=234L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="itn_student_id")
    private int studentId;
    private String studentName;
    private String studentAddress;
    private long studentPhone;

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public long getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(long studentPhone) {
        this.studentPhone = studentPhone;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
