package com.example.jwt.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

// 해당 클래스는 Spring Boot의 `@ConfigurationProperties` 
// 어노테이션을 사용하여, application.properties(속성 설정 파일) 로부터
// JWT 관련 프로퍼티를 관리하는 프로퍼티 클래스입니다.
@Data
@Component // IOC 컨테이너에 빈 등록 하기
@ConfigurationProperties("com.example.jwt") // com.example.jwt 경로 하위 속성들을 지정
public class JwtProps {
    
    // com.example.jwt.secretKey로 지정된 프로퍼티 값을 주입받는 필드
    // com.example.jwt.secret-key -> secretKey : {인코딩된 시크릿 키}
    private String secretKey;

}
