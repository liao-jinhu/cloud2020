package com.liao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/07/11/22:04
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {
    private long id;
    private String serial;
}
