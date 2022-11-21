package com.example.chain_of_responsibility

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
// Filter와 Interceptor 정리: https://dev-coco.tistory.com/173
class ChainOfResponsibilityApplication

fun main(args: Array<String>) {
	runApplication<ChainOfResponsibilityApplication>(*args)
}
