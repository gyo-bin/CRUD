package kr.hs.dgsw.web0326.Service;

import kr.hs.dgsw.web0326.Domain.User;

import java.util.List;

public interface UserService {
    User useradd(User user);
    Boolean userdelete(Long id);
    User userupdate(User user);
    User usersearch(Long id);
    List<User> userView();

}
