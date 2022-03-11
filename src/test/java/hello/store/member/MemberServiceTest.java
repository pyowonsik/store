package hello.store.member;

import hello.store.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

public class MemberServiceTest {


    MemberService memberService;

    @BeforeEach
    void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){

        Member member = new Member(1L, "member", Month.THREE);

        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);


    }

}


