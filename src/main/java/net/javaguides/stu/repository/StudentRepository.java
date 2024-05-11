package net.javaguides.stu.repository;

import net.javaguides.stu.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
