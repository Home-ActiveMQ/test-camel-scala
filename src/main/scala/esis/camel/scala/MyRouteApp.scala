package esis.camel.scala

import org.apache.camel.impl.DefaultCamelContext
import org.apache.log4j.Logger
import esis.camel.scala.routes.MyRouteBuilder


object MyRouteApp extends App {
  val logger = Logger.getLogger(MyRouteApp.getClass)

  val camelContext = new DefaultCamelContext
  camelContext.addRoutes(new MyRouteBuilder)
  logger.info("~//starting MyRouteMain...")
  camelContext.start

  Thread.sleep(2000)

  logger.info("stopping...")
  camelContext.stop

}

