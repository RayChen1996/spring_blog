package com.raychen.blog.repository
import com.raychen.blog.model.Post
import org.springframework.data.jpa.repository.JpaRepository
interface PostRepository : JpaRepository<Post, Long> {
}