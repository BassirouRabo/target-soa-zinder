
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tafs_Scope0 {
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

     object tafs_Scope1 {
import java.util

class tafs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Taf],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tafs: util.List[Taf]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.24*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""


"""),format.raw/*10.1*/("""<body class="fix-sidebar">
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


            """),_display_(/*27.14*/menu()),format.raw/*27.20*/("""


            """),format.raw/*30.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Nos tafs</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*40.30*/if(flash.containsKey("error"))/*40.60*/ {_display_(Seq[Any](format.raw/*40.62*/("""
                                """),format.raw/*41.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*43.38*/flash/*43.43*/.get("error")),format.raw/*43.56*/("""
                                """),format.raw/*44.33*/("""</div>
                            """)))}),format.raw/*45.30*/("""
                            """),_display_(/*46.30*/if(flash.containsKey("success"))/*46.62*/ {_display_(Seq[Any](format.raw/*46.64*/("""
                                """),format.raw/*47.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*49.38*/flash/*49.43*/.get("success")),format.raw/*49.58*/("""</div>
                            """)))}),format.raw/*50.30*/("""
                        """),format.raw/*51.25*/("""</div>
                    </div>



                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>Date</th>
                                                <th>Camion</th>
                                                <th>Proprietaire</th>
                                                <th>TAF</th>
                                                <th>Obervation</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*72.42*/for(taf <- tafs) yield /*72.58*/ {_display_(Seq[Any](format.raw/*72.60*/("""
                                            """),format.raw/*73.45*/("""<tr class="active">
                                                <th>"""),_display_(/*74.54*/if(null != taf.getReparation.getWhenDone)/*74.95*/ {_display_(Seq[Any](format.raw/*74.97*/("""
                                                    """),_display_(/*75.54*/taf/*75.57*/.getReparation.getWhenDone.format("dd-MM-yyyy")),format.raw/*75.104*/("""
                                                """)))}),format.raw/*76.50*/("""</th>
                                                <td>"""),_display_(/*77.54*/taf/*77.57*/.getReparation.getCamion.getImmatriculation),format.raw/*77.100*/("""</td>
                                                <td>"""),_display_(/*78.54*/taf/*78.57*/.getReparation.getCamion.getProprietaire),format.raw/*78.97*/("""</td>
                                                <td>"""),_display_(/*79.54*/taf/*79.57*/.getTravail),format.raw/*79.68*/("""</td>
                                                <td>"""),_display_(/*80.54*/taf/*80.57*/.getObservation),format.raw/*80.72*/("""</td>
                                            </tr>
                                        """)))}),format.raw/*82.42*/("""
                                        """),format.raw/*83.41*/("""</tbody>
                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*97.6*/foot()),format.raw/*97.12*/("""

    """),format.raw/*99.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(tafs:util.List[Taf]): play.twirl.api.HtmlFormat.Appendable = apply(tafs)

  def f:((util.List[Taf]) => play.twirl.api.HtmlFormat.Appendable) = (tafs) => apply(tafs)

  def ref: this.type = this

}


}
}

/**/
object tafs extends tafs_Scope0.tafs_Scope1.tafs
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:43 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/tafs.scala.html
                  HASH: 4a518dc4e87ccc78e74a0f94adc0734217933c4d
                  MATRIX: 795->19|912->41|940->43|1004->82|1030->88|1060->91|1921->925|1948->931|1991->946|2448->1376|2487->1406|2527->1408|2588->1441|2833->1659|2847->1664|2881->1677|2942->1710|3009->1746|3066->1776|3107->1808|3147->1810|3208->1843|3453->2061|3467->2066|3503->2081|3570->2117|3623->2142|4766->3258|4798->3274|4838->3276|4911->3321|5011->3394|5061->3435|5101->3437|5182->3491|5194->3494|5263->3541|5344->3591|5430->3650|5442->3653|5507->3696|5593->3755|5605->3758|5666->3798|5752->3857|5764->3860|5796->3871|5882->3930|5894->3933|5930->3948|6058->4045|6127->4086|6747->4680|6774->4686|6807->4692
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|105->72|105->72|105->72|106->73|107->74|107->74|107->74|108->75|108->75|108->75|109->76|110->77|110->77|110->77|111->78|111->78|111->78|112->79|112->79|112->79|113->80|113->80|113->80|115->82|116->83|130->97|130->97|132->99
                  -- GENERATED --
              */
          