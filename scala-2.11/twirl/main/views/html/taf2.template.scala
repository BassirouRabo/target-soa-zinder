
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object taf2_Scope0 {
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

class taf2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Taf,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taf: Taf):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.12*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*6.6*/head()),format.raw/*6.12*/("""


"""),format.raw/*9.1*/("""<body class="fix-sidebar">
            <!-- Preloader -->
        <div class="preloader">
            <div class="cssload-speeding-wheel"></div>
        </div>
        <div id="wrapper">
                <!-- Top Navigation -->
            <nav class="navbar navbar-default navbar-static-top m-b-0">
                <div class="navbar-header"> <a class="navbar-toggle hidden-sm hidden-md hidden-lg " href="javascript:void(0)" data-toggle="collapse" data-target=".navbar-collapse"><i class="ti-menu"></i></a>

                    <ul class="nav navbar-top-links navbar-left hidden-xs">
                        <li><a href="javascript:void(0)" class="open-close hidden-xs waves-effect waves-light"><i class="icon-arrow-left-circle ti-menu"></i></a></li>
                    </ul>
                </div>
            </nav>


            """),_display_(/*26.14*/menu()),format.raw/*26.20*/("""


            """),format.raw/*29.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Nos tafs</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*39.30*/if(flash.containsKey("error"))/*39.60*/ {_display_(Seq[Any](format.raw/*39.62*/("""
                                """),format.raw/*40.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*42.38*/flash/*42.43*/.get("error")),format.raw/*42.56*/("""
                                """),format.raw/*43.33*/("""</div>
                            """)))}),format.raw/*44.30*/("""
                            """),_display_(/*45.30*/if(flash.containsKey("success"))/*45.62*/ {_display_(Seq[Any](format.raw/*45.64*/("""
                                """),format.raw/*46.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*48.38*/flash/*48.43*/.get("success")),format.raw/*48.58*/("""</div>
                            """)))}),format.raw/*49.30*/("""
                        """),format.raw/*50.25*/("""</div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Modifier un taf</h3>
                                <form class="form-horizontal" method="post" action="/ordre-paiements/"""),_display_(/*57.103*/taf/*57.106*/.getReparation.getId),format.raw/*57.126*/("""/tafs/"""),_display_(/*57.133*/taf/*57.136*/.getId),format.raw/*57.142*/("""/update">

                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="montant" type="number" min="0" value=""""),_display_(/*61.97*/taf/*61.100*/.getMontant),format.raw/*61.111*/("""" class="form-control" />
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*67.84*/taf/*67.87*/.getId),format.raw/*67.93*/("""">
                                            <input name="reparation.id" type="hidden" value=""""),_display_(/*68.95*/taf/*68.98*/.getReparation.getId),format.raw/*68.118*/("""">
                                            <input name="travail" value=""""),_display_(/*69.75*/taf/*69.78*/.getTravail),format.raw/*69.89*/("""" type="hidden">
                                            <input name="observation" value=""""),_display_(/*70.79*/taf/*70.82*/.getObservation),format.raw/*70.97*/("""" type="hidden">
                                            <button type="submit" class="btn btn-block btn-info">Modifier</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*86.6*/foot()),format.raw/*86.12*/("""

    """),format.raw/*88.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(taf:Taf): play.twirl.api.HtmlFormat.Appendable = apply(taf)

  def f:((Taf) => play.twirl.api.HtmlFormat.Appendable) = (taf) => apply(taf)

  def ref: this.type = this

}


}

/**/
object taf2 extends taf2_Scope0.taf2
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/taf2.scala.html
                  HASH: 99e7cd9450a76628c397c6bb48e21eeadc6229a5
                  MATRIX: 740->1|845->11|873->13|937->52|963->58|992->61|1853->895|1880->901|1923->916|2380->1346|2419->1376|2459->1378|2520->1411|2765->1629|2779->1634|2813->1647|2874->1680|2941->1716|2998->1746|3039->1778|3079->1780|3140->1813|3385->2031|3399->2036|3435->2051|3502->2087|3555->2112|3939->2468|3952->2471|3994->2491|4029->2498|4042->2501|4070->2507|4328->2738|4341->2741|4374->2752|4725->3076|4737->3079|4764->3085|4888->3182|4900->3185|4942->3205|5046->3282|5058->3285|5090->3296|5212->3391|5224->3394|5260->3409|5883->4006|5910->4012|5943->4018
                  LINES: 27->1|32->1|34->3|37->6|37->6|40->9|57->26|57->26|60->29|70->39|70->39|70->39|71->40|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|77->46|79->48|79->48|79->48|80->49|81->50|88->57|88->57|88->57|88->57|88->57|88->57|92->61|92->61|92->61|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|117->86|117->86|119->88
                  -- GENERATED --
              */
          