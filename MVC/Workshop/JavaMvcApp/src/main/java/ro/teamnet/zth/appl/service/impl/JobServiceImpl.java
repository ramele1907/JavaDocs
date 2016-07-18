package ro.teamnet.zth.appl.service.impl;

import ro.teamnet.zth.appl.dao.JobDao;
import ro.teamnet.zth.appl.domain.Job;
import ro.teamnet.zth.appl.service.JobService;

import java.util.List;

/**
 * Created by user on 7/18/2016.
 */
public class JobServiceImpl implements JobService{
    JobDao jd = new JobDao();

    @Override
    public Job findOneJob(String id) {
        Job aux = jd.getJobById(id);
        return aux;
    }

    @Override
    public List<Job> findAllJobs() {
        List<Job> aux = jd.getAllJobs();
        return aux;
    }

    @Override
    public void delete(String id) {
        jd.deleteJob(jd.getJobById(id));
    }
}
