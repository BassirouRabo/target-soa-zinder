
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object personnels_Scope0 {
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

     object personnels_Scope1 {
import java.util

class personnels extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Personnel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(personnels: util.List[Personnel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.36*/("""

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
                            <h4 class="page-title">Personnel interne</h4>
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
                                <h3 class="box-title m-b-0">Ajouter un nouveau personnel</h3>
                                <form class="form-horizontal" method="post" action="/personnels">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <select name="fonction" required="required" class="form-control" >
                                                <option value="Administratif">Administratif</option>
                                                <option value="Chauffeur">Chauffeur</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nom" type="text" class="form-control" placeholder="Nom" required="required">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="prenom" type="text" class="form-control" placeholder="Prénom" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="telephone" type="text" class="form-control" placeholder="téléphone">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="salaire" type="number" min="0" class="form-control" placeholder="Salaire">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-2">
                                            <button type="submit" class="btn btn-block btn-info">Ajouter</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    """),_display_(/*97.22*/if(personnels.size() > 0)/*97.47*/ {_display_(Seq[Any](format.raw/*97.49*/("""
                        """),format.raw/*98.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>NOM</th>
                                                    <th>PRÉNOM</th>
                                                    <th>TÉLÉPHONE</th>
                                                    <th>FONCTION</th>
                                                    <th>SALAIRE</th>
                                                    <th>ACTIONS</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*115.46*/for(personnel <- personnels) yield /*115.74*/ {_display_(Seq[Any](format.raw/*115.76*/("""
                                                """),format.raw/*116.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*117.58*/personnel/*117.67*/.getNom),format.raw/*117.74*/("""</td>
                                                    <td>"""),_display_(/*118.58*/personnel/*118.67*/.getPrenom),format.raw/*118.77*/("""</td>
                                                    <td>"""),_display_(/*119.58*/personnel/*119.67*/.getTelephone),format.raw/*119.80*/("""</td>
                                                    <td>"""),_display_(/*120.58*/personnel/*120.67*/.getFonction),format.raw/*120.79*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*121.98*/personnel/*121.107*/.getSalaire),format.raw/*121.118*/("""</span></td>
                                                    <td>
                                                        <a href="/personnels/"""),_display_(/*123.79*/personnel/*123.88*/.getId),format.raw/*123.94*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>

                                                        <a href="/personnels/"""),_display_(/*125.79*/personnel/*125.88*/.getId),format.raw/*125.94*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*128.46*/("""
                                            """),format.raw/*129.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*136.22*/("""


                """),format.raw/*139.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*145.6*/foot()),format.raw/*145.12*/("""

    """),format.raw/*147.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(personnels:util.List[Personnel]): play.twirl.api.HtmlFormat.Appendable = apply(personnels)

  def f:((util.List[Personnel]) => play.twirl.api.HtmlFormat.Appendable) = (personnels) => apply(personnels)

  def ref: this.type = this

}


}
}

/**/
object personnels extends personnels_Scope0.personnels_Scope1.personnels
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:14 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/personnels.scala.html
                  HASH: aa89905ba26fd4ff6d6b41628ec368660672c0a6
                  MATRIX: 819->19|948->53|976->55|1040->94|1066->100|1096->103|1957->937|1984->943|2027->958|2493->1397|2532->1427|2572->1429|2633->1462|2878->1680|2892->1685|2926->1698|2987->1731|3054->1767|3111->1797|3152->1829|3192->1831|3253->1864|3498->2082|3512->2087|3548->2102|3615->2138|3668->2163|6300->4768|6334->4793|6374->4795|6427->4820|7645->6010|7690->6038|7731->6040|7809->6089|7914->6166|7933->6175|7962->6182|8053->6245|8072->6254|8104->6264|8195->6327|8214->6336|8249->6349|8340->6412|8359->6421|8393->6433|8524->6536|8544->6545|8578->6556|8754->6704|8773->6713|8801->6719|9029->6919|9048->6928|9076->6934|9455->7281|9529->7326|9959->7724|10007->7743|10258->7967|10286->7973|10320->7979
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|130->97|130->97|130->97|131->98|148->115|148->115|148->115|149->116|150->117|150->117|150->117|151->118|151->118|151->118|152->119|152->119|152->119|153->120|153->120|153->120|154->121|154->121|154->121|156->123|156->123|156->123|158->125|158->125|158->125|161->128|162->129|169->136|172->139|178->145|178->145|180->147
                  -- GENERATED --
              */
          