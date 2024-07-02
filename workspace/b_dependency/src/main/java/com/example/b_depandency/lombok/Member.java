package com.example.b_depandency.lombok;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
//@Data

public class Member {
    @NonNull
    private String name;

    private int age;
    private String gender;
    private String address;

}
