package com.guoer.shooting.responsity;

import com.guoer.shooting.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserResponsity extends JpaRepository<User,Integer> {

    User findUserByAccountAndPwd(String account,String pwd);
}
