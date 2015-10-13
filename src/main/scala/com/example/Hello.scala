package com.example

import org.scalajs.dom.{document, Node}
import scala.scalajs.js.JSApp

object DemoExamples extends JSApp {
  def main(): Unit = {
    appendPar(document.body, "Hello World")

  }


  def appendPar(targetNode: Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
}