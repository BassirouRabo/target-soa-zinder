
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object client_transport_Scope0 {
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

     object client_transport_Scope1 {
import java.util

class client_transport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[ClientTransport,util.List[CommandeTransport],util.List[PaiementTransport],Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(client: ClientTransport, commandes: util.List[CommandeTransport],  paiements: util.List[PaiementTransport], dateActuelle: Date):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.130*/("""

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
                            <h4 class="page-title">CLIENT : """),_display_(/*34.62*/client/*34.68*/.getNom),format.raw/*34.75*/("""</h4>
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
                                <h3 class="box-title m-b-0">Modifier un client</h3>
                                <form class="form-horizontal" method="post" action="/client-transports/"""),_display_(/*58.105*/client/*58.111*/.getId),format.raw/*58.117*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nom" type="text" class="form-control" value=""""),_display_(/*61.104*/client/*61.110*/.getNom),format.raw/*61.117*/("""" required="required" placeholder="Nom">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="telephone" type="tel" class="form-control" value=""""),_display_(/*65.109*/client/*65.115*/.getTelephone),format.raw/*65.128*/("""" placeholder="Téléphone">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <textarea name="adresse" class="form-control" rows="5" placeholder="Adresse">"""),_display_(/*70.123*/client/*70.129*/.getAdresse),format.raw/*70.140*/("""</textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*76.84*/client/*76.90*/.getId),format.raw/*76.96*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Modifier</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    """),_display_(/*86.22*/if(commandes.size() > 0)/*86.46*/ {_display_(Seq[Any](format.raw/*86.48*/("""
                        """),format.raw/*87.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">COMMANDES</h3>
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
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*106.46*/for(commande <- commandes) yield /*106.72*/ {_display_(Seq[Any](format.raw/*106.74*/("""
                                                """),format.raw/*107.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*108.58*/if(null != commande.getDateCommande)/*108.94*/ {_display_(Seq[Any](format.raw/*108.96*/("""
                                                        """),_display_(/*109.58*/commande/*109.66*/.getDateCommande.format("dd-MM-yyyy")),format.raw/*109.103*/("""
                                                    """)))}),format.raw/*110.54*/("""</th>
                                                    <td>"""),_display_(/*111.58*/commande/*111.66*/.getCamion.getImmatriculation),format.raw/*111.95*/("""</td>
                                                    <td>"""),_display_(/*112.58*/commande/*112.66*/.getCamion.getProprietaire),format.raw/*112.92*/("""</td>
                                                    <td>"""),_display_(/*113.58*/commande/*113.66*/.getDestination),format.raw/*113.81*/("""</td>
                                                    <td>"""),_display_(/*114.58*/commande/*114.66*/.getProduit.getNom),format.raw/*114.84*/("""</td>
                                                    <td>"""),_display_(/*115.58*/commande/*115.66*/.getQuantite),format.raw/*115.78*/("""</td>
                                                    <td>
                                                        <a href="/facture-transports/"""),_display_(/*117.87*/commande/*117.95*/.getFacture.getId),format.raw/*117.112*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>

                                                </tr>
                                            """)))}),format.raw/*121.46*/("""
                                            """),format.raw/*122.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*129.22*/("""

                    """),_display_(/*131.22*/if(paiements.size() > 0)/*131.46*/ {_display_(Seq[Any](format.raw/*131.48*/("""
                        """),format.raw/*132.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">PAIEMENT</h3>
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
                                            """),_display_(/*152.46*/for(paiement <- paiements) yield /*152.72*/ {_display_(Seq[Any](format.raw/*152.74*/("""
                                                """),format.raw/*153.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*154.58*/if(null != paiement.getWhenDone)/*154.90*/ {_display_(Seq[Any](format.raw/*154.92*/("""
                                                        """),_display_(/*155.58*/paiement/*155.66*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*155.99*/("""
                                                    """)))}),format.raw/*156.54*/("""</td>
                                                    <th>"""),_display_(/*157.58*/paiement/*157.66*/.getFacture.getClient.getNom),format.raw/*157.94*/("""</th>
                                                    <td>"""),_display_(/*158.58*/paiement/*158.66*/.getType),format.raw/*158.74*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*159.98*/paiement/*159.106*/.getMontant),format.raw/*159.117*/("""</span></td>
                                                    <td>"""),_display_(/*160.58*/if(null != paiement.getEcheance)/*160.90*/ {_display_(Seq[Any](format.raw/*160.92*/("""
                                                        """),_display_(/*161.58*/paiement/*161.66*/.getEcheance.format("dd-MM-yyyy")),format.raw/*161.99*/("""
                                                    """)))}),format.raw/*162.54*/("""</td>
                                                    <td>
                                                    """),_display_(/*164.54*/if(paiement.getEcheance() == null || dateActuelle == null)/*164.112*/ {_display_(Seq[Any](format.raw/*164.114*/("""
                                                        """),format.raw/*165.57*/("""<em>-</em>
                                                    """)))}/*166.55*/else/*166.60*/{_display_(Seq[Any](format.raw/*166.61*/("""
                                                        """),_display_(/*167.58*/if(
                                                            ((((Long.valueOf(dateActuelle.format("yyyy").toString()) * 4380) +
                                                                    (Long.valueOf(dateActuelle.format("MM").toString()) * 365) +
                                                                    (Long.valueOf(dateActuelle.format("dd").toString())))))
                                                                    >
                                                                    ((((Long.valueOf(paiement.getEcheance().format("yyyy").toString()) * 4380) +
                                                                            (Long.valueOf(paiement.getEcheance().format("MM").toString()) * 365) +
                                                                            (Long.valueOf(paiement.getEcheance().format("dd").toString())))))

                                                        )/*176.58*/ {_display_(Seq[Any](format.raw/*176.60*/("""
                                                            """),format.raw/*177.61*/("""<strong style="color : red">
                                                                + """),_display_(/*178.68*/((((Long.valueOf(dateActuelle.format("yyyy").toString()) * 4380) +
                                                                    (Long.valueOf(dateActuelle.format("MM").toString()) * 365) +
                                                                    (Long.valueOf(dateActuelle.format("dd").toString()))))
                                                                    -
                                                                    (((Long.valueOf(paiement.getEcheance().format("yyyy").toString()) * 4380) +
                                                                            (Long.valueOf(paiement.getEcheance().format("MM").toString()) * 365) +
                                                                            (Long.valueOf(paiement.getEcheance().format("dd").toString())))))),format.raw/*184.142*/("""
                                                            """),format.raw/*185.61*/("""</strong>
                                                        """)))}/*186.59*/else/*186.64*/{_display_(Seq[Any](format.raw/*186.65*/("""
                                                            """),format.raw/*187.61*/("""<strong style="color : green">


                                                                - """),_display_(/*190.68*/((((Long.valueOf(paiement.getEcheance().format("yyyy").toString()) * 4380) +
                                                                    (Long.valueOf(paiement.getEcheance().format("MM").toString()) * 365) +
                                                                    (Long.valueOf(paiement.getEcheance().format("dd").toString()))))
                                                                    -
                                                                    (((Long.valueOf(dateActuelle.format("yyyy").toString()) * 4380) +
                                                                            (Long.valueOf(dateActuelle.format("MM").toString()) * 365) +
                                                                            (Long.valueOf(dateActuelle.format("dd").toString())))))),format.raw/*196.132*/("""
                                                            """),format.raw/*197.61*/("""</strong>
                                                        """)))}),format.raw/*198.58*/("""
                                                    """)))}),format.raw/*199.54*/("""
                                                    """),format.raw/*200.53*/("""</td>
                                                    <th>
                                                        """),_display_(/*202.58*/if(paiement.getStatus.equals("Ouvert"))/*202.97*/ {_display_(Seq[Any](format.raw/*202.99*/("""
                                                            """),format.raw/*203.61*/("""<strong style="color : red"><a href="/facture-transports/"""),_display_(/*203.119*/paiement/*203.127*/.getFacture.getId),format.raw/*203.144*/("""/paiements/"""),_display_(/*203.156*/paiement/*203.164*/.getId),format.raw/*203.170*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                        """)))}),format.raw/*204.58*/("""
                                                        """),_display_(/*205.58*/if(paiement.getStatus.equals("Fermé"))/*205.96*/ {_display_(Seq[Any](format.raw/*205.98*/("""
                                                            """),format.raw/*206.61*/("""<strong style="color : green">Fermé</strong>
                                                        """)))}),format.raw/*207.58*/("""
                                                    """),format.raw/*208.53*/("""</th>
                                                    <td>
                                                        <a href="/facture-transports/"""),_display_(/*210.87*/paiement/*210.95*/.getFacture.getId),format.raw/*210.112*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>

                                                </tr>
                                            """)))}),format.raw/*214.46*/("""
                                            """),format.raw/*215.45*/("""</tbody>

                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*223.22*/("""

                """),format.raw/*225.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

            """),_display_(/*231.14*/foot()),format.raw/*231.20*/("""
    """),format.raw/*232.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(client:ClientTransport,commandes:util.List[CommandeTransport],paiements:util.List[PaiementTransport],dateActuelle:Date): play.twirl.api.HtmlFormat.Appendable = apply(client,commandes,paiements,dateActuelle)

  def f:((ClientTransport,util.List[CommandeTransport],util.List[PaiementTransport],Date) => play.twirl.api.HtmlFormat.Appendable) = (client,commandes,paiements,dateActuelle) => apply(client,commandes,paiements,dateActuelle)

  def ref: this.type = this

}


}
}

/**/
object client_transport extends client_transport_Scope0.client_transport_Scope1.client_transport
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/client_transport.scala.html
                  HASH: 876342991d00d66b339423152b472703d2e2e8ce
                  MATRIX: 895->19|1119->147|1147->149|1211->188|1237->194|1275->205|2136->1039|2163->1045|2206->1060|2486->1313|2501->1319|2529->1326|2735->1505|2774->1535|2814->1537|2875->1570|3120->1788|3134->1793|3168->1806|3229->1839|3296->1875|3353->1905|3394->1937|3434->1939|3495->1972|3740->2190|3754->2195|3790->2210|3857->2246|3910->2271|4299->2632|4315->2638|4343->2644|4608->2881|4624->2887|4653->2894|4941->3154|4957->3160|4992->3173|5384->3537|5400->3543|5433->3554|5770->3864|5785->3870|5812->3876|6203->4240|6236->4264|6276->4266|6329->4291|7702->5636|7745->5662|7786->5664|7864->5713|7969->5790|8015->5826|8056->5828|8142->5886|8160->5894|8220->5931|8306->5985|8397->6048|8415->6056|8466->6085|8557->6148|8575->6156|8623->6182|8714->6245|8732->6253|8769->6268|8860->6331|8878->6339|8918->6357|9009->6420|9027->6428|9061->6440|9238->6589|9256->6597|9296->6614|9607->6893|9681->6938|10111->7336|10162->7359|10196->7383|10237->7385|10291->7410|11717->8808|11760->8834|11801->8836|11879->8885|11984->8962|12026->8994|12067->8996|12153->9054|12171->9062|12226->9095|12312->9149|12403->9212|12421->9220|12471->9248|12562->9311|12580->9319|12610->9327|12741->9430|12760->9438|12794->9449|12892->9519|12934->9551|12975->9553|13061->9611|13079->9619|13134->9652|13220->9706|13364->9822|13433->9880|13475->9882|13561->9939|13645->10004|13659->10009|13699->10010|13785->10068|14741->11014|14782->11016|14872->11077|14996->11173|15840->11994|15930->12055|16017->12123|16031->12128|16071->12129|16161->12190|16289->12290|17133->13111|17223->13172|17322->13239|17408->13293|17490->13346|17638->13466|17687->13505|17728->13507|17818->13568|17905->13626|17924->13634|17964->13651|18005->13663|18024->13671|18053->13677|18288->13880|18374->13938|18422->13976|18463->13978|18553->14039|18687->14141|18769->14194|18946->14343|18964->14351|19004->14368|19315->14647|19389->14692|19820->15091|19867->15109|20127->15341|20155->15347|20188->15352
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|67->34|67->34|67->34|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|94->61|94->61|94->61|98->65|98->65|98->65|103->70|103->70|103->70|109->76|109->76|109->76|119->86|119->86|119->86|120->87|139->106|139->106|139->106|140->107|141->108|141->108|141->108|142->109|142->109|142->109|143->110|144->111|144->111|144->111|145->112|145->112|145->112|146->113|146->113|146->113|147->114|147->114|147->114|148->115|148->115|148->115|150->117|150->117|150->117|154->121|155->122|162->129|164->131|164->131|164->131|165->132|185->152|185->152|185->152|186->153|187->154|187->154|187->154|188->155|188->155|188->155|189->156|190->157|190->157|190->157|191->158|191->158|191->158|192->159|192->159|192->159|193->160|193->160|193->160|194->161|194->161|194->161|195->162|197->164|197->164|197->164|198->165|199->166|199->166|199->166|200->167|209->176|209->176|210->177|211->178|217->184|218->185|219->186|219->186|219->186|220->187|223->190|229->196|230->197|231->198|232->199|233->200|235->202|235->202|235->202|236->203|236->203|236->203|236->203|236->203|236->203|236->203|237->204|238->205|238->205|238->205|239->206|240->207|241->208|243->210|243->210|243->210|247->214|248->215|256->223|258->225|264->231|264->231|265->232
                  -- GENERATED --
              */
          