
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object facture_vente_edit_Scope0 {
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

     object facture_vente_edit_Scope1 {
import java.util

class facture_vente_edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[FactureVente,util.List[ClientVente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(facture: FactureVente, clients: util.List[ClientVente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.58*/("""

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
                            <h4 class="page-title">Nos factures ventes</h4>
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
                                <h3 class="box-title m-b-0">Modifier une facture de vente</h3>
                                <form class="form-horizontal" method="post" action="/facture-ventes/"""),_display_(/*58.102*/facture/*58.109*/.getId),format.raw/*58.115*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <select name="client.id" class="form-control" required="required">
                                            """),_display_(/*62.46*/for(client <- clients) yield /*62.68*/ {_display_(Seq[Any](format.raw/*62.70*/("""
                                                """),_display_(/*63.50*/if(client == facture.getClient)/*63.81*/ {_display_(Seq[Any](format.raw/*63.83*/("""
                                                    """),format.raw/*64.53*/("""<option value=""""),_display_(/*64.69*/client/*64.75*/.getId),format.raw/*64.81*/("""" selected="selected">"""),_display_(/*64.104*/client/*64.110*/.getNom),format.raw/*64.117*/("""</option>
                                                """)))}/*65.51*/else/*65.56*/{_display_(Seq[Any](format.raw/*65.57*/("""
                                                    """),format.raw/*66.53*/("""<option value=""""),_display_(/*66.69*/client/*66.75*/.getId),format.raw/*66.81*/("""">"""),_display_(/*66.84*/client/*66.90*/.getNom),format.raw/*66.97*/("""</option>
                                                """)))}),format.raw/*67.50*/("""
                                            """)))}),format.raw/*68.46*/("""
                                            """),format.raw/*69.45*/("""</select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input type="hidden" name="id" value=""""),_display_(/*75.84*/facture/*75.91*/.getId),format.raw/*75.97*/("""">
                                            <input type="hidden" name="referenceFactureProforma" value=""""),_display_(/*76.106*/facture/*76.113*/.getReferenceFactureProforma),format.raw/*76.141*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Modifier</button>
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

    """),_display_(/*92.6*/foot()),format.raw/*92.12*/("""

    """),format.raw/*94.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(facture:FactureVente,clients:util.List[ClientVente]): play.twirl.api.HtmlFormat.Appendable = apply(facture,clients)

  def f:((FactureVente,util.List[ClientVente]) => play.twirl.api.HtmlFormat.Appendable) = (facture,clients) => apply(facture,clients)

  def ref: this.type = this

}


}
}

/**/
object facture_vente_edit extends facture_vente_edit_Scope0.facture_vente_edit_Scope1.facture_vente_edit
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/facture_vente_edit.scala.html
                  HASH: 03626d1cd9e9b695f8b2dffbc3275c0d623cd1dd
                  MATRIX: 858->19|1009->75|1037->77|1101->116|1127->122|1157->125|2018->959|2045->965|2088->980|2556->1421|2595->1451|2635->1453|2696->1486|2941->1704|2955->1709|2989->1722|3050->1755|3117->1791|3174->1821|3215->1853|3255->1855|3316->1888|3561->2106|3575->2111|3611->2126|3678->2162|3731->2187|4128->2556|4145->2563|4173->2569|4491->2860|4529->2882|4569->2884|4646->2934|4686->2965|4726->2967|4807->3020|4850->3036|4865->3042|4892->3048|4943->3071|4959->3077|4988->3084|5066->3144|5079->3149|5118->3150|5199->3203|5242->3219|5257->3225|5284->3231|5314->3234|5329->3240|5357->3247|5447->3306|5524->3352|5597->3397|5932->3705|5948->3712|5975->3718|6111->3826|6128->3833|6178->3861|6787->4444|6814->4450|6847->4456
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|99->66|99->66|99->66|99->66|100->67|101->68|102->69|108->75|108->75|108->75|109->76|109->76|109->76|125->92|125->92|127->94
                  -- GENERATED --
              */
          