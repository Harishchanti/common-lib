package com.ailiens.common;


/**
 * Created by jayant on 20/2/17.
 */
public interface MsgPublisher {
    PublishResponse publish(MsgMessage msgMessage, String queueName);

    default PublishResponse exchangePublish(MsgMessage msgMessage, String exchangeName)
    {
        return publish(msgMessage, exchangeName);
    }

    PublishResponse retry(MsgMessage msgMessage, String exchangeName);
}
