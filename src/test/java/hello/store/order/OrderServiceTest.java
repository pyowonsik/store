package hello.store.order;

import hello.store.AppConfig;

import hello.store.member.Member;
import hello.store.member.MemberService;
import hello.store.member.Month;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();

    }



    @Test
    void createOrder(){

        Long memberId = 1L;


        Member member = new Member(memberId, "member", Month.THREE);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);



    }






}
