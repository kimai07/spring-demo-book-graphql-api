package com.kimai07.demo.mapper;

import com.kimai07.demo.entity.AuthorEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthorMapper {

    @Select("SELECT id, name FROM authors WHERE id = #{id}")
    AuthorEntity getAuthorById(@Param("id") int id);

    @Insert("INSERT INTO authors (name) VALUES (#{name})")
    void registerAuthor(@Param("name") String name);
}
