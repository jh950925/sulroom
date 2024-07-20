package jh.sulroom.sulroom.app.service.user;

import jh.sulroom.sulroom.app.model.dto.user.UserVo;

public interface UserService {

    // 회원가입
    UserVo signup(UserVo userVo);

    // ID 찾기
    String findId(UserVo userVo);

    // 비밀번호 찾기
    String findPassword(UserVo userVo);

    // 로그인
    String login(UserVo userVo);

    // 로그아웃
    void logout(UserVo userVo);

    UserVo modifyUser(UserVo userVo);
}
