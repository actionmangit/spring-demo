package com.actionman.springredis.web;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDTO {

    private String name;

    private int age;

    private String id;
}
