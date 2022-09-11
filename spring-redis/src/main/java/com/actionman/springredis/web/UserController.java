package com.actionman.springredis.web;

import com.actionman.springredis.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
class UserController {

    private final UserService service;

    @GetMapping
    UserDTO findUser() {
        log.info("Controller------");

        UserDTO dto = UserDTO.builder()
                .id("hong1")
                .build();

        return service.findUser(dto);
    }
}
