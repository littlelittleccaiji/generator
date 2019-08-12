package com.greedystar.generator.model;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @program: PageQueryRequest
 * @description:
 * @author: zhang
 * @create: 14:53
 **/
@Data
public class PageQueryRequest {

	private Integer pageNo;

	private Integer pageSize;

	private JSONObject queryCondition;

}
