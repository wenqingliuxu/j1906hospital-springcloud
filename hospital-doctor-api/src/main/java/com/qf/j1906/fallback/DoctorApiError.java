package com.qf.j1906.fallback;

import com.qf.j1906.api.DoctorApi;
import com.qf.j1906.vo.MsgResult;
import org.springframework.stereotype.Component;

/**
 * @Author: 刘旭
 * Date: 2019/11/21 15:12
 * @Version 1.0
 */
@Component
public class DoctorApiError implements DoctorApi {
    @Override
    public MsgResult getAllaa() {
        return null;
    }
}
