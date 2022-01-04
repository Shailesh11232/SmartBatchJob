package com.smartbatchjobui.smartbatchjobui.services;

import com.smartbatchjobui.smartbatchjobui.dto.BatchJobAudit;
import com.smartbatchjobui.smartbatchjobui.dto.BatchJobParameterAudit;
import com.smartbatchjobui.smartbatchjobui.entity.BatchJobAuditEntity;
import com.smartbatchjobui.smartbatchjobui.entity.BatchJobParameterAuditEntity;
import com.smartbatchjobui.smartbatchjobui.repositoris.BatchJobAuditRepository;
import com.smartbatchjobui.smartbatchjobui.repositoris.BatchJobParameterAuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class AuditBatchJobService {

    @Autowired
    BatchJobAuditRepository batchJobAuditRepository;
    @Autowired
    BatchJobParameterAuditRepository batchJobParameterAuditRepository;

    public BatchJobAudit BatchJobAudit(BatchJobAudit batchJobAudit){
        BatchJobAuditEntity batchJobAuditEntity = new BatchJobAuditEntity();
        batchJobAuditEntity.setBatchJobAuditId(0L);
        batchJobAuditEntity.setBatchJobName(batchJobAudit.getBatchJobName());
        batchJobAuditEntity.setBatchJobType(batchJobAudit.getBatchJobType());
       batchJobAuditEntity.setAuditUserId(batchJobAudit.getAuditUserId());
        batchJobAuditEntity.setOperation(batchJobAudit.getOperation());
        batchJobAuditEntity.setBatchJobDescription(batchJobAudit.getBatchJobDescription());
        BatchJobAuditEntity batchJobAuditEntityResult =
                batchJobAuditRepository.save(batchJobAuditEntity);
        BatchJobAudit batchJobAudit1 =
                new BatchJobAudit();
        batchJobAudit1.setAuditUserId(batchJobAuditEntityResult.getAuditUserId());
        batchJobAudit1.setBatchJobId(batchJobAuditEntityResult.getBatchJobAuditId());
        batchJobAudit1.setBatchJobDescription(batchJobAuditEntityResult.getBatchJobDescription());
        batchJobAudit1.setBatchJobId(batchJobAuditEntityResult.getBatchJobId());
        batchJobAudit1.setBatchJobName(batchJobAuditEntityResult.getBatchJobName());
        batchJobAudit1.setBatchJobType(batchJobAuditEntityResult.getBatchJobType());
        batchJobAudit1.setOperation(batchJobAuditEntityResult.getOperation());

        return  batchJobAudit1;
    }
    public BatchJobParameterAudit BatchJPA(BatchJobParameterAudit batchJobParameterAudit, Long BatchJobParameterId
            , Long BatchJobId){
        BatchJobParameterAuditEntity batchJobParameterAuditEntity =
                new BatchJobParameterAuditEntity();
        batchJobParameterAuditEntity.setBatchJobParameterAuditId(0L);
        batchJobParameterAuditEntity.setBatchJobParameterId(BatchJobParameterId);
        batchJobParameterAuditEntity.setBatchJobId(BatchJobId);
        batchJobParameterAuditEntity.setAuditUserId(batchJobParameterAudit.getAuditUserId());
        batchJobParameterAuditEntity.setOperation(batchJobParameterAudit.getOperation());
        batchJobParameterAuditEntity.setParameterName(batchJobParameterAudit.getParameterName());
        batchJobParameterAuditEntity.setParameterFormat(batchJobParameterAudit.getParameterFormat());
        batchJobParameterAuditEntity.setDefaultValue(batchJobParameterAudit.getDefaultValue());
        batchJobParameterAuditEntity.setMandatoryFlag(batchJobParameterAudit.getMandatoryFlag());
        batchJobParameterAuditEntity.setParameterDescription(batchJobParameterAudit.getParameterDescription());
        batchJobParameterAuditEntity.setParameterType(batchJobParameterAudit.getParameterType());
        batchJobParameterAuditEntity.setRegexForValidation(batchJobParameterAudit.getRegexforValidation());
        batchJobParameterAuditEntity.setVisibleFlag(batchJobParameterAudit.getVisibleFlag());
        BatchJobParameterAuditEntity batchJobParameterAuditEntityResult =
                batchJobParameterAuditRepository.save(batchJobParameterAuditEntity);

        BatchJobParameterAudit batchJobParameterAudit1 = new BatchJobParameterAudit();
        batchJobParameterAudit1.setBatchJobParameterAuditId(batchJobParameterAuditEntityResult.getBatchJobParameterAuditId());
        batchJobParameterAudit1.setParameterId(batchJobParameterAuditEntityResult.getBatchJobParameterId());
        batchJobParameterAudit1.getBatchJobId(batchJobParameterAuditEntityResult.getBatchJobId());
       // batchJobParameterAudit1.setAuditUserId(batchJobParameterAuditEntityResult.getAuditUserId());
       // batchJobParameterAudit1.setOperation(batchJobParameterAuditEntityResult.getOperation());
        batchJobParameterAudit1.setParameterName(batchJobParameterAuditEntityResult.getParameterName());
        batchJobParameterAudit1.setParameterFormat(batchJobParameterAuditEntityResult.getParameterFormat());
        batchJobParameterAudit1.setDefaultValue(batchJobParameterAuditEntityResult.getDefaultValue());
        batchJobParameterAudit1.setMandatoryFlag(batchJobParameterAuditEntityResult.getMandatoryFlag());
        batchJobParameterAudit1.setParameterDescription(batchJobParameterAuditEntityResult.getParameterDescription());
        batchJobParameterAudit1.setParameterType(batchJobParameterAuditEntityResult.getParameterType());
        batchJobParameterAudit1.setRegexforValidation(batchJobParameterAuditEntityResult.getRegexForValidation());
        batchJobParameterAudit1.setVisibleFlag(batchJobParameterAuditEntityResult.getVisibleFlag());
        return batchJobParameterAudit1;
    }
}