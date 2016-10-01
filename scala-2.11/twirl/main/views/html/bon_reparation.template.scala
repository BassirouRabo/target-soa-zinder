
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bon_reparation_Scope0 {
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

     object bon_reparation_Scope1 {
import java.util

class bon_reparation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Reparation,util.List[Camion],util.List[Personnel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reparation: Reparation, camions : util.List[Camion], personnels : util.List[Personnel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.90*/("""

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
                            <h4 class="page-title">Modifer Bon de réparation</h4>
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
                                <h3 class="box-title m-b-0">Modifier un bon de réparation</h3>
                                <form class="form-horizontal" method="post" action="/bon-reparations/"""),_display_(/*58.103*/reparation/*58.113*/.getId),format.raw/*58.119*/("""/update">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <select name="camion.id" class="form-control">
                                            """),_display_(/*62.46*/for(camion <- camions) yield /*62.68*/ {_display_(Seq[Any](format.raw/*62.70*/("""
                                                """),_display_(/*63.50*/if(reparation.getCamion == camion)/*63.84*/ {_display_(Seq[Any](format.raw/*63.86*/("""
                                                    """),format.raw/*64.53*/("""<option value=""""),_display_(/*64.69*/camion/*64.75*/.getId),format.raw/*64.81*/("""" selected="selected">"""),_display_(/*64.104*/camion/*64.110*/.getImmatriculation),format.raw/*64.129*/("""</option>
                                                """)))}/*65.51*/else/*65.56*/{_display_(Seq[Any](format.raw/*65.57*/("""
                                                    """),format.raw/*66.53*/("""<option value=""""),_display_(/*66.69*/camion/*66.75*/.getId),format.raw/*66.81*/("""">"""),_display_(/*66.84*/camion/*66.90*/.getImmatriculation),format.raw/*66.109*/("""</option>
                                                """)))}),format.raw/*67.50*/("""
                                            """)))}),format.raw/*68.46*/("""
                                            """),format.raw/*69.45*/("""</select>
                                        </div>

                                        <div class="col-md-6">
                                            <select name="personnel.id" class="form-control">
                                            """),_display_(/*74.46*/for(personnel <- personnels) yield /*74.74*/ {_display_(Seq[Any](format.raw/*74.76*/("""
                                                """),_display_(/*75.50*/if(reparation.getPersonnel == personnel)/*75.90*/ {_display_(Seq[Any](format.raw/*75.92*/("""
                                                    """),format.raw/*76.53*/("""<option value=""""),_display_(/*76.69*/personnel/*76.78*/.getId),format.raw/*76.84*/("""" selected="selected">"""),_display_(/*76.107*/personnel/*76.116*/.getNom),format.raw/*76.123*/("""  """),_display_(/*76.126*/personnel/*76.135*/.getPrenom),format.raw/*76.145*/("""</option>
                                                """)))}/*77.51*/else/*77.56*/{_display_(Seq[Any](format.raw/*77.57*/("""
                                                    """),format.raw/*78.53*/("""<option value=""""),_display_(/*78.69*/personnel/*78.78*/.getId),format.raw/*78.84*/("""">"""),_display_(/*78.87*/personnel/*78.96*/.getNom),format.raw/*78.103*/(""" """),format.raw/*78.104*/("""- """),_display_(/*78.107*/personnel/*78.116*/.getPrenom),format.raw/*78.126*/("""</option>
                                                """)))}),format.raw/*79.50*/("""
                                            """)))}),format.raw/*80.46*/("""
                                            """),format.raw/*81.45*/("""</select>
                                        </div>

                                        </div>

                                    <div class="form-group">

                                        <div class="col-md-6">
                                            <input name="reparateur" type="text" class="form-control" placeholder="Réparateur" value=""""),_display_(/*89.136*/reparation/*89.146*/.getReparateur),format.raw/*89.160*/("""">
                                        </div>

                                        <div class="col-md-6">
                                        """),_display_(/*93.42*/if(null == reparation.getDateBonReparation)/*93.85*/ {_display_(Seq[Any](format.raw/*93.87*/("""
                                            """),format.raw/*94.45*/("""<input name="dateBonReparation" type="text"  pattern="[0-9]"""),format.raw/*94.104*/("""{"""),format.raw/*94.105*/("""2"""),format.raw/*94.106*/("""}"""),format.raw/*94.107*/("""-[0-9]"""),format.raw/*94.113*/("""{"""),format.raw/*94.114*/("""2"""),format.raw/*94.115*/("""}"""),format.raw/*94.116*/("""-[0-9]"""),format.raw/*94.122*/("""{"""),format.raw/*94.123*/("""4"""),format.raw/*94.124*/("""}"""),format.raw/*94.125*/(""""  class="form-control" placeholder="Date bon de réparation" required="required">
                                        """)))}/*95.43*/else/*95.48*/{_display_(Seq[Any](format.raw/*95.49*/("""
                                            """),format.raw/*96.45*/("""<input name="dateBonReparation" type="text" pattern="[0-9]"""),format.raw/*96.103*/("""{"""),format.raw/*96.104*/("""2"""),format.raw/*96.105*/("""}"""),format.raw/*96.106*/("""-[0-9]"""),format.raw/*96.112*/("""{"""),format.raw/*96.113*/("""2"""),format.raw/*96.114*/("""}"""),format.raw/*96.115*/("""-[0-9]"""),format.raw/*96.121*/("""{"""),format.raw/*96.122*/("""4"""),format.raw/*96.123*/("""}"""),format.raw/*96.124*/(""""  value=""""),_display_(/*96.135*/reparation/*96.145*/.getDateBonReparation.format("dd-MM-yyyy")),format.raw/*96.187*/("""" class="form-control" placeholder="Date bon de réparation" required="required">
                                            """)))}),format.raw/*97.46*/("""
                                        """),format.raw/*98.41*/("""</div>

                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <textarea name="motif" class="form-control" rows="5" placeholder="Motif">"""),_display_(/*103.119*/reparation/*103.129*/.getMotif),format.raw/*103.138*/("""</textarea>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input type="hidden" name="id" value=""""),_display_(/*109.84*/reparation/*109.94*/.getId),format.raw/*109.100*/("""">
                                            <input type="hidden" name="numero" value=""""),_display_(/*110.88*/reparation/*110.98*/.getNumero),format.raw/*110.108*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Modifier</button>
                                        </div>
                                    </div>

                                </form>
                                <a href="/bon-reparations/"""),_display_(/*116.60*/reparation/*116.70*/.getId),format.raw/*116.76*/("""/reference/"""),_display_(/*116.88*/reparation/*116.98*/.getReferenceImpressionBonReparation),format.raw/*116.134*/("""/generate" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer"> <i class="fa fa-pencil"></i> Générer </a>
                                <a href="/rapport/download/Bon-Reparation/"""),_display_(/*117.76*/reparation/*117.86*/.getReferenceImpressionBonReparation),format.raw/*117.122*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> Imprimer </a><br><br>

                                <a href="/demande-travaux/"""),_display_(/*119.60*/reparation/*119.70*/.getId),format.raw/*119.76*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Demande de travaux">
                                    Demande travaux </a>
                                <a href="/ordre-paiements/"""),_display_(/*121.60*/reparation/*121.70*/.getId),format.raw/*121.76*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Ordre de paiement">
                                    Ordre de paiement </a>

                            </div>
                        </div>
                    </div>

                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*134.6*/foot()),format.raw/*134.12*/("""

    """),format.raw/*136.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(reparation:Reparation,camions:util.List[Camion],personnels:util.List[Personnel]): play.twirl.api.HtmlFormat.Appendable = apply(reparation,camions,personnels)

  def f:((Reparation,util.List[Camion],util.List[Personnel]) => play.twirl.api.HtmlFormat.Appendable) = (reparation,camions,personnels) => apply(reparation,camions,personnels)

  def ref: this.type = this

}


}
}

/**/
object bon_reparation extends bon_reparation_Scope0.bon_reparation_Scope1.bon_reparation
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/bon_reparation.scala.html
                  HASH: 1522be7f6ee58c25b9c219b28bd69639deb85fbe
                  MATRIX: 860->19|1043->107|1071->109|1135->148|1161->154|1191->157|2052->991|2079->997|2122->1012|2596->1459|2635->1489|2675->1491|2736->1524|2981->1742|2995->1747|3029->1760|3090->1793|3157->1829|3214->1859|3255->1891|3295->1893|3356->1926|3601->2144|3615->2149|3651->2164|3718->2200|3771->2225|4169->2595|4189->2605|4217->2611|4514->2881|4552->2903|4592->2905|4669->2955|4712->2989|4752->2991|4833->3044|4876->3060|4891->3066|4918->3072|4969->3095|4985->3101|5026->3120|5104->3180|5117->3185|5156->3186|5237->3239|5280->3255|5295->3261|5322->3267|5352->3270|5367->3276|5408->3295|5498->3354|5575->3400|5648->3445|5935->3705|5979->3733|6019->3735|6096->3785|6145->3825|6185->3827|6266->3880|6309->3896|6327->3905|6354->3911|6405->3934|6424->3943|6453->3950|6484->3953|6503->3962|6535->3972|6613->4032|6626->4037|6665->4038|6746->4091|6789->4107|6807->4116|6834->4122|6864->4125|6882->4134|6911->4141|6941->4142|6972->4145|6991->4154|7023->4164|7113->4223|7190->4269|7263->4314|7657->4680|7677->4690|7713->4704|7895->4859|7947->4902|7987->4904|8060->4949|8148->5008|8178->5009|8208->5010|8238->5011|8273->5017|8303->5018|8333->5019|8363->5020|8398->5026|8428->5027|8458->5028|8488->5029|8630->5153|8643->5158|8682->5159|8755->5204|8842->5262|8872->5263|8902->5264|8932->5265|8967->5271|8997->5272|9027->5273|9057->5274|9092->5280|9122->5281|9152->5282|9182->5283|9221->5294|9241->5304|9305->5346|9462->5472|9531->5513|9854->5807|9875->5817|9907->5826|10245->6136|10265->6146|10294->6152|10412->6242|10432->6252|10465->6262|10801->6570|10821->6580|10849->6586|10889->6598|10909->6608|10968->6644|11210->6858|11230->6868|11289->6904|11532->7119|11552->7129|11580->7135|11823->7350|11843->7360|11871->7366|12390->7858|12418->7864|12452->7870
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|99->66|99->66|99->66|99->66|100->67|101->68|102->69|107->74|107->74|107->74|108->75|108->75|108->75|109->76|109->76|109->76|109->76|109->76|109->76|109->76|109->76|109->76|109->76|110->77|110->77|110->77|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|111->78|112->79|113->80|114->81|122->89|122->89|122->89|126->93|126->93|126->93|127->94|127->94|127->94|127->94|127->94|127->94|127->94|127->94|127->94|127->94|127->94|127->94|127->94|128->95|128->95|128->95|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|129->96|130->97|131->98|136->103|136->103|136->103|142->109|142->109|142->109|143->110|143->110|143->110|149->116|149->116|149->116|149->116|149->116|149->116|150->117|150->117|150->117|152->119|152->119|152->119|154->121|154->121|154->121|167->134|167->134|169->136
                  -- GENERATED --
              */
          