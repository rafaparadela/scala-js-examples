package com.example


import Math._
import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.dom.{CanvasRenderingContext2D, html}

@JSExport
object DemoExamples  {
  @JSExport
  def main(canvas: html.Canvas): Unit = {
    val ctx = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
    dom.window.addEventListener("resize", { e: dom.Event => resizeCanvas(ctx) }, false)
    resizeCanvas(ctx)
  }

  def drawStuff(ctx: CanvasRenderingContext2D) {
    var x = 0.0

    dom.setInterval(() => {
      x = x + 1
      ctx.fillStyle = "#FF9900"
      ctx.fillRect(x, 100, 30, 30)
    }, 10)
  }

  def resizeCanvas(ctx: CanvasRenderingContext2D) = {
    ctx.canvas.width = dom.window.innerWidth
    ctx.canvas.height = dom.window.innerHeight
    drawStuff(ctx)
  }

}