package com.microservice.student.persistence;

import com.microservice.student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {

    @Query("select s from Student s where s.courseId = :idCourse")
    List<Student> findAllStudents(Long idCourse);
    List<Student> findAllByCourseId(Long idCourse);
}
