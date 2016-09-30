
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object client_transports_Scope0 {
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

     object client_transports_Scope1 {
import java.util

class client_transports extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[ClientTransport],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(clients: util.List[ClientTransport]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.39*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""


        """),format.raw/*10.9*/("""<body class="fix-sidebar">
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
                            <h4 class="page-title">Nos clients</h4>
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
                                <h3 class="box-title m-b-0">Ajouter un nouveau client</h3>
                                <form class="form-horizontal" method="post" action="/client-transports">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nom" type="text" class="form-control" placeholder="Nom ..." required="required">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="telephone" type="tel" class="form-control" placeholder="téléphone ...">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <textarea name="adresse" class="form-control" rows="5" placeholder="Adresse ..."></textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <button type="submit" class="btn btn-block btn-info">Ajouter</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    """),_display_(/*85.22*/if(clients.size() > 0)/*85.44*/ {_display_(Seq[Any](format.raw/*85.46*/("""
                        """),format.raw/*86.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>Nom</th>
                                                    <th>Téléphone</th>
                                                    <th>Adresse</th>
                                                    <th>Factures</th>
                                                    <th>Détail</th>
                                                    <th>Supprimer</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*103.46*/for(client <- clients) yield /*103.68*/ {_display_(Seq[Any](format.raw/*103.70*/("""
                                                """),format.raw/*104.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*105.58*/client/*105.64*/.getNom),format.raw/*105.71*/("""</td>
                                                    <td>"""),_display_(/*106.58*/client/*106.64*/.getTelephone),format.raw/*106.77*/("""</td>
                                                    <td>"""),_display_(/*107.58*/client/*107.64*/.getAdresse),format.raw/*107.75*/("""</td>
                                                    <td>Factures</td>
                                                    <td>
                                                        <a href="/client-transports/"""),_display_(/*110.86*/client/*110.92*/.getId),format.raw/*110.98*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/client-transports/"""),_display_(/*113.86*/client/*113.92*/.getId),format.raw/*113.98*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*116.46*/("""
                                            """),format.raw/*117.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*124.22*/("""



                """),format.raw/*128.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

            """),_display_(/*134.14*/foot()),format.raw/*134.20*/("""

    """),format.raw/*136.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(clients:util.List[ClientTransport]): play.twirl.api.HtmlFormat.Appendable = apply(clients)

  def f:((util.List[ClientTransport]) => play.twirl.api.HtmlFormat.Appendable) = (clients) => apply(clients)

  def ref: this.type = this

}


}
}

/**/
object client_transports extends client_transports_Scope0.client_transports_Scope1.client_transports
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:43 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/client_transports.scala.html
                  HASH: 83db6cd6e84047b75d0d5fb0d33078fce37238ef
                  MATRIX: 846->19|978->56|1006->58|1070->97|1096->103|1134->114|1995->948|2022->954|2065->969|2525->1402|2564->1432|2604->1434|2665->1467|2910->1685|2924->1690|2958->1703|3019->1736|3086->1772|3143->1802|3184->1834|3224->1836|3285->1869|3530->2087|3544->2092|3580->2107|3647->2143|3700->2168|5525->3966|5556->3988|5596->3990|5649->4015|6869->5207|6908->5229|6949->5231|7027->5280|7132->5357|7148->5363|7177->5370|7268->5433|7284->5439|7319->5452|7410->5515|7426->5521|7459->5532|7705->5750|7721->5756|7749->5762|8098->6083|8114->6089|8142->6095|8521->6442|8595->6487|9025->6885|9074->6905|9334->7137|9362->7143|9396->7149
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|118->85|118->85|118->85|119->86|136->103|136->103|136->103|137->104|138->105|138->105|138->105|139->106|139->106|139->106|140->107|140->107|140->107|143->110|143->110|143->110|146->113|146->113|146->113|149->116|150->117|157->124|161->128|167->134|167->134|169->136
                  -- GENERATED --
              */
          