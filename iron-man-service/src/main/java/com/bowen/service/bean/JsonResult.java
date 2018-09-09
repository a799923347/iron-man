package com.bowen.service.bean;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JsonResult implements Serializable {

  private static final long serialVersionUID = 7467420256987533633L;
  private Integer code;
  private String msg;
  private Integer count;
  private List<Object> data;

  public static JsonResult success(String msg, Integer count, List<Object> data) {
    return new JsonResult(0, msg, count, data);
  }
}
