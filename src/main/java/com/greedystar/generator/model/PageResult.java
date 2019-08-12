package com.greedystar.generator.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @program: tuishou-server
 * @description: 分页查询
 * @author: menglingjie1@xiaomi.com
 * @create: 2018-11-23 20:21
 **/
@Data
public class PageResult<T> {
    private long total;
    private long pageSize;
    private long pageNo;
    private List<T> data;
    private Map ext;

    public PageResult(long pageSize, long pageNo) {
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }

    public void setTotal(long total) {
        this.total = total;
        long maxPage = (this.total + this.pageSize - 1) / this.pageSize;
        if (maxPage < this.pageNo) {
            this.pageNo = maxPage;
        }
    }
}
