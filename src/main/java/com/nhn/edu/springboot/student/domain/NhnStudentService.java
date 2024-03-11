package com.nhn.edu.springboot.student.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NhnStudentService implements StudentService {

    private final StudentRepository studentRepository;

}
