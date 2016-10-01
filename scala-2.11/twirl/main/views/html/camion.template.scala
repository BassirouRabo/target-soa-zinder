
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object camion_Scope0 {
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

     object camion_Scope1 {
import java.util

class camion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Camion,util.List[Taf],util.List[Taf],util.List[CommandeTransport],util.List[CommandeTransport],Long,Long,util.List[Proprietaire],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(camion: Camion,  tafs: util.List[Taf], tafsMonth: util.List[Taf], commandes: util.List[CommandeTransport], commandesMonth: util.List[CommandeTransport],
        totalTafMonth: Long, totalCommandeTransportMonth: Long, proprietaires: util.List[Proprietaire]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.104*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*8.6*/head()),format.raw/*8.12*/("""


"""),format.raw/*11.1*/("""<body class="fix-sidebar">
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


            """),_display_(/*28.14*/menu()),format.raw/*28.20*/("""


            """),format.raw/*31.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Camion """),_display_(/*35.60*/camion/*35.66*/.getImmatriculation),format.raw/*35.85*/("""</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*41.30*/if(flash.containsKey("error"))/*41.60*/ {_display_(Seq[Any](format.raw/*41.62*/("""
                                """),format.raw/*42.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*44.38*/flash/*44.43*/.get("error")),format.raw/*44.56*/("""
                                """),format.raw/*45.33*/("""</div>
                            """)))}),format.raw/*46.30*/("""
                            """),_display_(/*47.30*/if(flash.containsKey("success"))/*47.62*/ {_display_(Seq[Any](format.raw/*47.64*/("""
                                """),format.raw/*48.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*50.38*/flash/*50.43*/.get("success")),format.raw/*50.58*/("""</div>
                            """)))}),format.raw/*51.30*/("""
                        """),format.raw/*52.25*/("""</div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Modifier un camion</h3>
                                <form class="form-horizontal" method="post" action="/camions/"""),_display_(/*59.95*/camion/*59.101*/.getId),format.raw/*59.107*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="immatriculation" type="text" class="form-control" value=""""),_display_(/*62.116*/camion/*62.122*/.getImmatriculation),format.raw/*62.141*/("""" required="required" placeholder="Immatriculation">
                                        </div>

                                        <div class="col-md-6">
                                            <select name="proprietaire.id" class="form-control" required="required">
                                            """),_display_(/*67.46*/for(proprietaire <- proprietaires) yield /*67.80*/ {_display_(Seq[Any](format.raw/*67.82*/("""
                                               """),_display_(/*68.49*/if(proprietaire == camion.getProprietaire)/*68.91*/ {_display_(Seq[Any](format.raw/*68.93*/("""
                                                   """),format.raw/*69.52*/("""<option value=""""),_display_(/*69.68*/proprietaire/*69.80*/.getId),format.raw/*69.86*/("""" selected="selected">"""),_display_(/*69.109*/proprietaire/*69.121*/.getNom),format.raw/*69.128*/("""</option>
                                               """)))}/*70.50*/else/*70.55*/{_display_(Seq[Any](format.raw/*70.56*/("""
                                                   """),format.raw/*71.52*/("""<option value=""""),_display_(/*71.68*/proprietaire/*71.80*/.getId),format.raw/*71.86*/("""">"""),_display_(/*71.89*/proprietaire/*71.101*/.getNom),format.raw/*71.108*/("""</option>
                                               """)))}),format.raw/*72.49*/("""
                                            """)))}),format.raw/*73.46*/("""
                                            """),format.raw/*74.45*/("""</select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <textarea name="numeroCarteGrise" class="form-control" rows="5" placeholder="Numéro carte grise">"""),_display_(/*80.143*/camion/*80.149*/.getNumeroCarteGrise),format.raw/*80.169*/("""</textarea>
                                        </div>

                                        <div class="col-md-6">
                                            <textarea name="caracteristique" class="form-control" rows="5" placeholder="Caractéristiques">"""),_display_(/*84.140*/camion/*84.146*/.getCaracteristique),format.raw/*84.165*/("""</textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*90.84*/camion/*90.90*/.getId),format.raw/*90.96*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Modifer</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                        <div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">T.A.F DU MOIS</h3>
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>CAMION</th>
                                                    <th>PROPRIETAIRE</th>
                                                    <th>TAF</th>
                                                    <th>OBSERVATION</th>
                                                    <th>MONTANT</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*118.46*/for(taf <- tafs) yield /*118.62*/ {_display_(Seq[Any](format.raw/*118.64*/("""
                                                """),format.raw/*119.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*120.58*/if(null != taf.getReparation.getWhenDone)/*120.99*/ {_display_(Seq[Any](format.raw/*120.101*/("""
                                                        """),_display_(/*121.58*/taf/*121.61*/.getReparation.getWhenDone.format("dd-MM-yyyy")),format.raw/*121.108*/("""
                                                    """)))}),format.raw/*122.54*/("""</th>
                                                    <td>"""),_display_(/*123.58*/taf/*123.61*/.getReparation.getCamion.getImmatriculation),format.raw/*123.104*/("""</td>
                                                    <td>"""),_display_(/*124.58*/taf/*124.61*/.getReparation.getCamion.getProprietaire.getNom),format.raw/*124.108*/("""</td>
                                                    <td>"""),_display_(/*125.58*/taf/*125.61*/.getTravail),format.raw/*125.72*/("""</td>
                                                    <td>"""),_display_(/*126.58*/taf/*126.61*/.getObservation),format.raw/*126.76*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*127.98*/taf/*127.101*/.getMontant),format.raw/*127.112*/("""</span></td>
                                                </tr>
                                            """)))}),format.raw/*129.46*/("""
                                            """),format.raw/*130.45*/("""</tbody>
                                            <foot>
                                                <tr class="active">
                                                    <th>TOTAL</th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th class="text-right"><span class="number">"""),_display_(/*138.98*/totalTafMonth),format.raw/*138.111*/("""</span></th>
                                                </tr>
                                            </foot>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>


                    """),_display_(/*148.22*/if(tafs.size() > 0)/*148.41*/ {_display_(Seq[Any](format.raw/*148.43*/("""

                        """),format.raw/*150.25*/("""<div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">T.A.F</h3>
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>DATE</th>
                                                <th>CAMION</th>
                                                <th>PROPRIETAIRE</th>
                                                <th>TAF</th>
                                                <th>OBSERVATION</th>
                                                <th>MONTANT</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*168.42*/for(taf <- tafs) yield /*168.58*/ {_display_(Seq[Any](format.raw/*168.60*/("""
                                            """),format.raw/*169.45*/("""<tr class="active">
                                                <th>"""),_display_(/*170.54*/if(null != taf.getReparation.getWhenDone)/*170.95*/ {_display_(Seq[Any](format.raw/*170.97*/("""
                                                    """),_display_(/*171.54*/taf/*171.57*/.getReparation.getWhenDone.format("dd-MM-yyyy")),format.raw/*171.104*/("""
                                                """)))}),format.raw/*172.50*/("""</th>
                                                <td>"""),_display_(/*173.54*/taf/*173.57*/.getReparation.getCamion.getImmatriculation),format.raw/*173.100*/("""</td>
                                                <td>"""),_display_(/*174.54*/taf/*174.57*/.getReparation.getCamion.getProprietaire),format.raw/*174.97*/("""</td>
                                                <td>"""),_display_(/*175.54*/taf/*175.57*/.getTravail),format.raw/*175.68*/("""</td>
                                                <td>"""),_display_(/*176.54*/taf/*176.57*/.getObservation),format.raw/*176.72*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*177.94*/taf/*177.97*/.getMontant),format.raw/*177.108*/("""</span></td>
                                            </tr>
                                        """)))}),format.raw/*179.42*/("""
                                        """),format.raw/*180.41*/("""</tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    """)))}),format.raw/*186.22*/("""

                        """),format.raw/*188.25*/("""<div class="row">
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
                                            """),_display_(/*208.46*/for(commande <- commandes) yield /*208.72*/ {_display_(Seq[Any](format.raw/*208.74*/("""
                                                """),format.raw/*209.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*210.58*/if(null != commande.getDateCommande)/*210.94*/ {_display_(Seq[Any](format.raw/*210.96*/("""
                                                        """),_display_(/*211.58*/commande/*211.66*/.getDateCommande.format("dd-MM-yyyy")),format.raw/*211.103*/("""
                                                    """)))}),format.raw/*212.54*/("""</th>
                                                    <td>"""),_display_(/*213.58*/commande/*213.66*/.getCamion.getImmatriculation),format.raw/*213.95*/("""</td>
                                                    <td>"""),_display_(/*214.58*/commande/*214.66*/.getCamion.getProprietaire),format.raw/*214.92*/("""</td>
                                                    <td>"""),_display_(/*215.58*/commande/*215.66*/.getDestination),format.raw/*215.81*/("""</td>
                                                    <td>"""),_display_(/*216.58*/commande/*216.66*/.getProduit.getNom),format.raw/*216.84*/("""</td>
                                                    <td>"""),_display_(/*217.58*/commande/*217.66*/.getQuantite),format.raw/*217.78*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*218.98*/commande/*218.106*/.getMontant),format.raw/*218.117*/("""</span></td>
                                                    <td>
                                                        <a href="/facture-transports/"""),_display_(/*220.87*/commande/*220.95*/.getFacture.getId),format.raw/*220.112*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>

                                                </tr>
                                            """)))}),format.raw/*224.46*/("""
                                            """),format.raw/*225.45*/("""</tbody>
                                            <tfoot>
                                                <tr class="active">
                                                    <th>TOTAL</th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th></th>
                                                    <th class="text-right"><span class="number">"""),_display_(/*234.98*/totalCommandeTransportMonth),format.raw/*234.125*/("""</span></th>
                                                    <th></th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>

                    """),_display_(/*244.22*/if(commandes.size() > 0)/*244.46*/ {_display_(Seq[Any](format.raw/*244.48*/("""
                        """),format.raw/*245.25*/("""<div class="row">
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
                                                    <th>MONTANT</th>
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*265.46*/for(commande <- commandes) yield /*265.72*/ {_display_(Seq[Any](format.raw/*265.74*/("""
                                                """),format.raw/*266.49*/("""<tr class="active">
                                                    <th>"""),_display_(/*267.58*/if(null != commande.getDateCommande)/*267.94*/ {_display_(Seq[Any](format.raw/*267.96*/("""
                                                        """),_display_(/*268.58*/commande/*268.66*/.getDateCommande.format("dd-MM-yyyy")),format.raw/*268.103*/("""
                                                    """)))}),format.raw/*269.54*/("""</th>
                                                    <td>"""),_display_(/*270.58*/commande/*270.66*/.getCamion.getImmatriculation),format.raw/*270.95*/("""</td>
                                                    <td>"""),_display_(/*271.58*/commande/*271.66*/.getCamion.getProprietaire),format.raw/*271.92*/("""</td>
                                                    <td>"""),_display_(/*272.58*/commande/*272.66*/.getDestination),format.raw/*272.81*/("""</td>
                                                    <td>"""),_display_(/*273.58*/commande/*273.66*/.getProduit.getNom),format.raw/*273.84*/("""</td>
                                                    <td>"""),_display_(/*274.58*/commande/*274.66*/.getQuantite),format.raw/*274.78*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*275.98*/commande/*275.106*/.getMontant),format.raw/*275.117*/("""</span></td>
                                                    <td>
                                                        <a href="/facture-transports/"""),_display_(/*277.87*/commande/*277.95*/.getFacture.getId),format.raw/*277.112*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>

                                                </tr>
                                            """)))}),format.raw/*281.46*/("""
                                            """),format.raw/*282.45*/("""</tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*288.22*/("""

                """),format.raw/*290.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*296.6*/foot()),format.raw/*296.12*/("""
    """),format.raw/*297.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(camion:Camion,tafs:util.List[Taf],tafsMonth:util.List[Taf],commandes:util.List[CommandeTransport],commandesMonth:util.List[CommandeTransport],totalTafMonth:Long,totalCommandeTransportMonth:Long,proprietaires:util.List[Proprietaire]): play.twirl.api.HtmlFormat.Appendable = apply(camion,tafs,tafsMonth,commandes,commandesMonth,totalTafMonth,totalCommandeTransportMonth,proprietaires)

  def f:((Camion,util.List[Taf],util.List[Taf],util.List[CommandeTransport],util.List[CommandeTransport],Long,Long,util.List[Proprietaire]) => play.twirl.api.HtmlFormat.Appendable) = (camion,tafs,tafsMonth,commandes,commandesMonth,totalTafMonth,totalCommandeTransportMonth,proprietaires) => apply(camion,tafs,tafsMonth,commandes,commandesMonth,totalTafMonth,totalCommandeTransportMonth,proprietaires)

  def ref: this.type = this

}


}
}

/**/
object camion extends camion_Scope0.camion_Scope1.camion
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/camion.scala.html
                  HASH: dcf1ffb8ef0cd5affb5185eee8d11a4742f079d7
                  MATRIX: 915->19|1268->276|1296->278|1360->317|1386->323|1416->326|2277->1160|2304->1166|2347->1181|2625->1432|2640->1438|2680->1457|2886->1636|2925->1666|2965->1668|3026->1701|3271->1919|3285->1924|3319->1937|3380->1970|3447->2006|3504->2036|3545->2068|3585->2070|3646->2103|3891->2321|3905->2326|3941->2341|4008->2377|4061->2402|4439->2753|4455->2759|4483->2765|4760->3014|4776->3020|4817->3039|5170->3365|5220->3399|5260->3401|5336->3450|5387->3492|5427->3494|5507->3546|5550->3562|5571->3574|5598->3580|5649->3603|5671->3615|5700->3622|5777->3681|5790->3686|5829->3687|5909->3739|5952->3755|5973->3767|6000->3773|6030->3776|6052->3788|6081->3795|6170->3853|6247->3899|6320->3944|6715->4311|6731->4317|6773->4337|7063->4599|7079->4605|7120->4624|7457->4934|7472->4940|7499->4946|9169->6588|9202->6604|9243->6606|9321->6655|9426->6732|9477->6773|9519->6775|9605->6833|9618->6836|9688->6883|9774->6937|9865->7000|9878->7003|9944->7046|10035->7109|10048->7112|10118->7159|10209->7222|10222->7225|10255->7236|10346->7299|10359->7302|10396->7317|10527->7420|10541->7423|10575->7434|10719->7546|10793->7591|11361->8131|11397->8144|11764->8483|11793->8502|11834->8504|11889->8530|13113->9726|13146->9742|13187->9744|13261->9789|13362->9862|13413->9903|13454->9905|13536->9959|13549->9962|13619->10009|13701->10059|13788->10118|13801->10121|13867->10164|13954->10223|13967->10226|14029->10266|14116->10325|14129->10328|14162->10339|14249->10398|14262->10401|14299->10416|14426->10515|14439->10518|14473->10529|14609->10633|14679->10674|14918->10881|14973->10907|16423->12329|16466->12355|16507->12357|16585->12406|16690->12483|16736->12519|16777->12521|16863->12579|16881->12587|16941->12624|17027->12678|17118->12741|17136->12749|17187->12778|17278->12841|17296->12849|17344->12875|17435->12938|17453->12946|17490->12961|17581->13024|17599->13032|17639->13050|17730->13113|17748->13121|17782->13133|17913->13236|17932->13244|17966->13255|18150->13411|18168->13419|18208->13436|18519->13715|18593->13760|19224->14363|19274->14390|19703->14791|19737->14815|19778->14817|19832->14842|21274->16256|21317->16282|21358->16284|21436->16333|21541->16410|21587->16446|21628->16448|21714->16506|21732->16514|21792->16551|21878->16605|21969->16668|21987->16676|22038->16705|22129->16768|22147->16776|22195->16802|22286->16865|22304->16873|22341->16888|22432->16951|22450->16959|22490->16977|22581->17040|22599->17048|22633->17060|22764->17163|22783->17171|22817->17182|23001->17338|23019->17346|23059->17363|23370->17642|23444->17687|23703->17914|23750->17932|24001->18156|24029->18162|24062->18167
                  LINES: 30->2|36->3|38->5|41->8|41->8|44->11|61->28|61->28|64->31|68->35|68->35|68->35|74->41|74->41|74->41|75->42|77->44|77->44|77->44|78->45|79->46|80->47|80->47|80->47|81->48|83->50|83->50|83->50|84->51|85->52|92->59|92->59|92->59|95->62|95->62|95->62|100->67|100->67|100->67|101->68|101->68|101->68|102->69|102->69|102->69|102->69|102->69|102->69|102->69|103->70|103->70|103->70|104->71|104->71|104->71|104->71|104->71|104->71|104->71|105->72|106->73|107->74|113->80|113->80|113->80|117->84|117->84|117->84|123->90|123->90|123->90|151->118|151->118|151->118|152->119|153->120|153->120|153->120|154->121|154->121|154->121|155->122|156->123|156->123|156->123|157->124|157->124|157->124|158->125|158->125|158->125|159->126|159->126|159->126|160->127|160->127|160->127|162->129|163->130|171->138|171->138|181->148|181->148|181->148|183->150|201->168|201->168|201->168|202->169|203->170|203->170|203->170|204->171|204->171|204->171|205->172|206->173|206->173|206->173|207->174|207->174|207->174|208->175|208->175|208->175|209->176|209->176|209->176|210->177|210->177|210->177|212->179|213->180|219->186|221->188|241->208|241->208|241->208|242->209|243->210|243->210|243->210|244->211|244->211|244->211|245->212|246->213|246->213|246->213|247->214|247->214|247->214|248->215|248->215|248->215|249->216|249->216|249->216|250->217|250->217|250->217|251->218|251->218|251->218|253->220|253->220|253->220|257->224|258->225|267->234|267->234|277->244|277->244|277->244|278->245|298->265|298->265|298->265|299->266|300->267|300->267|300->267|301->268|301->268|301->268|302->269|303->270|303->270|303->270|304->271|304->271|304->271|305->272|305->272|305->272|306->273|306->273|306->273|307->274|307->274|307->274|308->275|308->275|308->275|310->277|310->277|310->277|314->281|315->282|321->288|323->290|329->296|329->296|330->297
                  -- GENERATED --
              */
          