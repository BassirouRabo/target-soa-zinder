
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object depenses_Scope0 {
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

     object depenses_Scope1 {
import java.util

class depenses extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[util.List[Depense],util.List[Depense],util.List[Camion],Long,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(depenses: util.List[Depense], depensesMonth: util.List[Depense], camions: util.List[Camion], totalDepenseMonth: Long, totalDepense: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.140*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""


        """),format.raw/*10.9*/("""<body class="fix-sidebar">
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
                            <h4 class="page-title">Nos depenses</h4>
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
                                <h3 class="box-title m-b-0">Ajouter une nouvelle dépense administrative</h3>
                                <form class="form-horizontal" method="post" action="/depenses">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="beneficiaire" type="text"class="form-control" placeholder="Bénéficiaire">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="montant" type="number" min="0" class="form-control" placeholder="Montant">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <textarea name="libelle" class="form-control" rows="5" placeholder="Libellé"></textarea>
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

                        <div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">DÉPENSES DU MOIS</h3>
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>BÉNÉFICIAIRE</th>
                                                    <th>LIBELLE</th>
                                                    <th>MONTANT</th>
                                                    <th>DETAIL</th>
                                                    <th>SUPPRIMER</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*103.46*/for(depense <- depensesMonth) yield /*103.75*/ {_display_(Seq[Any](format.raw/*103.77*/("""
                                                """),format.raw/*104.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*105.58*/if(null != depense.getWhenDone)/*105.89*/ {_display_(Seq[Any](format.raw/*105.91*/("""
                                                        """),_display_(/*106.58*/depense/*106.65*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*106.98*/("""
                                                    """)))}),format.raw/*107.54*/("""</td>
                                                    <td>"""),_display_(/*108.58*/depense/*108.65*/.getBeneficiaire),format.raw/*108.81*/("""</td>
                                                    <td>"""),_display_(/*109.58*/depense/*109.65*/.getLibelle),format.raw/*109.76*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*110.98*/depense/*110.105*/.getMontant),format.raw/*110.116*/("""</span></td>
                                                    <td>
                                                        <a href="/depenses/"""),_display_(/*112.77*/depense/*112.84*/.getId),format.raw/*112.90*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/depenses/"""),_display_(/*115.77*/depense/*115.84*/.getId),format.raw/*115.90*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*118.46*/("""
                                            """),format.raw/*119.45*/("""</tbody>
                                            <tfoot>
                                                <tr class="active">
                                                    <th>TOTAL</th>
                                                    <th></th>
                                                    <th></th>
                                                    <th class="text-right"><span class="number">"""),_display_(/*125.98*/totalDepenseMonth),format.raw/*125.115*/("""</span></th>
                                                    <th></th>
                                                    <th></th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    """),_display_(/*137.22*/if(depenses.size() > 0)/*137.45*/ {_display_(Seq[Any](format.raw/*137.47*/("""
                        """),format.raw/*138.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <h3 class="box-title m-b-0">DÉPENSES GLOBALE</h3>
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>BÉNÉFICIAIRE</th>
                                                    <th>LIBELLE</th>
                                                    <th>MONTANT</th>
                                                    <th>DETAIL</th>
                                                    <th>SUPPRIMER</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*156.46*/for(depense <- depenses) yield /*156.70*/ {_display_(Seq[Any](format.raw/*156.72*/("""
                                                """),format.raw/*157.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*158.58*/if(null != depense.getWhenDone)/*158.89*/ {_display_(Seq[Any](format.raw/*158.91*/("""
                                                        """),_display_(/*159.58*/depense/*159.65*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*159.98*/("""
                                                    """)))}),format.raw/*160.54*/("""</td>
                                                    <td>"""),_display_(/*161.58*/depense/*161.65*/.getBeneficiaire),format.raw/*161.81*/("""</td>
                                                    <td>"""),_display_(/*162.58*/depense/*162.65*/.getLibelle),format.raw/*162.76*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*163.98*/depense/*163.105*/.getMontant),format.raw/*163.116*/("""</span></td>
                                                    <td>
                                                        <a href="/depenses/"""),_display_(/*165.77*/depense/*165.84*/.getId),format.raw/*165.90*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/depenses/"""),_display_(/*168.77*/depense/*168.84*/.getId),format.raw/*168.90*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*171.46*/("""
                                            """),format.raw/*172.45*/("""</tbody>
                                            <tfoot>
                                                <tr class="active">
                                                    <th>TOTAL</th>
                                                    <th></th>
                                                    <th></th>
                                                    <th class="text-right"><span class="number">"""),_display_(/*178.98*/totalDepense),format.raw/*178.110*/("""</span></th>
                                                    <th></th>
                                                    <th></th>
                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*188.22*/("""


                """),format.raw/*191.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

            """),_display_(/*197.14*/foot()),format.raw/*197.20*/("""

    """),format.raw/*199.5*/("""</body>
</html>

"""))
      }
    }
  }

  def render(depenses:util.List[Depense],depensesMonth:util.List[Depense],camions:util.List[Camion],totalDepenseMonth:Long,totalDepense:Long): play.twirl.api.HtmlFormat.Appendable = apply(depenses,depensesMonth,camions,totalDepenseMonth,totalDepense)

  def f:((util.List[Depense],util.List[Depense],util.List[Camion],Long,Long) => play.twirl.api.HtmlFormat.Appendable) = (depenses,depensesMonth,camions,totalDepenseMonth,totalDepense) => apply(depenses,depensesMonth,camions,totalDepenseMonth,totalDepense)

  def ref: this.type = this

}


}
}

/**/
object depenses extends depenses_Scope0.depenses_Scope1.depenses
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 01:30:44 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/depenses.scala.html
                  HASH: 4252be83a3dc104f69d66c54ebd21a08844f9bc6
                  MATRIX: 858->19|1092->157|1120->159|1184->198|1210->204|1248->215|2109->1049|2136->1055|2179->1070|2640->1504|2679->1534|2719->1536|2780->1569|3025->1787|3039->1792|3073->1805|3134->1838|3201->1874|3258->1904|3299->1936|3339->1938|3400->1971|3645->2189|3659->2194|3695->2209|3762->2245|3815->2270|6926->5353|6972->5382|7013->5384|7091->5433|7196->5510|7237->5541|7278->5543|7364->5601|7381->5608|7436->5641|7522->5695|7613->5758|7630->5765|7668->5781|7759->5844|7776->5851|7809->5862|7940->5965|7958->5972|7992->5983|8166->6129|8183->6136|8211->6142|8551->6454|8568->6461|8596->6467|8975->6814|9049->6859|9494->7276|9534->7293|10196->7927|10229->7950|10270->7952|10324->7977|11633->9258|11674->9282|11715->9284|11793->9333|11898->9410|11939->9441|11980->9443|12066->9501|12083->9508|12138->9541|12224->9595|12315->9658|12332->9665|12370->9681|12461->9744|12478->9751|12511->9762|12642->9865|12660->9872|12694->9883|12868->10029|12885->10036|12913->10042|13253->10354|13270->10361|13298->10367|13677->10714|13751->10759|14196->11176|14231->11188|14725->11650|14773->11669|15033->11901|15061->11907|15095->11913
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|136->103|136->103|136->103|137->104|138->105|138->105|138->105|139->106|139->106|139->106|140->107|141->108|141->108|141->108|142->109|142->109|142->109|143->110|143->110|143->110|145->112|145->112|145->112|148->115|148->115|148->115|151->118|152->119|158->125|158->125|170->137|170->137|170->137|171->138|189->156|189->156|189->156|190->157|191->158|191->158|191->158|192->159|192->159|192->159|193->160|194->161|194->161|194->161|195->162|195->162|195->162|196->163|196->163|196->163|198->165|198->165|198->165|201->168|201->168|201->168|204->171|205->172|211->178|211->178|221->188|224->191|230->197|230->197|232->199
                  -- GENERATED --
              */
          