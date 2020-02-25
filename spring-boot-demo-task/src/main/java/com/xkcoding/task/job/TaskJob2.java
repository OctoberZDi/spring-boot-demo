package com.xkcoding.task.job;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ProjectName: spring-boot-demo
 * @ClassName: TaskJob2
 * @Description: 其定义定时任务2
 * @Author: zhangdi
 * @Date: 2020年01月21日 11:08
 **/
@Component
@Slf4j
public class TaskJob2 {

    /**
     * 10秒执行一次
     */
    @Scheduled(cron = "0/10 * * * * ?")
    public void job1() {
        log.info("job1******" + DateUtil.formatDateTime(new Date()));
    }

    /**
     * 上一次开始执行时间点后5秒再执行
     */
    @Scheduled(fixedDelay = 5000)
    public void job2() {
        log.info("job2******" + DateUtil.formatDateTime(new Date()));
    }
}
