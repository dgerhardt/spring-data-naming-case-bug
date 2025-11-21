package net.dgerhardt.spring_data_naming_case_bug.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface DemoEntityRepository : JpaRepository<DemoEntity, UUID>
