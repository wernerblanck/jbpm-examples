/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jbpm.spring.boot;

import org.jbpm.kie.services.impl.KModuleDeploymentUnit;
import org.jbpm.services.api.DeploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author wblanck
 */
@Configuration
public class Deployment {

    @Autowired
    DeploymentService deploymentService;

    @Autowired
    public void init() {
        System.out.println("START **********************************************************************");
        try {
            KModuleDeploymentUnit unit = new KModuleDeploymentUnit("org.mastertheboss.kieserver", "hello-kie-server", "1.0");
            deploymentService.deploy(unit);
        } catch (Throwable e) {
            System.out.println("Error when deploying = " + e.getMessage());
        }
    }
}
