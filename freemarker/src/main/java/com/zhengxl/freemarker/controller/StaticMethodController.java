package com.zhengxl.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @projectName:freemarker
 * @see:com.zhengxl.freemarker.controller
 * @author:郑晓龙
 * @createTime:2020/12/28 14:13
 * @version:1.0
 */
@Controller
public class StaticMethodController {
    @GetMapping("static")
    public String staticMethodView(){
        return "static-method-view";
    }
}
