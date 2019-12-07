package com.cs201.sendo.mappers;

import com.cs201.sendo.models.UserViewCount;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserViewCountMapper {

    @Update("update user_views_count set count = count + 1 where user_id = #{userId} and cat_lv2_id = #{cateLv2Id}")
    void updateUserViewCount(UserViewCount viewCount);

    @Select("select user_id as userId, cat_lv2_id as cateLv2Id , count " +
            "from user_views_count " +
            "where user_id = #{userId} and cat_lv2_id = #{cateLv2Id}")
    UserViewCount getViewCountRecord(UserViewCount viewCount);


    @Insert("insert into user_views_count (user_id, cat_lv2_id, count) " +
            "VALUES (#{userId}, #{cateLv2Id}, #{count})")
    void insertUserViewCount(UserViewCount viewCount);

    @Update("update user_views_count set count = #{count} where user_id = #{userId} and cat_lv2_id = #{cateLv2Id}")
    void hardUpdateUserViewCount(UserViewCount viewCount);

    @Select("select cat_lv2_id from user_views_count where user_id = #{userId} and count > 0 order by count desc")
    List<Long> getListMostInteractiveCategory(@Param("userId") Long userId);

    @Update("update user_views_count set count = 0 where user_id = #{id}")
    void setUserViewCountToZero(@Param("id") Long id);
}
