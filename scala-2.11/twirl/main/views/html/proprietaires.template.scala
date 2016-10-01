
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object proprietaires_Scope0 {
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

     object proprietaires_Scope1 {
import java.util

class proprietaires extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Proprietaire],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(proprietaires: util.List[Proprietaire]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.42*/("""

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


        """),_display_(/*27.10*/menu()),format.raw/*27.16*/("""


        """),format.raw/*30.9*/("""<div id="page-wrapper">
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                        <h4 class="page-title">Nos Proprietaires</h4>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-6">
                        """),_display_(/*40.26*/if(flash.containsKey("error"))/*40.56*/ {_display_(Seq[Any](format.raw/*40.58*/("""
                            """),format.raw/*41.29*/("""<div class="alert alert-warning alert-dismissable">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                """),_display_(/*43.34*/flash/*43.39*/.get("error")),format.raw/*43.52*/("""
                            """),format.raw/*44.29*/("""</div>
                        """)))}),format.raw/*45.26*/("""
                        """),_display_(/*46.26*/if(flash.containsKey("success"))/*46.58*/ {_display_(Seq[Any](format.raw/*46.60*/("""
                            """),format.raw/*47.29*/("""<div class="alert alert-success alert-dismissable">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                """),_display_(/*49.34*/flash/*49.39*/.get("success")),format.raw/*49.54*/("""</div>
                        """)))}),format.raw/*50.26*/("""
                    """),format.raw/*51.21*/("""</div>
                </div>

                <div class="row">
                    <div class="col-sm-12">
                        <div class="white-box">
                            <h3 class="box-title m-b-0">Ajouter un nouveau proprietaire</h3>
                            <form class="form-horizontal" method="post" action="/proprietaires">
                                <div class="form-group">
                                    <div class="col-md-10">
                                        <input name="nom" type="text" class="form-control" placeholder="nom" required="required">
                                    </div>

                                    <div class="col-md-2">
                                        <button type="submit" class="btn btn-block btn-info">Ajouter</button>
                                    </div>
                                </div>

                            </form>
                        </div>
                    </div>
                </div>

                """),_display_(/*74.18*/if(proprietaires.size() > 0)/*74.46*/ {_display_(Seq[Any](format.raw/*74.48*/("""
                    """),format.raw/*75.21*/("""<div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>NOM</th>
                                                <th>ACTION</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*88.42*/for(proprietaire <- proprietaires) yield /*88.76*/ {_display_(Seq[Any](format.raw/*88.78*/("""
                                            """),format.raw/*89.45*/("""<tr class="active">
                                                <td>"""),_display_(/*90.54*/proprietaire/*90.66*/.getNom),format.raw/*90.73*/("""</td>
                                                <td>
                                                    <a href="/proprietaires/"""),_display_(/*92.78*/proprietaire/*92.90*/.getId),format.raw/*92.96*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    <a href="/proprietaires/"""),_display_(/*93.78*/proprietaire/*93.90*/.getId),format.raw/*93.96*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*96.42*/("""
                                        """),format.raw/*97.41*/("""</tbody>
                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                </div>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*104.18*/("""


            """),format.raw/*107.13*/("""</div>
            <footer class="footer text-center"> 2016 &copy;
                Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
        </div>
    </div>

    """),_display_(/*113.6*/foot()),format.raw/*113.12*/("""

"""),format.raw/*115.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(proprietaires:util.List[Proprietaire]): play.twirl.api.HtmlFormat.Appendable = apply(proprietaires)

  def f:((util.List[Proprietaire]) => play.twirl.api.HtmlFormat.Appendable) = (proprietaires) => apply(proprietaires)

  def ref: this.type = this

}


}
}

/**/
object proprietaires extends proprietaires_Scope0.proprietaires_Scope1.proprietaires
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:13 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/proprietaires.scala.html
                  HASH: 3e8c05f2ca062759cc19ddef55bb047cd34d46c3
                  MATRIX: 831->19|966->59|994->61|1058->100|1084->106|1114->109|1919->887|1946->893|1984->904|2414->1307|2453->1337|2493->1339|2550->1368|2787->1578|2801->1583|2835->1596|2892->1625|2955->1657|3008->1683|3049->1715|3089->1717|3146->1746|3383->1956|3397->1961|3433->1976|3496->2008|3545->2029|4597->3054|4634->3082|4674->3084|4723->3105|5609->3964|5659->3998|5699->4000|5772->4045|5872->4118|5893->4130|5921->4137|6084->4273|6105->4285|6132->4291|6357->4489|6378->4501|6405->4507|6771->4842|6840->4883|7242->5253|7286->5268|7521->5476|7549->5482|7579->5484
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|107->74|107->74|107->74|108->75|121->88|121->88|121->88|122->89|123->90|123->90|123->90|125->92|125->92|125->92|126->93|126->93|126->93|129->96|130->97|137->104|140->107|146->113|146->113|148->115
                  -- GENERATED --
              */
          