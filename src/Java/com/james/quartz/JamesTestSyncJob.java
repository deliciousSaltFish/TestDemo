package com.james.quartz;

import org.springframework.stereotype.Repository;

@Repository
public class JamesTestSyncJob {


    int i = 0;

    private void execute() {
        try {
            i++;
            System.out.println("Quartz Sucessful-" + i + "!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void execute1() {
        System.out.println("Quartz1 Sucessful" );
    }
}
