package com.example

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.dom.html

@JSExport
object DemoExamples  {
  @JSExport
  def main(canvas: html.Canvas): Unit = {
    val ctx = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
    dom.window.addEventListener("resize", { e: dom.Event => resizeCanvas(ctx.canvas) }, false)
    resizeCanvas(ctx.canvas)
  }

  def drawStuff(canvas: HTMLCanvasElement) {

  }

  def resizeCanvas(canvas: HTMLCanvasElement) = {
    canvas.width = dom.window.innerWidth
    canvas.height = dom.window.innerHeight
    drawStuff(canvas)
  }

}