package com.example.tmacdemo;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 类名: ExampleController <br/>
 * 功能: api接口开发实例，开发示例
 *
 * 创建时间: 2018年1月23日 下午4:44:43 <br/>
 * 
 * @author 姜有建
 * @version  
 * @since Jdk 1.8
 */
@RestController
@Scope("prototype")
@RequestMapping(value="/api/")     // 通过这里配置使下面的映射都在/examples
public class ExampleController {

    @RequestMapping(value="hello", method= RequestMethod.GET)
	public String hello() {
	System.out.println("test duplicated rate ");
	System.out.println("test duplicated rate ");
        return "tmac demo say：hello!";
	}



}
