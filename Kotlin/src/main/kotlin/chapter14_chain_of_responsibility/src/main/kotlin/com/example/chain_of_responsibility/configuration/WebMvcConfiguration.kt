package com.example.chain_of_responsibility.configuration

import com.example.chain_of_responsibility.interceptor.VipRequestInterceptor
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebMvcConfiguration(
    private val vipRequestInterceptor: VipRequestInterceptor,
) : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(vipRequestInterceptor)
        super.addInterceptors(registry)
    }
}