package com.example.tmacdemo;///**

import com.example.tmacdemo.service.ExampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*Copyright(c)2017,中国电信甘肃万维公司 All rights reserved.
        *中国电信甘肃万维公司 专有/保密源代码,未经许可禁止任何人通过任何渠道使用、修改源代码.
/**
 * 系统名称 综合办公平台
 * 工程名称 ioop-cloud
 * 创建时间 2017-7-3 14:52
 *
 * @author 姜有建
 * @since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TmacDemoApplication.class)
public class TmacDemoTest {

    @Autowired
     ExampleService exampleService;

    @Test
    public void hello() {
        System.out.println("-------------------- tmac-test helloword!");
    }

    @Test
    public void getExample() {
        try {
            exampleService.getExample();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
