package musinsa.clone.admin.board.news;

import lombok.RequiredArgsConstructor;
import musinsa.clone.domain.board.news.dto.NewsWrite;
import musinsa.clone.domain.brand.dto.BrandList;
import musinsa.clone.domain.brand.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/news")
@RequiredArgsConstructor
public class AdminNewsController {
    private final BrandService brandService;

    @GetMapping("/list")
    public String list() {
        return "/board/news/list";
    }

    /**
     * 뉴스 작성 페이
     * @return
     */
    @GetMapping("/write")
    public String writeForm(
            @ModelAttribute("newsWrite") NewsWrite newsWrite,
            Model model
    ) {
        List<BrandList.BrandListElem> brandList = brandService.getBrandList().getBrandList();
        model.addAttribute("brandList", brandList);
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
