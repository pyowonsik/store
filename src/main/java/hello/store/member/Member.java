package hello.store.member;
// 회원 도메인
public class Member {

    private Long id;
    private String name;
    private Month month;


    public Member(Long id, String name, Month month) {
        this.id = id;
        this.name = name;
        this.month = month;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }
}
