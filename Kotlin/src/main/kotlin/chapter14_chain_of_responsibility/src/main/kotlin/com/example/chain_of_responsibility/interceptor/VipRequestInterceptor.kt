package com.example.chain_of_responsibility.interceptor

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.HandlerMapping

@Component
class VipRequestInterceptor: HandlerInterceptor {
    @Suppress("UNCHECKED_CAST")
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        val userId = request.getParameter("userId")?.toLong()
        userId?.let {
            if (userId > 100) {
                println("[VipRequestInterceptor] vip로부터 온 요청입니다")
            }
        }
        return true
    }
}
