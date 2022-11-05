package lk.icoder.restsrv.repo;

import lk.icoder.restsrv.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
