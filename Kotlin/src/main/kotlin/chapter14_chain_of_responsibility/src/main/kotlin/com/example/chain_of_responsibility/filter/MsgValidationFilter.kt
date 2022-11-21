package com.example.chain_of_responsibility.filter

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Order(2)
class MsgValidationFilter: Filter {
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        val msg = request?.getParameter("msg")
        println("[MsgValidationFilter] msg: $msg")
        msg?.let {
            if (msg.length > 10) {
                //throw IllegalArgumentException("메세지가 너무 길어요")
                println("[MsgValidationFilter] 메세지가 너무 길어요")
            }
        }
        chain?.doFilter(request, response)
    }
}
