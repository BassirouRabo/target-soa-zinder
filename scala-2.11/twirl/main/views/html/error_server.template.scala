
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_server_Scope0 {
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

class error_server extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*5.6*/head()),format.raw/*5.12*/("""


        """),format.raw/*8.9*/("""<body>
            <!-- Preloader -->
        <div class="preloader">
            <div class="cssload-speeding-wheel"></div>
        </div>
        <section id="wrapper" class="error-page">
            <div class="error-box">
                <div class="error-body text-center">
                    <h1>500</h1>
                    <h3 class="text-uppercase">
                        Oups erreur serveur, veuillez contacter l'administrateur en lui indiquant le message ci-dessous.</h3>
                    <p class="text-muted m-t-30 m-b-30">"""),_display_(/*19.58*/message),format.raw/*19.65*/("""</p>
                    <a href="/" class="btn btn-info btn-rounded waves-effect waves-light m-b-40">
                        Retournez à la page d'accueil</a> </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </section>

            """),_display_(/*27.14*/foot()),format.raw/*27.20*/("""

    """),format.raw/*29.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object error_server extends error_server_Scope0.error_server
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:28 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/error_server.scala.html
                  HASH: 9069a1817f214b1504cfd6f34648d6c7dae0b342
                  MATRIX: 759->1|871->18|898->19|962->58|988->64|1025->75|1595->618|1623->625|2047->1022|2074->1028|2107->1034
                  LINES: 27->1|32->1|33->2|36->5|36->5|39->8|50->19|50->19|58->27|58->27|60->29
                  -- GENERATED --
              */
          