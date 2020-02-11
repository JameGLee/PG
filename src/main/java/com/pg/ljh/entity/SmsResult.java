package com.pg.ljh.entity;

import com.pg.ljh.enums.AppointStateEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 系统通用返回结果
 * get set toString
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsResult {
    private int status;
    private String message;
    public SmsResult(AppointStateEnum em){
        this.status = em.getState();
        this.message = em.getStateInfo();
    }
}
