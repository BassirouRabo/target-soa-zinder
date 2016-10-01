
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object paiement_transport_Scope0 {
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

     object paiement_transport_Scope1 {
import java.util

class paiement_transport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[PaiementTransport,util.List[FactureTransport],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(paiement: PaiementTransport, factures: util.List[FactureTransport]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.70*/("""

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
                            <form class="form-horizontal" method="post" action="/facture-transports/"""),_display_(/*58.102*/paiement/*58.110*/.getFacture.getId),format.raw/*58.127*/("""/paiements/"""),_display_(/*58.139*/paiement/*58.147*/.getId),format.raw/*58.153*/("""/update">
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

  def render(paiement:PaiementTransport,factures:util.List[FactureTransport]): play.twirl.api.HtmlFormat.Appendable = apply(paiement,factures)

  def f:((PaiementTransport,util.List[FactureTransport]) => play.twirl.api.HtmlFormat.Appendable) = (paiement,factures) => apply(paiement,factures)

  def ref: this.type = this

}


}
}

/**/
object paiement_transport extends paiement_transport_Scope0.paiement_transport_Scope1.paiement_transport
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:14 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/paiement_transport.scala.html
                  HASH: baba573a472a18e2789d626ebe912c0ae4081296
                  MATRIX: 868->19|1031->87|1059->89|1123->128|1149->134|1179->137|1984->915|2011->921|2049->932|2475->1331|2514->1361|2554->1363|2611->1392|2848->1602|2862->1607|2896->1620|2953->1649|3016->1681|3069->1707|3110->1739|3150->1741|3207->1770|3444->1980|3458->1985|3494->2000|3557->2032|3606->2053|3973->2392|3991->2400|4030->2417|4070->2429|4088->2437|4116->2443|4396->2696|4444->2735|4484->2737|4561->2786|4696->2890|4769->2936|4818->2976|4858->2978|4935->3027|5072->3133|5145->3179|5192->3217|5232->3219|5309->3268|5442->3370|5511->3411|5733->3606|5750->3614|5783->3625|6016->3831|6057->3863|6097->3865|6166->3906|6243->3955|6272->3956|6301->3957|6330->3958|6364->3964|6394->3965|6424->3966|6454->3967|6489->3973|6519->3974|6549->3975|6579->3976|6683->4062|6696->4067|6735->4068|6804->4109|6881->4158|6910->4159|6939->4160|6968->4161|7002->4167|7032->4168|7062->4169|7092->4170|7127->4176|7157->4177|7187->4178|7217->4179|7256->4190|7274->4198|7329->4231|7448->4319|7513->4356|7756->4572|7804->4611|7844->4613|7921->4662|8044->4767|8057->4772|8096->4773|8173->4822|8288->4906|8361->4952|8408->4990|8448->4992|8525->5041|8647->5145|8660->5150|8699->5151|8776->5200|8889->5282|8958->5323|9275->5612|9293->5620|9321->5626|9439->5716|9457->5724|9497->5741|10058->6275|10086->6281|10116->6283
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|91->58|91->58|91->58|95->62|95->62|95->62|96->63|97->64|98->65|98->65|98->65|99->66|100->67|101->68|101->68|101->68|102->69|103->70|104->71|108->75|108->75|108->75|112->79|112->79|112->79|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|113->80|114->81|114->81|114->81|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|115->82|116->83|117->84|121->88|121->88|121->88|122->89|123->90|123->90|123->90|124->91|125->92|126->93|126->93|126->93|127->94|128->95|128->95|128->95|129->96|130->97|131->98|138->105|138->105|138->105|139->106|139->106|139->106|155->122|155->122|157->124
                  -- GENERATED --
              */
          