package kr.hs.dgsw.web0326.Repository;

import kr.hs.dgsw.web0326.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);       //email로 사용자 중복체크
}
