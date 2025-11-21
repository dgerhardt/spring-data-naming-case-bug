package net.dgerhardt.spring_data_naming_case_bug.demo

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class DemoEntity {
    @Id var demoId: UUID? = null
}
