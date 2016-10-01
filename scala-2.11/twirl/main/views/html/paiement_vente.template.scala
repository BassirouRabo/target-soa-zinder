
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object paiement_vente_Scope0 {
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

     object paiement_vente_Scope1 {
import java.util

class paiement_vente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[PaiementVente,util.List[FactureVente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(paiement: PaiementVente, factures: util.List[FactureVente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.62*/("""

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
                        <h4 class="page-title">Nos Paiements</h4>
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
                            <h3 class="box-title m-b-0">Modifier un produit</h3>
                            <form class="form-horizontal" method="post" action="/facture-ventes/"""),_display_(/*58.98*/paiement/*58.106*/.getFacture.getId),format.raw/*58.123*/("""/paiements/"""),_display_(/*58.135*/paiement/*58.143*/.getId),format.raw/*58.149*/("""/update">
                                <div class="form-group">
                                    <div class="col-md-3">
                                        <select name="type" class="form-control">
                                            """),_display_(/*62.46*/if(paiement.getType.endsWith("Avance"))/*62.85*/ {_display_(Seq[Any](format.raw/*62.87*/("""
                                                """),format.raw/*63.49*/("""<option value="Avance" selected="selected">Avance</option>
                                            """)))}),format.raw/*64.46*/("""
                                            """),_display_(/*65.46*/if(paiement.getType.endsWith("Partiel"))/*65.86*/ {_display_(Seq[Any](format.raw/*65.88*/("""
                                                """),format.raw/*66.49*/("""<option value="Partiel" selected="selected">Partiel</option>
                                            """)))}),format.raw/*67.46*/("""
                                            """),_display_(/*68.46*/if(paiement.getType.endsWith("Total"))/*68.84*/ {_display_(Seq[Any](format.raw/*68.86*/("""
                                                """),format.raw/*69.49*/("""<option value="Total" selected="selected">Total</option>
                                            """)))}),format.raw/*70.46*/("""
                                        """),format.raw/*71.41*/("""</select>
                                    </div>

                                    <div class="col-md-3">
                                        <input name="montant" type="text" value=""""),_display_(/*75.83*/paiement/*75.91*/.getMontant),format.raw/*75.102*/("""" class="form-control" placeholder="Montant" required="required">
                                    </div>

                                    <div class="col-md-3">
                                    """),_display_(/*79.38*/if(null == paiement.getEcheance)/*79.70*/ {_display_(Seq[Any](format.raw/*79.72*/("""
                                        """),format.raw/*80.41*/("""<input name="echeance" type="text" pattern="[0-9]"""),format.raw/*80.90*/("""{"""),format.raw/*80.91*/("""2"""),format.raw/*80.92*/("""}"""),format.raw/*80.93*/("""-[0-9]"""),format.raw/*80.99*/("""{"""),format.raw/*80.100*/("""2"""),format.raw/*80.101*/("""}"""),format.raw/*80.102*/("""-[0-9]"""),format.raw/*80.108*/("""{"""),format.raw/*80.109*/("""4"""),format.raw/*80.110*/("""}"""),format.raw/*80.111*/(""""  class="form-control" placeholder="Echéance">
                                    """)))}/*81.39*/else/*81.44*/{_display_(Seq[Any](format.raw/*81.45*/("""
                                        """),format.raw/*82.41*/("""<input name="echeance" type="text" pattern="[0-9]"""),format.raw/*82.90*/("""{"""),format.raw/*82.91*/("""2"""),format.raw/*82.92*/("""}"""),format.raw/*82.93*/("""-[0-9]"""),format.raw/*82.99*/("""{"""),format.raw/*82.100*/("""2"""),format.raw/*82.101*/("""}"""),format.raw/*82.102*/("""-[0-9]"""),format.raw/*82.108*/("""{"""),format.raw/*82.109*/("""4"""),format.raw/*82.110*/("""}"""),format.raw/*82.111*/(""""  value=""""),_display_(/*82.122*/paiement/*82.130*/.getEcheance.format("dd-MM-yyyy")),format.raw/*82.163*/("""" class="form-control" placeholder="Echéance">
                                        """)))}),format.raw/*83.42*/("""
                                    """),format.raw/*84.37*/("""</div>

                                    <div class="col-md-3">
                                        <select name="status" class="form-control" required="required">
                                            """),_display_(/*88.46*/if(paiement.getStatus.equals("Ouvert"))/*88.85*/ {_display_(Seq[Any](format.raw/*88.87*/("""
                                                """),format.raw/*89.49*/("""<option value="Ouvert" selected="selected">Ouvert</option>
                                            """)))}/*90.47*/else/*90.52*/{_display_(Seq[Any](format.raw/*90.53*/("""
                                                """),format.raw/*91.49*/("""<option value="Ouvert">Ouvert</option>
                                            """)))}),format.raw/*92.46*/("""
                                            """),_display_(/*93.46*/if(paiement.getStatus.equals("Fermé"))/*93.84*/ {_display_(Seq[Any](format.raw/*93.86*/("""
                                                """),format.raw/*94.49*/("""<option value="Fermé" selected="selected">Ouvert</option>
                                            """)))}/*95.47*/else/*95.52*/{_display_(Seq[Any](format.raw/*95.53*/("""
                                                """),format.raw/*96.49*/("""<option value="Fermé">Fermé</option>
                                            """)))}),format.raw/*97.46*/("""
                                        """),format.raw/*98.41*/("""</select>
                                    </div>

                                </div>

                                <div class="form-group">
                                    <div class="col-md-2">
                                        <input type="hidden" name="id" value=""""),_display_(/*105.80*/paiement/*105.88*/.getId),format.raw/*105.94*/("""">
                                        <input type="hidden" name="facture.id" value=""""),_display_(/*106.88*/paiement/*106.96*/.getFacture.getId),format.raw/*106.113*/("""">
                                        <button type="submit" class="btn btn-block btn-info">Modifer</button>
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

    """),_display_(/*122.6*/foot()),format.raw/*122.12*/("""

"""),format.raw/*124.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(paiement:PaiementVente,factures:util.List[FactureVente]): play.twirl.api.HtmlFormat.Appendable = apply(paiement,factures)

  def f:((PaiementVente,util.List[FactureVente]) => play.twirl.api.HtmlFormat.Appendable) = (paiement,factures) => apply(paiement,factures)

  def ref: this.type = this

}


}
}

/**/
object paiement_vente extends paiement_vente_Scope0.paiement_vente_Scope1.paiement_vente
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:15 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/paiement_vente.scala.html
                  HASH: 5afa6f16852c57f1dda588e2c214779e16be35c1
                  MATRIX: 848->19|1003->79|1031->81|1095->120|1121->126|1151->129|1956->907|1983->913|2021->924|2447->1323|2486->1353|2526->1355|2583->1384|2820->1594|2834->1599|2868->1612|2925->1641|2988->1673|3041->1699|3082->1731|3122->1733|3179->1762|3416->1972|3430->1977|3466->1992|3529->2024|3578->2045|3940->2380|3958->2388|3997->2405|4037->2417|4055->2425|4083->2431|4363->2684|4411->2723|4451->2725|4528->2774|4663->2878|4736->2924|4785->2964|4825->2966|4902->3015|5039->3121|5112->3167|5159->3205|5199->3207|5276->3256|5409->3358|5478->3399|5700->3594|5717->3602|5750->3613|5983->3819|6024->3851|6064->3853|6133->3894|6210->3943|6239->3944|6268->3945|6297->3946|6331->3952|6361->3953|6391->3954|6421->3955|6456->3961|6486->3962|6516->3963|6546->3964|6650->4050|6663->4055|6702->4056|6771->4097|6848->4146|6877->4147|6906->4148|6935->4149|6969->4155|6999->4156|7029->4157|7059->4158|7094->4164|7124->4165|7154->4166|7184->4167|7223->4178|7241->4186|7296->4219|7415->4307|7480->4344|7723->4560|7771->4599|7811->4601|7888->4650|8011->4755|8024->4760|8063->4761|8140->4810|8255->4894|8328->4940|8375->4978|8415->4980|8492->5029|8614->5133|8627->5138|8666->5139|8743->5188|8856->5270|8925->5311|9242->5600|9260->5608|9288->5614|9406->5704|9424->5712|9464->5729|10025->6263|10053->6269|10083->6271
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|91->58|91->58|91->58|95->62|95->62|95->62|96->63|97->64|98->65|98->65|98->65|99->66|100->67|101->68|101->68|101->68|102->69|103->70|104->71|108->75|108->75|108->75|112->79|112->79|112->79|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|114->81|114->81|114->81|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|116->83|117->84|121->88|121->88|121->88|122->89|123->90|123->90|123->90|124->91|125->92|126->93|126->93|126->93|127->94|128->95|128->95|128->95|129->96|130->97|131->98|138->105|138->105|138->105|139->106|139->106|139->106|155->122|155->122|157->124
                  -- GENERATED --
              */
          