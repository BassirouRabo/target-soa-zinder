
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object facture_ventes_Scope0 {
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

     object facture_ventes_Scope1 {
import java.util

class facture_ventes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[util.List[FactureVente],util.List[ClientVente],Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(factures: util.List[FactureVente], clients: util.List[ClientVente], dateActuelle: Date):play.twirl.api.HtmlFormat.Appendable = {
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
                            <h4 class="page-title">Nos factures ventes</h4>
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
                                <h3 class="box-title m-b-0">Ajouter une nouvelle facture</h3>
                                <form class="form-horizontal" method="post" action="/facture-ventes">
                                    <div class="form-group">
                                        <div class="col-md-10">
                                            <select name="client.id" class="form-control" required="required">
                                            """),_display_(/*62.46*/for(client <- clients) yield /*62.68*/ {_display_(Seq[Any](format.raw/*62.70*/("""
                                                """),format.raw/*63.49*/("""<option value=""""),_display_(/*63.65*/client/*63.71*/.getId),format.raw/*63.77*/("""">"""),_display_(/*63.80*/client/*63.86*/.getNom),format.raw/*63.93*/("""</option>
                                            """)))}),format.raw/*64.46*/("""
                                            """),format.raw/*65.45*/("""</select>
                                        </div>

                                        <div class="col-md-2">
                                            <button type="submit" class="btn btn-block btn-info">Créer</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    """),_display_(/*78.22*/if(factures.size() > 0)/*78.45*/ {_display_(Seq[Any](format.raw/*78.47*/("""
                        """),format.raw/*79.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>RÉFÉRENCE</th>
                                                    <th>CLIENT</th>
                                                    <th>ACTIONS</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*94.46*/for(facture <- factures) yield /*94.70*/ {_display_(Seq[Any](format.raw/*94.72*/("""
                                                """),format.raw/*95.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*96.58*/if(null != facture.getWhenDone)/*96.89*/ {_display_(Seq[Any](format.raw/*96.91*/("""
                                                        """),_display_(/*97.58*/facture/*97.65*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*97.98*/("""
                                                    """)))}),format.raw/*98.54*/("""</td>
                                                    <td>P"""),_display_(/*99.59*/facture/*99.66*/.getReferenceFactureProforma),format.raw/*99.94*/("""/TIT/"""),_display_(/*99.100*/(Long.valueOf(dateActuelle.format("yyyy")))),format.raw/*99.143*/("""</td>
                                                    <td>"""),_display_(/*100.58*/facture/*100.65*/.getClient.getNom),format.raw/*100.82*/("""</td>
                                                    <td>
                                                        <a href="/facture-ventes/"""),_display_(/*102.83*/facture/*102.90*/.getId),format.raw/*102.96*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                        <a href="/facture-ventes/"""),_display_(/*103.83*/facture/*103.90*/.getId),format.raw/*103.96*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*106.46*/("""
                                            """),format.raw/*107.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*114.22*/("""


                """),format.raw/*117.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*123.6*/foot()),format.raw/*123.12*/("""

    """),format.raw/*125.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(factures:util.List[FactureVente],clients:util.List[ClientVente],dateActuelle:Date): play.twirl.api.HtmlFormat.Appendable = apply(factures,clients,dateActuelle)

  def f:((util.List[FactureVente],util.List[ClientVente],Date) => play.twirl.api.HtmlFormat.Appendable) = (factures,clients,dateActuelle) => apply(factures,clients,dateActuelle)

  def ref: this.type = this

}


}
}

/**/
object facture_ventes extends facture_ventes_Scope0.facture_ventes_Scope1.facture_ventes
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:13 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/facture_ventes.scala.html
                  HASH: 3833adcaf569e7ef2b6f760c4d5315c53482c4ba
                  MATRIX: 862->19|1045->107|1073->109|1137->148|1163->154|1193->157|2054->991|2081->997|2124->1012|2592->1453|2631->1483|2671->1485|2732->1518|2977->1736|2991->1741|3025->1754|3086->1787|3153->1823|3210->1853|3251->1885|3291->1887|3352->1920|3597->2138|3611->2143|3647->2158|3714->2194|3767->2219|4444->2869|4482->2891|4522->2893|4599->2942|4642->2958|4657->2964|4684->2970|4714->2973|4729->2979|4757->2986|4843->3041|4916->3086|5422->3565|5454->3588|5494->3590|5547->3615|6626->4667|6666->4691|6706->4693|6783->4742|6887->4819|6927->4850|6967->4852|7052->4910|7068->4917|7122->4950|7207->5004|7298->5068|7314->5075|7363->5103|7397->5109|7462->5152|7553->5215|7570->5222|7609->5239|7782->5384|7799->5391|7827->5397|8058->5600|8075->5607|8103->5613|8482->5960|8556->6005|8986->6403|9034->6422|9285->6646|9313->6652|9347->6658
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|95->62|95->62|95->62|96->63|96->63|96->63|96->63|96->63|96->63|96->63|97->64|98->65|111->78|111->78|111->78|112->79|127->94|127->94|127->94|128->95|129->96|129->96|129->96|130->97|130->97|130->97|131->98|132->99|132->99|132->99|132->99|132->99|133->100|133->100|133->100|135->102|135->102|135->102|136->103|136->103|136->103|139->106|140->107|147->114|150->117|156->123|156->123|158->125
                  -- GENERATED --
              */
          