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

    val (h, w) = (ctx.canvas.height, ctx.canvas.width)
    var x = 0.0

    dom.setInterval(() => {
      x = (x + 1) % w

      if (x == 0) ctx.clearRect(0, 0, w, h)
      else {
        val y = sin(x/w * 100) * h/40 + 200
        ctx.fillStyle = "#FF9900"
        ctx.fillRect(x, y, 3, 3)
      }
    }, 10)

  }

  def resizeCanvas(ctx: CanvasRenderingContext2D) = {
    ctx.canvas.width = dom.window.innerWidth
    ctx.canvas.height = dom.window.innerHeight
    drawStuff(ctx)
  }

}