
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object facture_vente_Scope0 {
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

     object facture_vente_Scope1 {
import java.util

class facture_vente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[FactureVente,util.List[CommandeVente],util.List[PaiementVente],util.List[Produit],Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(facture: FactureVente, commandes: util.List[CommandeVente], paiements: util.List[PaiementVente], produits: util.List[Produit], dateActuelle: Date):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.149*/("""

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
                            <h4 class="page-title">Nos factures de vente</h4>
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
                                <dl>
                                    <dt>RÉFÉRENCE PROFORMA</dt>
                                    <dd>P"""),_display_(/*59.43*/facture/*59.50*/.getReferenceFactureProforma),format.raw/*59.78*/("""/TIT/"""),_display_(/*59.84*/(Long.valueOf(dateActuelle.format("yyyy")))),format.raw/*59.127*/("""</dd><br>
                                    <dt>CLIENT</dt>
                                    <dd>"""),_display_(/*61.42*/facture/*61.49*/.getClient.getNom),format.raw/*61.66*/("""</dd><br>
                                    <dt>DATE</dt>
                                    <dd>"""),_display_(/*63.42*/if(null == facture.getWhenDone)/*63.73*/ {_display_(Seq[Any](format.raw/*63.75*/("""
                                        """),_display_(/*64.42*/facture/*64.49*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*64.82*/(""")
                                    """)))}),format.raw/*65.38*/("""</dd><br>
                                    <dt>MONTANT</dt>
                                    <dd><span class="number">"""),_display_(/*67.63*/facture/*67.70*/.getMontant),format.raw/*67.81*/("""</span></dd><br>
                                    <dt>PAIEMENT</dt>
                                    <dd><span class="number">"""),_display_(/*69.63*/facture/*69.70*/.getPaiement),format.raw/*69.82*/("""</span></dd><br>
                                    <dt>SOLDE</dt>
                                    <dd>"""),_display_(/*71.42*/if(null != facture.getMontant && null != facture.getPaiement)/*71.103*/ {_display_(Seq[Any](format.raw/*71.105*/("""
                                        """),format.raw/*72.41*/("""<span class="number">"""),_display_(/*72.63*/(facture.getMontant - facture.getPaiement)),format.raw/*72.105*/("""</span>
                                    """)))}),format.raw/*73.38*/("""</dd><br>
                                    <dt>MONTANT EN LETTRE</dt>
                                    <dd>"""),_display_(/*75.42*/facture/*75.49*/.getMontantLettre),format.raw/*75.66*/("""</dd><br>

                                </dl>
                                <a href="/facture-ventes/"""),_display_(/*78.59*/facture/*78.66*/.getId),format.raw/*78.72*/("""/edit" class="btn btn-info">Modifier</a>

                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Commandes</h3>
                                """),_display_(/*88.34*/if(commandes.size() > 0)/*88.58*/ {_display_(Seq[Any](format.raw/*88.60*/("""
                                    """),format.raw/*89.37*/("""<input type="search" class="light-table-filter form-control" data-table="order-table-commande" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table-commande sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>Désignation</th>
                                                <th>Quantité</th>
                                                <th>Prix Unitaire</th>
                                                <th>Total</th>
                                                <th>Modifier</th>
                                                <th>Supprimer</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*103.42*/for(commande <- commandes) yield /*103.68*/ {_display_(Seq[Any](format.raw/*103.70*/("""
                                            """),format.raw/*104.45*/("""<tr class="active">
                                                <td>"""),_display_(/*105.54*/commande/*105.62*/.getProduit.getNom),format.raw/*105.80*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*106.94*/commande/*106.102*/.getQuantite),format.raw/*106.114*/("""</span></td>
                                                <td class="text-right"><span class="number">"""),_display_(/*107.94*/commande/*107.102*/.getPrix),format.raw/*107.110*/("""</span></td>
                                                <td class="text-right"><span class="number">"""),_display_(/*108.94*/commande/*108.102*/.getMontant),format.raw/*108.113*/("""</span></td>
                                                <td>
                                                    <a href="/facture-ventes/"""),_display_(/*110.79*/facture/*110.86*/.getId),format.raw/*110.92*/("""/commandes/"""),_display_(/*110.104*/commande/*110.112*/.getId),format.raw/*110.118*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>
                                                <td>
                                                    <a href="/facture-ventes/"""),_display_(/*113.79*/facture/*113.86*/.getId),format.raw/*113.92*/("""/commandes/"""),_display_(/*113.104*/commande/*113.112*/.getId),format.raw/*113.118*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*116.42*/("""
                                        """),format.raw/*117.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th>NET À PAYER</th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*123.94*/facture/*123.101*/.getMontant),format.raw/*123.112*/("""</span></th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </tfoot>
                                    </table>

                                    <a href="/facture-ventes/"""),_display_(/*130.63*/facture/*130.70*/.getId),format.raw/*130.76*/("""/reference/"""),_display_(/*130.88*/facture/*130.95*/.getReferenceFactureProforma),format.raw/*130.123*/("""/generate/proforma" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer">Générer facture proforma </a>
                                    <a href="/rapport/download/Facture-Vente-Proforma/"""),_display_(/*131.88*/facture/*131.95*/.getReferenceFactureProforma),format.raw/*131.123*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>

                                    <a href="/facture-ventes/"""),_display_(/*133.63*/facture/*133.70*/.getId),format.raw/*133.76*/("""/reference/"""),_display_(/*133.88*/facture/*133.95*/.getReferenceFactureDefinitive),format.raw/*133.125*/("""/generate/definitive" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer">Générer facture définitive  </a>
                                    <a href="/rapport/download/Facture-Vente-Definitive/"""),_display_(/*134.90*/facture/*134.97*/.getReferenceFactureDefinitive),format.raw/*134.127*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>

                                    <br><br><button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>

                                </div>
                                """)))}),format.raw/*139.34*/("""
                            """),format.raw/*140.29*/("""</div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Ajouter un produit</h3>
                                <form class="form-horizontal" method="post" action="/facture-ventes/"""),_display_(/*148.102*/facture/*148.109*/.getId),format.raw/*148.115*/("""/commandes">
                                    <div class="form-group">
                                        <div class="col-md-5">
                                            <select name="produit.id" class="form-control" required="required">
                                            """),_display_(/*152.46*/for(produit <- produits) yield /*152.70*/ {_display_(Seq[Any](format.raw/*152.72*/("""
                                                """),format.raw/*153.49*/("""<option value=""""),_display_(/*153.65*/produit/*153.72*/.getId),format.raw/*153.78*/("""">"""),_display_(/*153.81*/produit/*153.88*/.getNom),format.raw/*153.95*/(""" """),format.raw/*153.96*/("""- """),_display_(/*153.99*/produit/*153.106*/.getPrixVente),format.raw/*153.119*/("""</option>
                                            """)))}),format.raw/*154.46*/("""
                                            """),format.raw/*155.45*/("""</select>
                                        </div>

                                        <div class="col-md-5">
                                            <input name="quantite" type="number" min="0" class="form-control" placeholder="Quantité" required="required">
                                        </div>

                                        <div class="col-md-2">
                                            <input type="hidden" name="facture.id" value=""""),_display_(/*163.92*/facture/*163.99*/.getId),format.raw/*163.105*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Ajouter</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Paiement</h3>
                                """),_display_(/*177.34*/if(paiements.size() > 0)/*177.58*/ {_display_(Seq[Any](format.raw/*177.60*/("""
                                    """),format.raw/*178.37*/("""<input type="search" class="light-table-filter form-control" data-table="order-table-paiement" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table-paiement sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>TYPE</th>
                                                    <th>MONTANT</th>
                                                    <th>ECHEANCE</th>
                                                    <th>ECART</th>
                                                    <th>STATUS</th>
                                                    <th>MODIFIER</th>
                                                    <th>SUPPRIMER</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*194.46*/for(paiement <- paiements) yield /*194.72*/ {_display_(Seq[Any](format.raw/*194.74*/("""
                                                """),format.raw/*195.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*196.58*/if(null != paiement.getWhenDone)/*196.90*/ {_display_(Seq[Any](format.raw/*196.92*/("""
                                                        """),_display_(/*197.58*/paiement/*197.66*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*197.99*/("""
                                                    """)))}),format.raw/*198.54*/("""</td>
                                                    <td>"""),_display_(/*199.58*/paiement/*199.66*/.getType),format.raw/*199.74*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*200.98*/paiement/*200.106*/.getMontant),format.raw/*200.117*/("""</span></td>
                                                    <td>"""),_display_(/*201.58*/if(null != paiement.getEcheance)/*201.90*/ {_display_(Seq[Any](format.raw/*201.92*/("""
                                                        """),_display_(/*202.58*/paiement/*202.66*/.getEcheance.format("dd-MM-yyyy")),format.raw/*202.99*/("""
                                                    """)))}),format.raw/*203.54*/("""</td>
                                                    <td>
                                                    """),_display_(/*205.54*/if(paiement.getDifferenceDate <= 0)/*205.89*/ {_display_(Seq[Any](format.raw/*205.91*/("""
                                                        """),format.raw/*206.57*/("""<strong style="color : red">"""),_display_(/*206.86*/paiement/*206.94*/.getDifferenceDate),format.raw/*206.112*/("""</strong>
                                                    """)))}/*207.55*/else/*207.60*/{_display_(Seq[Any](format.raw/*207.61*/("""
                                                        """),format.raw/*208.57*/("""<strong style="color : green">"""),_display_(/*208.88*/paiement/*208.96*/.getDifferenceDate),format.raw/*208.114*/("""</strong>
                                                    """)))}),format.raw/*209.54*/("""
                                                    """),format.raw/*210.53*/("""</td>
                                                    <th>
                                                        """),_display_(/*212.58*/if(paiement.getStatus.equals("Ouvert"))/*212.97*/ {_display_(Seq[Any](format.raw/*212.99*/("""
                                                            """),format.raw/*213.61*/("""<strong style="color : red"><a href="/facture-ventes/"""),_display_(/*213.115*/facture/*213.122*/.getId),format.raw/*213.128*/("""/paiements/"""),_display_(/*213.140*/paiement/*213.148*/.getId),format.raw/*213.154*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                        """)))}),format.raw/*214.58*/("""
                                                        """),_display_(/*215.58*/if(paiement.getStatus.equals("Fermé"))/*215.96*/ {_display_(Seq[Any](format.raw/*215.98*/("""
                                                            """),format.raw/*216.61*/("""<strong style="color : green">Traité</strong>
                                                        """)))}),format.raw/*217.58*/("""
                                                    """),format.raw/*218.53*/("""</th>
                                                    <td>
                                                        <a href="/facture-ventes/"""),_display_(/*220.83*/facture/*220.90*/.getId),format.raw/*220.96*/("""/paiements/"""),_display_(/*220.108*/paiement/*220.116*/.getId),format.raw/*220.122*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/facture-ventes/"""),_display_(/*223.83*/facture/*223.90*/.getId),format.raw/*223.96*/("""/paiements/"""),_display_(/*223.108*/paiement/*223.116*/.getId),format.raw/*223.122*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*226.46*/("""
                                            """),format.raw/*227.45*/("""</tbody>
                                            <tfoot>
                                                <tr class="active">
                                                    <th>TOTAL PAIEMENT</th>
                                                    <th></th>
                                                    <th class="text-right"><span class="number">"""),_display_(/*232.98*/facture/*232.105*/.getPaiement),format.raw/*232.117*/("""</span></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                """)))}),format.raw/*243.34*/("""
                            """),format.raw/*244.29*/("""</div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Ajouter un paiement</h3>
                                <form class="form-horizontal" method="post" action="/facture-ventes/"""),_display_(/*252.102*/facture/*252.109*/.getId),format.raw/*252.115*/("""/paiements">
                                    <div class="form-group">

                                        <div class="col-md-3">
                                            <select name="type" class="form-control">
                                                <option value="Avance">Avance</option>
                                                <option value="Partiel">Partiel</option>
                                                <option value="Total">Total</option>
                                            </select>
                                        </div>

                                        <div class="col-md-3">
                                            <input name="montant" type="number" min="0" class="form-control" placeholder="Montant" required="required">
                                        </div>


                                        <div class="col-md-3">
                                            <input name="echeance" type="text"  pattern="[0-9]"""),format.raw/*269.95*/("""{"""),format.raw/*269.96*/("""2"""),format.raw/*269.97*/("""}"""),format.raw/*269.98*/("""-[0-9]"""),format.raw/*269.104*/("""{"""),format.raw/*269.105*/("""2"""),format.raw/*269.106*/("""}"""),format.raw/*269.107*/("""-[0-9]"""),format.raw/*269.113*/("""{"""),format.raw/*269.114*/("""4"""),format.raw/*269.115*/("""}"""),format.raw/*269.116*/(""""  class="form-control" placeholder="écheance">
                                        </div>


                                        <div class="col-md-3">
                                            <input type="hidden" name="facture.id" value=""""),_display_(/*274.92*/facture/*274.99*/.getId),format.raw/*274.105*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Ajouter</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*290.6*/foot()),format.raw/*290.12*/("""

    """),format.raw/*292.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(facture:FactureVente,commandes:util.List[CommandeVente],paiements:util.List[PaiementVente],produits:util.List[Produit],dateActuelle:Date): play.twirl.api.HtmlFormat.Appendable = apply(facture,commandes,paiements,produits,dateActuelle)

  def f:((FactureVente,util.List[CommandeVente],util.List[PaiementVente],util.List[Produit],Date) => play.twirl.api.HtmlFormat.Appendable) = (facture,commandes,paiements,produits,dateActuelle) => apply(facture,commandes,paiements,produits,dateActuelle)

  def ref: this.type = this

}


}
}

/**/
object facture_vente extends facture_vente_Scope0.facture_vente_Scope1.facture_vente
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:14 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/facture_vente.scala.html
                  HASH: 0a1f978c0389283062bf907b8f5d6dec93655586
                  MATRIX: 894->19|1137->166|1165->168|1229->207|1255->213|1285->216|2146->1050|2173->1056|2216->1071|2686->1514|2725->1544|2765->1546|2826->1579|3071->1797|3085->1802|3119->1815|3180->1848|3247->1884|3304->1914|3345->1946|3385->1948|3446->1981|3691->2199|3705->2204|3741->2219|3808->2255|3861->2280|4204->2596|4220->2603|4269->2631|4302->2637|4367->2680|4497->2783|4513->2790|4551->2807|4679->2908|4719->2939|4759->2941|4828->2983|4844->2990|4898->3023|4968->3062|5120->3187|5136->3194|5168->3205|5328->3338|5344->3345|5377->3357|5513->3466|5584->3527|5625->3529|5694->3570|5743->3592|5807->3634|5883->3679|6024->3793|6040->3800|6078->3817|6212->3924|6228->3931|6255->3937|6664->4319|6697->4343|6737->4345|6802->4382|7834->5386|7877->5412|7918->5414|7992->5459|8093->5532|8111->5540|8151->5558|8278->5657|8297->5665|8332->5677|8466->5783|8485->5791|8516->5799|8650->5905|8669->5913|8703->5924|8875->6068|8892->6075|8920->6081|8961->6093|8980->6101|9009->6107|9343->6413|9360->6420|9388->6426|9429->6438|9448->6446|9477->6452|9844->6787|9914->6828|10341->7227|10359->7234|10393->7245|10757->7581|10774->7588|10802->7594|10842->7606|10859->7613|10910->7641|11160->7863|11177->7870|11228->7898|11457->8099|11474->8106|11502->8112|11542->8124|11559->8131|11612->8161|11869->8390|11886->8397|11939->8427|12358->8814|12416->8843|12834->9232|12852->9239|12881->9245|13203->9539|13244->9563|13285->9565|13363->9614|13407->9630|13424->9637|13452->9643|13483->9646|13500->9653|13529->9660|13559->9661|13590->9664|13608->9671|13644->9684|13731->9739|13805->9784|14310->10261|14327->10268|14356->10274|14971->10861|15005->10885|15046->10887|15112->10924|16321->12105|16364->12131|16405->12133|16483->12182|16588->12259|16630->12291|16671->12293|16757->12351|16775->12359|16830->12392|16916->12446|17007->12509|17025->12517|17055->12525|17186->12628|17205->12636|17239->12647|17337->12717|17379->12749|17420->12751|17506->12809|17524->12817|17579->12850|17665->12904|17809->13020|17854->13055|17895->13057|17981->13114|18038->13143|18056->13151|18097->13169|18180->13233|18194->13238|18234->13239|18320->13296|18379->13327|18397->13335|18438->13353|18533->13416|18615->13469|18763->13589|18812->13628|18853->13630|18943->13691|19026->13745|19044->13752|19073->13758|19114->13770|19133->13778|19162->13784|19397->13987|19483->14045|19531->14083|19572->14085|19662->14146|19797->14249|19879->14302|20052->14447|20069->14454|20097->14460|20138->14472|20157->14480|20186->14486|20532->14804|20549->14811|20577->14817|20618->14829|20637->14837|20666->14843|21045->15190|21119->15235|21511->15599|21529->15606|21564->15618|22322->16344|22380->16373|22799->16763|22817->16770|22846->16776|23883->17784|23913->17785|23943->17786|23973->17787|24009->17793|24040->17794|24071->17795|24102->17796|24138->17802|24169->17803|24200->17804|24231->17805|24510->18056|24527->18063|24556->18069|25165->18651|25193->18657|25227->18663
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|92->59|92->59|92->59|92->59|92->59|94->61|94->61|94->61|96->63|96->63|96->63|97->64|97->64|97->64|98->65|100->67|100->67|100->67|102->69|102->69|102->69|104->71|104->71|104->71|105->72|105->72|105->72|106->73|108->75|108->75|108->75|111->78|111->78|111->78|121->88|121->88|121->88|122->89|136->103|136->103|136->103|137->104|138->105|138->105|138->105|139->106|139->106|139->106|140->107|140->107|140->107|141->108|141->108|141->108|143->110|143->110|143->110|143->110|143->110|143->110|146->113|146->113|146->113|146->113|146->113|146->113|149->116|150->117|156->123|156->123|156->123|163->130|163->130|163->130|163->130|163->130|163->130|164->131|164->131|164->131|166->133|166->133|166->133|166->133|166->133|166->133|167->134|167->134|167->134|172->139|173->140|181->148|181->148|181->148|185->152|185->152|185->152|186->153|186->153|186->153|186->153|186->153|186->153|186->153|186->153|186->153|186->153|186->153|187->154|188->155|196->163|196->163|196->163|210->177|210->177|210->177|211->178|227->194|227->194|227->194|228->195|229->196|229->196|229->196|230->197|230->197|230->197|231->198|232->199|232->199|232->199|233->200|233->200|233->200|234->201|234->201|234->201|235->202|235->202|235->202|236->203|238->205|238->205|238->205|239->206|239->206|239->206|239->206|240->207|240->207|240->207|241->208|241->208|241->208|241->208|242->209|243->210|245->212|245->212|245->212|246->213|246->213|246->213|246->213|246->213|246->213|246->213|247->214|248->215|248->215|248->215|249->216|250->217|251->218|253->220|253->220|253->220|253->220|253->220|253->220|256->223|256->223|256->223|256->223|256->223|256->223|259->226|260->227|265->232|265->232|265->232|276->243|277->244|285->252|285->252|285->252|302->269|302->269|302->269|302->269|302->269|302->269|302->269|302->269|302->269|302->269|302->269|302->269|307->274|307->274|307->274|323->290|323->290|325->292
                  -- GENERATED --
              */
          