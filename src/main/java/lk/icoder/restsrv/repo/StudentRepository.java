package lk.icoder.restsrv.repo;

import lk.icoder.restsrv.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
