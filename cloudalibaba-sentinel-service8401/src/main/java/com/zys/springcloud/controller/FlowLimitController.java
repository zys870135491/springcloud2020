package com.zys.springcloud.controller;



import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class FlowLimitController
{
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        System.out.println(Thread.currentThread().getName()+"/testB");
        return "------testB";
    }



    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHostKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        return "------testHotKey";
    }

    // 兜底方法
    public String deal_testHostKey(String p1, String p2, BlockException blockException){
        return "访问人数过多，稍后重试！！！！";
    }
}


