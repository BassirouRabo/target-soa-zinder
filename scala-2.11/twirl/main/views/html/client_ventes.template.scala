
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object client_ventes_Scope0 {
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

     object client_ventes_Scope1 {
import java.util

class client_ventes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[ClientVente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(clients: util.List[ClientVente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.35*/("""

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
                            <h4 class="page-title">Nos clients</h4>
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
                                <h3 class="box-title m-b-0">Ajouter un nouveau client</h3>
                                <form class="form-horizontal" method="post" action="/client-ventes">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <input name="nom" type="text" class="form-control" placeholder="Nom ..." required="required">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="telephone" type="tel" class="form-control" placeholder="téléphone ...">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <textarea name="adresse" class="form-control" rows="5" placeholder="Adresse ..."></textarea>
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

                    """),_display_(/*85.22*/if(clients.size() > 0)/*85.44*/ {_display_(Seq[Any](format.raw/*85.46*/("""
                        """),format.raw/*86.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>Nom</th>
                                                    <th>Téléphone</th>
                                                    <th>Adresse</th>
                                                    <th>Factures</th>
                                                    <th>Détail</th>
                                                    <th>Supprimer</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*103.46*/for(client <- clients) yield /*103.68*/ {_display_(Seq[Any](format.raw/*103.70*/("""
                                                """),format.raw/*104.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*105.58*/client/*105.64*/.getNom),format.raw/*105.71*/("""</td>
                                                    <td>"""),_display_(/*106.58*/client/*106.64*/.getTelephone),format.raw/*106.77*/("""</td>
                                                    <td>"""),_display_(/*107.58*/client/*107.64*/.getAdresse),format.raw/*107.75*/("""</td>
                                                    <td>Factures</td>
                                                    <td>
                                                        <a href="/client-ventes/"""),_display_(/*110.82*/client/*110.88*/.getId),format.raw/*110.94*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/client-ventes/"""),_display_(/*113.82*/client/*113.88*/.getId),format.raw/*113.94*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*116.46*/("""
                                            """),format.raw/*117.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*124.22*/("""


                """),format.raw/*127.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>
            </div>
        </div>

            """),_display_(/*133.14*/foot()),format.raw/*133.20*/("""

    """),format.raw/*135.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(clients:util.List[ClientVente]): play.twirl.api.HtmlFormat.Appendable = apply(clients)

  def f:((util.List[ClientVente]) => play.twirl.api.HtmlFormat.Appendable) = (clients) => apply(clients)

  def ref: this.type = this

}


}
}

/**/
object client_ventes extends client_ventes_Scope0.client_ventes_Scope1.client_ventes
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:29 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/client_ventes.scala.html
                  HASH: 2f5cc177c0036fa6bbe44c3e9290de51dd8f93f5
                  MATRIX: 830->19|958->52|986->54|1050->93|1076->99|1114->110|1975->944|2002->950|2045->965|2505->1398|2544->1428|2584->1430|2645->1463|2890->1681|2904->1686|2938->1699|2999->1732|3066->1768|3123->1798|3164->1830|3204->1832|3265->1865|3510->2083|3524->2088|3560->2103|3627->2139|3680->2164|5501->3958|5532->3980|5572->3982|5625->4007|6845->5199|6884->5221|6925->5223|7003->5272|7108->5349|7124->5355|7153->5362|7244->5425|7260->5431|7295->5444|7386->5507|7402->5513|7435->5524|7677->5738|7693->5744|7721->5750|8066->6067|8082->6073|8110->6079|8489->6426|8563->6471|8993->6869|9041->6888|9301->7120|9329->7126|9363->7132
                  LINES: 30->2|35->2|37->4|40->7|40->7|43->10|60->27|60->27|63->30|73->40|73->40|73->40|74->41|76->43|76->43|76->43|77->44|78->45|79->46|79->46|79->46|80->47|82->49|82->49|82->49|83->50|84->51|118->85|118->85|118->85|119->86|136->103|136->103|136->103|137->104|138->105|138->105|138->105|139->106|139->106|139->106|140->107|140->107|140->107|143->110|143->110|143->110|146->113|146->113|146->113|149->116|150->117|157->124|160->127|166->133|166->133|168->135
                  -- GENERATED --
              */
          