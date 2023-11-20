package com.spring.orm;

import com.spring.orm.Dao_or_Repository.StudentDao;
import com.spring.orm.Entity_or_Model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/Config.xml");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentdao1");
        Student student = new Student();
        student.setStudentId(1011);
        student.setStudentName("ravi");
        student.setStudentCity("delhi");
        Integer integer= studentDao.saveStudent(student);
        System.out.println(integer);
    }
}
