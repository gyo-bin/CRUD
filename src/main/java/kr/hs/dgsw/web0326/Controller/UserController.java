package kr.hs.dgsw.web0326.Controller;

import kr.hs.dgsw.web0326.Domain.User;
import kr.hs.dgsw.web0326.Repository.UserRepository;
import kr.hs.dgsw.web0326.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/search")
    public List<User> view(){
        return this.userService.userView();
    }

    @GetMapping("/search/{id}")
    public User search(@PathVariable Long id){
        return this.userService.usersearch(id);
    }

    @PostMapping("/add")
    public User add(@RequestBody User user){
        return this.userService.useradd(user);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id){
        return this.userService.userdelete(id);
    }

    @PutMapping("/update")
    public User update(@RequestBody User user) {
        return this.userService.userupdate(user);
    }
}
