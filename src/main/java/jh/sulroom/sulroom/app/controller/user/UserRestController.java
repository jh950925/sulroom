package jh.sulroom.sulroom.app.controller.user;

import jh.sulroom.sulroom.app.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserRestController {

    private UserServiceImpl userService;


}
