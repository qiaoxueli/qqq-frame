package com.example.xxljob.service;
import java.util.Date;

import com.example.schedule.SpringContextUtils;
import com.example.xxljob.domain.XxlJobInfoDTO;
import com.xxl.job.core.biz.model.ReturnT;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class XxljobService {

    private final XxlJobClient jobClient;
    public ReturnT<String> initJob(XxlJobInfoDTO jobInfo) {
        System.out.println("进入static方法");

        XxlJobClient xxlJobClient = SpringContextUtils.getBean(XxlJobClient.class);

        if (jobInfo == null) {
            jobInfo = new XxlJobInfoDTO();
        }
        jobInfo.setId(123);
        jobInfo.setJobGroup(1);
        jobInfo.setJobDesc("自动注册任务");
        jobInfo.setAddTime(new Date());
        jobInfo.setUpdateTime(new Date());
        jobInfo.setAuthor("admin");
        jobInfo.setAlarmEmail("future_qxl@163.com");
        jobInfo.setScheduleType("CRON");
        jobInfo.setScheduleConf("* * 11,12 * * ?");
        jobInfo.setMisfireStrategy("DO_NOTHING");
        jobInfo.setExecutorRouteStrategy("FIRST");
        jobInfo.setExecutorHandler("方法名");
        jobInfo.setExecutorParam("");
        jobInfo.setExecutorBlockStrategy("SERIAL_EXECUTION");
        jobInfo.setExecutorTimeout(0);
        jobInfo.setExecutorFailRetryCount(0);
//        jobInfo.setGlueType();
//        jobInfo.setGlueSource("");
//        jobInfo.setGlueRemark("");
        jobInfo.setGlueUpdatetime(new Date());
        jobInfo.setChildJobId("");
        jobInfo.setTriggerStatus(0);
        jobInfo.setTriggerLastTime(0L);
        jobInfo.setTriggerNextTime(0L);
        ReturnT<String> stringReturnT = xxlJobClient.addAndStart(jobInfo);
        System.out.println(stringReturnT.getMsg());
        return stringReturnT;
    }

}
