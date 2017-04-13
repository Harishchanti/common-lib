package com.ailiens.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jayant on 29/3/17.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RabbitmqConfig {
  String host;
  String userName="";
  String password="";
}
