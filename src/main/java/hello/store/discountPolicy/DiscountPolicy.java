package hello.store.discountPolicy;


import hello.store.member.Member;

public interface DiscountPolicy {

    int discount(Member member,int price);
}
