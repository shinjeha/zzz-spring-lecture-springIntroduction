package demo;

import org.springframework.stereotype.Component;

// hello.hellospring 패키지 밑에 있는 클래스가 아니므로 스프링 컨테이너에 등록되지 않음 (컴포넌트 스캔 방식)
// 하려면 직접 등록해줘야 함
@Component
public class Demo {
}
