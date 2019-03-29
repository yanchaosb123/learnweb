package com.david.producer;


import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.KafkaAdminClient;


public class TopicManager {

    public static void main(String[] args) {
        String zookeeperConnect = "";

        AdminClient clt = AdminClient.create();

        int sessionTimeoutMs = 10 * 1000;
        int connectionTimeoutMs = 8 *1000;


    }
}
