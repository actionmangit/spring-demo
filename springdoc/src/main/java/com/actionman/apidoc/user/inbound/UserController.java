package com.actionman.apidoc.user.inbound;

import com.actionman.apidoc.common.ErrorDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

@Tag(name = "사용자", description = "사용자 API")
@RestController
class UserController {

    @Operation(summary = "사용자 생성 API", description = "사용자 생성 API 입니다.", tags = { "사용자" })
    @PostMapping("/users")
    void saveUser(@RequestBody UserDto userDto) {
        
    }

    @Operation(summary = "사용자 조회 API", description = "사용자 조회 API 입니다.", tags = { "사용자" })
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "성공 응답",
                    content = {@Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class)) }),
            @ApiResponse(
                    responseCode = "500",
                    description = "실패 응답",
                    content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class)) })
    })
    @GetMapping("/users/{id}")
    UserDto findUser(
            @Parameter(description = "사용자 ID", required = true)
            @PathVariable("id") final String id) {
        return UserDto.builder()
                .id(id)
                .name("홍길동")
                .age(22)
                .gender(UserDto.Gender.MAN)
                .build();
    }

    @Operation(summary = "사용자 조회 API", description = "사용자 조회 API 입니다.", tags = { "사용자" })
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "성공 응답",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = UserDto.class))))
    })
    @GetMapping("/users")
    List<UserDto> findUsers(
            @NotNull @Parameter(description = "사용자명", required = false)
            @RequestParam(value = "username", required = false) String name
    ) {
        UserDto user01 = UserDto.builder()
                .id("hong")
                .name("홍길동")
                .age(22)
                .gender(UserDto.Gender.MAN)
                .build();

        UserDto user02 = UserDto.builder()
                .id("kang")
                .name("강영미")
                .age(22)
                .gender(UserDto.Gender.WOMAN)
                .build();

        return Arrays.asList(user01, user02);
    }
}
