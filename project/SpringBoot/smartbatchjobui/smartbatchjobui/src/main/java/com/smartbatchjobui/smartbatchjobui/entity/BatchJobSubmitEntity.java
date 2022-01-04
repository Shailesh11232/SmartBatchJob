package com.smartbatchjobui.smartbatchjobui.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.time.LocalDateTime;
@Entity(name = "batch_job_submit")
@EntityListeners(AuditingEntityListener.class)
public class BatchJobSubmitEntity extends AudiTable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_job_submit_id")
    private Long batchJobSubmitId;
    @Column(name = "batch_job_name")
    private String batchJobName;
    @Column(name = "batch_job_parameter")
    private String createBatchJobParameter;


    public BatchJobSubmitEntity(){}

    public BatchJobSubmitEntity(LocalDateTime createdDate, LocalDateTime lastModifiedDate, Long batchJobSubmitId, String batchJobName, String createBatchJobParameter) {
        super(createdDate, lastModifiedDate);
        this.batchJobSubmitId = batchJobSubmitId;
        this.batchJobName = batchJobName;
        this.createBatchJobParameter = createBatchJobParameter;
    }

    @Override
    public String toString() {
        return "BatchJobSubmitEntity{" +
                "batchJobSubmitId=" + batchJobSubmitId +
                ", batchJobName='" + batchJobName + '\'' +
                ", createBatchJobParameter='" + createBatchJobParameter + '\'' +
                '}';
    }

    public Long getBatchJobSubmitId() {
        return batchJobSubmitId;
    }

    public void setBatchJobSubmitId(Long batchJobSubmitId) {
        this.batchJobSubmitId = batchJobSubmitId;
    }

    public String getBatchJobName() {
        return batchJobName;
    }

    public void setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
    }

    public String getCreateBatchJobParameter() {
        return createBatchJobParameter;
    }

    public void setCreateBatchJobParameter(String createBatchJobParameter) {
        this.createBatchJobParameter = createBatchJobParameter;
    }
}