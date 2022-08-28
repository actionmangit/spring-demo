package com.actionman.springdoc.name.inbound;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
class DemoDto {

    private String name;
    private String id;
}
