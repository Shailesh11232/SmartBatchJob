package com.smartbatchjobui.smartbatchjobui.resources;

import com.smartbatchjobui.smartbatchjobui.dto.BatchJobSubmit;
import com.smartbatchjobui.smartbatchjobui.services.BatchJobSubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/")
class BatchJobSubmitResource {

    @Autowired
    BatchJobSubmitService batchJobSubmitService;


    @PostMapping("BatchJobSubmit")
    public ResponseEntity<BatchJobSubmit> BJS(@RequestBody BatchJobSubmit batchJobSubmit){
        System.out.println("BatchJobSubmit:"+batchJobSubmit);
        BatchJobSubmit batchJobSubmitResult = batchJobSubmitService.BatchJobS(batchJobSubmit);
        URI location =
                ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}")
                        .buildAndExpand(batchJobSubmitResult).toUri();
        return ResponseEntity.created(location).body(batchJobSubmitResult);
    }
    @GetMapping("BatchJobSubmit")
    public ResponseEntity<List<BatchJobSubmit>> batchJobSubmitGet(){
        List<BatchJobSubmit> batchJobSubmitResult = batchJobSubmitService.batchJobSubmitGet();
        return ResponseEntity.ok().body(batchJobSubmitResult);
    }
    @GetMapping("BatchJobSubmit/{batchJobSubmitId}")
    public ResponseEntity<List<BatchJobSubmit>> batchJobSubmitGetId(@PathVariable(
            "batchJobSubmitId")Long batchJobSubmitId){
        List<BatchJobSubmit> batchJobSubmitResult =
                batchJobSubmitService.batchJobSubmitGetId(batchJobSubmitId);
        return ResponseEntity.ok().body(batchJobSubmitResult);
    }

}