package com.clementine_amouroux.little_app.repository;

import com.clementine_amouroux.little_app.model.User;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<@NonNull User, @NonNull Long> {

    User findByEmail(String email);
}
