package io.github.vishalmysore.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee {
    private String name;
    private int hardWorking; // 1-10 scale
    private int mathAptitude; // 1-10 scale
    private int attitude; // 1-10 scale
}
