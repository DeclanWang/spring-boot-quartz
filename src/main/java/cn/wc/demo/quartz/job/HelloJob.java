package cn.wc.demo.quartz.job;

import cn.wc.demo.quartz.service.HelloService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 任务
 *
 * @author WangCong
 * @since 2019-04-23
 */
public class HelloJob implements Job {
    @Autowired
    private HelloService service;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        service.hello();
    }
}
