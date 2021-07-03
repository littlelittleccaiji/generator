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
public class MemberRelation  {
    private Long uid;
    private Long secondUid;
    private Long thirdUid;

}
