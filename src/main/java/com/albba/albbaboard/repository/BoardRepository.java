package com.albba.albbaboard.repository;

import com.albba.albbaboard.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Memo, Long> {

}
