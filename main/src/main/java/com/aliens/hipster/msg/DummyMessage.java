package com.aliens.hipster.msg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jayant on 6/3/17.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DummyMessage {
    String name;
    String gender;
    int age;
}
