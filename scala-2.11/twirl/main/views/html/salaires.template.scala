
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object salaires_Scope0 {
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

     object salaires_Scope1 {
import java.util

class salaires extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[util.List[Salaire],util.List[Personnel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(salaires: util.List[Salaire], personnels: util.List[Personnel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.66*/("""

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
                            <h4 class="page-title">Nos salaires</h4>
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
                                <h3 class="box-title m-b-0">Ajouter une avance sur salaire</h3>
                                <form class="form-horizontal" method="post" action="/salaires">
                                    <div class="form-group">
                                        <div class="col-md-3">
                                            <select name="personnel.id" class="form-control">
                                            """),_display_(/*62.46*/for(personnel <- personnels) yield /*62.74*/ {_display_(Seq[Any](format.raw/*62.76*/("""
                                                """),format.raw/*63.49*/("""<option value=""""),_display_(/*63.65*/personnel/*63.74*/.getId),format.raw/*63.80*/("""">"""),_display_(/*63.83*/personnel/*63.92*/.getNom),format.raw/*63.99*/(""" """),_display_(/*63.101*/personnel/*63.110*/.getPrenom),format.raw/*63.120*/("""</option>
                                            """)))}),format.raw/*64.46*/("""
                                            """),format.raw/*65.45*/("""</select>
                                        </div>

                                        <div class="col-md-3">
                                            <input name="avance" type="number" min="0" class="form-control" placeholder="Avance" required="required">
                                        </div>

                                        <div class="col-md-3">
                                            <input name="whenDone" type="text" pattern="[0-9]"""),format.raw/*73.94*/("""{"""),format.raw/*73.95*/("""2"""),format.raw/*73.96*/("""}"""),format.raw/*73.97*/("""-[0-9]"""),format.raw/*73.103*/("""{"""),format.raw/*73.104*/("""2"""),format.raw/*73.105*/("""}"""),format.raw/*73.106*/("""-[0-9]"""),format.raw/*73.112*/("""{"""),format.raw/*73.113*/("""4"""),format.raw/*73.114*/("""}"""),format.raw/*73.115*/("""" class="form-control" placeholder="Date" required="required">
                                        </div>

                                        <div class="col-md-3">
                                            <button type="submit" class="btn btn-block btn-info">Ajouter</button>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>
                    </div>

                    """),_display_(/*86.22*/if(salaires.size() > 0)/*86.45*/ {_display_(Seq[Any](format.raw/*86.47*/("""
                        """),format.raw/*87.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>NOM</th>
                                                    <th>PRÉNOM</th>
                                                    <th>AVANCE</th>
                                                    <th>ACTIONS</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*103.46*/for(salaire <- salaires) yield /*103.70*/ {_display_(Seq[Any](format.raw/*103.72*/("""
                                                """),format.raw/*104.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*105.58*/if(null != salaire.getWhenDone)/*105.89*/ {_display_(Seq[Any](format.raw/*105.91*/("""
                                                        """),_display_(/*106.58*/salaire/*106.65*/.getWhenDone.format("dd-MM-yyyy")),format.raw/*106.98*/("""
                                                    """)))}),format.raw/*107.54*/("""
                                                    """),format.raw/*108.53*/("""</td>
                                                    <td>"""),_display_(/*109.58*/salaire/*109.65*/.getPersonnel.getNom),format.raw/*109.85*/("""</td>
                                                    <td>"""),_display_(/*110.58*/salaire/*110.65*/.getPersonnel.getPrenom),format.raw/*110.88*/("""</td>
                                                    <td class="text-right"><span class="number">"""),_display_(/*111.98*/salaire/*111.105*/.getAvance),format.raw/*111.115*/("""</span></td>
                                                    <td>
                                                        <a href="/salaires/"""),_display_(/*113.77*/salaire/*113.84*/.getId),format.raw/*113.90*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>

                                                        <a href="/salaires/"""),_display_(/*115.77*/salaire/*115.84*/.getId),format.raw/*115.90*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*118.46*/("""
                                            """),format.raw/*119.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*126.22*/("""


                """),format.raw/*129.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*135.6*/foot()),format.raw/*135.12*/("""

    """),format.raw/*137.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(salaires:util.List[Salaire],personnels:util.List[Personnel]): play.twirl.api.HtmlFormat.Appendable = apply(salaires,personnels)

  def f:((util.List[Salaire],util.List[Personnel]) => play.twirl.api.HtmlFormat.Appendable) = (salaires,personnels) => apply(salaires,personnels)

  def ref: this.type = this

}


}
}

/**/
object salaires extends salaires_Scope0.salaires_Scope1.salaires
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:28 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/salaires.scala.html
                  HASH: 68e89106b0720d1d7c87dd79b7dbd739bbd4a494
                  MATRIX: 832->19|991->83|1019->85|1083->124|1109->130|1139->133|2000->967|2027->973|2070->988|2531->1422|2570->1452|2610->1454|2671->1487|2916->1705|2930->1710|2964->1723|3025->1756|3092->1792|3149->1822|3190->1854|3230->1856|3291->1889|3536->2107|3550->2112|3586->2127|3653->2163|3706->2188|4361->2816|4405->2844|4445->2846|4522->2895|4565->2911|4583->2920|4610->2926|4640->2929|4658->2938|4686->2945|4716->2947|4735->2956|4767->2966|4853->3021|4926->3066|5429->3541|5458->3542|5487->3543|5516->3544|5551->3550|5581->3551|5611->3552|5641->3553|5676->3559|5706->3560|5736->3561|5766->3562|6327->4096|6359->4119|6399->4121|6452->4146|7594->5260|7635->5284|7676->5286|7754->5335|7859->5412|7900->5443|7941->5445|8027->5503|8044->5510|8099->5543|8185->5597|8267->5650|8358->5713|8375->5720|8417->5740|8508->5803|8525->5810|8570->5833|8701->5936|8719->5943|8752->5953|8926->6099|8943->6106|8971->6112|9197->6310|9214->6317|9242->6323|9621->6670|9695->6715|10125->7113|10173->7132|10424->7356|10452->7362|10486->7368
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|95->62|95->62|95->62|96->63|96->63|96->63|96->63|96->63|96->63|96->63|96->63|96->63|96->63|97->64|98->65|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|119->86|119->86|119->86|120->87|136->103|136->103|136->103|137->104|138->105|138->105|138->105|139->106|139->106|139->106|140->107|141->108|142->109|142->109|142->109|143->110|143->110|143->110|144->111|144->111|144->111|146->113|146->113|146->113|148->115|148->115|148->115|151->118|152->119|159->126|162->129|168->135|168->135|170->137
                  -- GENERATED --
              */
          