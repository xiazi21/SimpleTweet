package com.codepath.apps.restclienttemplate.models;


import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TweetDao {
    @Query("SELECT Tweet.body AS tweet_body, Tweet.createdAt AS tweet_createAt, Tweet.id AS tweet_id " + "FROM Tweet INNER JOIN User ON Tweet.userId = User.id ORDER BY Tweet.createdAt DESC LIMIT 5")
    List<TweetWithUser> recentItems();
}
