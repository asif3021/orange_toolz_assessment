package com.assessment.springbatchassessment.config;

import com.assessment.springbatchassessment.model.Lead;
import org.springframework.batch.item.ItemProcessor;

public class LeadProcessor implements ItemProcessor<Lead, Lead> {
//  Process Lead object and return as Lead object
    @Override
    public Lead process(Lead lead) throws Exception {
        return lead;
    }
}
