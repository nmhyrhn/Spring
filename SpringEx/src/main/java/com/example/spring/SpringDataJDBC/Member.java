package com.example.spring.SpringDataJDBC;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table  // 클래스가 DB 테이블이랑 연결 (매핑됨을 지정)
@Data  // Getter/Setter, toString, equals, hashCode 자동 생성
@Builder  // new Member() 대신 Member.builder()로 객체 만들 수 있음
// (객체 생성 시 빌더 패턴을 사용할 수 있게 함)
@AllArgsConstructor  // 모든 필드를 파라미터로 받는 생성자 생성
@NoArgsConstructor  // 파라미터가 없는 기본 생성자 생성
public class Member {
    @Id  // 기본 키(Primary Key) 필드임을 명시
    private Long id;
    private String name;
    private String email;
    private Integer age;
}
