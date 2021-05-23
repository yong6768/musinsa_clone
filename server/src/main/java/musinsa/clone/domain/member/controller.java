package musinsa.clone.domain.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class controller {

    @GetMapping("/test")
    public String test() {
        return "aaa";
    }
}
