package hello.store;

import hello.store.member.Member;
import hello.store.member.MemberService;
import hello.store.member.Month;
import hello.store.order.Order;
import hello.store.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService",OrderService.class);



        Long memberId = 1L;

        Member member = new Member(1L, "member", Month.THREE);
        memberService.join(member);

        Order order = orderService.createOrder(1L, "itemA", 10000);

        System.out.println("Order : " + order);


    }

}