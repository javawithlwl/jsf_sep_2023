package com.careerit.sdata;

import com.careerit.sdata.domain.Passport;
import com.careerit.sdata.domain.Student;
import com.careerit.sdata.repo.PassportRepo;
import com.careerit.sdata.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class LearningSpringDataApplication{

	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private PassportRepo passportRepo;

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringDataApplication.class, args);
	}

	@Bean

	CommandLineRunner runner(){
		return args -> {

				addStudents();


		};
	}
	@Transactional
	public void addStudents() {
		Passport passport = new Passport();
		passport.setNumber("PASSPORT_1235");
		passport.setIssuedCountry("INDIA");
		passport.setExpiryDate(LocalDate.now().plusYears(10));
		passport.setIssuedDate(LocalDate.now().minusYears(2));

		Student student = getRandStudent();
		student.setPassport(passport);
		passport.setStudent(student);
    	studentRepo.save(student);
	}

	private Student getRandStudent() {
		int num = (int)(Math.random()*1000);
		Student student = new Student();
		String name = "Student_"+num;
		student.setName(name);
		student.setEmail(name+"@gmail.com");
		student.setMobile(ThreadLocalRandom.current().nextLong(9000000000L,9999999999L)+"");
		student.setDob(LocalDate.now().minusYears(20));
		return student;
	}

}
