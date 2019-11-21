package com.qf.j1906.controller;

import com.qf.j1906.vo.MsgResult;
import com.qf.j1906.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 刘旭
 * Date: 2019/11/21 14:48
 * @Version 1.0
 */
@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @RequestMapping(value="/doctors",method = RequestMethod.GET)
    public MsgResult getAllDocs(){
        MsgResult all = doctorService.getAll();
        return all;
    }
}
