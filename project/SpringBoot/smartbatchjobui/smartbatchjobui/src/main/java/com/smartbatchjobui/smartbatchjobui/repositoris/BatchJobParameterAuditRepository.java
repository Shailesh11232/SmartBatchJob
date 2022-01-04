package com.smartbatchjobui.smartbatchjobui.repositoris;

import com.smartbatchjobui.smartbatchjobui.entity.BatchJobParameterAuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BatchJobParameterAuditRepository extends JpaRepository<BatchJobParameterAuditEntity,Long> {
   }
