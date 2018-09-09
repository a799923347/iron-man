package com.bowen.service.bean;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoModel implements Serializable {

  private static final long serialVersionUID = 6240952070365986726L;
  private Long id;
  private String username;
  private String sex;
  private String city;
  private String sign;
  private Integer experience;
  private Integer logins;
  private Integer wealth;
  private String classify;
  private Integer score;

}
