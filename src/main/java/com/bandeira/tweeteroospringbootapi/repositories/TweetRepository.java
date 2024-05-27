package com.bandeira.tweeteroospringbootapi.repositories;

import com.bandeira.tweeteroospringbootapi.models.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TweetRepository extends JpaRepository<Tweet, UUID> {
}
