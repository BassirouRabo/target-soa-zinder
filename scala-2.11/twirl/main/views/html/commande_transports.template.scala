
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object commande_transports_Scope0 {
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

     object commande_transports_Scope1 {
import java.util

class commande_transports extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[util.List[CommandeTransport],util.List[CommandeTransport],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(commandes: util.List[CommandeTransport], commandesMonth: util.List[CommandeTransport], totalCommandeTransportMonth: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.124*/("""

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
                                                    <th>CAMION</th>
                                                    <th>PROPRIETAIRE</th>
                                                    <th>DESTINATION</th>
                                                    <th>PRODUIT</th>
                                                    <th>QUANTITE</th>
                                                    <th>MONTANT</th>
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*74.46*/for(commande <- commandesMonth) yield /*74.77*/ {_display_(Seq[Any](format.raw/*74.79*/("""
                                                """),format.raw/*75.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*76.58*/if(null != commande.getDateCommande)/*76.94*/ {_display_(Seq[Any](format.raw/*76.96*/("""
                                                        """),_display_(/*77.58*/commande/*77.66*/.getDateCommande.format("dd-MM-yyyy")),format.raw/*77.103*/("""
                                                    """)))}),format.raw/*78.54*/("""</th>
                                                    <td>"""),_display_(/*79.58*/commande/*79.66*/.getCamion.getImmatriculation),format.raw/*79.95*/("""</td>
                                                    <td>"""),_display_(/*80.58*/commande/*80.66*/.getCamion.getProprietaire.getNom),format.raw/*80.99*/("""</td>
                                                    <td>"""),_display_(/*81.58*/commande/*81.66*/.getDestination),format.raw/*81.81*/("""</td>
                                                    <td>"""),_display_(/*82.58*/commande/*82.66*/.getProduit.getNom),format.raw/*82.84*/("""</td>
                                                    <td>"""),_display_(/*83.58*/commande/*83.66*/.getQuantite),format.raw/*83.78*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*84.98*/commande/*84.106*/.getMontant),format.raw/*84.117*/("""</span></td>
                                                    <td>
                                                        <a href="/facture-transports/"""),_display_(/*86.87*/commande/*86.95*/.getFacture.getId),format.raw/*86.112*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>

                                                </tr>
                                            """)))}),format.raw/*90.46*/("""
                                            """),format.raw/*91.45*/("""</tbody>
                                            <tfoot>
                                                <tr class="active">
                                                    <th>TOTAL</th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th class="text-right"><span class="number">"""),_display_(/*100.98*/totalCommandeTransportMonth),format.raw/*100.125*/("""</span></th>
                                                    <th></th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>


                    """),_display_(/*112.22*/if(commandes.size() > 0)/*112.46*/ {_display_(Seq[Any](format.raw/*112.48*/("""
                        """),format.raw/*113.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">COMMANDES GLOBALES</h3>
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>CAMION</th>
                                                    <th>PROPRIETAIRE</th>
                                                    <th>DESTINATION</th>
                                                    <th>PRODUIT</th>
                                                    <th>QUANTITE</th>
                                                    <th>MONTANT</th>
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*133.46*/for(commande <- commandes) yield /*133.72*/ {_display_(Seq[Any](format.raw/*133.74*/("""
                                                """),format.raw/*134.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*135.58*/if(null != commande.getDateCommande)/*135.94*/ {_display_(Seq[Any](format.raw/*135.96*/("""
                                                        """),_display_(/*136.58*/commande/*136.66*/.getDateCommande.format("dd-MM-yyyy")),format.raw/*136.103*/("""
                                                    """)))}),format.raw/*137.54*/("""</th>
                                                    <td>"""),_display_(/*138.58*/commande/*138.66*/.getCamion.getImmatriculation),format.raw/*138.95*/("""</td>
                                                    <td>"""),_display_(/*139.58*/commande/*139.66*/.getCamion.getProprietaire.getNom),format.raw/*139.99*/("""</td>
                                                    <td>"""),_display_(/*140.58*/commande/*140.66*/.getDestination),format.raw/*140.81*/("""</td>
                                                    <td>"""),_display_(/*141.58*/commande/*141.66*/.getProduit.getNom),format.raw/*141.84*/("""</td>
                                                    <td>"""),_display_(/*142.58*/commande/*142.66*/.getQuantite),format.raw/*142.78*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*143.98*/commande/*143.106*/.getMontant),format.raw/*143.117*/("""</span></td>
                                                    <td>
                                                        <a href="/facture-transports/"""),_display_(/*145.87*/commande/*145.95*/.getFacture.getId),format.raw/*145.112*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>

                                                </tr>
                                            """)))}),format.raw/*149.46*/("""
                                            """),format.raw/*150.45*/("""</tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*156.22*/("""


                """),format.raw/*159.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

            """),_display_(/*165.14*/foot()),format.raw/*165.20*/("""

    """),format.raw/*167.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(commandes:util.List[CommandeTransport],commandesMonth:util.List[CommandeTransport],totalCommandeTransportMonth:Long): play.twirl.api.HtmlFormat.Appendable = apply(commandes,commandesMonth,totalCommandeTransportMonth)

  def f:((util.List[CommandeTransport],util.List[CommandeTransport],Long) => play.twirl.api.HtmlFormat.Appendable) = (commandes,commandesMonth,totalCommandeTransportMonth) => apply(commandes,commandesMonth,totalCommandeTransportMonth)

  def ref: this.type = this

}


}
}

/**/
object commande_transports extends commande_transports_Scope0.commande_transports_Scope1.commande_transports
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:13 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/commande_transports.scala.html
                  HASH: 775c42345e96c141038eb1bf14b480c861dad6f6
                  MATRIX: 888->19|1106->141|1134->143|1198->182|1224->188|1262->199|2123->1033|2150->1039|2193->1054|2655->1489|2694->1519|2734->1521|2795->1554|3040->1772|3054->1777|3088->1790|3149->1823|3216->1859|3273->1889|3314->1921|3354->1923|3415->1956|3660->2174|3674->2179|3710->2194|3777->2230|3830->2255|5338->3736|5385->3767|5425->3769|5502->3818|5606->3895|5651->3931|5691->3933|5776->3991|5793->3999|5852->4036|5937->4090|6027->4153|6044->4161|6094->4190|6184->4253|6201->4261|6255->4294|6345->4357|6362->4365|6398->4380|6488->4443|6505->4451|6544->4469|6634->4532|6651->4540|6684->4552|6814->4655|6832->4663|6865->4674|7048->4830|7065->4838|7104->4855|7414->5134|7487->5179|8118->5782|8168->5809|8769->6382|8803->6406|8844->6408|8898->6433|10333->7840|10376->7866|10417->7868|10495->7917|10600->7994|10646->8030|10687->8032|10773->8090|10791->8098|10851->8135|10937->8189|11028->8252|11046->8260|11097->8289|11188->8352|11206->8360|11261->8393|11352->8456|11370->8464|11407->8479|11498->8542|11516->8550|11556->8568|11647->8631|11665->8639|11699->8651|11830->8754|11849->8762|11883->8773|12067->8929|12085->8937|12125->8954|12436->9233|12510->9278|12769->9505|12817->9524|13077->9756|13105->9762|13139->9768
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|107->74|107->74|107->74|108->75|109->76|109->76|109->76|110->77|110->77|110->77|111->78|112->79|112->79|112->79|113->80|113->80|113->80|114->81|114->81|114->81|115->82|115->82|115->82|116->83|116->83|116->83|117->84|117->84|117->84|119->86|119->86|119->86|123->90|124->91|133->100|133->100|145->112|145->112|145->112|146->113|166->133|166->133|166->133|167->134|168->135|168->135|168->135|169->136|169->136|169->136|170->137|171->138|171->138|171->138|172->139|172->139|172->139|173->140|173->140|173->140|174->141|174->141|174->141|175->142|175->142|175->142|176->143|176->143|176->143|178->145|178->145|178->145|182->149|183->150|189->156|192->159|198->165|198->165|200->167
                  -- GENERATED --
              */
          