package com.nhn.edu.springboot.student.adapter.in.web;

import com.nhn.edu.springboot.student.domain.StudentDto;
import com.nhn.edu.springboot.student.domain.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    public ResponseEntity<StudentDto> registerStudent(@RequestBody StudentRequest studentRequest) {
        return null;
    }

}
