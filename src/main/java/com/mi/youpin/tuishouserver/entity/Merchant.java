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
public class Merchant  {
    private Long merchantId;
    private String merchantName;
    private String sapId;
    private Timestamp createTime;

}
