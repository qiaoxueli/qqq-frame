package com.example.xxljob.service;

import com.example.xxljob.domain.XxlJobInfoDTO;
import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import com.xxl.job.core.biz.model.ReturnT;
import retrofit2.http.Body;
import retrofit2.http.POST;

@RetrofitClient(baseUrl = "${frame.xxljob.task.api}")
public interface XxlJobClient {

    @POST("add")
    void addJob(@Body XxlJobInfoDTO info);

    @POST("update")
    void updateJob(@Body XxlJobInfoDTO info);

    @POST("start")
    void startJob(@Body XxlJobInfoDTO info);

    @POST("addAndStart")
    ReturnT<String> addAndStart(@Body XxlJobInfoDTO info);

}
