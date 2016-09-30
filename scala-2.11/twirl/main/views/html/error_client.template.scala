
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_client_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class error_client extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*4.6*/head()),format.raw/*4.12*/("""


"""),format.raw/*7.1*/("""<body>
            <!-- Preloader -->
        <div class="preloader">
            <div class="cssload-speeding-wheel"></div>
        </div>

        <section id="wrapper" class="error-page">
            <div class="error-box">
                <div class="error-body text-center">
                    <h1>404</h1>
                    <h3 class="text-uppercase"> Cette page n'existe pas !</h3>
                    <a href="/" class="btn btn-info btn-rounded waves-effect waves-light m-b-40">Retournez à la page d'accueil</a> </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </section>

    """),_display_(/*24.6*/foot()),format.raw/*24.12*/("""

    """),format.raw/*26.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object error_client extends error_client_Scope0.error_client
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:43 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/error_client.scala.html
                  HASH: 5c55b497d11b5a5b4588fa78cfe9cc0adc5624ff
                  MATRIX: 841->0|905->39|931->45|960->48|1737->799|1764->805|1797->811
                  LINES: 32->1|35->4|35->4|38->7|55->24|55->24|57->26
                  -- GENERATED --
              */
          