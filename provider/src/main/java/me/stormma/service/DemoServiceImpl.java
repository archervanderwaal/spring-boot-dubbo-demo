package me.stormma.service;

import com.alibaba.dubbo.config.annotation.Service;
import me.stormma.api.DemoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author stormma
 * @date 2018/03/02
 */
@Service(
        interfaceClass = DemoService.class
)
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
