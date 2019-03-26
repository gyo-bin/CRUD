package kr.hs.dgsw.web0326.Service;

import kr.hs.dgsw.web0326.Domain.User;
import kr.hs.dgsw.web0326.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User useradd(User user) {
        Optional<User> found = this.userRepository.findByEmail(user.getEmail());
        if(found.isPresent()) return null;
        return userRepository.save(user);
    }

    @Override
    public Boolean userdelete(Long id) {
        try{
            this.userRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public User userupdate(User user) {
        return this.userRepository.findById(user.getId())
                .map(found -> {
                    found.setEmail(Optional.ofNullable(user.getEmail()).orElse(found.getEmail())
                    );
                    found.setUsername(Optional.ofNullable(user.getUsername()).orElse(found.getUsername())
                    );
                    return this.userRepository.save(found);
                })
                .orElse(null);
    }

    @Override
    public User usersearch(Long id) {
        Optional<User> found = this.userRepository.findById(id);
        return found.get();
    }

    @Override
    public List<User> userView() {
        List<User> found = this.userRepository.findAll();
        return found;
    }
}
