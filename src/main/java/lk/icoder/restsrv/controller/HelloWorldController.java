package lk.icoder.restsrv.controller;

import lk.icoder.restsrv.entity.Student;
import lk.icoder.restsrv.repo.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class HelloWorldController {

    private final StudentRepository studentRepository;

    public HelloWorldController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/healthcheck")
    public String healthCheck() {
        return "Service is working...";
    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }
}
