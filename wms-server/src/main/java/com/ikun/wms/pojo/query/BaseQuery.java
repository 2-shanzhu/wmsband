package com.ikun.wms.pojo.query;

import lombok.Data;

/**
 * @Author: yiwang
 * @Date: 2024/7/22
 */

@Data
public class BaseQuery {
    private Integer currentPage =  1;
    private Integer pageSize = 10;
}