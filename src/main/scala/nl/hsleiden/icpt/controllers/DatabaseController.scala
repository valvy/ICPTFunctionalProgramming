package nl.hsleiden.icpt.controllers

import nl.hsleiden.icpt.dao.CatDAO
import play.api.libs.json.Json
import play.api.mvc._
import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext

@Singleton
class DatabaseController @Inject() (catDAO: CatDAO,
                                     cc: ControllerComponents)(implicit executionContext: ExecutionContext)  extends AbstractController(cc) {
  def index: Action[AnyContent] = Action.async { implicit request =>
        catDAO.all().map {
          case Seq(c) => Ok(Json.obj("name" -> c.name, "color" -> c.color))
        }
  }
}