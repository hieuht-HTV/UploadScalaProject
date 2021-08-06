package controllers.Request

import play.api.mvc._
import play.filters.csrf.CSRFComponents

import javax.inject._
@Singleton
class LoginRequest  @Inject()(cc: ControllerComponents, csrf:CSRFComponents, request: RequestHeader) extends AbstractController(cc) {
    def login = Action{
      Ok
    }
}
