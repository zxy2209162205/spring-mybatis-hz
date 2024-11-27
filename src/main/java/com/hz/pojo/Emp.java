package com.hz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

  private long id;
  private String username;
  private String password;
  private String name;
  private long gender;
  private String image;
  private long job;
  private LocalDate entrydate;
  private long deptId;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;


}
