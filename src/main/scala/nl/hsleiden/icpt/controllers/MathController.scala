package nl.hsleiden.icpt.controllers

import play.api.mvc._

import javax.inject._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class MathController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def faculty(option: Option[Int]): Action[AnyContent] = Action { implicit request => {
    InternalServerError("Not yet implemented")
  }}

  def binaryToInt(code: Option[String]): Action[AnyContent] = Action {implicit  request => {
    InternalServerError("Not yet implement")
  }}

  def division(lh: Option[Int], rh: Option[Int]) = Action {implicit request => {
    InternalServerError("Not yet implemented")
  }}

  def index(option: Option[Int]): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
     option match {
       case Some(d) => Ok(s"$d")
       case _ => BadRequest("Missing parameter")
     }
  }


}