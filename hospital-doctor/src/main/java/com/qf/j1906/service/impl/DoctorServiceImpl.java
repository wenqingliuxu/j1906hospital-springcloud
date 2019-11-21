package com.qf.j1906.service.impl;

import com.qf.j1906.mapper.DoctorMapper;
import com.qf.j1906.vo.MsgResult;
import com.qf.j1906.pojo.Doctor;
import com.qf.j1906.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 刘旭
 * Date: 2019/11/21 14:47
 * @Version 1.0
 */
@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public MsgResult getAll() {
        List<Doctor> all = doctorMapper.findAll();
        MsgResult result = new MsgResult();
        result.setStatusCode(200);
        result.setData(all);
        return result;
    }
}
