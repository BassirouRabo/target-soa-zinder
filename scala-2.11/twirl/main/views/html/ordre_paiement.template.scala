
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ordre_paiement_Scope0 {
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

     object ordre_paiement_Scope1 {
import java.util

class ordre_paiement extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Reparation,util.List[Taf],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reparation: Reparation, tafs: util.List[Taf]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.math.BigInteger ; var i = 0;

Seq[Any](format.raw/*2.48*/(""";
"""),format.raw/*4.1*/("""

"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*9.6*/head()),format.raw/*9.12*/("""


    """),format.raw/*12.5*/("""<body class="fix-sidebar">
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


            """),_display_(/*30.14*/menu()),format.raw/*30.20*/("""


            """),format.raw/*33.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Ordre de paiement</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*43.30*/if(flash.containsKey("error"))/*43.60*/ {_display_(Seq[Any](format.raw/*43.62*/("""
                                """),format.raw/*44.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*46.38*/flash/*46.43*/.get("error")),format.raw/*46.56*/("""
                                """),format.raw/*47.33*/("""</div>
                            """)))}),format.raw/*48.30*/("""
                            """),_display_(/*49.30*/if(flash.containsKey("success"))/*49.62*/ {_display_(Seq[Any](format.raw/*49.64*/("""
                                """),format.raw/*50.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*52.38*/flash/*52.43*/.get("success")),format.raw/*52.58*/("""</div>
                            """)))}),format.raw/*53.30*/("""
                        """),format.raw/*54.25*/("""</div>
                    </div>

                    """),_display_(/*57.22*/if(null == reparation.getDateEmission)/*57.60*/ {_display_(Seq[Any](format.raw/*57.62*/("""
                        """),format.raw/*58.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">Modifier un ordre de paiement</h3>
                                    <form class="form-horizontal" method="post" action="/ordre-paiements/"""),_display_(/*62.107*/reparation/*62.117*/.getId),format.raw/*62.123*/("""/update">

                                        <div class="form-group">
                                            <div class="col-md-4">
                                                <label for="dateEmission">Date d'émission</label>
                                                <input name="dateEmission" id="dateEmission" type="text" pattern="[0-9]"""),format.raw/*67.120*/("""{"""),format.raw/*67.121*/("""2"""),format.raw/*67.122*/("""}"""),format.raw/*67.123*/("""-[0-9]"""),format.raw/*67.129*/("""{"""),format.raw/*67.130*/("""2"""),format.raw/*67.131*/("""}"""),format.raw/*67.132*/("""-[0-9]"""),format.raw/*67.138*/("""{"""),format.raw/*67.139*/("""4"""),format.raw/*67.140*/("""}"""),format.raw/*67.141*/(""""  class="form-control" placeholder="Date d'émission">
                                            </div>

                                            <div class="col-md-4">
                                                <label for="datePaiement">Date de paiement</label>
                                                <input name="datePaiement" id="datePaiement" type="text" pattern="[0-9]"""),format.raw/*72.120*/("""{"""),format.raw/*72.121*/("""2"""),format.raw/*72.122*/("""}"""),format.raw/*72.123*/("""-[0-9]"""),format.raw/*72.129*/("""{"""),format.raw/*72.130*/("""2"""),format.raw/*72.131*/("""}"""),format.raw/*72.132*/("""-[0-9]"""),format.raw/*72.138*/("""{"""),format.raw/*72.139*/("""4"""),format.raw/*72.140*/("""}"""),format.raw/*72.141*/(""""  class="form-control" placeholder="Date de paiement">
                                            </div>

                                            <div class="col-md-4">
                                                <label for="dateOrdrePaiement">Date ordre de paiement</label>
                                                """),_display_(/*77.50*/if(null == reparation.getDateOrdrePaiement)/*77.93*/ {_display_(Seq[Any](format.raw/*77.95*/("""
                                                    """),format.raw/*78.53*/("""<input name="dateOrdrePaiement" type="text"  pattern="[0-9]"""),format.raw/*78.112*/("""{"""),format.raw/*78.113*/("""2"""),format.raw/*78.114*/("""}"""),format.raw/*78.115*/("""-[0-9]"""),format.raw/*78.121*/("""{"""),format.raw/*78.122*/("""2"""),format.raw/*78.123*/("""}"""),format.raw/*78.124*/("""-[0-9]"""),format.raw/*78.130*/("""{"""),format.raw/*78.131*/("""4"""),format.raw/*78.132*/("""}"""),format.raw/*78.133*/(""""  class="form-control" placeholder="Date ordre de paiement" required="required">
                                                """)))}/*79.51*/else/*79.56*/{_display_(Seq[Any](format.raw/*79.57*/("""
                                                    """),format.raw/*80.53*/("""<input name="dateOrdrePaiement" type="text" pattern="[0-9]"""),format.raw/*80.111*/("""{"""),format.raw/*80.112*/("""2"""),format.raw/*80.113*/("""}"""),format.raw/*80.114*/("""-[0-9]"""),format.raw/*80.120*/("""{"""),format.raw/*80.121*/("""2"""),format.raw/*80.122*/("""}"""),format.raw/*80.123*/("""-[0-9]"""),format.raw/*80.129*/("""{"""),format.raw/*80.130*/("""4"""),format.raw/*80.131*/("""}"""),format.raw/*80.132*/(""""  value=""""),_display_(/*80.143*/reparation/*80.153*/.getDateOrdrePaiement.format("dd-MM-yyyy")),format.raw/*80.195*/("""" class="form-control" placeholder="Date ordre de paiement" required="required">
                                                    """)))}),format.raw/*81.54*/("""
                                            """),format.raw/*82.45*/("""</div>

                                        </div>

                                        <div class="form-group">
                                            <div class="col-md-2">
                                                <input name="id" type="hidden" value=""""),_display_(/*88.88*/reparation/*88.98*/.getId),format.raw/*88.104*/("""">
                                                <input name="numero" type="hidden" value=""""),_display_(/*89.92*/reparation/*89.102*/.getNumero),format.raw/*89.112*/("""">
                                                <button type="submit" class="btn btn-block btn-info">Mettre à jour</button>
                                            </div>
                                        </div>

                                    </form>
                                </div>
                            </div>
                        </div>
                    """)))}/*98.23*/else/*98.28*/{_display_(Seq[Any](format.raw/*98.29*/("""
                        """),format.raw/*99.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <dl>
                                        <dt>DATE</dt>
                                        <dd>"""),_display_(/*104.46*/if(null != reparation.getDateOrdrePaiement)/*104.89*/{_display_(Seq[Any](format.raw/*104.90*/("""
                                            """),_display_(/*105.46*/reparation/*105.56*/.getDateOrdrePaiement.format("dd-MM-yyyy")),format.raw/*105.98*/("""
                                        """)))}),format.raw/*106.42*/("""</dd><br>
                                        <dt>N° ORDRE</dt>
                                        <dd>"""),_display_(/*108.46*/reparation/*108.56*/.getNumero),format.raw/*108.66*/("""</dd><br>
                                        <dt>SERVICE</dt>
                                        <dd>"""),_display_(/*110.46*/reparation/*110.56*/.getService),format.raw/*110.67*/("""</dd><br>
                                        <dt>DATE D'EMISSION</dt>
                                        <dd>"""),_display_(/*112.46*/if(null != reparation.getDateEmission)/*112.84*/ {_display_(Seq[Any](format.raw/*112.86*/("""
                                            """),_display_(/*113.46*/reparation/*113.56*/.getDateEmission.format("dd-MM-yyyy")),format.raw/*113.93*/("""
                                        """)))}),format.raw/*114.42*/("""</dd><br>
                                        <dt>DATE DE PAIEMENT</dt>
                                        <dd>"""),_display_(/*116.46*/if(null != reparation.getDatePaiement)/*116.84*/ {_display_(Seq[Any](format.raw/*116.86*/("""
                                            """),_display_(/*117.46*/reparation/*117.56*/.getDatePaiement.format("dd-MM-yyyy")),format.raw/*117.93*/("""
                                        """)))}),format.raw/*118.42*/("""</dd><br>
                                        <dt>PROPRIÉTAIRE</dt>
                                        <dd>"""),_display_(/*120.46*/reparation/*120.56*/.getCamion.getProprietaire.getNom),format.raw/*120.89*/("""</dd><br>
                                        <dt>TRANSPORTEUR</dt>
                                        <dd>"""),_display_(/*122.46*/reparation/*122.56*/.getPersonnel.getNom),format.raw/*122.76*/(""" """),_display_(/*122.78*/reparation/*122.88*/.getPersonnel.getPrenom),format.raw/*122.111*/("""</dd><br>
                                        <dt>MONTANT EN LETTRE</dt>
                                        <dd>"""),_display_(/*124.46*/reparation/*124.56*/.getMontantLettre),format.raw/*124.73*/("""</dd>
                                    </dl>
                                    <a href="/ordre-paiements/"""),_display_(/*126.64*/reparation/*126.74*/.getId),format.raw/*126.80*/("""/reference/"""),_display_(/*126.92*/reparation/*126.102*/.getReferenceImpressionOrdrePaiement),format.raw/*126.138*/("""/generate" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer"> <i class="fa fa-pencil"></i> Générer </a>
                                    <a href="/rapport/download/Ordre-Paiement/"""),_display_(/*127.80*/reparation/*127.90*/.getReferenceImpressionOrdrePaiement),format.raw/*127.126*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> Imprimer </a><br><br>

                                    <a href="/ordre-paiements/"""),_display_(/*129.64*/reparation/*129.74*/.getId),format.raw/*129.80*/("""/edit" class="btn btn-info">Modifier</a>
                                    <a href="/bon-reparations/"""),_display_(/*130.64*/reparation/*130.74*/.getId),format.raw/*130.80*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Bon de reparation">
                                        Bon de reparation </a>
                                    <a href="/demande-travaux/"""),_display_(/*132.64*/reparation/*132.74*/.getId),format.raw/*132.80*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Demande de travaux">
                                        Demande travaux </a>

                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*138.22*/("""

                    """),format.raw/*140.21*/("""<div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">TAF</h3>
                                """),_display_(/*144.34*/if(tafs.size() > 0)/*144.53*/ {_display_(Seq[Any](format.raw/*144.55*/("""
                                    """),format.raw/*145.37*/("""<input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>ORDRE</th>
                                                    <th>LIBELLÉ</th>
                                                    <th>MONTANT</th>
                                                    <th>MODIFIER</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*157.46*/for(taf <- tafs) yield /*157.62*/ {_display_(Seq[Any](format.raw/*157.64*/("""
                                                """),format.raw/*158.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*159.58*/{i = i + 1;i}),format.raw/*159.71*/("""</td>
                                                    <td>"""),_display_(/*160.58*/taf/*160.61*/.getTravail),format.raw/*160.72*/("""</td>
                                                    <td class="text-right">
                                                    """),_display_(/*162.54*/if(taf.getMontant == 0)/*162.77*/ {_display_(Seq[Any](format.raw/*162.79*/("""
                                                        """),format.raw/*163.57*/("""<form method="post" action="/ordre-paiements/"""),_display_(/*163.103*/taf/*163.106*/.getReparation.getId),format.raw/*163.126*/("""/tafs/"""),_display_(/*163.133*/taf/*163.136*/.getId),format.raw/*163.142*/("""/update" class="form-horizontal">
                                                            <input type="number" name="montant" placeholder="0" min="0" class="form-control">

                                                            <input type="hidden" name="id" value=""""),_display_(/*166.100*/taf/*166.103*/.getId),format.raw/*166.109*/("""">
                                                            <input type="hidden" name="travail" value=""""),_display_(/*167.105*/taf/*167.108*/.getTravail),format.raw/*167.119*/("""">
                                                            <input type="hidden" name="observation" value=""""),_display_(/*168.109*/taf/*168.112*/.getObservation),format.raw/*168.127*/("""">
                                                            <button type="submit" class="btn btn-info btn-outline"><i class="fa fa-pencil"></i></button>
                                                        </form>
                                                    """)))}/*171.55*/else/*171.60*/{_display_(Seq[Any](format.raw/*171.61*/("""
                                                        """),format.raw/*172.57*/("""<span class="number"> """),_display_(/*172.80*/taf/*172.83*/.getMontant),format.raw/*172.94*/("""</span>
                                                    """)))}),format.raw/*173.54*/("""
                                                    """),format.raw/*174.53*/("""</td>
                                                    <td>
                                                        <a href="/ordre-paiements/"""),_display_(/*176.84*/reparation/*176.94*/.getId),format.raw/*176.100*/("""/tafs/"""),_display_(/*176.107*/taf/*176.110*/.getId),format.raw/*176.116*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*179.46*/("""
                                            """),format.raw/*180.45*/("""</tbody>
                                            <tfoot>
                                                <tr class="active">
                                                    <th>NET À PAYER</th>
                                                    <td></td>
                                                    <th class="text-right"><span class="number">"""),_display_(/*185.98*/reparation/*185.108*/.getMontant),format.raw/*185.119*/("""</span></th>
                                                    <td></td>
                                                </tr>
                                            </tfoot>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                """)))}),format.raw/*192.34*/("""
                            """),format.raw/*193.29*/("""</div>
                        </div>

                    </div>


                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

        """),_display_(/*205.10*/foot()),format.raw/*205.16*/("""

    """),format.raw/*207.5*/("""</body>
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
object ordre_paiement extends ordre_paiement_Scope0.ordre_paiement_Scope1.ordre_paiement
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:43 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/ordre_paiement.scala.html
                  HASH: 5bebf0d179b472b4d03121b371dd50de41b0004c
                  MATRIX: 836->19|1017->65|1045->109|1073->111|1137->150|1163->156|1197->163|2059->998|2086->1004|2129->1019|2595->1458|2634->1488|2674->1490|2735->1523|2980->1741|2994->1746|3028->1759|3089->1792|3156->1828|3213->1858|3254->1890|3294->1892|3355->1925|3600->2143|3614->2148|3650->2163|3717->2199|3770->2224|3853->2280|3900->2318|3940->2320|3993->2345|4352->2676|4372->2686|4400->2692|4789->3052|4819->3053|4849->3054|4879->3055|4914->3061|4944->3062|4974->3063|5004->3064|5039->3070|5069->3071|5099->3072|5129->3073|5550->3465|5580->3466|5610->3467|5640->3468|5675->3474|5705->3475|5735->3476|5765->3477|5800->3483|5830->3484|5860->3485|5890->3486|6251->3820|6303->3863|6343->3865|6424->3918|6512->3977|6542->3978|6572->3979|6602->3980|6637->3986|6667->3987|6697->3988|6727->3989|6762->3995|6792->3996|6822->3997|6852->3998|7002->4130|7015->4135|7054->4136|7135->4189|7222->4247|7252->4248|7282->4249|7312->4250|7347->4256|7377->4257|7407->4258|7437->4259|7472->4265|7502->4266|7532->4267|7562->4268|7601->4279|7621->4289|7685->4331|7850->4465|7923->4510|8225->4785|8244->4795|8272->4801|8393->4895|8413->4905|8445->4915|8860->5312|8873->5317|8912->5318|8965->5343|9259->5609|9312->5652|9352->5653|9426->5699|9446->5709|9510->5751|9584->5793|9725->5906|9745->5916|9777->5926|9917->6038|9937->6048|9970->6059|10118->6179|10166->6217|10207->6219|10281->6265|10301->6275|10360->6312|10434->6354|10583->6475|10631->6513|10672->6515|10746->6561|10766->6571|10825->6608|10899->6650|11044->6767|11064->6777|11119->6810|11264->6927|11284->6937|11326->6957|11356->6959|11376->6969|11422->6992|11572->7114|11592->7124|11631->7141|11770->7252|11790->7262|11818->7268|11858->7280|11879->7290|11938->7326|12184->7544|12204->7554|12263->7590|12510->7809|12530->7819|12558->7825|12690->7929|12710->7939|12738->7945|12990->8169|13010->8179|13038->8185|13357->8472|13408->8494|13656->8714|13685->8733|13726->8735|13792->8772|14711->9663|14744->9679|14785->9681|14863->9730|14968->9807|15003->9820|15094->9883|15107->9886|15140->9897|15303->10032|15336->10055|15377->10057|15463->10114|15538->10160|15552->10163|15595->10183|15631->10190|15645->10193|15674->10199|15979->10475|15993->10478|16022->10484|16158->10591|16172->10594|16206->10605|16346->10716|16360->10719|16398->10734|16691->11008|16705->11013|16745->11014|16831->11071|16882->11094|16895->11097|16928->11108|17021->11169|17103->11222|17277->11368|17297->11378|17326->11384|17362->11391|17376->11394|17405->11400|17715->11678|17789->11723|18178->12084|18199->12094|18233->12105|18743->12583|18801->12612|19141->12924|19169->12930|19203->12936
                  LINES: 30->2|35->2|36->4|38->6|41->9|41->9|44->12|62->30|62->30|65->33|75->43|75->43|75->43|76->44|78->46|78->46|78->46|79->47|80->48|81->49|81->49|81->49|82->50|84->52|84->52|84->52|85->53|86->54|89->57|89->57|89->57|90->58|94->62|94->62|94->62|99->67|99->67|99->67|99->67|99->67|99->67|99->67|99->67|99->67|99->67|99->67|99->67|104->72|104->72|104->72|104->72|104->72|104->72|104->72|104->72|104->72|104->72|104->72|104->72|109->77|109->77|109->77|110->78|110->78|110->78|110->78|110->78|110->78|110->78|110->78|110->78|110->78|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|113->81|114->82|120->88|120->88|120->88|121->89|121->89|121->89|130->98|130->98|130->98|131->99|136->104|136->104|136->104|137->105|137->105|137->105|138->106|140->108|140->108|140->108|142->110|142->110|142->110|144->112|144->112|144->112|145->113|145->113|145->113|146->114|148->116|148->116|148->116|149->117|149->117|149->117|150->118|152->120|152->120|152->120|154->122|154->122|154->122|154->122|154->122|154->122|156->124|156->124|156->124|158->126|158->126|158->126|158->126|158->126|158->126|159->127|159->127|159->127|161->129|161->129|161->129|162->130|162->130|162->130|164->132|164->132|164->132|170->138|172->140|176->144|176->144|176->144|177->145|189->157|189->157|189->157|190->158|191->159|191->159|192->160|192->160|192->160|194->162|194->162|194->162|195->163|195->163|195->163|195->163|195->163|195->163|195->163|198->166|198->166|198->166|199->167|199->167|199->167|200->168|200->168|200->168|203->171|203->171|203->171|204->172|204->172|204->172|204->172|205->173|206->174|208->176|208->176|208->176|208->176|208->176|208->176|211->179|212->180|217->185|217->185|217->185|224->192|225->193|237->205|237->205|239->207
                  -- GENERATED --
              */
          