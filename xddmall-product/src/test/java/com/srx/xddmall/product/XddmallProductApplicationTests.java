package com.srx.xddmall.product;

//import com.aliyun.oss.OSS;
//import com.aliyun.oss.OSSClient;
//import com.aliyun.oss.OSSClientBuilder;
//import com.aliyun.oss.model.PutObjectRequest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.srx.xddmall.product.entity.BrandEntity;
import com.srx.xddmall.product.service.BrandService;
import com.srx.xddmall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.File;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootTest
class XddmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;
//    @Resource
//    OSSClient ossClient;

    @Test
    public void test1() {
        Long[] path = categoryService.findCatelogPath(225L);
        log.info("完整路径 : {}", Arrays.asList(path));
    }


    /**
     * 阿里云对象存储,文件上传测试
     */
//    @Test
//    public void testUpload() {
////        // Endpoint以杭州为例，其它Region请按实际情况填写。
////        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
////        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
////        String accessKeyId = "LTAI4G7cK3457sWkquy7AaMu";
////        String accessKeySecret = "JzXtaV1mjxJgN8xXHVjFg2sFMuW7cs";
////        // 创建OSSClient实例。
////        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 创建PutObjectRequest对象。
//        PutObjectRequest putObjectRequest = new PutObjectRequest("xdd-mall",
//                "QQ图片20210206204144.jpg",
//                new File("C:\\Users\\长门有希\\Desktop\\QQ图片20210206204144.jpg"));
//
//        // 如果需要上传时设置存储类型与访问权限，请参考以下示例代码。
//        // ObjectMetadata metadata = new ObjectMetadata();
//        // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
//        // metadata.setObjectAcl(CannedAccessControlList.Private);
//        // putObjectRequest.setMetadata(metadata);
//
//        // 上传文件。
//        ossClient.putObject(putObjectRequest);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//
//        System.out.println("上传成功!");
//    }
    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        boolean save = brandService.save(brandEntity);
//        System.out.println(save);

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("爱国者华为");
//        boolean b = brandService.updateById(brandEntity);
//        System.out.println(b);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        System.out.println(list);
    }

}
