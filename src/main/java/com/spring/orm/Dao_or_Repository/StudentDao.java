package com.spring.orm.Dao_or_Repository;

import com.spring.orm.Entity_or_Model.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;
    //add new student
    @Transactional
    public Integer saveStudent(Student student){
        Integer reslut = (Integer) this.hibernateTemplate.save(student);
        return reslut;
    }
    //get a particular Student
    public Student getStudent(int studentId){
        Student student = this.hibernateTemplate.get(Student.class,studentId);
        return student;
    }
    //get all student
    public List<Student> getAllStudent(){
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }
    //update student
    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }
    //DeleteStudent
    @Transactional
    public void deleteStudent(int studentId){
        Student student = this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }


    public StudentDao() {
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
