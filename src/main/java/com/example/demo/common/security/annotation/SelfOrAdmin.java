package com.example.demo.common.security.annotation;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.*;

/**
 * 본인 리소스이거나 ADMIN인 경우만 접근 가능
 * 사용하는 메서드의 파라미터 이름이 반드시 "id"여야 함
 *
 * 사용 예:
 * @SelfOrAdmin
 * public ResponseEntity<?> getUser(@PathVariable Long id) { ... }
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@PreAuthorize("hasRole('ADMIN') or #id == authentication.principal.userId")
public @interface SelfOrAdmin {
}
