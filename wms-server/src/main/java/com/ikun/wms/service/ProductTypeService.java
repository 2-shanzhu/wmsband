package com.ikun.wms.service;

import com.ikun.wms.pojo.dto.ProductTypeTreeDTO;
import com.ikun.wms.pojo.entity.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author yiwan
* @description 针对表【product_type(商品分类表)】的数据库操作Service
* @createDate 2024-07-18 16:23:43
*/
public interface ProductTypeService extends IService<ProductType> {
    List<ProductTypeTreeDTO> findProductTree();

    boolean typeCodeExist(String typeCode);
}
