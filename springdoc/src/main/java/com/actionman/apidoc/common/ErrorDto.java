package com.actionman.apidoc.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ErrorDto {

    @Schema(example = "100", description = "에러 코드")
    private String errorCode;
    @Schema(example = "메시지", description = "에러 메시지")
    private String errorMessage;
}
