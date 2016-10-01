
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object utilisateurs_Scope0 {
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

     object utilisateurs_Scope1 {
import java.util

class utilisateurs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Utilisateur],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(utilisateurs: util.List[Utilisateur]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.40*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""


"""),format.raw/*10.1*/("""<body class="fix-sidebar">
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

            """),_display_(/*25.14*/menu()),format.raw/*25.20*/("""


            """),format.raw/*28.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Utilisateurs</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                <div class="table-responsive">
                                    <table class="table table-bordered order-table sortable" id="printTable">
                                        <thead>
                                            <tr class="active">
                                                <th>NOM</th>
                                                <th>TÉLÉPHONE</th>
                                                <th>EMAIL</th>
                                                <th>ACTIONS</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        """),_display_(/*51.42*/for(utilisateur <- utilisateurs) yield /*51.74*/ {_display_(Seq[Any](format.raw/*51.76*/("""
                                            """),format.raw/*52.45*/("""<tr class="active">
                                                <td>"""),_display_(/*53.54*/utilisateur/*53.65*/.getNom),format.raw/*53.72*/("""</td>
                                                <td>"""),_display_(/*54.54*/utilisateur/*54.65*/.getTelephone),format.raw/*54.78*/("""</td>
                                                <td>"""),_display_(/*55.54*/utilisateur/*55.65*/.getEmail),format.raw/*55.74*/("""</td>
                                                <td>
                                                    <a href="/utilisateurs/"""),_display_(/*57.77*/utilisateur/*57.88*/.getId),format.raw/*57.94*/("""" class="btn btn-info btn-outline" data-toggle="tooltip" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    <a href="/utilisateurs/"""),_display_(/*58.77*/utilisateur/*58.88*/.getId),format.raw/*58.94*/("""/delete" class="btn btn-info btn-outline" onclick="return window.confirm('Voulez vous supprimez ?');" data-toggle="tooltip" data-original-title="Supprimer"> <span><i class="fa fa-close"></i> </span> </a>
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*61.42*/("""
                                        """),format.raw/*62.41*/("""</tbody>
                                    </table>
                                    <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-2 col-sm-4 col-xs-12">
                            <a href="/inscription" class="btn btn-block btn-info">+ Nouveau</a>
                        </div>
                    </div>

                </div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*82.6*/foot()),format.raw/*82.12*/("""

    """),format.raw/*84.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(utilisateurs:util.List[Utilisateur]): play.twirl.api.HtmlFormat.Appendable = apply(utilisateurs)

  def f:((util.List[Utilisateur]) => play.twirl.api.HtmlFormat.Appendable) = (utilisateurs) => apply(utilisateurs)

  def ref: this.type = this

}


}
}

/**/
object utilisateurs extends utilisateurs_Scope0.utilisateurs_Scope1.utilisateurs
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/utilisateurs.scala.html
                  HASH: 9c13fe0ea8db0deada437b1abd1b820ff8bd4bb5
                  MATRIX: 827->19|960->57|988->59|1052->98|1078->104|1108->107|1928->900|1955->906|1998->921|3355->2251|3403->2283|3443->2285|3516->2330|3616->2403|3636->2414|3664->2421|3750->2480|3770->2491|3804->2504|3890->2563|3910->2574|3940->2583|4102->2718|4122->2729|4149->2735|4373->2932|4393->2943|4420->2949|4800->3298|4869->3339|5748->4192|5775->4198|5808->4204
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|58->25|58->25|61->28|84->51|84->51|84->51|85->52|86->53|86->53|86->53|87->54|87->54|87->54|88->55|88->55|88->55|90->57|90->57|90->57|91->58|91->58|91->58|94->61|95->62|115->82|115->82|117->84
                  -- GENERATED --
              */
          