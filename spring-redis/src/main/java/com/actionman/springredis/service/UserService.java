package com.actionman.springredis.service;

import com.actionman.springredis.web.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Cacheable(value = "customerCache", key = "#reqDto.id")
    public UserDTO findUser(UserDTO reqDto) {
        log.info("Inner Service Activate.");

        UserDTO dto = UserDTO.builder()
                .id("hong")
                .name("홍길동")
                .age(20)
                .build();

        return dto;
    }
}
