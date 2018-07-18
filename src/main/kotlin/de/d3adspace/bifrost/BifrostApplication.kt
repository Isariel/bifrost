package de.d3adspace.bifrost

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
class BifrostApplication

fun main(args: Array<String>) {

    runApplication<BifrostApplication>(*args)
}
