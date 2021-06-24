package musinsa.clone.admin.board.news;

import musinsa.clone.domain.board.news.dto.NewsWrite;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String writeForm(@ModelAttribute("newsWrite") NewsWrite newsWrite) {
        return "/board/news/write";
    }

    /**
     * 뉴스 작성 프로세지스
     */
    @PostMapping("/write")
    public String writeProcess(
            NewsWrite newsWrite,
            Model model
    ) {
        System.out.println("newsWrite = " + newsWrite);
        model.addAttribute("newsWrite", newsWrite);
        return "redirect:/board/news/list";
    }
}
