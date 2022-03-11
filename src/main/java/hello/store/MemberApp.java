package hello.store;


import hello.store.member.Member;
import hello.store.member.MemberService;
import hello.store.member.MemberServiceImpl;
import hello.store.member.Month;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);

        Member member = new Member(1L, "member", Month.THREE);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        System.out.println("member : " + member);
        System.out.println("findMember : " + findMember);


    }
}
