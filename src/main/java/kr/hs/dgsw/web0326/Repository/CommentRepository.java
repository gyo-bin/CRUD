package kr.hs.dgsw.web0326.Repository;

import kr.hs.dgsw.web0326.Domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {



}
