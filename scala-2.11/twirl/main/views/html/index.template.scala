
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import java.util

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[util.List[PaiementTransport],util.List[PaiementVente],Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(transportPaiements: util.List[PaiementTransport], ventePaiements: util.List[PaiementVente],  dateActuelle: Date):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.115*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">
    """),_display_(/*6.6*/head()),format.raw/*6.12*/("""
"""),format.raw/*7.1*/("""<body>
        <div class="preloader">
            <div class="cssload-speeding-wheel"></div>
        </div>
        <div id="wrapper">

            <nav class="navbar navbar-default navbar-static-top m-b-0">
                <div class="navbar-header"> <a class="navbar-toggle hidden-sm hidden-md hidden-lg " href="javascript:void(0)" data-toggle="collapse" data-target=".navbar-collapse"><i class="ti-menu"></i></a>

                    <ul class="nav navbar-top-links navbar-left hidden-xs">
                        <li><a href="javascript:void(0)" class="open-close hidden-xs waves-effect waves-light"><i class="icon-arrow-left-circle ti-menu"></i></a></li>
                    </ul>
                </div>
            </nav>

            """),_display_(/*22.14*/menu()),format.raw/*22.20*/("""

            """),format.raw/*24.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Tableau de bord</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Paiement Transport</h3>
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>DATE</th>
                                                <th>CLIENT</th>
                                                <th>TYPE</th>
                                                <th>MONTANT</th>
                                                <th>ECHEANCE</th>
                                                <th>ECART</th>
                                                <th>STATUS</th>
                                                <th>DÉTAIL</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*52.42*/for(paiement <- transportPaiements) yield /*52.77*/ {_display_(Seq[Any](format.raw/*52.79*/("""
                                            """),format.raw/*53.45*/("""<tr class="active">
                                                <td>"""),_display_(/*54.54*/if(null != paiement.getWhenDone)/*54.86*/ {_display_(Seq[Any](format.raw/*54.88*/("""
                                                    """),_display_(/*55.54*/paiement/*55.62*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*55.95*/("""
                                                """)))}),format.raw/*56.50*/("""</td>
                                                <th>"""),_display_(/*57.54*/paiement/*57.62*/.getFacture.getClient.getNom),format.raw/*57.90*/("""</th>
                                                <td>"""),_display_(/*58.54*/paiement/*58.62*/.getType),format.raw/*58.70*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*59.94*/paiement/*59.102*/.getMontant),format.raw/*59.113*/("""</span></td>
                                                <td>"""),_display_(/*60.54*/if(null != paiement.getEcheance)/*60.86*/ {_display_(Seq[Any](format.raw/*60.88*/("""
                                                    """),_display_(/*61.54*/paiement/*61.62*/.getEcheance.format("dd-MM-yyyy")),format.raw/*61.95*/("""
                                                """)))}),format.raw/*62.50*/("""</td>
                                                <td>
                                                """),_display_(/*64.50*/if(paiement.getDifferenceDate <= 0)/*64.85*/ {_display_(Seq[Any](format.raw/*64.87*/("""
                                                    """),format.raw/*65.53*/("""<strong style="color : red">"""),_display_(/*65.82*/paiement/*65.90*/.getDifferenceDate),format.raw/*65.108*/("""</strong>
                                                """)))}/*66.51*/else/*66.56*/{_display_(Seq[Any](format.raw/*66.57*/("""
                                                    """),format.raw/*67.53*/("""<strong style="color : green">"""),_display_(/*67.84*/paiement/*67.92*/.getDifferenceDate),format.raw/*67.110*/("""</strong>
                                                """)))}),format.raw/*68.50*/("""
                                                """),format.raw/*69.49*/("""</td>
                                                <th>
                                                    """),_display_(/*71.54*/if(paiement.getStatus.equals("Ouvert"))/*71.93*/ {_display_(Seq[Any](format.raw/*71.95*/("""
                                                        """),format.raw/*72.57*/("""<strong style="color : red"><a href="/facture-transports/"""),_display_(/*72.115*/paiement/*72.123*/.getFacture.getId),format.raw/*72.140*/("""/paiements/"""),_display_(/*72.152*/paiement/*72.160*/.getId),format.raw/*72.166*/("""/traiter" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> Traiter </a></strong>
                                                    """)))}),format.raw/*73.54*/("""
                                                    """),_display_(/*74.54*/if(paiement.getStatus.equals("Fermé"))/*74.92*/ {_display_(Seq[Any](format.raw/*74.94*/("""
                                                        """),format.raw/*75.57*/("""<strong style="color : green">Fermé</strong>
                                                    """)))}),format.raw/*76.54*/("""
                                                """),format.raw/*77.49*/("""</th>
                                                <td>
                                                    <a href="/facture-transports/"""),_display_(/*79.83*/paiement/*79.91*/.getFacture.getId),format.raw/*79.108*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                </td>

                                            </tr>
                                        """)))}),format.raw/*83.42*/("""
                                        """),format.raw/*84.41*/("""</tbody>

                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                </div>
                            </div>
                        </div>
                    </div>

                   """),format.raw/*148.29*/("""

                """),format.raw/*150.17*/("""</div>


                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*158.6*/foot()),format.raw/*158.12*/("""

    """),format.raw/*160.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(transportPaiements:util.List[PaiementTransport],ventePaiements:util.List[PaiementVente],dateActuelle:Date): play.twirl.api.HtmlFormat.Appendable = apply(transportPaiements,ventePaiements,dateActuelle)

  def f:((util.List[PaiementTransport],util.List[PaiementVente],Date) => play.twirl.api.HtmlFormat.Appendable) = (transportPaiements,ventePaiements,dateActuelle) => apply(transportPaiements,ventePaiements,dateActuelle)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:44 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/index.scala.html
                  HASH: ea75c7084ea54feb08411bbce57ba9ff90bf398f
                  MATRIX: 842->19|1051->132|1079->134|1142->172|1168->178|1195->179|1965->922|1992->928|2034->942|3732->2613|3783->2648|3823->2650|3896->2695|3996->2768|4037->2800|4077->2802|4158->2856|4175->2864|4229->2897|4310->2947|4396->3006|4413->3014|4462->3042|4548->3101|4565->3109|4594->3117|4720->3216|4738->3224|4771->3235|4864->3301|4905->3333|4945->3335|5026->3389|5043->3397|5097->3430|5178->3480|5313->3588|5357->3623|5397->3625|5478->3678|5534->3707|5551->3715|5591->3733|5669->3793|5682->3798|5721->3799|5802->3852|5860->3883|5877->3891|5917->3909|6007->3968|6084->4017|6223->4129|6271->4168|6311->4170|6396->4227|6482->4285|6500->4293|6539->4310|6579->4322|6597->4330|6625->4336|6855->4535|6936->4589|6983->4627|7023->4629|7108->4686|7237->4784|7314->4833|7482->4974|7499->4982|7538->4999|7836->5266|7905->5307|8308->9603|8355->9621|8608->9847|8636->9853|8670->9859
                  LINES: 30->2|35->2|37->4|39->6|39->6|40->7|55->22|55->22|57->24|85->52|85->52|85->52|86->53|87->54|87->54|87->54|88->55|88->55|88->55|89->56|90->57|90->57|90->57|91->58|91->58|91->58|92->59|92->59|92->59|93->60|93->60|93->60|94->61|94->61|94->61|95->62|97->64|97->64|97->64|98->65|98->65|98->65|98->65|99->66|99->66|99->66|100->67|100->67|100->67|100->67|101->68|102->69|104->71|104->71|104->71|105->72|105->72|105->72|105->72|105->72|105->72|105->72|106->73|107->74|107->74|107->74|108->75|109->76|110->77|112->79|112->79|112->79|116->83|117->84|126->148|128->150|136->158|136->158|138->160
                  -- GENERATED --
              */
          