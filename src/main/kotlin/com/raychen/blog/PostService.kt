package com.raychen.blog

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class PostService (private val postRepository: PostRepository){
    fun getAllPosts(): List<Post> = postRepository.findAll()

    fun getPostById(id: Long): Post = postRepository.findById(id)
        .orElseThrow { RuntimeException("Post not found") }

    fun createPost(post: Post): Post = postRepository.save(post)

//    fun updatePost(id: Long, updatedPost: Post): Post {
//        val post = getPostById(id)
//        val updated = post.copy(
//            title = updatedPost.title,
//            content = updatedPost.content
//            // 如果有其他屬性需要更新，也可以在這裡添加
//        )
//        return postRepository.save(updated)
//    }

    fun deletePost(id: Long) {
        postRepository.deleteById(id)
    }
}