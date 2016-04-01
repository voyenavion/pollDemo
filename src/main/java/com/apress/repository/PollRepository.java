package com.apress.repository;

import com.apress.domain.Poll;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shaungould on 2/24/16.
 */



public interface PollRepository extends CrudRepository<Poll, Long> {
}
