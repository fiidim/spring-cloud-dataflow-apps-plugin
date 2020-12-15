package springclouddataflowappsmavenplugins

import org.springframework.jenkins.springclouddataflowappsmavenplugins.ci.SpringCloudDataFlowAppsMavenPluginsBuildMaker
import javaposse.jobdsl.dsl.DslFactory

DslFactory dsl = this

// CI
new SpringCloudDataFlowAppsMavenPluginsBuildMaker(dsl, "spring-cloud", "spring-cloud-dataflow-apps-plugin").deploy()

