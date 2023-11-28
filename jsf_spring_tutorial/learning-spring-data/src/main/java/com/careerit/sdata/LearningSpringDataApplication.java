package com.careerit.sdata;

import com.careerit.sdata.domain.Student;
import com.careerit.sdata.repo.StudentRepo;
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

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringDataApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {


			/*
			Student student = getRandStudent();
			List<Student> list = new ArrayList<>();
			for(int i=1;i<=10;i++){
				list.add(getRandStudent());
			}*/
			/*List<Student> list = IntStream.rangeClosed(1,10).mapToObj(i->getRandStudent()).collect(Collectors.toList());
			list.add(student);
			studentRepo.saveAll(list);
			System.out.println("Student is saved with id : "+student.getId());*/


			/*Optional<Student> optStudent =  studentRepo.findById(UUID.fromString("bf47a7e6-da7e-4bc6-adf4-1e69d583f804"));
			if(optStudent.isPresent()) {
				Student student = optStudent.get();
				student.setName("Krishna T");
				student.setEmail("krishna.t@gmail.com");
				studentRepo.save(student);
			}else{
				System.out.println("Student is not found with given id");
			}*/
			/*Pageable pageable = PageRequest.of(1,5);
			Page<Student> page = studentRepo.findAll(pageable);
			System.out.println("Total pages : "+page.getTotalPages());
			System.out.println("Total elements : "+page.getTotalElements());
			System.out.println("Current page : "+page.getNumber());
			System.out.println("Current page elements : "+page.getNumberOfElements());
			page.getContent().forEach(e-> System.out.println(e.getName()));*/

			String mobile = "9859571083";
			Optional<Student> optStudent = studentRepo.useMobile(mobile);
			if(optStudent.isPresent()) {
				Student student = optStudent.get();
				System.out.println(student.getName()+" "+student.getEmail()+" "+student.getMobile());
			}else {
				System.out.println("Student is not found with given email : "+mobile);
			}
		};
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
