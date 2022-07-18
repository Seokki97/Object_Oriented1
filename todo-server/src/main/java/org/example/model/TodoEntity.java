package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data //getter ,setter requiredargConstructor tostring equalsandhashcode 한꺼번에 설정해주는 어노테이션
@Entity
@NoArgsConstructor //롬복에서 파라미터가 없는 기본 생성자를 자동으로 생성하는 어노테이션
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자를 만들어줌

public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(name = "todoOrder", nullable = false)
    private Long order;

    @Column(nullable = false)
    private Boolean completed;
}
