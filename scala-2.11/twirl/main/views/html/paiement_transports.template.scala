
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object paiement_transports_Scope0 {
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

     object paiement_transports_Scope1 {
import java.util

class paiement_transports extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[util.List[PaiementTransport],util.List[PaiementTransport],Date,Long,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(paiements: util.List[PaiementTransport], paiementsMonth: util.List[PaiementTransport], dateActuelle: Date, totalPaiementTransportMonth: Long, totalPaiementTransport: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.174*/("""

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
                        <h4 class="page-title">Nos factures de transport</h4>
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
                                <h3 class="box-title m-b-0">PAIEMENT DU MOIS</h3>
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>DATE</th>
                                                <th>CLIENT</th>
                                                <th>TYPE</th>
                                                <th>MONTANT</th>
                                                <th>ECHEANCE</th>
                                                <th>ECART</th>
                                                <th>STATUS</th>
                                                <th>DÉTAIL</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*74.42*/for(paiement <- paiements) yield /*74.68*/ {_display_(Seq[Any](format.raw/*74.70*/("""
                                            """),format.raw/*75.45*/("""<tr class="active">
                                                <td>"""),_display_(/*76.54*/if(null != paiement.getWhenDone)/*76.86*/ {_display_(Seq[Any](format.raw/*76.88*/("""
                                                    """),_display_(/*77.54*/paiement/*77.62*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*77.95*/("""
                                                """)))}),format.raw/*78.50*/("""</td>
                                                <th>"""),_display_(/*79.54*/paiement/*79.62*/.getFacture.getClient.getNom),format.raw/*79.90*/("""</th>
                                                <td>"""),_display_(/*80.54*/paiement/*80.62*/.getType),format.raw/*80.70*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*81.94*/paiement/*81.102*/.getMontant),format.raw/*81.113*/("""</span></td>
                                                <td>"""),_display_(/*82.54*/if(null != paiement.getEcheance)/*82.86*/ {_display_(Seq[Any](format.raw/*82.88*/("""
                                                    """),_display_(/*83.54*/paiement/*83.62*/.getEcheance.format("dd-MM-yyyy")),format.raw/*83.95*/("""
                                                """)))}),format.raw/*84.50*/("""</td>
                                                <td>
                                                """),_display_(/*86.50*/if(paiement.getDifferenceDate <= 0)/*86.85*/ {_display_(Seq[Any](format.raw/*86.87*/("""
                                                    """),format.raw/*87.53*/("""<strong style="color : red">"""),_display_(/*87.82*/paiement/*87.90*/.getDifferenceDate),format.raw/*87.108*/("""</strong>
                                                """)))}/*88.51*/else/*88.56*/{_display_(Seq[Any](format.raw/*88.57*/("""
                                                    """),format.raw/*89.53*/("""<strong style="color : green">"""),_display_(/*89.84*/paiement/*89.92*/.getDifferenceDate),format.raw/*89.110*/("""</strong>
                                                """)))}),format.raw/*90.50*/("""
                                                """),format.raw/*91.49*/("""</td>
                                                <th>
                                                    """),_display_(/*93.54*/if(paiement.getStatus.equals("Ouvert"))/*93.93*/ {_display_(Seq[Any](format.raw/*93.95*/("""
                                                        """),format.raw/*94.57*/("""<strong style="color : red"><a href="/facture-transports/"""),_display_(/*94.115*/paiement/*94.123*/.getFacture.getId),format.raw/*94.140*/("""/paiements/"""),_display_(/*94.152*/paiement/*94.160*/.getId),format.raw/*94.166*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                    """)))}),format.raw/*95.54*/("""
                                                    """),_display_(/*96.54*/if(paiement.getStatus.equals("Fermé"))/*96.92*/ {_display_(Seq[Any](format.raw/*96.94*/("""
                                                        """),format.raw/*97.57*/("""<strong style="color : green">Fermé</strong>
                                                    """)))}),format.raw/*98.54*/("""
                                                """),format.raw/*99.49*/("""</th>
                                                <td>
                                                    <a href="/facture-transports/"""),_display_(/*101.83*/paiement/*101.91*/.getFacture.getId),format.raw/*101.108*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>

                                            </tr>
                                        """)))}),format.raw/*105.42*/("""
                                        """),format.raw/*106.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th>TOTAL</th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*112.94*/totalPaiementTransportMonth),format.raw/*112.121*/("""</span></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </tfoot>

                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>


                """),_display_(/*127.18*/if(paiements.size() > 0)/*127.42*/ {_display_(Seq[Any](format.raw/*127.44*/("""
                    """),format.raw/*128.21*/("""<div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">PAIEMENTS GLOBALES</h3>
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" >
                                        <thead>
                                            <tr class="active">
                                                <th>DATE</th>
                                                <th>CLIENT</th>
                                                <th>TYPE</th>
                                                <th>MONTANT</th>
                                                <th>ECHEANCE</th>
                                                <th>ECART</th>
                                                <th>STATUS</th>
                                                <th>DÉTAIL</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*148.42*/for(paiement <- paiements) yield /*148.68*/ {_display_(Seq[Any](format.raw/*148.70*/("""
                                            """),format.raw/*149.45*/("""<tr class="active">
                                                <td>"""),_display_(/*150.54*/if(null != paiement.getWhenDone)/*150.86*/ {_display_(Seq[Any](format.raw/*150.88*/("""
                                                    """),_display_(/*151.54*/paiement/*151.62*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*151.95*/("""
                                                """)))}),format.raw/*152.50*/("""</td>
                                                <th>"""),_display_(/*153.54*/paiement/*153.62*/.getFacture.getClient.getNom),format.raw/*153.90*/("""</th>
                                                <td>"""),_display_(/*154.54*/paiement/*154.62*/.getType),format.raw/*154.70*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*155.94*/paiement/*155.102*/.getMontant),format.raw/*155.113*/("""</span></td>
                                                <td>"""),_display_(/*156.54*/if(null != paiement.getEcheance)/*156.86*/ {_display_(Seq[Any](format.raw/*156.88*/("""
                                                    """),_display_(/*157.54*/paiement/*157.62*/.getEcheance.format("dd-MM-yyyy")),format.raw/*157.95*/("""
                                                """)))}),format.raw/*158.50*/("""</td>
                                                <td>
                                                """),_display_(/*160.50*/if(paiement.getDifferenceDate <= 0)/*160.85*/ {_display_(Seq[Any](format.raw/*160.87*/("""
                                                    """),format.raw/*161.53*/("""<strong style="color : red">"""),_display_(/*161.82*/paiement/*161.90*/.getDifferenceDate),format.raw/*161.108*/("""</strong>
                                                """)))}/*162.51*/else/*162.56*/{_display_(Seq[Any](format.raw/*162.57*/("""
                                                    """),format.raw/*163.53*/("""<strong style="color : green">"""),_display_(/*163.84*/paiement/*163.92*/.getDifferenceDate),format.raw/*163.110*/("""</strong>
                                                """)))}),format.raw/*164.50*/("""
                                                """),format.raw/*165.49*/("""</td>
                                                <th>
                                                    """),_display_(/*167.54*/if(paiement.getStatus.equals("Ouvert"))/*167.93*/ {_display_(Seq[Any](format.raw/*167.95*/("""
                                                        """),format.raw/*168.57*/("""<strong style="color : red"><a href="/facture-transports/"""),_display_(/*168.115*/paiement/*168.123*/.getFacture.getId),format.raw/*168.140*/("""/paiements/"""),_display_(/*168.152*/paiement/*168.160*/.getId),format.raw/*168.166*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                    """)))}),format.raw/*169.54*/("""
                                                    """),_display_(/*170.54*/if(paiement.getStatus.equals("Fermé"))/*170.92*/ {_display_(Seq[Any](format.raw/*170.94*/("""
                                                        """),format.raw/*171.57*/("""<strong style="color : green">Fermé</strong>
                                                    """)))}),format.raw/*172.54*/("""
                                                """),format.raw/*173.49*/("""</th>
                                                <td>
                                                    <a href="/facture-transports/"""),_display_(/*175.83*/paiement/*175.91*/.getFacture.getId),format.raw/*175.108*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>

                                            </tr>
                                        """)))}),format.raw/*179.42*/("""
                                        """),format.raw/*180.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <td class="text-right"><span class="number">"""),_display_(/*186.94*/totalPaiementTransportMonth),format.raw/*186.121*/("""</span></td>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </tfoot>

                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*199.18*/("""


            """),format.raw/*202.13*/("""</div>
            <footer class="footer text-center"> 2016 &copy;
                Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
        </div>
    </div>

    """),_display_(/*208.6*/foot()),format.raw/*208.12*/("""

"""),format.raw/*210.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(paiements:util.List[PaiementTransport],paiementsMonth:util.List[PaiementTransport],dateActuelle:Date,totalPaiementTransportMonth:Long,totalPaiementTransport:Long): play.twirl.api.HtmlFormat.Appendable = apply(paiements,paiementsMonth,dateActuelle,totalPaiementTransportMonth,totalPaiementTransport)

  def f:((util.List[PaiementTransport],util.List[PaiementTransport],Date,Long,Long) => play.twirl.api.HtmlFormat.Appendable) = (paiements,paiementsMonth,dateActuelle,totalPaiementTransportMonth,totalPaiementTransport) => apply(paiements,paiementsMonth,dateActuelle,totalPaiementTransportMonth,totalPaiementTransport)

  def ref: this.type = this

}


}
}

/**/
object paiement_transports extends paiement_transports_Scope0.paiement_transports_Scope1.paiement_transports
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:14 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/paiement_transports.scala.html
                  HASH: e99af1de1ea6a8c6bc009bd78d1f808c799e3520
                  MATRIX: 898->19|1166->191|1194->193|1258->232|1284->238|1314->241|2119->1019|2146->1025|2184->1036|2622->1447|2661->1477|2701->1479|2758->1508|2995->1718|3009->1723|3043->1736|3100->1765|3163->1797|3216->1823|3257->1855|3297->1857|3354->1886|3591->2096|3605->2101|3641->2116|3704->2148|3753->2169|5157->3546|5199->3572|5239->3574|5312->3619|5412->3692|5453->3724|5493->3726|5574->3780|5591->3788|5645->3821|5726->3871|5812->3930|5829->3938|5878->3966|5964->4025|5981->4033|6010->4041|6136->4140|6154->4148|6187->4159|6280->4225|6321->4257|6361->4259|6442->4313|6459->4321|6513->4354|6594->4404|6729->4512|6773->4547|6813->4549|6894->4602|6950->4631|6967->4639|7007->4657|7085->4717|7098->4722|7137->4723|7218->4776|7276->4807|7293->4815|7333->4833|7423->4892|7500->4941|7639->5053|7687->5092|7727->5094|7812->5151|7898->5209|7916->5217|7955->5234|7995->5246|8013->5254|8041->5260|8271->5459|8352->5513|8399->5551|8439->5553|8524->5610|8653->5708|8730->5757|8899->5898|8917->5906|8957->5923|9256->6190|9326->6231|9747->6624|9797->6651|10366->7192|10400->7216|10441->7218|10491->7239|11832->8552|11875->8578|11916->8580|11990->8625|12091->8698|12133->8730|12174->8732|12256->8786|12274->8794|12329->8827|12411->8877|12498->8936|12516->8944|12566->8972|12653->9031|12671->9039|12701->9047|12828->9146|12847->9154|12881->9165|12975->9231|13017->9263|13058->9265|13140->9319|13158->9327|13213->9360|13295->9410|13431->9518|13476->9553|13517->9555|13599->9608|13656->9637|13674->9645|13715->9663|13794->9723|13808->9728|13848->9729|13930->9782|13989->9813|14007->9821|14048->9839|14139->9898|14217->9947|14357->10059|14406->10098|14447->10100|14533->10157|14620->10215|14639->10223|14679->10240|14720->10252|14739->10260|14768->10266|14999->10465|15081->10519|15129->10557|15170->10559|15256->10616|15386->10714|15464->10763|15633->10904|15651->10912|15691->10929|15990->11196|16060->11237|16476->11625|16526->11652|17097->12191|17141->12206|17376->12414|17404->12420|17434->12422
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|107->74|107->74|107->74|108->75|109->76|109->76|109->76|110->77|110->77|110->77|111->78|112->79|112->79|112->79|113->80|113->80|113->80|114->81|114->81|114->81|115->82|115->82|115->82|116->83|116->83|116->83|117->84|119->86|119->86|119->86|120->87|120->87|120->87|120->87|121->88|121->88|121->88|122->89|122->89|122->89|122->89|123->90|124->91|126->93|126->93|126->93|127->94|127->94|127->94|127->94|127->94|127->94|127->94|128->95|129->96|129->96|129->96|130->97|131->98|132->99|134->101|134->101|134->101|138->105|139->106|145->112|145->112|160->127|160->127|160->127|161->128|181->148|181->148|181->148|182->149|183->150|183->150|183->150|184->151|184->151|184->151|185->152|186->153|186->153|186->153|187->154|187->154|187->154|188->155|188->155|188->155|189->156|189->156|189->156|190->157|190->157|190->157|191->158|193->160|193->160|193->160|194->161|194->161|194->161|194->161|195->162|195->162|195->162|196->163|196->163|196->163|196->163|197->164|198->165|200->167|200->167|200->167|201->168|201->168|201->168|201->168|201->168|201->168|201->168|202->169|203->170|203->170|203->170|204->171|205->172|206->173|208->175|208->175|208->175|212->179|213->180|219->186|219->186|232->199|235->202|241->208|241->208|243->210
                  -- GENERATED --
              */
          