package com.example

import org.scalajs.dom
import dom.document
import scala.scalajs.js.JSApp

object DemoExamples extends JSApp {
  def main(): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode("Hello world")
    parNode.appendChild(textNode)
    document.body.appendChild(parNode)
  }
}