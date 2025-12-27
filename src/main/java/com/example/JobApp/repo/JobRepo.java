package com.example.JobApp.repo;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have java exp", 4, List.of("Java")),
            new JobPost(2, "Senior React Developer", "Must have 3+ year exp in React", 4, List.of("React")),
            new JobPost(3, "Fullstack Developer", "Must have 4+ exp working on Angular, Java, SQL", 4, List.of("Java", "Angular", "SQL")),
            new JobPost(4, "Business Analyst", "Looking for a BA", 4, List.of("Excel"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}
