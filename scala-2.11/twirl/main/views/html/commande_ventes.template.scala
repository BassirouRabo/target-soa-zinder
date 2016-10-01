
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object commande_ventes_Scope0 {
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

     object commande_ventes_Scope1 {
import java.util

class commande_ventes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[util.List[CommandeVente],util.List[CommandeVente],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(commandes: util.List[CommandeVente], commandesMonth: util.List[CommandeVente], totalCommandeVenteMonth: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.112*/("""

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
                            <h4 class="page-title">Nos commandes</h4>
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
                                    <h3 class="box-title m-b-0">COMMANDES DU MOIS</h3>
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>CLIENT</th>
                                                    <th>PRODUIT</th>
                                                    <th>QUANTITÉ</th>
                                                    <th>MONTANT</th>
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*72.46*/for(commande <- commandes) yield /*72.72*/ {_display_(Seq[Any](format.raw/*72.74*/("""
                                                """),format.raw/*73.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*74.58*/if(null != commande.getFacture.getWhenDone)/*74.101*/ {_display_(Seq[Any](format.raw/*74.103*/("""
                                                        """),_display_(/*75.58*/commande/*75.66*/.getFacture.getWhenDone.format("dd-MM-yyyy")),format.raw/*75.110*/("""
                                                    """)))}),format.raw/*76.54*/("""</th>
                                                    <td>"""),_display_(/*77.58*/commande/*77.66*/.getFacture.getClient.getNom),format.raw/*77.94*/("""</td>
                                                    <td>"""),_display_(/*78.58*/commande/*78.66*/.getProduit.getNom),format.raw/*78.84*/("""</td>
                                                    <td>"""),_display_(/*79.58*/commande/*79.66*/.getQuantite),format.raw/*79.78*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*80.98*/commande/*80.106*/.getMontant),format.raw/*80.117*/("""</span></td>
                                                    <td>
                                                        <a href="/facture-ventes/"""),_display_(/*82.83*/commande/*82.91*/.getFacture.getId),format.raw/*82.108*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*85.46*/("""
                                            """),format.raw/*86.45*/("""</tbody>
                                            <tfoot>
                                                <tr class="active">
                                                    <th>TOTAL</th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <td class="text-right"><span class="number">"""),_display_(/*93.98*/totalCommandeVenteMonth),format.raw/*93.121*/("""</span></td>
                                                    <th></th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    """),_display_(/*104.22*/if(commandes.size() > 0)/*104.46*/ {_display_(Seq[Any](format.raw/*104.48*/("""
                        """),format.raw/*105.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">COMMANDES GLOBALES</h3>
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>CLIENT</th>
                                                    <th>PRODUIT</th>
                                                    <th>QUANTITÉ</th>
                                                    <th>MONTANT</th>
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*123.46*/for(commande <- commandes) yield /*123.72*/ {_display_(Seq[Any](format.raw/*123.74*/("""
                                                """),format.raw/*124.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*125.58*/if(null != commande.getFacture.getWhenDone)/*125.101*/ {_display_(Seq[Any](format.raw/*125.103*/("""
                                                        """),_display_(/*126.58*/commande/*126.66*/.getFacture.getWhenDone.format("dd-MM-yyyy")),format.raw/*126.110*/("""
                                                    """)))}),format.raw/*127.54*/("""</th>
                                                    <td>"""),_display_(/*128.58*/commande/*128.66*/.getFacture.getClient.getNom),format.raw/*128.94*/("""</td>
                                                    <td>"""),_display_(/*129.58*/commande/*129.66*/.getProduit.getNom),format.raw/*129.84*/("""</td>
                                                    <td>"""),_display_(/*130.58*/commande/*130.66*/.getQuantite),format.raw/*130.78*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*131.98*/commande/*131.106*/.getMontant),format.raw/*131.117*/("""</span></td>
                                                    <td>
                                                        <a href="/facture-ventes/"""),_display_(/*133.83*/commande/*133.91*/.getFacture.getId),format.raw/*133.108*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*136.46*/("""
                                            """),format.raw/*137.45*/("""</tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*143.22*/("""

                """),format.raw/*145.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

            """),_display_(/*151.14*/foot()),format.raw/*151.20*/("""

    """),format.raw/*153.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(commandes:util.List[CommandeVente],commandesMonth:util.List[CommandeVente],totalCommandeVenteMonth:Long): play.twirl.api.HtmlFormat.Appendable = apply(commandes,commandesMonth,totalCommandeVenteMonth)

  def f:((util.List[CommandeVente],util.List[CommandeVente],Long) => play.twirl.api.HtmlFormat.Appendable) = (commandes,commandesMonth,totalCommandeVenteMonth) => apply(commandes,commandesMonth,totalCommandeVenteMonth)

  def ref: this.type = this

}


}
}

/**/
object commande_ventes extends commande_ventes_Scope0.commande_ventes_Scope1.commande_ventes
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:28 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/commande_ventes.scala.html
                  HASH: 7dca8023fb917dfdee841803cc35780094512c6d
                  MATRIX: 868->19|1074->129|1102->131|1166->170|1192->176|1230->187|2091->1021|2118->1027|2161->1042|2623->1477|2662->1507|2702->1509|2763->1542|3008->1760|3022->1765|3056->1778|3117->1811|3184->1847|3241->1877|3282->1909|3322->1911|3383->1944|3628->2162|3642->2167|3678->2182|3745->2218|3798->2243|5159->3577|5201->3603|5241->3605|5318->3654|5422->3731|5475->3774|5516->3776|5601->3834|5618->3842|5684->3886|5769->3940|5859->4003|5876->4011|5925->4039|6015->4102|6032->4110|6071->4128|6161->4191|6178->4199|6211->4211|6341->4314|6359->4322|6392->4333|6571->4485|6588->4493|6627->4510|6936->4788|7009->4833|7515->5312|7560->5335|8160->5907|8194->5931|8235->5933|8289->5958|9593->7234|9636->7260|9677->7262|9755->7311|9860->7388|9914->7431|9956->7433|10042->7491|10060->7499|10127->7543|10213->7597|10304->7660|10322->7668|10372->7696|10463->7759|10481->7767|10521->7785|10612->7848|10630->7856|10664->7868|10795->7971|10814->7979|10848->7990|11028->8142|11046->8150|11086->8167|11396->8445|11470->8490|11729->8717|11776->8735|12036->8967|12064->8973|12098->8979
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|105->72|105->72|105->72|106->73|107->74|107->74|107->74|108->75|108->75|108->75|109->76|110->77|110->77|110->77|111->78|111->78|111->78|112->79|112->79|112->79|113->80|113->80|113->80|115->82|115->82|115->82|118->85|119->86|126->93|126->93|137->104|137->104|137->104|138->105|156->123|156->123|156->123|157->124|158->125|158->125|158->125|159->126|159->126|159->126|160->127|161->128|161->128|161->128|162->129|162->129|162->129|163->130|163->130|163->130|164->131|164->131|164->131|166->133|166->133|166->133|169->136|170->137|176->143|178->145|184->151|184->151|186->153
                  -- GENERATED --
              */
          