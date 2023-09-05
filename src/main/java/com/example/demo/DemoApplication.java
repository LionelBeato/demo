package com.example.demo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Profile("spring")
public class DemoApplication {

    public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		// context.register(SpringBatchConfig.class);
		context.refresh();
		Test test = context.getBean(Test.class);
		test.printGreeting();

        // try (// Spring Java config
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
		// 	// context.register(SpringConfig.class);
		// 	context.register(SpringBatchConfig.class);
		// 	context.refresh();
			
		// 	JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		// 	Job job = (Job) context.getBean("firstBatchJob");
		// 	System.out.println("Starting the batch job");
		// 	try {
		// 	    JobExecution execution = jobLauncher.run(job, new JobParameters());
		// 	    System.out.println("Job Status : " + execution.getStatus());
		// 	    System.out.println("Job completed");
		// 	} catch (Exception e) {
		// 	    e.printStackTrace();
		// 	    System.out.println("Job failed");
		// 	}
		// } catch (BeansException | IllegalStateException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }
    }

}
