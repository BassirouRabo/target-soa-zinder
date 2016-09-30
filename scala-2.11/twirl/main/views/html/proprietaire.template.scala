
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object proprietaire_Scope0 {
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

     object proprietaire_Scope1 {
import java.util

class proprietaire extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Proprietaire,util.List[Camion],Long,Long,Long,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(proprietaire: Proprietaire, camions : util.List[Camion], globalTaf: Long, globalTafMonth: Long, globalCommande: Long, globalCommandeMonth: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.147*/("""

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
                        <h4 class="page-title">Modifier un propiétaire</h4>
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
                            <h3 class="box-title m-b-0">Modifier un proprietaire</h3>
                            <form class="form-horizontal" method="post" action="/proprietaires/"""),_display_(/*58.97*/proprietaire/*58.109*/.getId),format.raw/*58.115*/("""/update">
                                <div class="form-group">
                                    <div class="col-md-10">
                                        <input name="nom" type="text" class="form-control" value=""""),_display_(/*61.100*/proprietaire/*61.112*/.getNom),format.raw/*61.119*/("""" required="required">
                                    </div>

                                    <div class="col-md-2">
                                        <input name="id" type="hidden" value=""""),_display_(/*65.80*/proprietaire/*65.92*/.getId),format.raw/*65.98*/("""">
                                        <button type="submit" class="btn btn-block btn-info">Modifier</button>
                                    </div>
                                </div>

                            </form>
                        </div>
                    </div>
                </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Liste camions</h3>
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>IMMATRICULATION</th>
                                                <th>CARTE GRISE</th>
                                                <th>CARACTERISTIQUE</th>
                                                <th>DÉPENSE(T.A.F)</th>
                                                <th>RECETTE(COMMANDE)</th>
                                                <th>DÉPENSE / MOIS</th>
                                                <th>RECETTE / MOIS</th>
                                                <th>ACTION</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*95.42*/for(camion <- camions) yield /*95.64*/ {_display_(Seq[Any](format.raw/*95.66*/("""
                                            """),format.raw/*96.45*/("""<tr class="active">
                                                <td>"""),_display_(/*97.54*/camion/*97.60*/.getImmatriculation),format.raw/*97.79*/("""</td>
                                                <td>"""),_display_(/*98.54*/camion/*98.60*/.getNumeroCarteGrise),format.raw/*98.80*/("""</td>
                                                <td>"""),_display_(/*99.54*/camion/*99.60*/.getCaracteristique),format.raw/*99.79*/("""</td>
                                                <td class="text-right"><span class="number">"""),_display_(/*100.94*/camion/*100.100*/.getTotalTaf),format.raw/*100.112*/("""</span></td>
                                                <td class="text-right"><span class="number">"""),_display_(/*101.94*/camion/*101.100*/.getTotalCommande),format.raw/*101.117*/("""</span></td>
                                                <td class="text-right"><span class="number">"""),_display_(/*102.94*/camion/*102.100*/.getTotalTafMonth),format.raw/*102.117*/("""</span></td>
                                                <td class="text-right"><span class="number">"""),_display_(/*103.94*/camion/*103.100*/.getTotalCommandeMonth),format.raw/*103.122*/("""</span></td>

                                                <td>
                                                    <a href="/camions/"""),_display_(/*106.72*/camion/*106.78*/.getId),format.raw/*106.84*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>

                                                    <a href="/camions/"""),_display_(/*108.72*/camion/*108.78*/.getId),format.raw/*108.84*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*111.42*/("""
                                        """),format.raw/*112.41*/("""</tbody>
                                        <tfoot>
                                            <tr class="active">
                                                <th>TOTAL</th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*118.94*/globalTaf),format.raw/*118.103*/("""</span></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*119.94*/globalCommande),format.raw/*119.108*/("""</span></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*120.94*/globalTafMonth),format.raw/*120.108*/("""</span></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*121.94*/globalCommandeMonth),format.raw/*121.113*/("""</span></th>
                                                <th></th>
                                            </tr>
                                            <tr class="active">
                                                <th>RÉSULTAT</th>
                                                <th></th>
                                                <th></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*129.94*/(globalCommande - globalTaf)),format.raw/*129.122*/("""</span></th>
                                                <th></th>
                                                <th class="text-right"><span class="number">"""),_display_(/*131.94*/(globalCommandeMonth - globalTafMonth)),format.raw/*131.132*/("""</span></th>
                                                <th></th>
                                            </tr>
                                        </tfoot>
                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                </div>
                            </div>
                        </div>
                    </div>


            </div>
            <footer class="footer text-center"> 2016 &copy;
                Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
        </div>
    </div>

    """),_display_(/*149.6*/foot()),format.raw/*149.12*/("""

"""),format.raw/*151.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(proprietaire:Proprietaire,camions:util.List[Camion],globalTaf:Long,globalTafMonth:Long,globalCommande:Long,globalCommandeMonth:Long): play.twirl.api.HtmlFormat.Appendable = apply(proprietaire,camions,globalTaf,globalTafMonth,globalCommande,globalCommandeMonth)

  def f:((Proprietaire,util.List[Camion],Long,Long,Long,Long) => play.twirl.api.HtmlFormat.Appendable) = (proprietaire,camions,globalTaf,globalTafMonth,globalCommande,globalCommandeMonth) => apply(proprietaire,camions,globalTaf,globalTafMonth,globalCommande,globalCommandeMonth)

  def ref: this.type = this

}


}
}

/**/
object proprietaire extends proprietaire_Scope0.proprietaire_Scope1.proprietaire
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:43 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/proprietaire.scala.html
                  HASH: eda136c1d02234b9cd2bcb821d4309e96f63492c
                  MATRIX: 855->19|1096->164|1124->166|1188->205|1214->211|1244->214|2049->992|2076->998|2114->1009|2550->1418|2589->1448|2629->1450|2686->1479|2923->1689|2937->1694|2971->1707|3028->1736|3091->1768|3144->1794|3185->1826|3225->1828|3282->1857|3519->2067|3533->2072|3569->2087|3632->2119|3681->2140|4047->2479|4069->2491|4097->2497|4351->2723|4373->2735|4402->2742|4634->2947|4655->2959|4682->2965|6427->4683|6465->4705|6505->4707|6578->4752|6678->4825|6693->4831|6733->4850|6819->4909|6834->4915|6875->4935|6961->4994|6976->5000|7016->5019|7143->5118|7160->5124|7195->5136|7329->5242|7346->5248|7386->5265|7520->5371|7537->5377|7577->5394|7711->5500|7728->5506|7773->5528|7939->5666|7955->5672|7983->5678|8204->5871|8220->5877|8248->5883|8615->6218|8685->6259|9106->6652|9138->6661|9272->6767|9309->6781|9443->6887|9480->6901|9614->7007|9656->7026|10202->7544|10253->7572|10445->7736|10506->7774|11269->8510|11297->8516|11327->8518
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|91->58|91->58|91->58|94->61|94->61|94->61|98->65|98->65|98->65|128->95|128->95|128->95|129->96|130->97|130->97|130->97|131->98|131->98|131->98|132->99|132->99|132->99|133->100|133->100|133->100|134->101|134->101|134->101|135->102|135->102|135->102|136->103|136->103|136->103|139->106|139->106|139->106|141->108|141->108|141->108|144->111|145->112|151->118|151->118|152->119|152->119|153->120|153->120|154->121|154->121|162->129|162->129|164->131|164->131|182->149|182->149|184->151
                  -- GENERATED --
              */
          