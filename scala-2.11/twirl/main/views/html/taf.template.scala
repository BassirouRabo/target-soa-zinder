
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object taf_Scope0 {
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

class taf extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Taf,play.twirl.api.HtmlFormat.Appendable] {

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
                                <form class="form-horizontal" method="post" action="/demande-travaux/"""),_display_(/*57.103*/taf/*57.106*/.getReparation.getId),format.raw/*57.126*/("""/tafs/"""),_display_(/*57.133*/taf/*57.136*/.getId),format.raw/*57.142*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <textarea name="travail" class="form-control" rows="5">"""),_display_(/*60.101*/taf/*60.104*/.getTravail),format.raw/*60.115*/("""</textarea>
                                        </div>

                                        <div class="col-md-6">
                                            <textarea name="observation" class="form-control" rows="5">"""),_display_(/*64.105*/taf/*64.108*/.getObservation),format.raw/*64.123*/("""</textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*70.84*/taf/*70.87*/.getId),format.raw/*70.93*/("""">
                                            <input name="reparation.id" type="hidden" value=""""),_display_(/*71.95*/taf/*71.98*/.getReparation.getId),format.raw/*71.118*/("""">
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

    """),_display_(/*87.6*/foot()),format.raw/*87.12*/("""

    """),format.raw/*89.5*/("""</body>
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
object taf extends taf_Scope0.taf
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/taf.scala.html
                  HASH: a568a8575b027aebd130d8c8dcf60472fd34d20d
                  MATRIX: 738->1|843->11|871->13|935->52|961->58|990->61|1851->895|1878->901|1921->916|2378->1346|2417->1376|2457->1378|2518->1411|2763->1629|2777->1634|2811->1647|2872->1680|2939->1716|2996->1746|3037->1778|3077->1780|3138->1813|3383->2031|3397->2036|3433->2051|3500->2087|3553->2112|3937->2468|3950->2471|3992->2491|4027->2498|4040->2501|4068->2507|4330->2741|4343->2744|4376->2755|4631->2982|4644->2985|4681->3000|5018->3310|5030->3313|5057->3319|5181->3416|5193->3419|5235->3439|5844->4022|5871->4028|5904->4034
                  LINES: 27->1|32->1|34->3|37->6|37->6|40->9|57->26|57->26|60->29|70->39|70->39|70->39|71->40|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|77->46|79->48|79->48|79->48|80->49|81->50|88->57|88->57|88->57|88->57|88->57|88->57|91->60|91->60|91->60|95->64|95->64|95->64|101->70|101->70|101->70|102->71|102->71|102->71|118->87|118->87|120->89
                  -- GENERATED --
              */
          