package kr.hs.dgsw.web0326.Service;

import kr.hs.dgsw.web0326.Domain.Comment;
import kr.hs.dgsw.web0326.Domain.User;
import kr.hs.dgsw.web0326.Protocol.CommentUsernameProtocol;

import java.util.List;

public interface CommentService {
    List<CommentUsernameProtocol> listAllComments();

    Comment commentadd(Comment comment);
    Boolean commentdelete(Long id);
    Comment commentupdate(Comment comment);
    Comment commentsearch(Long id);
    List<Comment> commentView();
}
