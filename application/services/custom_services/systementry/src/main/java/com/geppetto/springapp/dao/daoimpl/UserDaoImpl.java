package com.geppetto.springapp.dao.daoimpl;

import com.geppetto.springapp.model.User;
import com.geppetto.springapp.repository.UserRepository;
import com.geppetto.springapp.dao.UserDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    private final UserRepository userRepository;

     public UserDaoImpl(UserRepository userRepository) {
       this.userRepository = userRepository;
}





}
