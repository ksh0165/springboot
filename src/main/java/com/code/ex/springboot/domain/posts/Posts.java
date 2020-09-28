package com.code.ex.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 500, nullable = false)
  private String title;

  @Column(columnDefinition =  "TEXT", nullable = false)
  private String content;

  private String author;

  @Builder
  public Posts(String title, String content, String author){
      this.title = title;
      this.content = content;
      this.author = author;
  }

  public String getContent(){
    return content;
  }

  public String getTitle(){
    return title;
  }

  public void update(String title, String content){
    this.title = title;
    this.content = content;
  }
}
