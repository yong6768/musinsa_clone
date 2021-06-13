package musinsa.clone.admin.board.news;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/news")
public class AdminNewsController {

    @GetMapping("/list")
    public String list() {
        return "/board/news/list";
    }

    /**
     * 뉴스 작성 페이
     * @return
     */
    @GetMapping("/write")
    public String writeForm() {
        return "/board/news/write";
    }

    /**
     * 뉴스 작성 프로세지스
     */
    @PostMapping("/write")
    public String writeProcess() {
        return "redirect:/board/news/list";
    }
}
