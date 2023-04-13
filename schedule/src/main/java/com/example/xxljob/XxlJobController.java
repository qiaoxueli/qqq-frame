package com.example.xxljob;

import com.example.xxljob.service.XxljobService;
import com.xxl.job.core.biz.model.ReturnT;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.http.GET;
import retrofit2.http.POST;

@RestController
@RequiredArgsConstructor
@RequestMapping("job")
public class XxlJobController {
    private final XxljobService service;

    @GetMapping("addAndStart")
    @ResponseBody
    public ReturnT<String> addAndStart() {
       return service.initJob(null);
    }
}
