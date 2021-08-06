package controllers

import play.api.mvc._
import play.filters.csrf._
import javax.inject._
@Singleton
class LoginController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val email = "hoanghieu.9e.dth@gmail.com"

  val password = "123456"

  def index = Action{
    Ok(views.html.users.login("Login"))
  }

  def login(Email: String, Password: String)  = Action{
    request =>
    if(Email == email && Password == password){
      Ok(request.queryString.toString())
    }else{
      Ok("Login fail")
    }
  }

//  def login2() = Action{
//    request =>
//      val formData = request.body.asFormUrlEncoded
//      formData.map{args =>
//        val email = args("email").head
//        val password = args("password").head
//        Ok("Login success")
//      }.getOrElse(Ok("Login fail"))
//  }
}
