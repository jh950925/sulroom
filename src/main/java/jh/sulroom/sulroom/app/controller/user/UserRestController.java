package jh.sulroom.sulroom.app.controller.user;

import jh.sulroom.sulroom.app.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/user/")
@RestController
public class UserRestController {

    private UserServiceImpl userService;

    /**
     * 회원가입
     * @return ResponseEntity
     */
    @PostMapping("add/data")
    public ResponseEntity<Map<String, Object>> userAdd() {
        Map<String, Object> map = new HashMap<>();
        return ResponseEntity.ok(map);
    }

    /**
     * 회원 아읻 찾기
     * @return
     */
    @PostMapping("search/id/data")
    public ResponseEntity<Map<String, Object>> userSearchId() {
        Map<String, Object> map = new HashMap<>();
        return ResponseEntity.ok(map);
    }

    /**
     * 회원 비밀번호 찾기
     * @return
     */
    @PostMapping("search/pass/data")
    public ResponseEntity<Map<String, Object>> userSearchPass() {
        Map<String, Object> map = new HashMap<>();
        return ResponseEntity.ok(map);
    }

    /**
     * 로그인
     * @return
     */
    @PostMapping("login/data")
    public ResponseEntity<Map<String, Object>> logint() {
        Map<String, Object> map = new HashMap<>();
        return ResponseEntity.ok(map);
    }

    /**
     * 로그아웃
     * @return
     */
    @PostMapping("logout/data")
    public ResponseEntity<Map<String, Object>> logout() {
        Map<String, Object> map = new HashMap<>();
        return ResponseEntity.ok(map);
    }

}
