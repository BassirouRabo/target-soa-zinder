
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object facture_transport_Scope0 {
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

     object facture_transport_Scope1 {
import java.util

class facture_transport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[FactureTransport,util.List[CommandeTransport],util.List[PaiementTransport],util.List[Produit],util.List[Camion],Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(facture: FactureTransport, commandes: util.List[CommandeTransport], paiements: util.List[PaiementTransport], produits: util.List[Produit], camions: util.List[Camion], dateActuelle: Date):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.189*/("""

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
                            <dl>
                                <dt>RÉFÉRENCE PROFORMA</dt>
                                <dd>P"""),_display_(/*59.39*/facture/*59.46*/.getReferenceFactureProforma),format.raw/*59.74*/("""/SOA/"""),_display_(/*59.80*/(Long.valueOf(dateActuelle.format("yyyy")))),format.raw/*59.123*/("""</dd><br>
                                <dt>CLIENT</dt>
                                <dd>"""),_display_(/*61.38*/facture/*61.45*/.getClient.getNom),format.raw/*61.62*/("""</dd><br>
                                <dt>OBJET</dt>
                                <dd>"""),_display_(/*63.38*/facture/*63.45*/.getObjet),format.raw/*63.54*/("""</dd> <br>
                                <dt>DATE</dt>
                                <dd>"""),_display_(/*65.38*/if(null != facture.getWhenDone)/*65.69*/ {_display_(Seq[Any](format.raw/*65.71*/("""
                                    """),_display_(/*66.38*/facture/*66.45*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*66.78*/("""
                                """)))}),format.raw/*67.34*/("""</dd><br>
                                <dt>NET À PAYER</dt>
                                <dd><span class="number">"""),_display_(/*69.59*/if(facture.getClient.getNom.equals("SONIDEP"))/*69.105*/ {_display_(Seq[Any](format.raw/*69.107*/("""
                                    """),_display_(/*70.38*/facture/*70.45*/.getNetSonidep),format.raw/*70.59*/("""
                                """)))}/*71.35*/else/*71.40*/{_display_(Seq[Any](format.raw/*71.41*/("""
                                    """),_display_(/*72.38*/facture/*72.45*/.getNet),format.raw/*72.52*/("""
                                """)))}),format.raw/*73.34*/("""</span>
                                </dd> <br>
                                <dt>PAIEMENT</dt>
                                <dd><span class="number">"""),_display_(/*76.59*/facture/*76.66*/.getPaiement),format.raw/*76.78*/("""</span></dd> <br>
                                <dt>SOLDE</dt>
                                <dd>"""),_display_(/*78.38*/if(null != facture.getMontant && null != facture.getPaiement)/*78.99*/ {_display_(Seq[Any](format.raw/*78.101*/("""
                                    """),_display_(/*79.38*/if(facture.getClient.getNom.equals("SONIDEP"))/*79.84*/ {_display_(Seq[Any](format.raw/*79.86*/("""
                                        """),format.raw/*80.41*/("""<span class="number">"""),_display_(/*80.63*/(facture.getNetSonidep - facture.getPaiement)),format.raw/*80.108*/("""</span>
                                    """)))}/*81.39*/else/*81.44*/{_display_(Seq[Any](format.raw/*81.45*/("""
                                        """),format.raw/*82.41*/("""<span class="number">"""),_display_(/*82.63*/(facture.getNet - facture.getPaiement)),format.raw/*82.101*/("""</span>
                                    """)))}),format.raw/*83.38*/("""
                                """)))}),format.raw/*84.34*/("""</dd> <br>
                                <dt>MONTANT EN LETTRE</dt>
                                <dd>"""),_display_(/*86.38*/facture/*86.45*/.getMontantLettre),format.raw/*86.62*/("""</dd><br>

                            </dl>
                            <a href="/facture-transports/"""),_display_(/*89.59*/facture/*89.66*/.getId),format.raw/*89.72*/("""/edit" class="btn btn-info">Modifier</a>

                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-12">
                        <div class="white-box">
                            <h3 class="box-title m-b-0">Commandes</h3>
                            """),_display_(/*99.30*/if(commandes.size() > 0)/*99.54*/ {_display_(Seq[Any](format.raw/*99.56*/("""
                                """),format.raw/*100.33*/("""<input type="search" class="light-table-filter form-control" data-table="order-table-commande" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table-commande sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>DÉSIGNATION</th>
                                                <th>DATE</th>
                                                <th>CAMION</th>
                                                <th>QUANTITÉ</th>
                                                <th>P.U</th>
                                                <th>MONTANT</th>
                                                <th>DESTINATION</th>
                                                <th>MODIFIER</th>
                                                <th>SUPPRIMER</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*117.42*/for(commande <- commandes) yield /*117.68*/ {_display_(Seq[Any](format.raw/*117.70*/("""
                                            """),format.raw/*118.45*/("""<tr class="active">
                                                <td>"""),_display_(/*119.54*/commande/*119.62*/.getProduit.getNom),format.raw/*119.80*/("""</td>
                                                <td>"""),_display_(/*120.54*/if(null != commande.getDateCommande)/*120.90*/ {_display_(Seq[Any](format.raw/*120.92*/("""
                                                    """),_display_(/*121.54*/commande/*121.62*/.getDateCommande.format("dd-MM-yyyy")),format.raw/*121.99*/("""
                                                """)))}),format.raw/*122.50*/("""</td>
                                                <td>"""),_display_(/*123.54*/commande/*123.62*/.getCamion.getImmatriculation),format.raw/*123.91*/("""
                                                    """),format.raw/*124.53*/("""- """),_display_(/*124.56*/commande/*124.64*/.getCamion.getProprietaire.getNom),format.raw/*124.97*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*125.94*/commande/*125.102*/.getQuantite),format.raw/*125.114*/("""</span></td>
                                                <td class="text-right"><span class="number">"""),_display_(/*126.94*/commande/*126.102*/.getPrix),format.raw/*126.110*/("""</span></td>
                                                <td class="text-right"><span class="number">"""),_display_(/*127.94*/commande/*127.102*/.getMontant),format.raw/*127.113*/("""</span></td>
                                                <td>"""),_display_(/*128.54*/commande/*128.62*/.getDestination),format.raw/*128.77*/("""</td>
                                                <td>
                                                    <a href="/facture-transports/"""),_display_(/*130.83*/facture/*130.90*/.getId),format.raw/*130.96*/("""/commandes/"""),_display_(/*130.108*/commande/*130.116*/.getId),format.raw/*130.122*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>
                                                <td>
                                                    <a href="/facture-transports/"""),_display_(/*133.83*/facture/*133.90*/.getId),format.raw/*133.96*/("""/commandes/"""),_display_(/*133.108*/commande/*133.116*/.getId),format.raw/*133.122*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*136.42*/("""
                                        """),format.raw/*137.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th>TOTAL</th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*145.94*/facture/*145.101*/.getMontant),format.raw/*145.112*/("""</span></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                            <tr class="active">
                                                <th>RETENUE BIC 2 %</th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*156.94*/facture/*156.101*/.getRetenueBic),format.raw/*156.115*/("""</span></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                            <tr class="active">
                                                <th> """),_display_(/*162.55*/if(facture.getClient.getNom.equals("SONIDEP"))/*162.101*/ {_display_(Seq[Any](format.raw/*162.103*/("""
                                                    """),format.raw/*163.53*/("""NET
                                                """)))}/*164.51*/else/*164.56*/{_display_(Seq[Any](format.raw/*164.57*/("""
                                                    """),format.raw/*165.53*/("""NET À PAYER
                                                """)))}),format.raw/*166.50*/("""</th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*171.94*/facture/*171.101*/.getNet),format.raw/*171.108*/("""</span></th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                            """),_display_(/*176.46*/if(facture.getClient.getNom.equals("SONIDEP"))/*176.92*/ {_display_(Seq[Any](format.raw/*176.94*/("""
                                                """),format.raw/*177.49*/("""<tr class="active">
                                                    <th>RETENUE SONIDEP</th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    """),_display_(/*183.54*/if(facture.getRetenueSonidep == 0)/*183.88*/ {_display_(Seq[Any](format.raw/*183.90*/("""
                                                        """),format.raw/*184.57*/("""<th>
                                                        <form class="form-horizontal" method="post" action="/facture-transports/"""),_display_(/*185.130*/facture/*185.137*/.getId),format.raw/*185.143*/("""/update">
                                                            <input type="number" name="retenueSonidep" placeholder="0" min="0" class="form-control">

                                                            <input type="hidden" name="client.id" value=""""),_display_(/*188.107*/facture/*188.114*/.getClient.getId),format.raw/*188.130*/("""">
                                                            <input type="hidden" name="id" value=""""),_display_(/*189.100*/facture/*189.107*/.getId),format.raw/*189.113*/("""">
                                                            <input type="hidden" name="objet" value=""""),_display_(/*190.103*/facture/*190.110*/.getObjet),format.raw/*190.119*/("""">
                                                            <input type="hidden" name="retenueBic" value=""""),_display_(/*191.108*/facture/*191.115*/.getRetenueBic),format.raw/*191.129*/("""">
                                                            <input type="hidden" name="referenceFactureProforma" value=""""),_display_(/*192.122*/facture/*192.129*/.getReferenceFactureProforma),format.raw/*192.157*/("""">
                                                            <input type="hidden" name="referenceFactureDefinitive" value=""""),_display_(/*193.124*/facture/*193.131*/.getReferenceFactureDefinitive),format.raw/*193.161*/("""">
                                                            <input type="hidden" name="montant" value=""""),_display_(/*194.105*/facture/*194.112*/.getMontant),format.raw/*194.123*/("""">
                                                            <input type="hidden" name="net" value=""""),_display_(/*195.101*/facture/*195.108*/.getNet),format.raw/*195.115*/("""">
                                                            <input type="hidden" name="netSonidep" value=""""),_display_(/*196.108*/facture/*196.115*/.getNetSonidep),format.raw/*196.129*/("""">
                                                            <input type="hidden" name="paiement" value=""""),_display_(/*197.106*/facture/*197.113*/.getPaiement),format.raw/*197.125*/("""">
                                                            <input type="hidden" name="montantLettre" value=""""),_display_(/*198.111*/facture/*198.118*/.getMontantLettre),format.raw/*198.135*/("""">

                                                            <button type="submit" class="btn btn-info btn-outline"><i class="fa fa-pencil"></i></button>
                                                        </form>
                                                        </th>
                                                    """)))}/*203.55*/else/*203.60*/{_display_(Seq[Any](format.raw/*203.61*/("""
                                                        """),format.raw/*204.57*/("""<th class="text-right"><span class="number">"""),_display_(/*204.102*/facture/*204.109*/.getRetenueSonidep),format.raw/*204.127*/("""</span></th>
                                                    """)))}),format.raw/*205.54*/("""
                                                    """),format.raw/*206.53*/("""<th></th>
                                                    <th></th>
                                                    <th></th>
                                                </tr>
                                                <tr class="active">
                                                    <th>NET À PAYER</th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th class="text-right"><span class="number">"""),_display_(/*216.98*/facture/*216.105*/.getNetSonidep),format.raw/*216.119*/("""</span></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                </tr>
                                            """)))}),format.raw/*221.46*/("""
                                        """),format.raw/*222.41*/("""</tfoot>
                                    </table>
                                    """),_display_(/*224.38*/if(facture.getClient.getNom.equals("SONIDEP"))/*224.84*/ {_display_(Seq[Any](format.raw/*224.86*/("""
                                        """),format.raw/*225.41*/("""<a href="/facture-transports/"""),_display_(/*225.71*/facture/*225.78*/.getId),format.raw/*225.84*/("""/reference/"""),_display_(/*225.96*/facture/*225.103*/.getReferenceFactureProforma),format.raw/*225.131*/("""/generate/proforma-sonidep" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer"> Générer facture proforma </a>
                                        <a href="/rapport/download/Facture-Transport-Proforma-Sonidep/"""),_display_(/*226.104*/facture/*226.111*/.getReferenceFactureProforma),format.raw/*226.139*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>

                                        <a href="/facture-transports/"""),_display_(/*228.71*/facture/*228.78*/.getId),format.raw/*228.84*/("""/reference/"""),_display_(/*228.96*/facture/*228.103*/.getReferenceFactureDefinitive),format.raw/*228.133*/("""/generate/definitive-sonidep" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer">Générer facture définitive  </a>
                                        <a href="/rapport/download/Facture-Transport-Definitive-Sonidep/"""),_display_(/*229.106*/facture/*229.113*/.getReferenceFactureDefinitive),format.raw/*229.143*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>


                                    """)))}/*232.39*/else/*232.44*/{_display_(Seq[Any](format.raw/*232.45*/("""
                                        """),format.raw/*233.41*/("""<a href="/facture-transports/"""),_display_(/*233.71*/facture/*233.78*/.getId),format.raw/*233.84*/("""/reference/"""),_display_(/*233.96*/facture/*233.103*/.getReferenceFactureProforma),format.raw/*233.131*/("""/generate/proforma" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer">Générer facture proforma </a>
                                        <a href="/rapport/download/Facture-Transport-Proforma/"""),_display_(/*234.96*/facture/*234.103*/.getReferenceFactureProforma),format.raw/*234.131*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>

                                        <a href="/facture-transports/"""),_display_(/*236.71*/facture/*236.78*/.getId),format.raw/*236.84*/("""/reference/"""),_display_(/*236.96*/facture/*236.103*/.getReferenceFactureDefinitive),format.raw/*236.133*/("""/generate/definitive" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer">Générer facture définitive  </a>
                                        <a href="/rapport/download/Facture-Transport-Definitive/"""),_display_(/*237.98*/facture/*237.105*/.getReferenceFactureDefinitive),format.raw/*237.135*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>
                                    """)))}),format.raw/*238.38*/("""

                                    """),format.raw/*240.37*/("""<br><br><button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>

                                </div>
                            """)))}),format.raw/*243.30*/("""
                        """),format.raw/*244.25*/("""</div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-12">
                        <div class="white-box">
                            <h3 class="box-title m-b-0">Ajouter un produit</h3>
                            <form class="form-horizontal" method="post" action="/facture-transports/"""),_display_(/*252.102*/facture/*252.109*/.getId),format.raw/*252.115*/("""/commandes">
                                <div class="form-group">
                                    <div class="col-md-6">
                                        <select name="produit.id" class="form-control" required="required">
                                        """),_display_(/*256.42*/for(produit <- produits) yield /*256.66*/ {_display_(Seq[Any](format.raw/*256.68*/("""
                                            """),format.raw/*257.45*/("""<option value=""""),_display_(/*257.61*/produit/*257.68*/.getId),format.raw/*257.74*/("""">"""),_display_(/*257.77*/produit/*257.84*/.getNom),format.raw/*257.91*/("""</option>
                                        """)))}),format.raw/*258.42*/("""
                                        """),format.raw/*259.41*/("""</select>
                                    </div>
                                    <div class="col-md-6">
                                        <select name="camion.id" class="form-control" required="required">
                                        """),_display_(/*263.42*/for(camion <- camions) yield /*263.64*/ {_display_(Seq[Any](format.raw/*263.66*/("""
                                            """),format.raw/*264.45*/("""<option value=""""),_display_(/*264.61*/camion/*264.67*/.getId),format.raw/*264.73*/("""">"""),_display_(/*264.76*/camion/*264.82*/.getImmatriculation),format.raw/*264.101*/("""
                                                """),format.raw/*265.49*/("""- """),_display_(/*265.52*/camion/*265.58*/.getProprietaire.getNom),format.raw/*265.81*/("""</option>
                                        """)))}),format.raw/*266.42*/("""
                                        """),format.raw/*267.41*/("""</select>
                                    </div>
                                </div>
                                <div class="form-group">

                                    <div class="col-md-6">
                                        <input name="destination" type="text" class="form-control" placeholder="Destination" required="required">
                                    </div>
                                    <div class="col-md-6">
                                        <input name="quantite" type="number" min="0" class="form-control" placeholder="Quantité" required="required">
                                    </div>

                                </div>
                                <div class="form-group">

                                    <div class="col-md-6">
                                        <input name="dateCommande" type="text"  pattern="[0-9]"""),format.raw/*283.95*/("""{"""),format.raw/*283.96*/("""2"""),format.raw/*283.97*/("""}"""),format.raw/*283.98*/("""-[0-9]"""),format.raw/*283.104*/("""{"""),format.raw/*283.105*/("""2"""),format.raw/*283.106*/("""}"""),format.raw/*283.107*/("""-[0-9]"""),format.raw/*283.113*/("""{"""),format.raw/*283.114*/("""4"""),format.raw/*283.115*/("""}"""),format.raw/*283.116*/(""""  class="form-control" placeholder="Date" required="required">
                                    </div>

                                    <div class="col-md-6">
                                        <input name="referenceBonLivraison" type="text" class="form-control" placeholder="BL" required="required">
                                    </div>
                                </div>
                                <div class="form-group">

                                    <div class="col-md-2">
                                        <input type="hidden" name="facture.id" value=""""),_display_(/*293.88*/facture/*293.95*/.getId),format.raw/*293.101*/("""">
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
                            """),_display_(/*307.30*/if(paiements.size() > 0)/*307.54*/ {_display_(Seq[Any](format.raw/*307.56*/("""
                                """),format.raw/*308.33*/("""<input type="search" class="light-table-filter form-control" data-table="order-table-paiement" placeholder="Recherche">
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
                                        """),_display_(/*324.42*/for(paiement <- paiements) yield /*324.68*/ {_display_(Seq[Any](format.raw/*324.70*/("""
                                            """),format.raw/*325.45*/("""<tr class="active">
                                                <td>"""),_display_(/*326.54*/if(null != paiement.getWhenDone)/*326.86*/ {_display_(Seq[Any](format.raw/*326.88*/("""
                                                    """),_display_(/*327.54*/paiement/*327.62*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*327.95*/("""
                                                """)))}),format.raw/*328.50*/("""</td>
                                                <td>"""),_display_(/*329.54*/paiement/*329.62*/.getType),format.raw/*329.70*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*330.94*/paiement/*330.102*/.getMontant),format.raw/*330.113*/("""</span></td>
                                                <td>"""),_display_(/*331.54*/if(null != paiement.getEcheance)/*331.86*/ {_display_(Seq[Any](format.raw/*331.88*/("""
                                                    """),_display_(/*332.54*/paiement/*332.62*/.getEcheance.format("dd-MM-yyyy")),format.raw/*332.95*/("""
                                                """)))}),format.raw/*333.50*/("""</td>
                                                <td>
                                                    """),_display_(/*335.54*/if(paiement.getDifferenceDate <= 0)/*335.89*/ {_display_(Seq[Any](format.raw/*335.91*/("""
                                                        """),format.raw/*336.57*/("""<strong style="color : red">"""),_display_(/*336.86*/paiement/*336.94*/.getDifferenceDate),format.raw/*336.112*/("""</strong>
                                                    """)))}/*337.55*/else/*337.60*/{_display_(Seq[Any](format.raw/*337.61*/("""
                                                        """),format.raw/*338.57*/("""<strong style="color : green">"""),_display_(/*338.88*/paiement/*338.96*/.getDifferenceDate),format.raw/*338.114*/("""</strong>
                                                    """)))}),format.raw/*339.54*/("""
                                                """),format.raw/*340.49*/("""</td>
                                                <th>
                                                    """),_display_(/*342.54*/if(paiement.getStatus.equals("Ouvert"))/*342.93*/ {_display_(Seq[Any](format.raw/*342.95*/("""
                                                        """),format.raw/*343.57*/("""<strong style="color : red"><a href="/facture-transports/"""),_display_(/*343.115*/facture/*343.122*/.getId),format.raw/*343.128*/("""/paiements/"""),_display_(/*343.140*/paiement/*343.148*/.getId),format.raw/*343.154*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                    """)))}),format.raw/*344.54*/("""
                                                    """),_display_(/*345.54*/if(paiement.getStatus.equals("Fermé"))/*345.92*/ {_display_(Seq[Any](format.raw/*345.94*/("""
                                                        """),format.raw/*346.57*/("""<strong style="color : green">Traité</strong>
                                                    """)))}),format.raw/*347.54*/("""
                                                """),format.raw/*348.49*/("""</th>
                                                <td>
                                                    <a href="/facture-transports/"""),_display_(/*350.83*/facture/*350.90*/.getId),format.raw/*350.96*/("""/paiements/"""),_display_(/*350.108*/paiement/*350.116*/.getId),format.raw/*350.122*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>
                                                <td>
                                                    <a href="/facture-transports/"""),_display_(/*353.83*/facture/*353.90*/.getId),format.raw/*353.96*/("""/paiements/"""),_display_(/*353.108*/paiement/*353.116*/.getId),format.raw/*353.122*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                </td>

                                            </tr>
                                        """)))}),format.raw/*357.42*/("""
                                        """),format.raw/*358.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th>TOTAL PAIEMENT</th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*363.94*/facture/*363.101*/.getPaiement),format.raw/*363.113*/("""</span></th>
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
                            """)))}),format.raw/*374.30*/("""
                        """),format.raw/*375.25*/("""</div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-12">
                        <div class="white-box">
                            <h3 class="box-title m-b-0">Ajouter un paiement</h3>
                            <form class="form-horizontal" method="post" action="/facture-transports/"""),_display_(/*383.102*/facture/*383.109*/.getId),format.raw/*383.115*/("""/paiements">
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
                                        <input name="echeance" type="text" pattern="[0-9]"""),format.raw/*400.90*/("""{"""),format.raw/*400.91*/("""2"""),format.raw/*400.92*/("""}"""),format.raw/*400.93*/("""-[0-9]"""),format.raw/*400.99*/("""{"""),format.raw/*400.100*/("""2"""),format.raw/*400.101*/("""}"""),format.raw/*400.102*/("""-[0-9]"""),format.raw/*400.108*/("""{"""),format.raw/*400.109*/("""4"""),format.raw/*400.110*/("""}"""),format.raw/*400.111*/(""""  class="form-control" placeholder="écheance">
                                    </div>


                                    <div class="col-md-3">
                                        <input type="hidden" name="facture.id" value=""""),_display_(/*405.88*/facture/*405.95*/.getId),format.raw/*405.101*/("""">
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

    """),_display_(/*421.6*/foot()),format.raw/*421.12*/("""

"""),format.raw/*423.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(facture:FactureTransport,commandes:util.List[CommandeTransport],paiements:util.List[PaiementTransport],produits:util.List[Produit],camions:util.List[Camion],dateActuelle:Date): play.twirl.api.HtmlFormat.Appendable = apply(facture,commandes,paiements,produits,camions,dateActuelle)

  def f:((FactureTransport,util.List[CommandeTransport],util.List[PaiementTransport],util.List[Produit],util.List[Camion],Date) => play.twirl.api.HtmlFormat.Appendable) = (facture,commandes,paiements,produits,camions,dateActuelle) => apply(facture,commandes,paiements,produits,camions,dateActuelle)

  def ref: this.type = this

}


}
}

/**/
object facture_transport extends facture_transport_Scope0.facture_transport_Scope1.facture_transport
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:44 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/facture_transport.scala.html
                  HASH: ba89fbac27fb562bfde24953afbda64e01fce45f
                  MATRIX: 936->19|1219->206|1247->208|1311->247|1337->253|1367->256|2172->1034|2199->1040|2237->1051|2675->1462|2714->1492|2754->1494|2811->1523|3048->1733|3062->1738|3096->1751|3153->1780|3216->1812|3269->1838|3310->1870|3350->1872|3407->1901|3644->2111|3658->2116|3694->2131|3757->2163|3806->2184|4121->2472|4137->2479|4186->2507|4219->2513|4284->2556|4406->2651|4422->2658|4460->2675|4581->2769|4597->2776|4627->2785|4748->2879|4788->2910|4828->2912|4893->2950|4909->2957|4963->2990|5028->3024|5176->3145|5232->3191|5273->3193|5338->3231|5354->3238|5389->3252|5442->3287|5455->3292|5494->3293|5559->3331|5575->3338|5603->3345|5668->3379|5854->3538|5870->3545|5903->3557|6032->3659|6102->3720|6143->3722|6208->3760|6263->3806|6303->3808|6372->3849|6421->3871|6488->3916|6552->3962|6565->3967|6604->3968|6673->4009|6722->4031|6782->4069|6858->4114|6923->4148|7057->4255|7073->4262|7111->4279|7241->4382|7257->4389|7284->4395|7661->4745|7694->4769|7734->4771|7796->4804|9015->5995|9058->6021|9099->6023|9173->6068|9274->6141|9292->6149|9332->6167|9419->6226|9465->6262|9506->6264|9588->6318|9606->6326|9665->6363|9747->6413|9834->6472|9852->6480|9903->6509|9985->6562|10016->6565|10034->6573|10089->6606|10216->6705|10235->6713|10270->6725|10404->6831|10423->6839|10454->6847|10588->6953|10607->6961|10641->6972|10735->7038|10753->7046|10790->7061|10959->7202|10976->7209|11004->7215|11045->7227|11064->7235|11093->7241|11431->7551|11448->7558|11476->7564|11517->7576|11536->7584|11565->7590|11932->7925|12002->7966|12539->8475|12557->8482|12591->8493|13318->9192|13336->9199|13373->9213|13756->9568|13813->9614|13855->9616|13937->9669|14010->9723|14024->9728|14064->9729|14146->9782|14239->9843|14598->10174|14616->10181|14646->10188|14956->10470|15012->10516|15053->10518|15131->10567|15557->10965|15601->10999|15642->11001|15728->11058|15891->11192|15909->11199|15938->11205|16233->11471|16251->11478|16290->11494|16421->11596|16439->11603|16468->11609|16602->11714|16620->11721|16652->11730|16791->11840|16809->11847|16846->11861|16999->11985|17017->11992|17068->12020|17223->12146|17241->12153|17294->12183|17430->12290|17448->12297|17482->12308|17614->12411|17632->12418|17662->12425|17801->12535|17819->12542|17856->12556|17993->12664|18011->12671|18046->12683|18188->12796|18206->12803|18246->12820|18602->13157|18616->13162|18656->13163|18742->13220|18816->13265|18834->13272|18875->13290|18973->13356|19055->13409|19757->14083|19775->14090|19812->14104|20142->14402|20212->14443|20331->14534|20387->14580|20428->14582|20498->14623|20556->14653|20573->14660|20601->14666|20641->14678|20659->14685|20710->14713|20986->14960|21004->14967|21055->14995|21292->15204|21309->15211|21337->15217|21377->15229|21395->15236|21448->15266|21730->15519|21748->15526|21801->15556|21998->15734|22012->15739|22052->15740|22122->15781|22180->15811|22197->15818|22225->15824|22265->15836|22283->15843|22334->15871|22592->16101|22610->16108|22661->16136|22898->16345|22915->16352|22943->16358|22983->16370|23001->16377|23054->16407|23319->16644|23337->16651|23390->16681|23597->16856|23664->16894|23904->17102|23958->17127|24352->17492|24370->17499|24399->17505|24705->17783|24746->17807|24787->17809|24861->17854|24905->17870|24922->17877|24950->17883|24981->17886|24998->17893|25027->17900|25110->17951|25180->17992|25468->18252|25507->18274|25548->18276|25622->18321|25666->18337|25682->18343|25710->18349|25741->18352|25757->18358|25799->18377|25877->18426|25908->18429|25924->18435|25969->18458|26052->18509|26122->18550|27052->19451|27082->19452|27112->19453|27142->19454|27178->19460|27209->19461|27240->19462|27271->19463|27307->19469|27338->19470|27369->19471|27400->19472|28028->20072|28045->20079|28074->20085|28641->20624|28675->20648|28716->20650|28778->20683|29923->21800|29966->21826|30007->21828|30081->21873|30182->21946|30224->21978|30265->21980|30347->22034|30365->22042|30420->22075|30502->22125|30589->22184|30607->22192|30637->22200|30764->22299|30783->22307|30817->22318|30911->22384|30953->22416|30994->22418|31076->22472|31094->22480|31149->22513|31231->22563|31371->22675|31416->22710|31457->22712|31543->22769|31600->22798|31618->22806|31659->22824|31742->22888|31756->22893|31796->22894|31882->22951|31941->22982|31959->22990|32000->23008|32095->23071|32173->23120|32313->23232|32362->23271|32403->23273|32489->23330|32576->23388|32594->23395|32623->23401|32664->23413|32683->23421|32712->23427|32943->23626|33025->23680|33073->23718|33114->23720|33200->23777|33331->23876|33409->23925|33578->24066|33595->24073|33623->24079|33664->24091|33683->24099|33712->24105|34050->24415|34067->24422|34095->24428|34136->24440|34155->24448|34184->24454|34552->24790|34622->24831|34994->25175|35012->25182|35047->25194|35761->25876|35815->25901|36210->26267|36228->26274|36257->26280|37241->27235|37271->27236|37301->27237|37331->27238|37366->27244|37397->27245|37428->27246|37459->27247|37495->27253|37526->27254|37557->27255|37588->27256|37855->27495|37872->27502|37901->27508|38462->28042|38490->28048|38520->28050
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|92->59|92->59|92->59|92->59|92->59|94->61|94->61|94->61|96->63|96->63|96->63|98->65|98->65|98->65|99->66|99->66|99->66|100->67|102->69|102->69|102->69|103->70|103->70|103->70|104->71|104->71|104->71|105->72|105->72|105->72|106->73|109->76|109->76|109->76|111->78|111->78|111->78|112->79|112->79|112->79|113->80|113->80|113->80|114->81|114->81|114->81|115->82|115->82|115->82|116->83|117->84|119->86|119->86|119->86|122->89|122->89|122->89|132->99|132->99|132->99|133->100|150->117|150->117|150->117|151->118|152->119|152->119|152->119|153->120|153->120|153->120|154->121|154->121|154->121|155->122|156->123|156->123|156->123|157->124|157->124|157->124|157->124|158->125|158->125|158->125|159->126|159->126|159->126|160->127|160->127|160->127|161->128|161->128|161->128|163->130|163->130|163->130|163->130|163->130|163->130|166->133|166->133|166->133|166->133|166->133|166->133|169->136|170->137|178->145|178->145|178->145|189->156|189->156|189->156|195->162|195->162|195->162|196->163|197->164|197->164|197->164|198->165|199->166|204->171|204->171|204->171|209->176|209->176|209->176|210->177|216->183|216->183|216->183|217->184|218->185|218->185|218->185|221->188|221->188|221->188|222->189|222->189|222->189|223->190|223->190|223->190|224->191|224->191|224->191|225->192|225->192|225->192|226->193|226->193|226->193|227->194|227->194|227->194|228->195|228->195|228->195|229->196|229->196|229->196|230->197|230->197|230->197|231->198|231->198|231->198|236->203|236->203|236->203|237->204|237->204|237->204|237->204|238->205|239->206|249->216|249->216|249->216|254->221|255->222|257->224|257->224|257->224|258->225|258->225|258->225|258->225|258->225|258->225|258->225|259->226|259->226|259->226|261->228|261->228|261->228|261->228|261->228|261->228|262->229|262->229|262->229|265->232|265->232|265->232|266->233|266->233|266->233|266->233|266->233|266->233|266->233|267->234|267->234|267->234|269->236|269->236|269->236|269->236|269->236|269->236|270->237|270->237|270->237|271->238|273->240|276->243|277->244|285->252|285->252|285->252|289->256|289->256|289->256|290->257|290->257|290->257|290->257|290->257|290->257|290->257|291->258|292->259|296->263|296->263|296->263|297->264|297->264|297->264|297->264|297->264|297->264|297->264|298->265|298->265|298->265|298->265|299->266|300->267|316->283|316->283|316->283|316->283|316->283|316->283|316->283|316->283|316->283|316->283|316->283|316->283|326->293|326->293|326->293|340->307|340->307|340->307|341->308|357->324|357->324|357->324|358->325|359->326|359->326|359->326|360->327|360->327|360->327|361->328|362->329|362->329|362->329|363->330|363->330|363->330|364->331|364->331|364->331|365->332|365->332|365->332|366->333|368->335|368->335|368->335|369->336|369->336|369->336|369->336|370->337|370->337|370->337|371->338|371->338|371->338|371->338|372->339|373->340|375->342|375->342|375->342|376->343|376->343|376->343|376->343|376->343|376->343|376->343|377->344|378->345|378->345|378->345|379->346|380->347|381->348|383->350|383->350|383->350|383->350|383->350|383->350|386->353|386->353|386->353|386->353|386->353|386->353|390->357|391->358|396->363|396->363|396->363|407->374|408->375|416->383|416->383|416->383|433->400|433->400|433->400|433->400|433->400|433->400|433->400|433->400|433->400|433->400|433->400|433->400|438->405|438->405|438->405|454->421|454->421|456->423
                  -- GENERATED --
              */
          