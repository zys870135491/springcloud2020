package com.zys.springcloud.controller;


import com.zys.springcloud.entities.CommonResult;
import com.zys.springcloud.entities.Payment;
import com.zys.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result > 0){
            return new CommonResult(200, "插入数据库成功", result);
        }
        return new CommonResult(444, "插入数据库失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment result = paymentService.getPaymentById(id);
        if(result != null){
            return new CommonResult(200, "查询成功 serverPort:"+serverPort, result);
        }
        return new CommonResult(444, "没有对应id的记录", null);
    }

   /* @GetMapping("/payment/get/{id}")
    public String getGateWayTest1(@PathVariable("id") Integer id){
        return "***8001 get方法收到请求，参数id为：" + id;
    }

    @GetMapping("/payment/lb/{id}")
    public String getGateWayTest2(@PathVariable("id") Integer id){
        return "---8001 lb方法受到请求，参数id为：" + id;
    }


    @GetMapping("/payment/zipkin")
    public String testzipkin(){
        return "zipkin ------";
    }*/

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;

    }

    @GetMapping(value = "/payment/timeOut")
    public String timeOut(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
