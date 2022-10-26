package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello (Model model) {
        model.addAttribute("data", "hello!");
        return "hello"; // resources/templates/hello.html 파일을 찾아라. (뷰 리졸버야 찾아라)
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // 응답 http body에 리턴 내용을 직접 넣어 주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // boot는 기본적으로 객체를 반환하면 JSON으로 반환함. {"name":"aa"}
    }

    static class Hello {
        private String name;

        // getter, setter는 자바 빈 규약
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
