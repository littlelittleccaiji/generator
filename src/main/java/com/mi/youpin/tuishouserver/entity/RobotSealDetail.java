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
public class RobotSealDetail  {
    private Long id;
    private Long sealId;
    private Long groupId;
    private Long ctime;
    private Long utime;

}
