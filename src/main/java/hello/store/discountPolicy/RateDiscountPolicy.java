package hello.store.discountPolicy;


import hello.store.member.Member;
import hello.store.member.Month;

public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member member, int price) {
        if (member.getMonth() == Month.ONE) {
            return price;
        } else if (member.getMonth() == Month.THREE) {
            return price * 10 / 100;
        } else if (member.getMonth() == Month.SIX) {
            return price * 20 / 100;
        } else {
            return price * 30 / 100;
        }
    }
}
