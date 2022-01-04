package com.smartbatchjobui.smartbatchjobui.repositoris;

import com.smartbatchjobui.smartbatchjobui.entity.BatchJobAuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchJobAuditRepository extends JpaRepository<BatchJobAuditEntity, Long> {

}
