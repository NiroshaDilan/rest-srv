package lk.icoder.restsrv.controller;

import lk.icoder.restsrv.entity.Employee;
import lk.icoder.restsrv.entity.Student;
import lk.icoder.restsrv.repo.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return new ResponseEntity<>(repository.save(employee), HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Employee>> getAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }
}
