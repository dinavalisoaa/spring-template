package com.train.integration.dto;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;
@Getter
@Setter
public class ArticleDTO {
  public Long authorId;
  public String text;
  public  Date publishAt;
}


