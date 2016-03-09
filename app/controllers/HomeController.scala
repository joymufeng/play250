package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HomeController @Inject() extends Controller {

  def index = Action {
    Ok("index")
  }

  def getResponse(len: Int) = Action {

    Ok(("a" * len).getBytes("utf-8")).withHeaders("Content-Type" -> "text/html; charset=utf-8")
  }

}
