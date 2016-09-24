package com.aliens.msg.hazelcast;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by jayant on 21/9/16.
 */

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class QueueInfo implements Serializable
{
    String qname;

 String groupName;
 String threadName;
    QueueState state=QueueState.IDLE;
    int retry=0;

    public void incRetry(int val)
    {
        retry+=val;
    }
}
