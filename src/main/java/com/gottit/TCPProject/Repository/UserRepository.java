package com.gottit.TCPProject.Repository;

import com.gottit.TCPProject.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository< User, Long> {
public List<User> findAllByUsername(String user_name);

}
