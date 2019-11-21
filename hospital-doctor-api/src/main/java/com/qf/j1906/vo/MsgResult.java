package com.qf.j1906.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 刘旭
 * Date: 2019/11/21 16:52
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgResult {
    private int statusCode;
    private String msg;
    private Object data;
}