package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mytest extends BaseController{
    @RequestMapping("test")
    public void testok(){
        System.out.println("okokok");
    }
}
