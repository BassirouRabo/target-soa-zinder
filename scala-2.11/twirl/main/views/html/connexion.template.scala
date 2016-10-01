
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object connexion_Scope0 {
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

class connexion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <section id="wrapper" class="login-register">
            <div class="login-box">
                <div class="white-box">
                    <div class="row">
                        <div class="col-md-12">
                            """),_display_(/*17.30*/if(flash.containsKey("error"))/*17.60*/ {_display_(Seq[Any](format.raw/*17.62*/("""
                                """),format.raw/*18.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*20.38*/flash/*20.43*/.get("error")),format.raw/*20.56*/("""
                                """),format.raw/*21.33*/("""</div>
                            """)))}),format.raw/*22.30*/("""
                            """),_display_(/*23.30*/if(flash.containsKey("success"))/*23.62*/ {_display_(Seq[Any](format.raw/*23.64*/("""
                                """),format.raw/*24.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*26.38*/flash/*26.43*/.get("success")),format.raw/*26.58*/("""</div>
                            """)))}),format.raw/*27.30*/("""
                        """),format.raw/*28.25*/("""</div>
                    </div>
                    <form method="post" class="form-horizontal form-material" id="loginform" action="/connexion">
                        <h3 class="box-title m-b-20">Logiciel de gestion d'hydrocarbure - Sidi Omar Ahmed</h3>
                        <div class="form-group ">
                            <div class="col-xs-12">
                                <input name="telephone" class="form-control" type="tel" required="required" placeholder="Téléphone">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-12">
                                <input name="password" class="form-control" type="password" required="" placeholder="Password">
                            </div>
                        </div>

                        <div class="form-group text-center m-t-20">
                            <div class="col-xs-12">
                                <button class="btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light" type="submit">Connexion</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>

    """),_display_(/*53.6*/foot()),format.raw/*53.12*/("""

    """),format.raw/*55.5*/("""</body>
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
object connexion extends connexion_Scope0.connexion
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:14 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/connexion.scala.html
                  HASH: d8c7f283dc4e6c03b4dcc7d0c5b5a86ef1ac070f
                  MATRIX: 835->0|902->42|928->48|960->54|1382->449|1421->479|1461->481|1523->515|1770->735|1784->740|1818->753|1880->787|1948->824|2006->855|2047->887|2087->889|2149->923|2396->1143|2410->1148|2446->1163|2514->1200|2568->1226|3907->2539|3934->2545|3969->2553
                  LINES: 32->1|35->4|35->4|38->7|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|53->22|54->23|54->23|54->23|55->24|57->26|57->26|57->26|58->27|59->28|84->53|84->53|86->55
                  -- GENERATED --
              */
          