package com.raychen.blog
import org.springframework.data.jpa.repository.JpaRepository
interface PostRepository : JpaRepository<Post, Long> {
}