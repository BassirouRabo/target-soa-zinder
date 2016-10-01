
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ordre_paiement_edit_Scope0 {
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

     object ordre_paiement_edit_Scope1 {
import java.util

class ordre_paiement_edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Reparation,util.List[Taf],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reparation: Reparation, tafs: util.List[Taf]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.48*/("""

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
                            <h4 class="page-title">Demande de travaux</h4>
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
                                <h3 class="box-title m-b-0">Modifier un ordre de paiement</h3>
                                <form class="form-horizontal" method="post" action="/ordre-paiements/"""),_display_(/*58.103*/reparation/*58.113*/.getId),format.raw/*58.119*/("""/update">

                                    <div class="form-group">
                                        <div class="col-md-4">
                                            <label for="dateEmission">Date d'émission</label>
                                        """),_display_(/*63.42*/if(null == reparation.getDateEmission)/*63.80*/ {_display_(Seq[Any](format.raw/*63.82*/("""
                                            """),format.raw/*64.45*/("""<input name="dateEmission" id="dateEmission" type="text" pattern="[0-9]"""),format.raw/*64.116*/("""{"""),format.raw/*64.117*/("""2"""),format.raw/*64.118*/("""}"""),format.raw/*64.119*/("""-[0-9]"""),format.raw/*64.125*/("""{"""),format.raw/*64.126*/("""2"""),format.raw/*64.127*/("""}"""),format.raw/*64.128*/("""-[0-9]"""),format.raw/*64.134*/("""{"""),format.raw/*64.135*/("""4"""),format.raw/*64.136*/("""}"""),format.raw/*64.137*/(""""  class="form-control" placeholder="Date d'émission">
                                        """)))}/*65.43*/else/*65.48*/{_display_(Seq[Any](format.raw/*65.49*/("""
                                            """),format.raw/*66.45*/("""<input name="dateEmission" type="text" pattern="[0-9]"""),format.raw/*66.98*/("""{"""),format.raw/*66.99*/("""2"""),format.raw/*66.100*/("""}"""),format.raw/*66.101*/("""-[0-9]"""),format.raw/*66.107*/("""{"""),format.raw/*66.108*/("""2"""),format.raw/*66.109*/("""}"""),format.raw/*66.110*/("""-[0-9]"""),format.raw/*66.116*/("""{"""),format.raw/*66.117*/("""4"""),format.raw/*66.118*/("""}"""),format.raw/*66.119*/(""""  class="form-control" placeholder="Date d'émission" value=""""),_display_(/*66.181*/reparation/*66.191*/.getDateEmission.format("dd-MM-yyyy")),format.raw/*66.228*/("""">
                                            """)))}),format.raw/*67.46*/("""
                                        """),format.raw/*68.41*/("""</div>
                                        <div class="col-md-4">
                                            <label for="datePaiement">Date de paiement</label>
                                        """),_display_(/*71.42*/if(null == reparation.getDatePaiement)/*71.80*/ {_display_(Seq[Any](format.raw/*71.82*/("""
                                            """),format.raw/*72.45*/("""<input name="datePaiement" id="datePaiement" type="text" pattern="[0-9]"""),format.raw/*72.116*/("""{"""),format.raw/*72.117*/("""2"""),format.raw/*72.118*/("""}"""),format.raw/*72.119*/("""-[0-9]"""),format.raw/*72.125*/("""{"""),format.raw/*72.126*/("""2"""),format.raw/*72.127*/("""}"""),format.raw/*72.128*/("""-[0-9]"""),format.raw/*72.134*/("""{"""),format.raw/*72.135*/("""4"""),format.raw/*72.136*/("""}"""),format.raw/*72.137*/(""""  class="form-control" placeholder="Date de paiement">
                                        """)))}/*73.43*/else/*73.48*/{_display_(Seq[Any](format.raw/*73.49*/("""
                                            """),format.raw/*74.45*/("""<input name="datePaiement" type="text" pattern="[0-9]"""),format.raw/*74.98*/("""{"""),format.raw/*74.99*/("""2"""),format.raw/*74.100*/("""}"""),format.raw/*74.101*/("""-[0-9]"""),format.raw/*74.107*/("""{"""),format.raw/*74.108*/("""2"""),format.raw/*74.109*/("""}"""),format.raw/*74.110*/("""-[0-9]"""),format.raw/*74.116*/("""{"""),format.raw/*74.117*/("""4"""),format.raw/*74.118*/("""}"""),format.raw/*74.119*/(""""  class="form-control" placeholder="Date de paiment" value=""""),_display_(/*74.181*/reparation/*74.191*/.getDatePaiement.format("dd-MM-yyyy")),format.raw/*74.228*/("""">
                                            """)))}),format.raw/*75.46*/("""
                                        """),format.raw/*76.41*/("""</div>

                                            <div class="col-md-4">
                                                <label for="dateOrdrePaiement">Date ordre de paiement</label>
                                            """),_display_(/*80.46*/if(null == reparation.getDateOrdrePaiement)/*80.89*/ {_display_(Seq[Any](format.raw/*80.91*/("""
                                                """),format.raw/*81.49*/("""<input name="dateOrdrePaiement" type="text"  pattern="[0-9]"""),format.raw/*81.108*/("""{"""),format.raw/*81.109*/("""2"""),format.raw/*81.110*/("""}"""),format.raw/*81.111*/("""-[0-9]"""),format.raw/*81.117*/("""{"""),format.raw/*81.118*/("""2"""),format.raw/*81.119*/("""}"""),format.raw/*81.120*/("""-[0-9]"""),format.raw/*81.126*/("""{"""),format.raw/*81.127*/("""4"""),format.raw/*81.128*/("""}"""),format.raw/*81.129*/(""""  class="form-control" placeholder="Date ordre de paiement" required="required">
                                            """)))}/*82.47*/else/*82.52*/{_display_(Seq[Any](format.raw/*82.53*/("""
                                                """),format.raw/*83.49*/("""<input name="dateOrdrePaiement" type="text" pattern="[0-9]"""),format.raw/*83.107*/("""{"""),format.raw/*83.108*/("""2"""),format.raw/*83.109*/("""}"""),format.raw/*83.110*/("""-[0-9]"""),format.raw/*83.116*/("""{"""),format.raw/*83.117*/("""2"""),format.raw/*83.118*/("""}"""),format.raw/*83.119*/("""-[0-9]"""),format.raw/*83.125*/("""{"""),format.raw/*83.126*/("""4"""),format.raw/*83.127*/("""}"""),format.raw/*83.128*/(""""  value=""""),_display_(/*83.139*/reparation/*83.149*/.getDateOrdrePaiement.format("dd-MM-yyyy")),format.raw/*83.191*/("""" class="form-control" placeholder="Date ordre de paiement" required="required">
                                                """)))}),format.raw/*84.50*/("""
                                            """),format.raw/*85.45*/("""</div>

                                      </div>

                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <input name="id" type="hidden" value=""""),_display_(/*91.84*/reparation/*91.94*/.getId),format.raw/*91.100*/("""">
                                            <input name="numero" type="hidden" value=""""),_display_(/*92.88*/reparation/*92.98*/.getNumero),format.raw/*92.108*/("""">
                                            <button type="submit" class="btn btn-block btn-info">Mettre à jour</button>
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

    """),_display_(/*108.6*/foot()),format.raw/*108.12*/("""

    """),format.raw/*110.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(reparation:Reparation,tafs:util.List[Taf]): play.twirl.api.HtmlFormat.Appendable = apply(reparation,tafs)

  def f:((Reparation,util.List[Taf]) => play.twirl.api.HtmlFormat.Appendable) = (reparation,tafs) => apply(reparation,tafs)

  def ref: this.type = this

}


}
}

/**/
object ordre_paiement_edit extends ordre_paiement_edit_Scope0.ordre_paiement_edit_Scope1.ordre_paiement_edit
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/ordre_paiement_edit.scala.html
                  HASH: 2a023da5e3e0ec976ac9bc135d43a346d219052b
                  MATRIX: 851->19|992->65|1020->67|1084->106|1110->112|1140->115|2001->949|2028->955|2071->970|2538->1410|2577->1440|2617->1442|2678->1475|2923->1693|2937->1698|2971->1711|3032->1744|3099->1780|3156->1810|3197->1842|3237->1844|3298->1877|3543->2095|3557->2100|3593->2115|3660->2151|3713->2176|4111->2546|4131->2556|4159->2562|4456->2832|4503->2870|4543->2872|4616->2917|4716->2988|4746->2989|4776->2990|4806->2991|4841->2997|4871->2998|4901->2999|4931->3000|4966->3006|4996->3007|5026->3008|5056->3009|5171->3106|5184->3111|5223->3112|5296->3157|5377->3210|5406->3211|5436->3212|5466->3213|5501->3219|5531->3220|5561->3221|5591->3222|5626->3228|5656->3229|5686->3230|5716->3231|5806->3293|5826->3303|5885->3340|5964->3388|6033->3429|6266->3635|6313->3673|6353->3675|6426->3720|6526->3791|6556->3792|6586->3793|6616->3794|6651->3800|6681->3801|6711->3802|6741->3803|6776->3809|6806->3810|6836->3811|6866->3812|6982->3910|6995->3915|7034->3916|7107->3961|7188->4014|7217->4015|7247->4016|7277->4017|7312->4023|7342->4024|7372->4025|7402->4026|7437->4032|7467->4033|7497->4034|7527->4035|7617->4097|7637->4107|7696->4144|7775->4192|7844->4233|8101->4463|8153->4506|8193->4508|8270->4557|8358->4616|8388->4617|8418->4618|8448->4619|8483->4625|8513->4626|8543->4627|8573->4628|8608->4634|8638->4635|8668->4636|8698->4637|8844->4765|8857->4770|8896->4771|8973->4820|9060->4878|9090->4879|9120->4880|9150->4881|9185->4887|9215->4888|9245->4889|9275->4890|9310->4896|9340->4897|9370->4898|9400->4899|9439->4910|9459->4920|9523->4962|9684->5092|9757->5137|10045->5398|10064->5408|10092->5414|10209->5504|10228->5514|10260->5524|10875->6112|10903->6118|10937->6124
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|99->66|100->67|101->68|104->71|104->71|104->71|105->72|105->72|105->72|105->72|105->72|105->72|105->72|105->72|105->72|105->72|105->72|105->72|105->72|106->73|106->73|106->73|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|107->74|108->75|109->76|113->80|113->80|113->80|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|115->82|115->82|115->82|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|116->83|117->84|118->85|124->91|124->91|124->91|125->92|125->92|125->92|141->108|141->108|143->110
                  -- GENERATED --
              */
          