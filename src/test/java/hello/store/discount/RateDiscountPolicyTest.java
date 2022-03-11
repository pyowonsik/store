package hello.store.discount;

import hello.store.discountPolicy.RateDiscountPolicy;

import hello.store.member.Member;
import hello.store.member.Month;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RateDiscountPolicyTest {
    
    
    
    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();
    
    
    @Test
    void vip_o(){

        Member memberA = new Member(1L, "memberA", Month.THREE);

        int discountPrice = rateDiscountPolicy.discount(memberA, 10000);

        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void vip_x(){

        Member memberB = new Member(2L, "memberB",Month.THREE);

        int discountPrice = rateDiscountPolicy.discount(memberB, 10000);

        Assertions.assertThat(discountPrice).isEqualTo(0);
    }
    

   
   
   

}
