package com.example

import com.typesafe.conductr.bundlelib.scala.ConnectionContext.Implicits.global
import com.typesafe.conductr.bundlelib.scala.StatusService

object Demo extends App {
  println("Demo starting")
  StatusService.signalStartedOrExit()
  println("Demo started")
  Runtime.getRuntime.addShutdownHook(new Thread {
    override def run: Unit = {
      println("Demo shutting down")
    }
  })
  while(true) Thread.sleep(Long.MaxValue)
}
