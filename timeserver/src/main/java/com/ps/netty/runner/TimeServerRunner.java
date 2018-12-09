package com.ps.netty.runner;

import com.ps.netty.service.TimeServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TimeServerRunner implements CommandLineRunner {
    private TimeServerService timeServerService;
    @Autowired
    public TimeServerRunner(TimeServerService timeServerService){
        this.timeServerService = timeServerService;
    }
    public void run(String... args) throws Exception {
        System.out.println("Begin");
        int port = 8080;
        this.timeServerService.bind(port);
        System.out.println("End");
    }
}
