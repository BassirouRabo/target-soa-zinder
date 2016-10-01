
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ordre_paiements_Scope0 {
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

     object ordre_paiements_Scope1 {
import java.util

class ordre_paiements extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Reparation],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reparations: util.List[Reparation]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.38*/("""


"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*8.6*/head()),format.raw/*8.12*/("""


"""),format.raw/*11.1*/("""<body>
            <!-- Preloader -->
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

            """),_display_(/*27.14*/menu()),format.raw/*27.20*/("""

            """),format.raw/*29.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Demande de travaux</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*39.30*/if(flash.containsKey("error"))/*39.60*/ {_display_(Seq[Any](format.raw/*39.62*/("""
                                """),format.raw/*40.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*42.38*/flash/*42.43*/.get("error")),format.raw/*42.56*/("""
                                """),format.raw/*43.33*/("""</div>
                            """)))}),format.raw/*44.30*/("""
                            """),_display_(/*45.30*/if(flash.containsKey("success"))/*45.62*/ {_display_(Seq[Any](format.raw/*45.64*/("""
                                """),format.raw/*46.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*48.38*/flash/*48.43*/.get("success")),format.raw/*48.58*/("""</div>
                            """)))}),format.raw/*49.30*/("""
                        """),format.raw/*50.25*/("""</div>
                    </div>

                    """),_display_(/*53.22*/if(reparations.size() > 0)/*53.48*/ {_display_(Seq[Any](format.raw/*53.50*/("""
                        """),format.raw/*54.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>N° ORDRE</th>
                                                    <th>SERVICE</th>
                                                    <th>DATE D'EMISSION</th>
                                                    <th>DATE DE PAIEMENT</th>
                                                    <th>CAMION</th>
                                                    <th>CHAUFFEUR</th>
                                                    <th>MONTANT</th>
                                                    <th>GÉNÉRER</th>
                                                    <th>IMPRIMER</th>
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*75.46*/for(reparation <- reparations) yield /*75.76*/ {_display_(Seq[Any](format.raw/*75.78*/("""
                                                """),format.raw/*76.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*77.58*/reparation/*77.68*/.getNumero),format.raw/*77.78*/("""</td>
                                                    <td>"""),_display_(/*78.58*/reparation/*78.68*/.getService),format.raw/*78.79*/("""</td>
                                                    <td>"""),_display_(/*79.58*/if(null != reparation.getDateEmission)/*79.96*/ {_display_(Seq[Any](format.raw/*79.98*/("""
                                                        """),_display_(/*80.58*/reparation/*80.68*/.getDateEmission.format("dd-MM-yyyy")),format.raw/*80.105*/("""
                                                    """)))}),format.raw/*81.54*/("""</td>
                                                    <td>"""),_display_(/*82.58*/if(null != reparation.getDatePaiement)/*82.96*/ {_display_(Seq[Any](format.raw/*82.98*/("""
                                                        """),_display_(/*83.58*/reparation/*83.68*/.getDatePaiement.format("dd-MM-yyyy")),format.raw/*83.105*/("""
                                                    """)))}),format.raw/*84.54*/("""</td>
                                                    <td>"""),_display_(/*85.58*/reparation/*85.68*/.getCamion.getImmatriculation),format.raw/*85.97*/("""</td>
                                                    <td>"""),_display_(/*86.58*/reparation/*86.68*/.getPersonnel.getNom),format.raw/*86.88*/("""
                                                        """),format.raw/*87.57*/("""- """),_display_(/*87.60*/reparation/*87.70*/.getPersonnel.getPrenom),format.raw/*87.93*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*88.98*/reparation/*88.108*/.getMontant),format.raw/*88.119*/("""</span></td>
                                                    <td>
                                                        <a href="/ordre-paiements/"""),_display_(/*90.84*/reparation/*90.94*/.getId),format.raw/*90.100*/("""/reference/"""),_display_(/*90.112*/reparation/*90.122*/.getReferenceImpressionOrdrePaiement),format.raw/*90.158*/("""/generate" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/rapport/download/Ordre-Paiement/"""),_display_(/*93.100*/reparation/*93.110*/.getReferenceImpressionOrdrePaiement),format.raw/*93.146*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/ordre-paiements/"""),_display_(/*96.84*/reparation/*96.94*/.getId),format.raw/*96.100*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*99.46*/("""
                                            """),format.raw/*100.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*107.22*/("""


                """),format.raw/*110.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>

            </div>
        </div>

    """),_display_(/*117.6*/foot()),format.raw/*117.12*/("""

    """),format.raw/*119.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(reparations:util.List[Reparation]): play.twirl.api.HtmlFormat.Appendable = apply(reparations)

  def f:((util.List[Reparation]) => play.twirl.api.HtmlFormat.Appendable) = (reparations) => apply(reparations)

  def ref: this.type = this

}


}
}

/**/
object ordre_paiements extends ordre_paiements_Scope0.ordre_paiements_Scope1.ordre_paiements
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/ordre_paiements.scala.html
                  HASH: 80fd43fe3cc24527a09a21d0448884a3f345165b
                  MATRIX: 835->19|966->55|995->58|1059->97|1085->103|1115->106|1916->880|1943->886|1985->900|2452->1340|2491->1370|2531->1372|2592->1405|2837->1623|2851->1628|2885->1641|2946->1674|3013->1710|3070->1740|3111->1772|3151->1774|3212->1807|3457->2025|3471->2030|3507->2045|3574->2081|3627->2106|3710->2162|3745->2188|3785->2190|3838->2215|5352->3702|5398->3732|5438->3734|5515->3783|5619->3860|5638->3870|5669->3880|5759->3943|5778->3953|5810->3964|5900->4027|5947->4065|5987->4067|6072->4125|6091->4135|6150->4172|6235->4226|6325->4289|6372->4327|6412->4329|6497->4387|6516->4397|6575->4434|6660->4488|6750->4551|6769->4561|6819->4590|6909->4653|6928->4663|6969->4683|7054->4740|7084->4743|7103->4753|7147->4776|7277->4879|7297->4889|7330->4900|7510->5053|7529->5063|7557->5069|7597->5081|7617->5091|7675->5127|8048->5472|8068->5482|8126->5518|8489->5854|8508->5864|8536->5870|8845->6148|8919->6193|9349->6591|9397->6610|9649->6835|9677->6841|9711->6847
                  LINES: 30->2|35->2|38->5|41->8|41->8|44->11|60->27|60->27|62->29|72->39|72->39|72->39|73->40|75->42|75->42|75->42|76->43|77->44|78->45|78->45|78->45|79->46|81->48|81->48|81->48|82->49|83->50|86->53|86->53|86->53|87->54|108->75|108->75|108->75|109->76|110->77|110->77|110->77|111->78|111->78|111->78|112->79|112->79|112->79|113->80|113->80|113->80|114->81|115->82|115->82|115->82|116->83|116->83|116->83|117->84|118->85|118->85|118->85|119->86|119->86|119->86|120->87|120->87|120->87|120->87|121->88|121->88|121->88|123->90|123->90|123->90|123->90|123->90|123->90|126->93|126->93|126->93|129->96|129->96|129->96|132->99|133->100|140->107|143->110|150->117|150->117|152->119
                  -- GENERATED --
              */
          