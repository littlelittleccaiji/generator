package com.mi.youpin.tuishouserver.entity;

import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import lombok.Data;
/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
@Data
public class MemberFlow  {
    private Long id;
    private Long uid;
    private Long growthFlowId;
    private Short type;
    private Long stime;
    private Long etime;
    private Byte status;
    private String remark;
    private Long ctime;
    private Long utime;

}
