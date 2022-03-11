package hello.store;

import hello.store.discountPolicy.DiscountPolicy;
import hello.store.discountPolicy.RateDiscountPolicy;
import hello.store.member.*;
import hello.store.order.Order;
import hello.store.order.OrderService;
import hello.store.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(MemoryMemberRepository());
    }

    @Bean
    public MemberRepository MemoryMemberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(MemoryMemberRepository(),discountPolicy());
   }

    @Bean
   public DiscountPolicy discountPolicy(){
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
