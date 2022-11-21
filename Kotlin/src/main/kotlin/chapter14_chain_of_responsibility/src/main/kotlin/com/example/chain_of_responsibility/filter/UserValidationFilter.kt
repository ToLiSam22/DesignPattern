package com.example.chain_of_responsibility.filter

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(1)
class UserValidationFilter: Filter {
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        val userId = request?.getParameter("userId")?.toLong()
        println("[UserValidationFilter] userId: $userId")
        userId?.let {
            if (userId <= 0) {
                //throw IllegalArgumentException("이상한 userId 입니다")
                println("[UserValidationFilter] 이상한 userId 입니다")
            }
        }
        chain?.doFilter(request, response)
    }
}
