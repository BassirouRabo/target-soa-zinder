
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object produitss_Scope0 {
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

     object produitss_Scope1 {
import java.util

class produitss extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Produit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(produits: util.List[Produit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

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
                            <h4 class="page-title">Nos produits</h4>
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
                                <h3 class="box-title m-b-0">Ajouter un nouveau produit</h3>
                                <form class="form-horizontal" method="post" action="/produits">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nom" type="text" class="form-control" placeholder="Désignation" required="required">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="prixAchat" type="number" min="0" class="form-control" placeholder="Prix Achat">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="prixVente" type="number" min="0" class="form-control" placeholder="Prix Vente">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="prixTransport" type="number" min="0" class="form-control" placeholder="Prix Transport">
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

                    """),_display_(/*89.22*/if(produits.size() > 0)/*89.45*/ {_display_(Seq[Any](format.raw/*89.47*/("""
                        """),format.raw/*90.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DÉSIGNATION</th>
                                                    <th>PRIX ACHAT</th>
                                                    <th>PRIX VENTE</th>
                                                    <th>PRIX TRANSPORT</th>
                                                    <th>ACTIONS</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*106.46*/for(produit <- produits) yield /*106.70*/ {_display_(Seq[Any](format.raw/*106.72*/("""
                                                """),format.raw/*107.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*108.58*/produit/*108.65*/.getNom),format.raw/*108.72*/("""</td>
                                                    <td>"""),_display_(/*109.58*/produit/*109.65*/.getPrixAchat),format.raw/*109.78*/("""</td>
                                                    <td>"""),_display_(/*110.58*/produit/*110.65*/.getPrixVente),format.raw/*110.78*/("""</td>
                                                    <td>"""),_display_(/*111.58*/produit/*111.65*/.getPrixTransport),format.raw/*111.82*/("""</td>
                                                    <td>
                                                        <a href="/produits/"""),_display_(/*113.77*/produit/*113.84*/.getId),format.raw/*113.90*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                        <a href="/produits/"""),_display_(/*114.77*/produit/*114.84*/.getId),format.raw/*114.90*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*117.46*/("""
                                            """),format.raw/*118.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*125.22*/("""


                """),format.raw/*128.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*134.6*/foot()),format.raw/*134.12*/("""

    """),format.raw/*136.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(produits:util.List[Produit]): play.twirl.api.HtmlFormat.Appendable = apply(produits)

  def f:((util.List[Produit]) => play.twirl.api.HtmlFormat.Appendable) = (produits) => apply(produits)

  def ref: this.type = this

}


}
}

/**/
object produitss extends produitss_Scope0.produitss_Scope1.produitss
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:42 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/produitss.scala.html
                  HASH: d733ee08a29e52b48d383cb9657ba7c9c4e62c76
                  MATRIX: 814->19|939->49|967->51|1031->90|1057->96|1087->99|1948->933|1975->939|2018->954|2479->1388|2518->1418|2558->1420|2619->1453|2864->1671|2878->1676|2912->1689|2973->1722|3040->1758|3097->1788|3138->1820|3178->1822|3239->1855|3484->2073|3498->2078|3534->2093|3601->2129|3654->2154|5738->4211|5770->4234|5810->4236|5863->4261|7031->5401|7072->5425|7113->5427|7191->5476|7296->5553|7313->5560|7342->5567|7433->5630|7450->5637|7485->5650|7576->5713|7593->5720|7628->5733|7719->5796|7736->5803|7775->5820|7942->5959|7959->5966|7987->5972|8212->6169|8229->6176|8257->6182|8636->6529|8710->6574|9140->6972|9188->6991|9439->7215|9467->7221|9501->7227
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|122->89|122->89|122->89|123->90|139->106|139->106|139->106|140->107|141->108|141->108|141->108|142->109|142->109|142->109|143->110|143->110|143->110|144->111|144->111|144->111|146->113|146->113|146->113|147->114|147->114|147->114|150->117|151->118|158->125|161->128|167->134|167->134|169->136
                  -- GENERATED --
              */
          