package com.actionman.apidoc.user.inbound;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@Builder
class UserDto {

    @Schema(example = "홍길동", description = "이름")
    @NotNull
    private String name;

    @Schema(example = "10", description = "나이")
    private int age;

    @Schema(example = "hong", description = "아이디")
    @NotBlank
    private String id;

    @Schema(description = "성별")
    private Gender gender;

    static enum Gender {
        MAN,
        WOMAN
    }
}
