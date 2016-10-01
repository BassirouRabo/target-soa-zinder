
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object utilisateur_Scope0 {
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

class utilisateur extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Utilisateur,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(utilisateur: Utilisateur):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*5.6*/head()),format.raw/*5.12*/("""


"""),format.raw/*8.1*/("""<body class="fix-sidebar">
            <!-- Preloader -->
        <div class="preloader">
            <div class="cssload-speeding-wheel"></div>
        </div>
        <div id="wrapper">
            <nav class="navbar navbar-default navbar-static-top m-b-0">
                <div class="navbar-header"> <a class="navbar-toggle hidden-sm hidden-md hidden-lg " href="javascript:void(0)" data-toggle="collapse" data-target=".navbar-collapse"><i class="ti-menu"></i></a>

                    <ul class="nav navbar-top-links navbar-left hidden-xs">
                        <li><a href="javascript:void(0)" class="open-close hidden-xs waves-effect waves-light"><i class="icon-arrow-left-circle ti-menu"></i></a></li>
                    </ul>
                </div>
            </nav>

            """),_display_(/*23.14*/menu()),format.raw/*23.20*/("""

            """),format.raw/*25.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Modification d'un compte utilisateur</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*35.30*/if(flash.containsKey("error"))/*35.60*/ {_display_(Seq[Any](format.raw/*35.62*/("""
                                """),format.raw/*36.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*38.38*/flash/*38.43*/.get("error")),format.raw/*38.56*/("""
                                """),format.raw/*39.33*/("""</div>
                            """)))}),format.raw/*40.30*/("""
                            """),_display_(/*41.30*/if(flash.containsKey("success"))/*41.62*/ {_display_(Seq[Any](format.raw/*41.64*/("""
                                """),format.raw/*42.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*44.38*/flash/*44.43*/.get("success")),format.raw/*44.58*/("""</div>
                            """)))}),format.raw/*45.30*/("""
                        """),format.raw/*46.25*/("""</div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="white-box">
                                <div class="row">
                                    <div class="col-sm-12 col-xs-12">
                                        <form method="post" action="/utilisateurs/"""),_display_(/*54.84*/utilisateur/*54.95*/.getId),format.raw/*54.101*/("""/update">
                                            <div class="form-group">
                                                <label for="nom">Nom</label>
                                                <div class="input-group">
                                                    <div class="input-group-addon"><i class="ti-user"></i></div>
                                                    <input name="nom" type="text" class="form-control" id="nom" value=""""),_display_(/*59.121*/utilisateur/*59.132*/.getNom),format.raw/*59.139*/("""">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="email">Email</label>
                                                <div class="input-group">
                                                    <div class="input-group-addon"><i class="ti-email"></i></div>
                                                    <input name="email" type="email" class="form-control" id="email" value=""""),_display_(/*66.126*/utilisateur/*66.137*/.getEmail),format.raw/*66.146*/("""">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="telephone">Téléphone</label>
                                                <div class="input-group">
                                                    <div class="input-group-addon"><i class="ti-microphone"></i></div>
                                                    <input name="telephone" type="tel" class="form-control" id="telephone" value=""""),_display_(/*73.132*/utilisateur/*73.143*/.getTelephone),format.raw/*73.156*/("""">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="password">Confirm Password</label>
                                                <div class="input-group">
                                                    <div class="input-group-addon"><i class="ti-lock"></i></div>
                                                    <input name="password" type="password" class="form-control" id="password" value=""""),_display_(/*80.135*/utilisateur/*80.146*/.getPassword),format.raw/*80.158*/("""">
                                                </div>
                                            </div>

                                            <button type="submit" class="btn btn-info waves-effect waves-light m-r-10">
                                                Modifier</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>
                    <!-- /.container-fluid -->
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
                <!-- /#page-wrapper -->
        </div>

    """),_display_(/*102.6*/foot()),format.raw/*102.12*/("""

    """),format.raw/*104.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(utilisateur:Utilisateur): play.twirl.api.HtmlFormat.Appendable = apply(utilisateur)

  def f:((Utilisateur) => play.twirl.api.HtmlFormat.Appendable) = (utilisateur) => apply(utilisateur)

  def ref: this.type = this

}


}

/**/
object utilisateur extends utilisateur_Scope0.utilisateur
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/utilisateur.scala.html
                  HASH: 41f5391927fb800c148ca687466492cdbe136897
                  MATRIX: 762->1|883->27|910->28|974->67|1000->73|1029->76|1849->869|1876->875|1918->889|2403->1347|2442->1377|2482->1379|2543->1412|2788->1630|2802->1635|2836->1648|2897->1681|2964->1717|3021->1747|3062->1779|3102->1781|3163->1814|3408->2032|3422->2037|3458->2052|3525->2088|3578->2113|3981->2489|4001->2500|4029->2506|4520->2969|4541->2980|4570->2987|5170->3559|5191->3570|5222->3579|5841->4170|5862->4181|5897->4194|6519->4788|6540->4799|6574->4811|7449->5659|7477->5665|7511->5671
                  LINES: 27->1|32->1|33->2|36->5|36->5|39->8|54->23|54->23|56->25|66->35|66->35|66->35|67->36|69->38|69->38|69->38|70->39|71->40|72->41|72->41|72->41|73->42|75->44|75->44|75->44|76->45|77->46|85->54|85->54|85->54|90->59|90->59|90->59|97->66|97->66|97->66|104->73|104->73|104->73|111->80|111->80|111->80|133->102|133->102|135->104
                  -- GENERATED --
              */
          