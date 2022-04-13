package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import com.mysite.sbb.answer.AnswerDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDto {
    private Integer id;
    private String subject;
    private String content;
    private LocalDateTime createDate;
    private List<AnswerDto> answerList;
}
