package com.qf.j1906.api;

import com.qf.j1906.fallback.DoctorApiError;
import com.qf.j1906.vo.MsgResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: 刘旭
 * Date: 2019/11/21 15:10
 * @Version 1.0
 */
@FeignClient(value="hospital-doctor",fallback = DoctorApiError.class)
public interface DoctorApi {
    @RequestMapping(value = "/doctors",method = RequestMethod.GET)
    public MsgResult getAllaa();
}
