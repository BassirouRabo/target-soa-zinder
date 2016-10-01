
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object camions_Scope0 {
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

     object camions_Scope1 {
import java.util

class camions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[util.List[Camion],util.List[Proprietaire],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(camions: util.List[Camion], proprietaires: util.List[Proprietaire]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.70*/("""

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
                            <h4 class="page-title">Nos Camions</h4>
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
                                <h3 class="box-title m-b-0">Ajouter un nouveau camion</h3>
                                <form class="form-horizontal" method="post" action="/camions">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="immatriculation" type="text" class="form-control" placeholder="Immatriculation" required="required">
                                        </div>

                                        <div class="col-md-6">
                                            <select name="proprietaire.id" class="form-control" required="required">
                                               """),_display_(/*66.49*/for(proprietaire <- proprietaires) yield /*66.83*/ {_display_(Seq[Any](format.raw/*66.85*/("""
                                                   """),format.raw/*67.52*/("""<option value=""""),_display_(/*67.68*/proprietaire/*67.80*/.getId),format.raw/*67.86*/("""">"""),_display_(/*67.89*/proprietaire/*67.101*/.getNom),format.raw/*67.108*/("""</option>
                                               """)))}),format.raw/*68.49*/("""
                                            """),format.raw/*69.45*/("""</select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <textarea name="numeroCarteGrise" class="form-control" rows="5" placeholder="Numéro carte grise"></textarea>
                                        </div>

                                        <div class="col-md-6">
                                            <textarea name="caracteristique" class="form-control" rows="5" placeholder="Caracteristique"></textarea>
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

                    """),_display_(/*94.22*/if(camions.size() > 0)/*94.44*/ {_display_(Seq[Any](format.raw/*94.46*/("""
                        """),format.raw/*95.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>IMMATRICULATION</th>
                                                    <th>PROPRIETAIRE</th>
                                                    <th>CARTE GRISE</th>
                                                    <th>CARACTERISTIQUE</th>
                                                    <th>ACTION</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*111.46*/for(camion <- camions) yield /*111.68*/ {_display_(Seq[Any](format.raw/*111.70*/("""
                                                """),format.raw/*112.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*113.58*/camion/*113.64*/.getImmatriculation),format.raw/*113.83*/("""</td>
                                                    <td>"""),_display_(/*114.58*/camion/*114.64*/.getProprietaire.getNom),format.raw/*114.87*/("""</td>
                                                    <td>"""),_display_(/*115.58*/camion/*115.64*/.getNumeroCarteGrise),format.raw/*115.84*/("""</td>
                                                    <td>"""),_display_(/*116.58*/camion/*116.64*/.getCaracteristique),format.raw/*116.83*/("""</td>
                                                    <td>
                                                        <a href="/camions/"""),_display_(/*118.76*/camion/*118.82*/.getId),format.raw/*118.88*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                        <a href="/camions/"""),_display_(/*119.76*/camion/*119.82*/.getId),format.raw/*119.88*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*122.46*/("""
                                            """),format.raw/*123.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*130.22*/("""


                """),format.raw/*133.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

    """),_display_(/*139.6*/foot()),format.raw/*139.12*/("""

    """),format.raw/*141.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(camions:util.List[Camion],proprietaires:util.List[Proprietaire]): play.twirl.api.HtmlFormat.Appendable = apply(camions,proprietaires)

  def f:((util.List[Camion],util.List[Proprietaire]) => play.twirl.api.HtmlFormat.Appendable) = (camions,proprietaires) => apply(camions,proprietaires)

  def ref: this.type = this

}


}
}

/**/
object camions extends camions_Scope0.camions_Scope1.camions
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 22:58:14 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/camions.scala.html
                  HASH: df242f72b1df825cc4076bf1cd9b208ef1af40a7
                  MATRIX: 831->19|994->87|1022->89|1086->128|1112->134|1142->137|2003->971|2030->977|2073->992|2533->1425|2572->1455|2612->1457|2673->1490|2918->1708|2932->1713|2966->1726|3027->1759|3094->1795|3151->1825|3192->1857|3232->1859|3293->1892|3538->2110|3552->2115|3588->2130|3655->2166|3708->2191|4652->3108|4702->3142|4742->3144|4822->3196|4865->3212|4886->3224|4913->3230|4943->3233|4965->3245|4994->3252|5083->3310|5156->3355|6396->4568|6427->4590|6467->4592|6520->4617|7695->5764|7734->5786|7775->5788|7853->5837|7958->5914|7974->5920|8015->5939|8106->6002|8122->6008|8167->6031|8258->6094|8274->6100|8316->6120|8407->6183|8423->6189|8464->6208|8630->6346|8646->6352|8674->6358|8898->6554|8914->6560|8942->6566|9321->6913|9395->6958|9825->7356|9873->7375|10124->7599|10152->7605|10186->7611
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|99->66|99->66|99->66|100->67|100->67|100->67|100->67|100->67|100->67|100->67|101->68|102->69|127->94|127->94|127->94|128->95|144->111|144->111|144->111|145->112|146->113|146->113|146->113|147->114|147->114|147->114|148->115|148->115|148->115|149->116|149->116|149->116|151->118|151->118|151->118|152->119|152->119|152->119|155->122|156->123|163->130|166->133|172->139|172->139|174->141
                  -- GENERATED --
              */
          