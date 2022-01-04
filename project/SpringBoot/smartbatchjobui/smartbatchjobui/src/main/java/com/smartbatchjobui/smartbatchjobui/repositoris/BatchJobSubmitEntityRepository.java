package com.smartbatchjobui.smartbatchjobui.repositoris;
import com.smartbatchjobui.smartbatchjobui.entity.BatchJobSubmitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchJobSubmitEntityRepository extends JpaRepository<BatchJobSubmitEntity,Long> {
    List<BatchJobSubmitEntity> findAllByBatchJobSubmitId(Long batchJobSubmitId);
}