package com.apress.repository;

import com.apress.domain.Vote;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shaungould on 2/24/16.
 */
public interface VoteRepository extends CrudRepository<Vote, Long> {
}
