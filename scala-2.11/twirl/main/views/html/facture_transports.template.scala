
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object facture_transports_Scope0 {
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

     object facture_transports_Scope1 {
import java.util

class facture_transports extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[util.List[FactureTransport],util.List[ClientTransport],Date,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(factures: util.List[FactureTransport], clients: util.List[ClientTransport], dateActuelle: Date):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.98*/("""

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
                            <h4 class="page-title">Nos factures transports</h4>
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
                                <form class="form-horizontal" method="post" action="/facture-transports">
                                    <div class="form-group">
                                        <div class="col-md-5">
                                            <select name="client.id" class="form-control" required="required">
                                            """),_display_(/*62.46*/for(client <- clients) yield /*62.68*/ {_display_(Seq[Any](format.raw/*62.70*/("""
                                                """),format.raw/*63.49*/("""<option value=""""),_display_(/*63.65*/client/*63.71*/.getId),format.raw/*63.77*/("""">"""),_display_(/*63.80*/client/*63.86*/.getNom),format.raw/*63.93*/("""</option>
                                            """)))}),format.raw/*64.46*/("""
                                            """),format.raw/*65.45*/("""</select>
                                        </div>
                                        <div class="col-md-5">
                                            <input type="text" name="objet" placeholder="Objet" class="form-control" required="required">
                                        </div>

                                        <div class="col-md-2">
                                            <button type="submit" class="btn btn-block btn-info">Créer</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    """),_display_(/*81.22*/if(factures.size() > 0)/*81.45*/ {_display_(Seq[Any](format.raw/*81.47*/("""
                        """),format.raw/*82.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>RÉFÉRENCE</th>
                                                    <th>OBJET</th>
                                                    <th>CLIENT</th>
                                                    <th>ACTIONS</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*98.46*/for(facture <- factures) yield /*98.70*/ {_display_(Seq[Any](format.raw/*98.72*/("""
                                                """),format.raw/*99.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*100.58*/if(null != facture.getWhenDone)/*100.89*/ {_display_(Seq[Any](format.raw/*100.91*/("""
                                                        """),_display_(/*101.58*/facture/*101.65*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*101.98*/("""
                                                    """)))}),format.raw/*102.54*/("""</td>
                                                    <td>P"""),_display_(/*103.59*/facture/*103.66*/.getReferenceFactureProforma),format.raw/*103.94*/("""/SOA/"""),_display_(/*103.100*/(Long.valueOf(dateActuelle.format("yyyy")))),format.raw/*103.143*/("""</td>
                                                    <td>"""),_display_(/*104.58*/facture/*104.65*/.getObjet),format.raw/*104.74*/("""</td>
                                                    <td>"""),_display_(/*105.58*/facture/*105.65*/.getClient.getNom),format.raw/*105.82*/("""</td>
                                                    <td>
                                                        <a href="/facture-transports/"""),_display_(/*107.87*/facture/*107.94*/.getId),format.raw/*107.100*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                        <a href="/facture-transports/"""),_display_(/*108.87*/facture/*108.94*/.getId),format.raw/*108.100*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*111.46*/("""
                                            """),format.raw/*112.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*119.22*/("""


                """),format.raw/*122.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*128.6*/foot()),format.raw/*128.12*/("""

    """),format.raw/*130.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(factures:util.List[FactureTransport],clients:util.List[ClientTransport],dateActuelle:Date): play.twirl.api.HtmlFormat.Appendable = apply(factures,clients,dateActuelle)

  def f:((util.List[FactureTransport],util.List[ClientTransport],Date) => play.twirl.api.HtmlFormat.Appendable) = (factures,clients,dateActuelle) => apply(factures,clients,dateActuelle)

  def ref: this.type = this

}


}
}

/**/
object facture_transports extends facture_transports_Scope0.facture_transports_Scope1.facture_transports
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/facture_transports.scala.html
                  HASH: 9416ae9622abdb35a54bf353608e34bfc20a639b
                  MATRIX: 882->19|1073->115|1101->117|1165->156|1191->162|1221->165|2082->999|2109->1005|2152->1020|2624->1465|2663->1495|2703->1497|2764->1530|3009->1748|3023->1753|3057->1766|3118->1799|3185->1835|3242->1865|3283->1897|3323->1899|3384->1932|3629->2150|3643->2155|3679->2170|3746->2206|3799->2231|4479->2884|4517->2906|4557->2908|4634->2957|4677->2973|4692->2979|4719->2985|4749->2988|4764->2994|4792->3001|4878->3056|4951->3101|5705->3828|5737->3851|5777->3853|5830->3878|6976->4997|7016->5021|7056->5023|7133->5072|7238->5149|7279->5180|7320->5182|7406->5240|7423->5247|7478->5280|7564->5334|7656->5398|7673->5405|7723->5433|7758->5439|7824->5482|7915->5545|7932->5552|7963->5561|8054->5624|8071->5631|8110->5648|8287->5797|8304->5804|8333->5810|8568->6017|8585->6024|8614->6030|8993->6377|9067->6422|9497->6820|9545->6839|9796->7063|9824->7069|9858->7075
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|95->62|95->62|95->62|96->63|96->63|96->63|96->63|96->63|96->63|96->63|97->64|98->65|114->81|114->81|114->81|115->82|131->98|131->98|131->98|132->99|133->100|133->100|133->100|134->101|134->101|134->101|135->102|136->103|136->103|136->103|136->103|136->103|137->104|137->104|137->104|138->105|138->105|138->105|140->107|140->107|140->107|141->108|141->108|141->108|144->111|145->112|152->119|155->122|161->128|161->128|163->130
                  -- GENERATED --
              */
          