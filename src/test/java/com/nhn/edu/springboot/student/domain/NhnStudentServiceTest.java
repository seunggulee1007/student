package com.nhn.edu.springboot.student.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class NhnStudentServiceTest {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testGetStudent() throws Exception {
        // List<Student> students = studentService.getStudents();
        // assertEquals(3, students.size());
        assertThat(studentService).isNotNull();
    }

}