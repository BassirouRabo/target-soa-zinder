
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object paiement_ventes_Scope0 {
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

     object paiement_ventes_Scope1 {
import java.util

class paiement_ventes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[util.List[PaiementVente],util.List[PaiementVente],Date,Long,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(paiements: util.List[PaiementVente], paiementsMonth: util.List[PaiementVente], dateActuelle: Date, totalPaiementVenteMonth: Long, totalPaiementVente: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.158*/("""

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
                        <h4 class="page-title">Nos factures de vente</h4>
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
                                <h3 class="box-title m-b-0">PAIEMENTS DU MOIS</h3>
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
                                        """),_display_(/*74.42*/for(paiement <- paiementsMonth) yield /*74.73*/ {_display_(Seq[Any](format.raw/*74.75*/("""
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
                                                        """),format.raw/*94.57*/("""<strong style="color : red"><a href="/facture-ventes/"""),_display_(/*94.111*/paiement/*94.119*/.getFacture.getId),format.raw/*94.136*/("""/paiements/"""),_display_(/*94.148*/paiement/*94.156*/.getId),format.raw/*94.162*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                    """)))}),format.raw/*95.54*/("""
                                                    """),_display_(/*96.54*/if(paiement.getStatus.equals("Fermé"))/*96.92*/ {_display_(Seq[Any](format.raw/*96.94*/("""
                                                        """),format.raw/*97.57*/("""<strong style="color : green">Traité</strong>
                                                    """)))}),format.raw/*98.54*/("""
                                                """),format.raw/*99.49*/("""</th>
                                                <td>
                                                    <a href="/facture-ventes/"""),_display_(/*101.79*/paiement/*101.87*/.getFacture.getId),format.raw/*101.104*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*104.42*/("""
                                        """),format.raw/*105.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th>TOTAL</th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*111.94*/totalPaiementVenteMonth),format.raw/*111.117*/("""</span></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </tfoot>

                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>

                                </div>
                            </div>
                        </div>
                    </div>


                """),_display_(/*128.18*/if(paiements.size() > 0)/*128.42*/ {_display_(Seq[Any](format.raw/*128.44*/("""
                    """),format.raw/*129.21*/("""<div class="row">
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
                                        """),_display_(/*149.42*/for(paiement <- paiements) yield /*149.68*/ {_display_(Seq[Any](format.raw/*149.70*/("""
                                            """),format.raw/*150.45*/("""<tr class="active">
                                                <td>"""),_display_(/*151.54*/if(null != paiement.getWhenDone)/*151.86*/ {_display_(Seq[Any](format.raw/*151.88*/("""
                                                    """),_display_(/*152.54*/paiement/*152.62*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*152.95*/("""
                                                """)))}),format.raw/*153.50*/("""</td>
                                                <th>"""),_display_(/*154.54*/paiement/*154.62*/.getFacture.getClient.getNom),format.raw/*154.90*/("""</th>
                                                <td>"""),_display_(/*155.54*/paiement/*155.62*/.getType),format.raw/*155.70*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*156.94*/paiement/*156.102*/.getMontant),format.raw/*156.113*/("""</span></td>
                                                <td>"""),_display_(/*157.54*/if(null != paiement.getEcheance)/*157.86*/ {_display_(Seq[Any](format.raw/*157.88*/("""
                                                    """),_display_(/*158.54*/paiement/*158.62*/.getEcheance.format("dd-MM-yyyy")),format.raw/*158.95*/("""
                                                """)))}),format.raw/*159.50*/("""</td>
                                                <td>
                                                """),_display_(/*161.50*/if(paiement.getDifferenceDate <= 0)/*161.85*/ {_display_(Seq[Any](format.raw/*161.87*/("""
                                                    """),format.raw/*162.53*/("""<strong style="color : red">"""),_display_(/*162.82*/paiement/*162.90*/.getDifferenceDate),format.raw/*162.108*/("""</strong>
                                                """)))}/*163.51*/else/*163.56*/{_display_(Seq[Any](format.raw/*163.57*/("""
                                                    """),format.raw/*164.53*/("""<strong style="color : green">"""),_display_(/*164.84*/paiement/*164.92*/.getDifferenceDate),format.raw/*164.110*/("""</strong>
                                                """)))}),format.raw/*165.50*/("""
                                                """),format.raw/*166.49*/("""</td>
                                                <th>
                                                    """),_display_(/*168.54*/if(paiement.getStatus.equals("Ouvert"))/*168.93*/ {_display_(Seq[Any](format.raw/*168.95*/("""
                                                        """),format.raw/*169.57*/("""<strong style="color : red"><a href="/facture-ventes/"""),_display_(/*169.111*/paiement/*169.119*/.getFacture.getId),format.raw/*169.136*/("""/paiements/"""),_display_(/*169.148*/paiement/*169.156*/.getId),format.raw/*169.162*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                    """)))}),format.raw/*170.54*/("""
                                                    """),_display_(/*171.54*/if(paiement.getStatus.equals("Fermé"))/*171.92*/ {_display_(Seq[Any](format.raw/*171.94*/("""
                                                        """),format.raw/*172.57*/("""<strong style="color : green">Traité</strong>
                                                    """)))}),format.raw/*173.54*/("""
                                                """),format.raw/*174.49*/("""</th>
                                                <td>
                                                    <a href="/facture-ventes/"""),_display_(/*176.79*/paiement/*176.87*/.getFacture.getId),format.raw/*176.104*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*179.42*/("""
                                        """),format.raw/*180.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th>TOTAL</th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*186.94*/totalPaiementVente),format.raw/*186.112*/("""</span></th>
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
                """)))}),format.raw/*200.18*/("""


            """),format.raw/*203.13*/("""</div>
            <footer class="footer text-center"> 2016 &copy;
                Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
        </div>
    </div>

    """),_display_(/*209.6*/foot()),format.raw/*209.12*/("""

"""),format.raw/*211.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(paiements:util.List[PaiementVente],paiementsMonth:util.List[PaiementVente],dateActuelle:Date,totalPaiementVenteMonth:Long,totalPaiementVente:Long): play.twirl.api.HtmlFormat.Appendable = apply(paiements,paiementsMonth,dateActuelle,totalPaiementVenteMonth,totalPaiementVente)

  def f:((util.List[PaiementVente],util.List[PaiementVente],Date,Long,Long) => play.twirl.api.HtmlFormat.Appendable) = (paiements,paiementsMonth,dateActuelle,totalPaiementVenteMonth,totalPaiementVente) => apply(paiements,paiementsMonth,dateActuelle,totalPaiementVenteMonth,totalPaiementVente)

  def ref: this.type = this

}


}
}

/**/
object paiement_ventes extends paiement_ventes_Scope0.paiement_ventes_Scope1.paiement_ventes
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/paiement_ventes.scala.html
                  HASH: 3172d31f5e345fd26ba3ec36ce2af6e856b93619
                  MATRIX: 878->19|1130->175|1158->177|1222->216|1248->222|1278->225|2083->1003|2110->1009|2148->1020|2582->1427|2621->1457|2661->1459|2718->1488|2955->1698|2969->1703|3003->1716|3060->1745|3123->1777|3176->1803|3217->1835|3257->1837|3314->1866|3551->2076|3565->2081|3601->2096|3664->2128|3713->2149|5118->3527|5165->3558|5205->3560|5278->3605|5378->3678|5419->3710|5459->3712|5540->3766|5557->3774|5611->3807|5692->3857|5778->3916|5795->3924|5844->3952|5930->4011|5947->4019|5976->4027|6102->4126|6120->4134|6153->4145|6246->4211|6287->4243|6327->4245|6408->4299|6425->4307|6479->4340|6560->4390|6695->4498|6739->4533|6779->4535|6860->4588|6916->4617|6933->4625|6973->4643|7051->4703|7064->4708|7103->4709|7184->4762|7242->4793|7259->4801|7299->4819|7389->4878|7466->4927|7605->5039|7653->5078|7693->5080|7778->5137|7860->5191|7878->5199|7917->5216|7957->5228|7975->5236|8003->5242|8233->5441|8314->5495|8361->5533|8401->5535|8486->5592|8616->5691|8693->5740|8858->5877|8876->5885|8916->5902|9214->6168|9284->6209|9705->6602|9751->6625|10488->7334|10522->7358|10563->7360|10613->7381|11954->8694|11997->8720|12038->8722|12112->8767|12213->8840|12255->8872|12296->8874|12378->8928|12396->8936|12451->8969|12533->9019|12620->9078|12638->9086|12688->9114|12775->9173|12793->9181|12823->9189|12950->9288|12969->9296|13003->9307|13097->9373|13139->9405|13180->9407|13262->9461|13280->9469|13335->9502|13417->9552|13553->9660|13598->9695|13639->9697|13721->9750|13778->9779|13796->9787|13837->9805|13916->9865|13930->9870|13970->9871|14052->9924|14111->9955|14129->9963|14170->9981|14261->10040|14339->10089|14479->10201|14528->10240|14569->10242|14655->10299|14738->10353|14757->10361|14797->10378|14838->10390|14857->10398|14886->10404|15117->10603|15199->10657|15247->10695|15288->10697|15374->10754|15505->10853|15583->10902|15748->11039|15766->11047|15806->11064|16104->11330|16174->11371|16595->11764|16636->11782|17208->12322|17252->12337|17487->12545|17515->12551|17545->12553
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|107->74|107->74|107->74|108->75|109->76|109->76|109->76|110->77|110->77|110->77|111->78|112->79|112->79|112->79|113->80|113->80|113->80|114->81|114->81|114->81|115->82|115->82|115->82|116->83|116->83|116->83|117->84|119->86|119->86|119->86|120->87|120->87|120->87|120->87|121->88|121->88|121->88|122->89|122->89|122->89|122->89|123->90|124->91|126->93|126->93|126->93|127->94|127->94|127->94|127->94|127->94|127->94|127->94|128->95|129->96|129->96|129->96|130->97|131->98|132->99|134->101|134->101|134->101|137->104|138->105|144->111|144->111|161->128|161->128|161->128|162->129|182->149|182->149|182->149|183->150|184->151|184->151|184->151|185->152|185->152|185->152|186->153|187->154|187->154|187->154|188->155|188->155|188->155|189->156|189->156|189->156|190->157|190->157|190->157|191->158|191->158|191->158|192->159|194->161|194->161|194->161|195->162|195->162|195->162|195->162|196->163|196->163|196->163|197->164|197->164|197->164|197->164|198->165|199->166|201->168|201->168|201->168|202->169|202->169|202->169|202->169|202->169|202->169|202->169|203->170|204->171|204->171|204->171|205->172|206->173|207->174|209->176|209->176|209->176|212->179|213->180|219->186|219->186|233->200|236->203|242->209|242->209|244->211
                  -- GENERATED --
              */
          