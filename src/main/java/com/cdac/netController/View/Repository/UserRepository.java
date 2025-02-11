package com.cdac.netController.View.Repository;

import com.cdac.netController.View.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
