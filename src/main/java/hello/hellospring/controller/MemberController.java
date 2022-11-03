package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 스프링 시작 시 스프링 컨테이너에 컨트롤러 추가 후 관리해줌 (빈 관리), 컨트롤러 : 외부요청받음
public class MemberController {

    // 필드 주입
    // @Autowired
    private MemberService memberService;

    // 세터 주입
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }

    // 생성자 주입
    @Autowired // 스프링 컨테이너에 있는 memberService랑 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
