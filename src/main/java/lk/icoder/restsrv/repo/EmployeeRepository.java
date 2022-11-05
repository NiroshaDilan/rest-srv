package lk.icoder.restsrv.repo;

import lk.icoder.restsrv.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
