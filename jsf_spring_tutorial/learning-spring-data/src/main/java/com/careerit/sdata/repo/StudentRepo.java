package com.careerit.sdata.repo;

import com.careerit.sdata.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface StudentRepo extends JpaRepository<Student, UUID> {

        Optional<Student> findByEmail(String email);

        @Query("select s from Student s where s.mobile = :mobile")
        Optional<Student> useMobile(String mobile);

}
