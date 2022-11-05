package lk.icoder.restsrv.controller;

import lk.icoder.restsrv.entity.Employee;
import lk.icoder.restsrv.entity.Teacher;
import lk.icoder.restsrv.repo.TeacherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherRepository repository;

    public TeacherController(TeacherRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Teacher> save(@RequestBody Teacher teacher) {
        return new ResponseEntity<>(repository.save(teacher), HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Teacher>> getAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }
}
