package com.neo.springboard.repository;

import com.neo.springboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends
        JpaRepository<UserAccount, Long> {
}
