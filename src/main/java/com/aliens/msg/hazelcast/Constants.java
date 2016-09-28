package com.aliens.msg.hazelcast;

import lombok.experimental.UtilityClass;

/**
 * Created by jayant on 26/9/16.
 */

@UtilityClass
public class Constants {
    public final static String CLUSTERNAME = "clusterMsg";

    public final static String MAIN_QUEUE_WORKER_LIST = "mainQueueWorkerThreads";
    public final static String GROUP_QUEUE_WORKER_LIST = "groupQueueWorkerThreads";

    public final static String RESTARTED_WORKER_LIST = "restartedThreads";
    public final static String WAITING_GROUPS ="waitingGroups";
    public final static String QUEUE_MAPPINGS="data";
    public final static String INFO="info";


    public final static String AVAILABLE_GROUP_SUFFIX = "_AvailableGroups";
    public final static String WAITING_GROUP_SUFFIX = "_WaitingGroups";
    public final static String CLIENTS= "clients";
}
