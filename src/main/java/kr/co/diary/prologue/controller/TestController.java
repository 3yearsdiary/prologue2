package kr.co.diary.prologue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "Hello World!";
    }

    @RequestMapping("/ebalShampoo")
    public String ebalShampoo() {
        return "샴푸는 두번하세요!";
    }
}
