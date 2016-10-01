
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object client_vente_Scope0 {
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

     object client_vente_Scope1 {
import java.util

class client_vente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[ClientVente,util.List[CommandeVente],util.List[PaiementVente],Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(client: ClientVente, commandes: util.List[CommandeVente], paiements: util.List[PaiementVente], dateActuelle: Date):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.117*/("""

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
                            <h4 class="page-title">CLIENT: """),_display_(/*34.61*/client/*34.67*/.getNom),format.raw/*34.74*/("""</h4>
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
                                <form class="form-horizontal" method="post" action="/client-ventes/"""),_display_(/*58.101*/client/*58.107*/.getId),format.raw/*58.113*/("""/update">
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
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>CLIENT</th>
                                                    <th>PRODUIT</th>
                                                    <th>QUANTITÉ</th>
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*103.46*/for(commande <- commandes) yield /*103.72*/ {_display_(Seq[Any](format.raw/*103.74*/("""
                                                """),format.raw/*104.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*105.58*/if(null != commande.getFacture.getWhenDone)/*105.101*/ {_display_(Seq[Any](format.raw/*105.103*/("""
                                                        """),_display_(/*106.58*/commande/*106.66*/.getFacture.getWhenDone.format("dd-MM-yyyy")),format.raw/*106.110*/("""
                                                    """)))}),format.raw/*107.54*/("""</th>
                                                    <td>"""),_display_(/*108.58*/commande/*108.66*/.getFacture.getClient.getNom),format.raw/*108.94*/("""</td>
                                                    <td>"""),_display_(/*109.58*/commande/*109.66*/.getProduit.getNom),format.raw/*109.84*/("""</td>
                                                    <td>"""),_display_(/*110.58*/commande/*110.66*/.getQuantite),format.raw/*110.78*/("""</td>
                                                    <td>
                                                        <a href="/facture-ventes/"""),_display_(/*112.83*/commande/*112.91*/.getFacture.getId),format.raw/*112.108*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*115.46*/("""
                                            """),format.raw/*116.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*123.22*/("""

                    """),_display_(/*125.22*/if(paiements.size() > 0)/*125.46*/ {_display_(Seq[Any](format.raw/*125.48*/("""
                        """),format.raw/*126.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">Paiement</h3>
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
                                            """),_display_(/*146.46*/for(paiement <- paiements) yield /*146.72*/ {_display_(Seq[Any](format.raw/*146.74*/("""
                                                """),format.raw/*147.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*148.58*/if(null != paiement.getWhenDone)/*148.90*/ {_display_(Seq[Any](format.raw/*148.92*/("""
                                                        """),_display_(/*149.58*/paiement/*149.66*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*149.99*/("""
                                                    """)))}),format.raw/*150.54*/("""</td>
                                                    <th>"""),_display_(/*151.58*/paiement/*151.66*/.getFacture.getClient.getNom),format.raw/*151.94*/("""</th>
                                                    <td>"""),_display_(/*152.58*/paiement/*152.66*/.getType),format.raw/*152.74*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*153.98*/paiement/*153.106*/.getMontant),format.raw/*153.117*/("""</span></td>
                                                    <td>"""),_display_(/*154.58*/if(null != paiement.getEcheance)/*154.90*/ {_display_(Seq[Any](format.raw/*154.92*/("""
                                                        """),_display_(/*155.58*/paiement/*155.66*/.getEcheance.format("dd-MM-yyyy")),format.raw/*155.99*/("""
                                                    """)))}),format.raw/*156.54*/("""</td>
                                                    <td>
                                                    """),_display_(/*158.54*/if(paiement.getEcheance() == null || dateActuelle == null)/*158.112*/ {_display_(Seq[Any](format.raw/*158.114*/("""
                                                        """),format.raw/*159.57*/("""<em>-</em>
                                                    """)))}/*160.55*/else/*160.60*/{_display_(Seq[Any](format.raw/*160.61*/("""
                                                        """),_display_(/*161.58*/if(
                                                            ((((Long.valueOf(dateActuelle.format("yyyy").toString()) * 4380) +
                                                                    (Long.valueOf(dateActuelle.format("MM").toString()) * 365) +
                                                                    (Long.valueOf(dateActuelle.format("dd").toString())))))
                                                                    >
                                                                    ((((Long.valueOf(paiement.getEcheance().format("yyyy").toString()) * 4380) +
                                                                            (Long.valueOf(paiement.getEcheance().format("MM").toString()) * 365) +
                                                                            (Long.valueOf(paiement.getEcheance().format("dd").toString())))))

                                                        )/*170.58*/ {_display_(Seq[Any](format.raw/*170.60*/("""
                                                            """),format.raw/*171.61*/("""<strong style="color : red">
                                                                + """),_display_(/*172.68*/((((Long.valueOf(dateActuelle.format("yyyy").toString()) * 4380) +
                                                                    (Long.valueOf(dateActuelle.format("MM").toString()) * 365) +
                                                                    (Long.valueOf(dateActuelle.format("dd").toString()))))
                                                                    -
                                                                    (((Long.valueOf(paiement.getEcheance().format("yyyy").toString()) * 4380) +
                                                                            (Long.valueOf(paiement.getEcheance().format("MM").toString()) * 365) +
                                                                            (Long.valueOf(paiement.getEcheance().format("dd").toString())))))),format.raw/*178.142*/("""
                                                            """),format.raw/*179.61*/("""</strong>
                                                        """)))}/*180.59*/else/*180.64*/{_display_(Seq[Any](format.raw/*180.65*/("""
                                                            """),format.raw/*181.61*/("""<strong style="color : green">


                                                                - """),_display_(/*184.68*/((((Long.valueOf(paiement.getEcheance().format("yyyy").toString()) * 4380) +
                                                                    (Long.valueOf(paiement.getEcheance().format("MM").toString()) * 365) +
                                                                    (Long.valueOf(paiement.getEcheance().format("dd").toString()))))
                                                                    -
                                                                    (((Long.valueOf(dateActuelle.format("yyyy").toString()) * 4380) +
                                                                            (Long.valueOf(dateActuelle.format("MM").toString()) * 365) +
                                                                            (Long.valueOf(dateActuelle.format("dd").toString())))))),format.raw/*190.132*/("""
                                                            """),format.raw/*191.61*/("""</strong>
                                                        """)))}),format.raw/*192.58*/("""
                                                    """)))}),format.raw/*193.54*/("""
                                                    """),format.raw/*194.53*/("""</td>
                                                    <th>
                                                        """),_display_(/*196.58*/if(paiement.getStatus.equals("Ouvert"))/*196.97*/ {_display_(Seq[Any](format.raw/*196.99*/("""
                                                            """),format.raw/*197.61*/("""<strong style="color : red"><a href="/facture-ventes/"""),_display_(/*197.115*/paiement/*197.123*/.getFacture.getId),format.raw/*197.140*/("""/paiements/"""),_display_(/*197.152*/paiement/*197.160*/.getId),format.raw/*197.166*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                        """)))}),format.raw/*198.58*/("""
                                                        """),_display_(/*199.58*/if(paiement.getStatus.equals("Fermé"))/*199.96*/ {_display_(Seq[Any](format.raw/*199.98*/("""
                                                            """),format.raw/*200.61*/("""<strong style="color : green">Traité</strong>
                                                        """)))}),format.raw/*201.58*/("""
                                                    """),format.raw/*202.53*/("""</th>
                                                    <td>
                                                        <a href="/facture-ventes/"""),_display_(/*204.83*/paiement/*204.91*/.getFacture.getId),format.raw/*204.108*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*207.46*/("""
                                            """),format.raw/*208.45*/("""</tbody>

                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>

                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*217.22*/("""

                """),format.raw/*219.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

            """),_display_(/*225.14*/foot()),format.raw/*225.20*/("""

    """),format.raw/*227.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(client:ClientVente,commandes:util.List[CommandeVente],paiements:util.List[PaiementVente],dateActuelle:Date): play.twirl.api.HtmlFormat.Appendable = apply(client,commandes,paiements,dateActuelle)

  def f:((ClientVente,util.List[CommandeVente],util.List[PaiementVente],Date) => play.twirl.api.HtmlFormat.Appendable) = (client,commandes,paiements,dateActuelle) => apply(client,commandes,paiements,dateActuelle)

  def ref: this.type = this

}


}
}

/**/
object client_vente extends client_vente_Scope0.client_vente_Scope1.client_vente
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:28 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/client_vente.scala.html
                  HASH: 9d721b8c685f1d60587974da125a1f49b7b602a5
                  MATRIX: 871->19|1082->134|1110->136|1174->175|1200->181|1238->192|2099->1026|2126->1032|2169->1047|2448->1299|2463->1305|2491->1312|2697->1491|2736->1521|2776->1523|2837->1556|3082->1774|3096->1779|3130->1792|3191->1825|3258->1861|3315->1891|3356->1923|3396->1925|3457->1958|3702->2176|3716->2181|3752->2196|3819->2232|3872->2257|4257->2614|4273->2620|4301->2626|4566->2863|4582->2869|4611->2876|4899->3136|4915->3142|4950->3155|5342->3519|5358->3525|5391->3536|5728->3846|5743->3852|5770->3858|6161->4222|6194->4246|6234->4248|6287->4273|7434->5392|7477->5418|7518->5420|7596->5469|7701->5546|7755->5589|7797->5591|7883->5649|7901->5657|7968->5701|8054->5755|8145->5818|8163->5826|8213->5854|8304->5917|8322->5925|8362->5943|8453->6006|8471->6014|8505->6026|8678->6171|8696->6179|8736->6196|9046->6474|9120->6519|9550->6917|9601->6940|9635->6964|9676->6966|9730->6991|11156->8389|11199->8415|11240->8417|11318->8466|11423->8543|11465->8575|11506->8577|11592->8635|11610->8643|11665->8676|11751->8730|11842->8793|11860->8801|11910->8829|12001->8892|12019->8900|12049->8908|12180->9011|12199->9019|12233->9030|12331->9100|12373->9132|12414->9134|12500->9192|12518->9200|12573->9233|12659->9287|12803->9403|12872->9461|12914->9463|13000->9520|13084->9585|13098->9590|13138->9591|13224->9649|14180->10595|14221->10597|14311->10658|14435->10754|15279->11575|15369->11636|15456->11704|15470->11709|15510->11710|15600->11771|15728->11871|16572->12692|16662->12753|16761->12820|16847->12874|16929->12927|17077->13047|17126->13086|17167->13088|17257->13149|17340->13203|17359->13211|17399->13228|17440->13240|17459->13248|17488->13254|17723->13457|17809->13515|17857->13553|17898->13555|17988->13616|18123->13719|18205->13772|18378->13917|18396->13925|18436->13942|18746->14220|18820->14265|19252->14665|19299->14683|19559->14915|19587->14921|19621->14927
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|67->34|67->34|67->34|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|94->61|94->61|94->61|98->65|98->65|98->65|103->70|103->70|103->70|109->76|109->76|109->76|119->86|119->86|119->86|120->87|136->103|136->103|136->103|137->104|138->105|138->105|138->105|139->106|139->106|139->106|140->107|141->108|141->108|141->108|142->109|142->109|142->109|143->110|143->110|143->110|145->112|145->112|145->112|148->115|149->116|156->123|158->125|158->125|158->125|159->126|179->146|179->146|179->146|180->147|181->148|181->148|181->148|182->149|182->149|182->149|183->150|184->151|184->151|184->151|185->152|185->152|185->152|186->153|186->153|186->153|187->154|187->154|187->154|188->155|188->155|188->155|189->156|191->158|191->158|191->158|192->159|193->160|193->160|193->160|194->161|203->170|203->170|204->171|205->172|211->178|212->179|213->180|213->180|213->180|214->181|217->184|223->190|224->191|225->192|226->193|227->194|229->196|229->196|229->196|230->197|230->197|230->197|230->197|230->197|230->197|230->197|231->198|232->199|232->199|232->199|233->200|234->201|235->202|237->204|237->204|237->204|240->207|241->208|250->217|252->219|258->225|258->225|260->227
                  -- GENERATED --
              */
          