package me.stormma.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.stormma.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author stormma
 * @date 2018/03/02
 */
@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name") String name) {
        return demoService.sayHello(name);
    }
}
