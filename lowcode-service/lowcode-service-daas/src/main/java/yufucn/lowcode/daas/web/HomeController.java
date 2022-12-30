package yufucn.lowcode.daas.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang
 * @date 2022/12/29 21:42
 */
@RestController
public class HomeController {


    @RequestMapping("/")
    public String index(){
        return "ok";
    }
}
