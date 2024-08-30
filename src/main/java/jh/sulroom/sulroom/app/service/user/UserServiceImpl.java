package jh.sulroom.sulroom.app.service.user;

import jh.sulroom.sulroom.app.model.dto.user.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    /**
     * 회원가입
     * @param userVo
     * @return UserVo
     */
    @Override
    public UserVo userAdd(UserVo userVo) {

        return null;
    }

    /**
     * 회원 아이디 찾기
     * @param userVo
     * @return UserVo
     */
    @Override
    public UserVo userSearchId(UserVo userVo) {
        return null;
    }

    /**
     * 회원 비밀번호 찾기
     * @param userVo
     * @return UserVo
     */
    @Override
    public UserVo userSearchPass(UserVo userVo) {
        return null;
    }

    /**
     * 로그인
     * @param userVo
     * @return UserVo
     */
    @Override
    public UserVo login(UserVo userVo) {
        return null;
    }

    /**
     * 로그아웃
     * @param userVo
     */
    @Override
    public void logout(UserVo userVo) {

    }
}
