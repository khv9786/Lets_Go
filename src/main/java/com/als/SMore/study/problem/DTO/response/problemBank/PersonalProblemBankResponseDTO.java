package com.als.SMore.study.problem.DTO.response.problemBank;

import com.als.SMore.domain.entity.StudyProblemBank;
import com.als.SMore.global.json.LongToStringSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PersonalProblemBankResponseDTO {
    @JsonSerialize(using = LongToStringSerializer.class)
    private Long problemBankPk;
    private String problemBankName;
    private int count;

    public static PersonalProblemBankResponseDTO of(StudyProblemBank studyProblemBank, int problemCnt) {
        return PersonalProblemBankResponseDTO.builder().
                problemBankPk(studyProblemBank.getStudyProblemBankPk()).
                problemBankName(studyProblemBank.getBankName()).
                count(problemCnt).
                build();
    }
}
