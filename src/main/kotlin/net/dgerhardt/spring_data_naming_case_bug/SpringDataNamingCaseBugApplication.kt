package net.dgerhardt.spring_data_naming_case_bug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataNamingCaseBugApplication

fun main(args: Array<String>) {
	runApplication<SpringDataNamingCaseBugApplication>(*args)
}
