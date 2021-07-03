package com.mi.youpin.tuishouserver.entity;

import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import lombok.Data;
/**
 * Author zhanghaitao
 * Date  2021-02-04
 */
@Data
public class RobotSeal  {
    private Long id;
    private Long robotId;
    private Integer sealType;
    private String sealReson;
    private Long sealTime;
    private Long ctime;
    private Long utime;

}
