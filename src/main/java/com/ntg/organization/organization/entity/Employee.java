package com.ntg.organization.organization.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Long id;
    private String name;
    private String email;
}
