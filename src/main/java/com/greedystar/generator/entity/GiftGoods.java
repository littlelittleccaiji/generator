package com.greedystar.generator.entity;

import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import lombok.Data;
/**
 * Author zhanghaitao
 * Date  2019-07-29
 */
@Data
public class GiftGoods  {
    private Long id;
    private Integer gid;
    private Integer defaultPid;
    private Integer price;
    private String title;
    private String summary;
    private String coverPicture;
    private String squarePicture;
    private String posterPicture;
    private Integer sellerCost;
    private Integer platformCost;
    private BigDecimal fixedCost;
    private Integer firstLevel;
    private Integer secondLevel;
    private Integer thirdLevel;
    private String channel;
    private Short type;
    private Short seq;
    private String status;

}
