package com.srx.xddmall.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.srx.xddmall.product.entity.BrandEntity;
import com.srx.xddmall.product.service.BrandService;
import com.srx.common.utils.PageUtils;
import com.srx.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author xdd
 * @email 568273744@qq.com
 * @date 2021-02-03 12:50:02
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId) {
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@Valid @RequestBody BrandEntity brand /* , BindingResult result */) {
//        if (result.hasErrors()) {
//            Map<String, String> map = new HashMap<>();
//            for (FieldError fieldError : result.getFieldErrors()) {
//                String defaultMessage = fieldError.getDefaultMessage();
//                String field = fieldError.getField();
//                map.put(field, defaultMessage);
//            }
//            return R.error(400, "提交的数据不合法").put("data", map);
//        } else {
//
//        }
        brandService.save(brand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BrandEntity brand) {
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] brandIds) {
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
