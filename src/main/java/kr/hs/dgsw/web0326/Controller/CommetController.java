package kr.hs.dgsw.web0326.Controller;

import kr.hs.dgsw.web0326.Domain.Comment;
import kr.hs.dgsw.web0326.Domain.User;
import kr.hs.dgsw.web0326.Protocol.CommentUsernameProtocol;
import kr.hs.dgsw.web0326.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommetController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/List")
    public List<CommentUsernameProtocol> listComments(){
        return this.commentService.listAllComments();
    }

    @GetMapping("/Csearch")
    public List<Comment> view(){
        return this.commentService.commentView();
    }

    @GetMapping("/Csearch/{id}")
    public Comment search(@PathVariable Long id){
        return this.commentService.commentsearch(id);
    }

    @PostMapping("/Cadd")
    public Comment add(@RequestBody Comment comment){
        return this.commentService.commentadd(comment);
    }

    @DeleteMapping("/Cdelete/{id}")
    public Boolean delete(@PathVariable Long id){
        return this.commentService.commentdelete(id);
    }

    @PutMapping("/Cupdate")
    public Comment update(@RequestBody Comment comment) {
        return this.commentService.commentupdate(comment);
    }
}
