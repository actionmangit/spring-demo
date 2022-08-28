package com.actionman.springdoc.name.inbound;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    DemoDto findDemo() {
        return DemoDto.builder()
                .id("DemoId")
                .name("DemoName")
                .build();
    }
}
