package cola.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author Cola0502
 * @version 1.0
 * @description: TestController
 * @date 2023/5/27 16:07
 */
@RestController
@RequestMapping("/api/v1/tests")
public class TestController {

    @GetMapping("sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "hello " + name;
    }
}
