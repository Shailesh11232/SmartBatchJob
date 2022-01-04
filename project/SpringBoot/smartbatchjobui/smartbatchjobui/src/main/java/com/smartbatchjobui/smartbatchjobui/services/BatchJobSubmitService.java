package com.smartbatchjobui.smartbatchjobui.services;


import com.smartbatchjobui.smartbatchjobui.dto.BatchJobSubmit;
import com.smartbatchjobui.smartbatchjobui.entity.BatchJobSubmitEntity;
import com.smartbatchjobui.smartbatchjobui.repositoris.BatchJobSubmitEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchJobSubmitService {

    @Autowired
    BatchJobSubmitEntityRepository batchJobSubmitEntityRepository;

    public BatchJobSubmit BatchJobS(BatchJobSubmit batchJobSubmit){
        BatchJobSubmitEntity batchJobSubmitEntity = new BatchJobSubmitEntity();
        batchJobSubmitEntity.setBatchJobSubmitId(0L);
        batchJobSubmitEntity.setBatchJobName(batchJobSubmit.getBatchJobName());
        batchJobSubmitEntity.setCreateBatchJobParameter(batchJobSubmit.getCreateBatchJobParameter());
        BatchJobSubmitEntity batchJobSubmitResult =
                batchJobSubmitEntityRepository.save(batchJobSubmitEntity);
        BatchJobSubmit batchJobSubmit1 = new BatchJobSubmit();
        batchJobSubmit1.setBatchJobSubmitId(batchJobSubmitResult.getBatchJobSubmitId());
        batchJobSubmit1.setBatchJobName(batchJobSubmitResult.getBatchJobName());
        batchJobSubmit1.setCreateBatchJobParameter(batchJobSubmitResult.getCreateBatchJobParameter());

        return batchJobSubmit1;
    }
    public List<BatchJobSubmit> batchJobSubmitGet(){
        List<BatchJobSubmitEntity> batchJobSubmitEntityList =
                batchJobSubmitEntityRepository.findAll();
        ArrayList<BatchJobSubmit> batchJobSubmitList = new ArrayList<>();
        batchJobSubmitEntityList.forEach(batchJobSubmitEntity -> {
            BatchJobSubmit batchJobSubmit1 = new BatchJobSubmit();
            batchJobSubmit1.setBatchJobSubmitId(batchJobSubmitEntity.getBatchJobSubmitId());
            batchJobSubmit1.setBatchJobName(batchJobSubmitEntity.getBatchJobName());
            batchJobSubmit1.setCreateBatchJobParameter(batchJobSubmitEntity.getCreateBatchJobParameter());
            batchJobSubmitList.add(batchJobSubmit1);
        });
        return batchJobSubmitList;
    }
    public List<BatchJobSubmit> batchJobSubmitGetId(Long batchJobSubmitId){
        List<BatchJobSubmitEntity> batchJobSubmitEntityList =
                batchJobSubmitEntityRepository.findAllByBatchJobSubmitId(batchJobSubmitId);
        ArrayList<BatchJobSubmit> batchJobSubmitList = new ArrayList<>();
        batchJobSubmitEntityList.forEach(batchJobSubmitEntity -> {
            BatchJobSubmit batchJobSubmit1 = new BatchJobSubmit();
            batchJobSubmit1.setBatchJobSubmitId(batchJobSubmitEntity.getBatchJobSubmitId());
            batchJobSubmit1.setBatchJobName(batchJobSubmitEntity.getBatchJobName());
            batchJobSubmit1.setCreateBatchJobParameter(batchJobSubmitEntity.getCreateBatchJobParameter());
            batchJobSubmitList.add(batchJobSubmit1);
        });
        return batchJobSubmitList;
    }

}