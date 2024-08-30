package jh.sulroom.sulroom.app.controller.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
@Controller
public class UserController {

    /**
     * 회원가입 화면이동
     * @return VIew
     */
    @GetMapping("/add/view")
    public String mvUSerAddView() {
        return "user/userAdd";
    }

    /**
     * 회원 ID 찾기 화면이동
     * @return View
     */
    @GetMapping("/search/id/view")
    public String mvUSerSearchIdView() {
        return "user/userSearchId";
    }

    /**
     * 회원 PASS 찾기 화면이동
     * @return View
     */
    @GetMapping("/search/pass/view")
    public String mvUserSearchPassView() {
        return "user/userSearchPass";
    }
}
