package cn.wwinter.malladmin.service.impl;

import cn.wwinter.malladmin.service.OssService;
import com.aliyun.oss.OSSClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2023/12/14
 * @Author: zhangdd
 */
@Service
@AllArgsConstructor
public class OssServiceImpl implements OssService {

    private final OSSClient ossClient;

}