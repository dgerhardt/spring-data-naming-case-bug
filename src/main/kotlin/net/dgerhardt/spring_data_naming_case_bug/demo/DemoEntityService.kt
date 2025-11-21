package net.dgerhardt.spring_data_naming_case_bug.demo

import jakarta.annotation.PostConstruct
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class DemoEntityService(private val demoEntityRepository: DemoEntityRepository) {
    @PostConstruct
    fun postConstruct() {
        demoEntityRepository.findByIdOrNull(UUID.randomUUID())
    }
}
