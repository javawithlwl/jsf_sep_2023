package com.careerit.sc;

import com.careerit.sc.domain.AppUser;
import com.careerit.sc.domain.Course;
import com.careerit.sc.domain.CreditDetails;
import com.careerit.sc.repo.AppUserRepo;
import com.careerit.sc.repo.CourseRepo;
import com.careerit.sc.repo.CreditDetailsRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentCourseApplication {

	private final CourseRepo courseRepo;
	private final CreditDetailsRepo creditDetailsRepo;
	private final AppUserRepo appUserRepo;

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			//createCreditsForAllUsers();
			addCourseToUser(1,4);
		};
	}

	@Transactional
	public void createCreditsForAllUsers() {
		List<AppUser> userList = appUserRepo.findAll();
		for (AppUser appUser : userList) {
			CreditDetails creditDetails = new CreditDetails();
			creditDetails.setAppUser(appUser);
			creditDetails.setAmount(10);
			creditDetailsRepo.save(creditDetails);
		}
	}

	@Transactional
	public void addCourseToUser(long userId, long courseId) {

		AppUser appUser = appUserRepo.findById(userId).orElseThrow(()-> new RuntimeException("User not found with id :"+userId));
		Course course = courseRepo.findById(courseId).orElseThrow(()-> new RuntimeException("Course not found with id :"+courseId));
		CreditDetails creditDetails = appUser.getCreditDetails();
		appUser.addCourse(course);
		if(creditDetails != null){
			double fee = course.getFee();
			double credit = creditDetails.getAmount();
			if(credit >= fee) {
				creditDetails.setAmount(credit - fee);
			}else{
				double remaining = fee - credit;
				creditDetails.setAmount(0);
				System.out.println("Please pay remaining amount :"+remaining);
			}
			creditDetailsRepo.save(creditDetails);
		}else{
			System.out.println("Please pay the fee "+course.getFee()+" to add the course");
		}
		appUserRepo.save(appUser);


	}
}
