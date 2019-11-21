package com.qf.j1906.controller;

import com.qf.j1906.api.DoctorApi;
import com.qf.j1906.vo.MsgResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 刘旭
 * Date: 2019/11/21 15:27
 * @Version 1.0
 */
@RestController
public class AdminController {
    @Autowired
    private DoctorApi doctorApi;
    @CrossOrigin
    @RequestMapping(value = "/api/doctors",method = RequestMethod.GET)
    public MsgResult getDocs(){
        MsgResult all = doctorApi.getAllaa();
        return all;
    }
}
