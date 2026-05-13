package com.example.demo.common.security.annotation;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.lang.annotation.*;

/**
 * 컨트롤러 파라미터에 현재 로그인한 User 객체를 주입
 *
 * 사용 예:
 * public ResponseEntity<?> getProfile(@CurrentUser User user) { ... }
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {
}
