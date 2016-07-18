package ro.teamnet.zth.appl.service;

import ro.teamnet.zth.appl.domain.Job;

import java.util.List;

/**
 * Created by user on 7/18/2016.
 */
public interface JobService {
    public Job findOneJob(String id);
    public List<Job> findAllJobs();
    public void delete(String id);
}
