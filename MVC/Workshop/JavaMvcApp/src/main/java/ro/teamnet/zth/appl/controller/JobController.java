package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.api.annotations.MyRequestParam;
import ro.teamnet.zth.appl.domain.Job;
import ro.teamnet.zth.appl.service.JobService;
import ro.teamnet.zth.appl.service.impl.JobServiceImpl;

import java.util.List;

/**
 * Created by user on 7/15/2016.
 */

@MyController(urlPath = "/jobs")
public class JobController {
    JobService js = new JobServiceImpl();

    @MyRequestMethod(urlPath = "/all")
    public List<Job> getAllJobs() {
        return js.findAllJobs();
    }

    @MyRequestMethod(urlPath = "/one")
    public Job getOneJob(@MyRequestParam(name="id") String id) {
        return js.findOneJob(id);}

    @MyRequestMethod(urlPath = "/deleteOne", methodType = "DELETE")
    public void deleteOne(@MyRequestParam(name="id") String id){
        js.delete(id);
    }
}
