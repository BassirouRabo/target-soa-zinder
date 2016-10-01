
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object demande_travauxs_Scope0 {
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

     object demande_travauxs_Scope1 {
import java.util

class demande_travauxs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Reparation],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reparations: util.List[Reparation]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.38*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""


        """),format.raw/*10.9*/("""<body>
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

            """),_display_(/*26.14*/menu()),format.raw/*26.20*/("""

            """),format.raw/*28.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Demande de travaux</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*38.30*/if(flash.containsKey("error"))/*38.60*/ {_display_(Seq[Any](format.raw/*38.62*/("""
                                """),format.raw/*39.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*41.38*/flash/*41.43*/.get("error")),format.raw/*41.56*/("""
                                """),format.raw/*42.33*/("""</div>
                            """)))}),format.raw/*43.30*/("""
                            """),_display_(/*44.30*/if(flash.containsKey("success"))/*44.62*/ {_display_(Seq[Any](format.raw/*44.64*/("""
                                """),format.raw/*45.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*47.38*/flash/*47.43*/.get("success")),format.raw/*47.58*/("""</div>
                            """)))}),format.raw/*48.30*/("""
                        """),format.raw/*49.25*/("""</div>
                    </div>

                    """),_display_(/*52.22*/if(reparations.size() > 0)/*52.48*/ {_display_(Seq[Any](format.raw/*52.50*/("""
                        """),format.raw/*53.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>SERVICE</th>
                                                    <th>CAMION</th>
                                                    <th>CHAUFFEUR</th>
                                                    <th>AFFECTATION</th>
                                                    <th>GÉNÉRER</th>
                                                    <th>IMPRIMER</th>
                                                    <th>DÉTAIL</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*72.46*/for(reparation <- reparations) yield /*72.76*/ {_display_(Seq[Any](format.raw/*72.78*/("""
                                                """),format.raw/*73.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*74.58*/if(null != reparation.getWhenDone)/*74.92*/ {_display_(Seq[Any](format.raw/*74.94*/("""
                                                        """),_display_(/*75.58*/reparation/*75.68*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*75.101*/("""
                                                    """)))}),format.raw/*76.54*/("""</td>
                                                    <td>"""),_display_(/*77.58*/reparation/*77.68*/.getService),format.raw/*77.79*/("""</td>
                                                    <td>"""),_display_(/*78.58*/reparation/*78.68*/.getCamion.getImmatriculation),format.raw/*78.97*/("""</td>
                                                    <td>"""),_display_(/*79.58*/reparation/*79.68*/.getPersonnel.getNom),format.raw/*79.88*/("""
                                                        """),format.raw/*80.57*/("""- """),_display_(/*80.60*/reparation/*80.70*/.getPersonnel.getPrenom),format.raw/*80.93*/("""</td>
                                                    <td>"""),_display_(/*81.58*/reparation/*81.68*/.getAffectation),format.raw/*81.83*/("""</td>
                                                    <td>
                                                        <a href="/demande-travauxs/"""),_display_(/*83.85*/reparation/*83.95*/.getId),format.raw/*83.101*/("""/reference/"""),_display_(/*83.113*/reparation/*83.123*/.getReferenceImpressionDemandeTravaux),format.raw/*83.160*/("""/generate" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/rapport/download/Demande-Travaux/"""),_display_(/*86.101*/reparation/*86.111*/.getReferenceImpressionDemandeTravaux),format.raw/*86.148*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/demande-travaux/"""),_display_(/*89.84*/reparation/*89.94*/.getId),format.raw/*89.100*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*92.46*/("""
                                            """),format.raw/*93.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*100.22*/("""

                """),format.raw/*102.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>

            </div>
        </div>

            """),_display_(/*109.14*/foot()),format.raw/*109.20*/("""

    """),format.raw/*111.5*/("""</body>
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
object demande_travauxs extends demande_travauxs_Scope0.demande_travauxs_Scope1.demande_travauxs
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:13 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/demande_travauxs.scala.html
                  HASH: 5607d869b3e5dae682e9f29a40130609d19be7a0
                  MATRIX: 838->19|969->55|997->57|1061->96|1087->102|1125->113|1926->887|1953->893|1995->907|2462->1347|2501->1377|2541->1379|2602->1412|2847->1630|2861->1635|2895->1648|2956->1681|3023->1717|3080->1747|3121->1779|3161->1781|3222->1814|3467->2032|3481->2037|3517->2052|3584->2088|3637->2113|3720->2169|3755->2195|3795->2197|3848->2222|5207->3554|5253->3584|5293->3586|5370->3635|5474->3712|5517->3746|5557->3748|5642->3806|5661->3816|5716->3849|5801->3903|5891->3966|5910->3976|5942->3987|6032->4050|6051->4060|6101->4089|6191->4152|6210->4162|6251->4182|6336->4239|6366->4242|6385->4252|6429->4275|6519->4338|6538->4348|6574->4363|6748->4510|6767->4520|6795->4526|6835->4538|6855->4548|6914->4585|7288->4931|7308->4941|7367->4978|7730->5314|7749->5324|7777->5330|8086->5608|8159->5653|8589->6051|8636->6069|8897->6302|8925->6308|8959->6314
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|59->26|59->26|61->28|71->38|71->38|71->38|72->39|74->41|74->41|74->41|75->42|76->43|77->44|77->44|77->44|78->45|80->47|80->47|80->47|81->48|82->49|85->52|85->52|85->52|86->53|105->72|105->72|105->72|106->73|107->74|107->74|107->74|108->75|108->75|108->75|109->76|110->77|110->77|110->77|111->78|111->78|111->78|112->79|112->79|112->79|113->80|113->80|113->80|113->80|114->81|114->81|114->81|116->83|116->83|116->83|116->83|116->83|116->83|119->86|119->86|119->86|122->89|122->89|122->89|125->92|126->93|133->100|135->102|142->109|142->109|144->111
                  -- GENERATED --
              */
          