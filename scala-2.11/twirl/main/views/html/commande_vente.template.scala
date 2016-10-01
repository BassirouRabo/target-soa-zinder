
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object commande_vente_Scope0 {
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

     object commande_vente_Scope1 {
import java.util

class commande_vente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[CommandeVente,util.List[Produit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(commande: CommandeVente, produits: util.List[Produit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""

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
                            <h4 class="page-title">Nos Commandes</h4>
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
                                <h3 class="box-title m-b-0">Modifier un produit</h3>
                                <form class="form-horizontal" method="post" action="/facture-ventes/"""),_display_(/*58.102*/commande/*58.110*/.getFacture.getId),format.raw/*58.127*/("""/commandes/"""),_display_(/*58.139*/commande/*58.147*/.getId),format.raw/*58.153*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <select name="produit.id" class="form-control" required="required">
                                            """),_display_(/*62.46*/for(produit <- produits) yield /*62.70*/ {_display_(Seq[Any](format.raw/*62.72*/("""
                                                """),_display_(/*63.50*/if(commande.getProduit == produit)/*63.84*/ {_display_(Seq[Any](format.raw/*63.86*/("""
                                                    """),format.raw/*64.53*/("""<option value=""""),_display_(/*64.69*/produit/*64.76*/.getId),format.raw/*64.82*/("""" selected="selected">"""),_display_(/*64.105*/produit/*64.112*/.getNom),format.raw/*64.119*/("""
                                                        """),format.raw/*65.57*/("""- """),_display_(/*65.60*/produit/*65.67*/.getPrixVente),format.raw/*65.80*/("""</option>
                                                """)))}/*66.51*/else/*66.56*/{_display_(Seq[Any](format.raw/*66.57*/("""
                                                    """),format.raw/*67.53*/("""<option value=""""),_display_(/*67.69*/produit/*67.76*/.getId),format.raw/*67.82*/("""">"""),_display_(/*67.85*/produit/*67.92*/.getNom),format.raw/*67.99*/("""
                                                        """),format.raw/*68.57*/("""- """),_display_(/*68.60*/produit/*68.67*/.getPrixVente),format.raw/*68.80*/("""</option>
                                                """)))}),format.raw/*69.50*/("""
                                            """)))}),format.raw/*70.46*/("""
                                            """),format.raw/*71.45*/("""</select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <input name="prix" type="number" min="0" class="form-control" value=""""),_display_(/*77.115*/commande/*77.123*/.getPrix),format.raw/*77.131*/("""" placeholder="P.U" required="required">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <input name="quantite" type="number" min="0" class="form-control" value=""""),_display_(/*83.119*/commande/*83.127*/.getQuantite),format.raw/*83.139*/("""" placeholder="Quantité" required="required">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input type="hidden" name="id" value=""""),_display_(/*89.84*/commande/*89.92*/.getId),format.raw/*89.98*/("""">
                                            <input type="hidden" name="facture.id" value=""""),_display_(/*90.92*/commande/*90.100*/.getFacture.getId),format.raw/*90.117*/("""">
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

            """),_display_(/*106.14*/foot()),format.raw/*106.20*/("""

    """),format.raw/*108.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(commande:CommandeVente,produits:util.List[Produit]): play.twirl.api.HtmlFormat.Appendable = apply(commande,produits)

  def f:((CommandeVente,util.List[Produit]) => play.twirl.api.HtmlFormat.Appendable) = (commande,produits) => apply(commande,produits)

  def ref: this.type = this

}


}
}

/**/
object commande_vente extends commande_vente_Scope0.commande_vente_Scope1.commande_vente
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:13 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/commande_vente.scala.html
                  HASH: 393715f1f1b742b12944fc935610052a2d54064e
                  MATRIX: 843->19|993->74|1021->76|1085->115|1111->121|1149->132|2010->966|2037->972|2080->987|2542->1422|2581->1452|2621->1454|2682->1487|2927->1705|2941->1710|2975->1723|3036->1756|3103->1792|3160->1822|3201->1854|3241->1856|3302->1889|3547->2107|3561->2112|3597->2127|3664->2163|3717->2188|4104->2547|4122->2555|4161->2572|4201->2584|4219->2592|4247->2598|4566->2890|4606->2914|4646->2916|4723->2966|4766->3000|4806->3002|4887->3055|4930->3071|4946->3078|4973->3084|5024->3107|5041->3114|5070->3121|5155->3178|5185->3181|5201->3188|5235->3201|5313->3261|5326->3266|5365->3267|5446->3320|5489->3336|5505->3343|5532->3349|5562->3352|5578->3359|5606->3366|5691->3423|5721->3426|5737->3433|5771->3446|5861->3505|5938->3551|6011->3596|6379->3936|6397->3944|6427->3952|6830->4327|6848->4335|6882->4347|7253->4691|7270->4699|7297->4705|7418->4799|7436->4807|7475->4824|8093->5414|8121->5420|8155->5426
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|91->58|91->58|91->58|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|98->65|99->66|99->66|99->66|100->67|100->67|100->67|100->67|100->67|100->67|100->67|101->68|101->68|101->68|101->68|102->69|103->70|104->71|110->77|110->77|110->77|116->83|116->83|116->83|122->89|122->89|122->89|123->90|123->90|123->90|139->106|139->106|141->108
                  -- GENERATED --
              */
          