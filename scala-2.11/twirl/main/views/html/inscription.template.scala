
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inscription_Scope0 {
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

class inscription extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                    <form method="post" class="form-horizontal form-material" id="loginform" action="/utilisateurs">
                        <h3 class="box-title m-b-20">Créer un utilisateur</h3>
                        <div class="form-group ">
                            <div class="col-xs-12">
                                <input name="nom" class="form-control" type="text" required="required" placeholder="Nom">
                            </div>
                        </div>
                        <div class="form-group ">
                            <div class="col-xs-12">
                                <input name="telephone" class="form-control" type="tel" required="required" placeholder="Téléphone">
                            </div>
                        </div>
                        <div class="form-group ">
                            <div class="col-xs-12">
                                <input name="email" class="form-control" type="email" placeholder="Email">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-12">
                                <input name="password" class="form-control" type="password" required="" placeholder="Password">
                            </div>
                        </div>

                        <div class="form-group text-center m-t-20">
                            <div class="col-xs-12">
                                <button class="btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light" type="submit">Inscription</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>

    """),_display_(/*63.6*/foot()),format.raw/*63.12*/("""

    """),format.raw/*65.5*/("""</body>
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
object inscription extends inscription_Scope0.inscription
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:14 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/inscription.scala.html
                  HASH: 549de2796dcf3c8552cc8ed4d0e8fc97866da1d9
                  MATRIX: 839->0|906->42|932->48|964->54|1386->449|1425->479|1465->481|1527->515|1774->735|1788->740|1822->753|1884->787|1952->824|2010->855|2051->887|2091->889|2153->923|2400->1143|2414->1148|2450->1163|2518->1200|2572->1226|4459->3087|4486->3093|4521->3101
                  LINES: 32->1|35->4|35->4|38->7|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|53->22|54->23|54->23|54->23|55->24|57->26|57->26|57->26|58->27|59->28|94->63|94->63|96->65
                  -- GENERATED --
              */
          