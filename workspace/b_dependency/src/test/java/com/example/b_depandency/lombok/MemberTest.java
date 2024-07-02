package com.example.b_depandency.lombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberTest {

    @Test
    void test (){
        Member member = new Member();
        Member member1 = new Member("김진수");
        log.info(member1.toString());

    }

}
