
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object commande_transport_Scope0 {
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

     object commande_transport_Scope1 {
import java.util

class commande_transport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[CommandeTransport,util.List[Produit],util.List[Camion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(commande: CommandeTransport, produits: util.List[Produit], camions: util.List[Camion]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.89*/("""

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
                                <h3 class="box-title m-b-0">Modifier une commande</h3>
                                <form class="form-horizontal" method="post" action="/facture-transports/"""),_display_(/*58.106*/commande/*58.114*/.getFacture.getId),format.raw/*58.131*/("""/commandes/"""),_display_(/*58.143*/commande/*58.151*/.getId),format.raw/*58.157*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <select name="produit.id" class="form-control" required="required">
                                            """),_display_(/*62.46*/for(produit <- produits) yield /*62.70*/ {_display_(Seq[Any](format.raw/*62.72*/("""
                                                """),_display_(/*63.50*/if(commande.getProduit == produit)/*63.84*/ {_display_(Seq[Any](format.raw/*63.86*/("""
                                                    """),format.raw/*64.53*/("""<option value=""""),_display_(/*64.69*/produit/*64.76*/.getId),format.raw/*64.82*/("""" selected="selected">"""),_display_(/*64.105*/produit/*64.112*/.getNom),format.raw/*64.119*/("""
                                                        """),format.raw/*65.57*/("""- """),_display_(/*65.60*/produit/*65.67*/.getPrixTransport),format.raw/*65.84*/("""</option>
                                                """)))}/*66.51*/else/*66.56*/{_display_(Seq[Any](format.raw/*66.57*/("""
                                                    """),format.raw/*67.53*/("""<option value=""""),_display_(/*67.69*/produit/*67.76*/.getId),format.raw/*67.82*/("""">"""),_display_(/*67.85*/produit/*67.92*/.getNom),format.raw/*67.99*/("""
                                                        """),format.raw/*68.57*/("""- """),_display_(/*68.60*/produit/*68.67*/.getPrixTransport),format.raw/*68.84*/("""</option>
                                                """)))}),format.raw/*69.50*/("""
                                            """)))}),format.raw/*70.46*/("""
                                            """),format.raw/*71.45*/("""</select>
                                        </div>
                                        <div class="col-md-6">
                                            <select name="camion.id" class="form-control" required="required">
                                            """),_display_(/*75.46*/for(camion <- camions) yield /*75.68*/ {_display_(Seq[Any](format.raw/*75.70*/("""
                                                """),_display_(/*76.50*/if(commande.getCamion == camion)/*76.82*/ {_display_(Seq[Any](format.raw/*76.84*/("""
                                                    """),format.raw/*77.53*/("""<option value=""""),_display_(/*77.69*/camion/*77.75*/.getId),format.raw/*77.81*/("""" selected="selected">"""),_display_(/*77.104*/camion/*77.110*/.getImmatriculation),format.raw/*77.129*/("""
                                                        """),format.raw/*78.57*/("""- """),_display_(/*78.60*/camion/*78.66*/.getProprietaire),format.raw/*78.82*/("""</option>
                                                """)))}/*79.51*/else/*79.56*/{_display_(Seq[Any](format.raw/*79.57*/("""
                                                    """),format.raw/*80.53*/("""<option value=""""),_display_(/*80.69*/camion/*80.75*/.getId),format.raw/*80.81*/("""">"""),_display_(/*80.84*/camion/*80.90*/.getImmatriculation),format.raw/*80.109*/("""
                                                        """),format.raw/*81.57*/("""- """),_display_(/*81.60*/camion/*81.66*/.getProprietaire),format.raw/*81.82*/("""</option>
                                                """)))}),format.raw/*82.50*/("""
                                            """)))}),format.raw/*83.46*/("""
                                            """),format.raw/*84.45*/("""</select>
                                        </div>
                                    </div>

                                    <div class="form-group">

                                        <div class="col-md-6">
                                            <input name="destination" type="text" class="form-control" placeholder="Destination" value=""""),_display_(/*91.138*/commande/*91.146*/.getDestination),format.raw/*91.161*/("""" required="required">
                                        </div>
                                        <div class="col-md-6">
                                            <input name="quantite" type="number" min="0" class="form-control" value=""""),_display_(/*94.119*/commande/*94.127*/.getQuantite),format.raw/*94.139*/("""" placeholder="Quantité" required="required">
                                        </div>

                                    </div>
                                    <div class="form-group">

                                        <div class="col-md-6">
                                        """),_display_(/*101.42*/if(null == commande.getDateCommande)/*101.78*/ {_display_(Seq[Any](format.raw/*101.80*/("""
                                            """),format.raw/*102.45*/("""<input name="dateCommande" type="text"  pattern="[0-9]"""),format.raw/*102.99*/("""{"""),format.raw/*102.100*/("""2"""),format.raw/*102.101*/("""}"""),format.raw/*102.102*/("""-[0-9]"""),format.raw/*102.108*/("""{"""),format.raw/*102.109*/("""2"""),format.raw/*102.110*/("""}"""),format.raw/*102.111*/("""-[0-9]"""),format.raw/*102.117*/("""{"""),format.raw/*102.118*/("""4"""),format.raw/*102.119*/("""}"""),format.raw/*102.120*/(""""  class="form-control" placeholder="Date" required="required">
                                        """)))}/*103.43*/else/*103.48*/{_display_(Seq[Any](format.raw/*103.49*/("""
                                            """),format.raw/*104.45*/("""<input name="dateCommande" type="text" pattern="[0-9]"""),format.raw/*104.98*/("""{"""),format.raw/*104.99*/("""2"""),format.raw/*104.100*/("""}"""),format.raw/*104.101*/("""-[0-9]"""),format.raw/*104.107*/("""{"""),format.raw/*104.108*/("""2"""),format.raw/*104.109*/("""}"""),format.raw/*104.110*/("""-[0-9]"""),format.raw/*104.116*/("""{"""),format.raw/*104.117*/("""4"""),format.raw/*104.118*/("""}"""),format.raw/*104.119*/(""""  value=""""),_display_(/*104.130*/commande/*104.138*/.getDateCommande.format("dd-MM-yyyy")),format.raw/*104.175*/("""" class="form-control" placeholder="Date" required="required">
                                            """)))}),format.raw/*105.46*/("""
                                        """),format.raw/*106.41*/("""</div>

                                        <div class="col-md-6">
                                            <input name="referenceBonLivraison" type="text" value=""""),_display_(/*109.101*/commande/*109.109*/.getReferenceBonLivraison),format.raw/*109.134*/("""" class="form-control" placeholder="BL" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="prix" type="number" value=""""),_display_(/*114.86*/commande/*114.94*/.getPrix),format.raw/*114.102*/("""" class="form-control" placeholder="P.U" required="required">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input type="hidden" name="id" value=""""),_display_(/*120.84*/commande/*120.92*/.getId),format.raw/*120.98*/("""">
                                            <input type="hidden" name="facture.id" value=""""),_display_(/*121.92*/commande/*121.100*/.getFacture.getId),format.raw/*121.117*/("""">
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

            """),_display_(/*137.14*/foot()),format.raw/*137.20*/("""

    """),format.raw/*139.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(commande:CommandeTransport,produits:util.List[Produit],camions:util.List[Camion]): play.twirl.api.HtmlFormat.Appendable = apply(commande,produits,camions)

  def f:((CommandeTransport,util.List[Produit],util.List[Camion]) => play.twirl.api.HtmlFormat.Appendable) = (commande,produits,camions) => apply(commande,produits,camions)

  def ref: this.type = this

}


}
}

/**/
object commande_transport extends commande_transport_Scope0.commande_transport_Scope1.commande_transport
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:28 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/commande_transport.scala.html
                  HASH: ea45ad21fd8275746c41acd3d3dd6ececef632a3
                  MATRIX: 877->19|1059->106|1087->108|1151->147|1177->153|1215->164|2076->998|2103->1004|2146->1019|2608->1454|2647->1484|2687->1486|2748->1519|2993->1737|3007->1742|3041->1755|3102->1788|3169->1824|3226->1854|3267->1886|3307->1888|3368->1921|3613->2139|3627->2144|3663->2159|3730->2195|3783->2220|4176->2585|4194->2593|4233->2610|4273->2622|4291->2630|4319->2636|4637->2927|4677->2951|4717->2953|4794->3003|4837->3037|4877->3039|4958->3092|5001->3108|5017->3115|5044->3121|5095->3144|5112->3151|5141->3158|5226->3215|5256->3218|5272->3225|5310->3242|5388->3302|5401->3307|5440->3308|5521->3361|5564->3377|5580->3384|5607->3390|5637->3393|5653->3400|5681->3407|5766->3464|5796->3467|5812->3474|5850->3491|5940->3550|6017->3596|6090->3641|6393->3917|6431->3939|6471->3941|6548->3991|6589->4023|6629->4025|6710->4078|6753->4094|6768->4100|6795->4106|6846->4129|6862->4135|6903->4154|6988->4211|7018->4214|7033->4220|7070->4236|7148->4296|7161->4301|7200->4302|7281->4355|7324->4371|7339->4377|7366->4383|7396->4386|7411->4392|7452->4411|7537->4468|7567->4471|7582->4477|7619->4493|7709->4552|7786->4598|7859->4643|8250->5006|8268->5014|8305->5029|8584->5280|8602->5288|8636->5300|8967->5603|9013->5639|9054->5641|9128->5686|9211->5740|9242->5741|9273->5742|9304->5743|9340->5749|9371->5750|9402->5751|9433->5752|9469->5758|9500->5759|9531->5760|9562->5761|9687->5867|9701->5872|9741->5873|9815->5918|9897->5971|9927->5972|9958->5973|9989->5974|10025->5980|10056->5981|10087->5982|10118->5983|10154->5989|10185->5990|10216->5991|10247->5992|10287->6003|10306->6011|10366->6048|10506->6156|10576->6197|10776->6368|10795->6376|10843->6401|11231->6761|11249->6769|11280->6777|11668->7137|11686->7145|11714->7151|11836->7245|11855->7253|11895->7270|12513->7860|12541->7866|12575->7872
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|91->58|91->58|91->58|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|98->65|99->66|99->66|99->66|100->67|100->67|100->67|100->67|100->67|100->67|100->67|101->68|101->68|101->68|101->68|102->69|103->70|104->71|108->75|108->75|108->75|109->76|109->76|109->76|110->77|110->77|110->77|110->77|110->77|110->77|110->77|111->78|111->78|111->78|111->78|112->79|112->79|112->79|113->80|113->80|113->80|113->80|113->80|113->80|113->80|114->81|114->81|114->81|114->81|115->82|116->83|117->84|124->91|124->91|124->91|127->94|127->94|127->94|134->101|134->101|134->101|135->102|135->102|135->102|135->102|135->102|135->102|135->102|135->102|135->102|135->102|135->102|135->102|135->102|136->103|136->103|136->103|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|137->104|138->105|139->106|142->109|142->109|142->109|147->114|147->114|147->114|153->120|153->120|153->120|154->121|154->121|154->121|170->137|170->137|172->139
                  -- GENERATED --
              */
          