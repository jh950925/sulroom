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

    @GetMapping("/add/view")
    public String mvUSerAddView() {
        return "";
    }

    @GetMapping("/search/id/view")
    public String mvUSerSearchIdView() {
        return null;
    }

    @GetMapping("/search/pass/view")
    public String mvUserSearchPassView() {
        return null;
    }
}
