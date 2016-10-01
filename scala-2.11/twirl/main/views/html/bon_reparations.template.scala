
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bon_reparations_Scope0 {
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

     object bon_reparations_Scope1 {
import java.util

class bon_reparations extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[util.List[Reparation],util.List[Camion],util.List[Personnel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(reparations: util.List[Reparation], camions : util.List[Camion], personnels : util.List[Personnel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.102*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="fr">

    """),_display_(/*7.6*/head()),format.raw/*7.12*/("""

    """),format.raw/*9.5*/("""<body>
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

            """),format.raw/*27.13*/("""<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row bg-title">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Bons de reparation</h4>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            """),_display_(/*37.30*/if(flash.containsKey("error"))/*37.60*/ {_display_(Seq[Any](format.raw/*37.62*/("""
                                """),format.raw/*38.33*/("""<div class="alert alert-warning alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*40.38*/flash/*40.43*/.get("error")),format.raw/*40.56*/("""
                                """),format.raw/*41.33*/("""</div>
                            """)))}),format.raw/*42.30*/("""
                            """),_display_(/*43.30*/if(flash.containsKey("success"))/*43.62*/ {_display_(Seq[Any](format.raw/*43.64*/("""
                                """),format.raw/*44.33*/("""<div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                    """),_display_(/*46.38*/flash/*46.43*/.get("success")),format.raw/*46.58*/("""</div>
                            """)))}),format.raw/*47.30*/("""
                        """),format.raw/*48.25*/("""</div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12">
                            <div class="white-box">
                                <h3 class="box-title m-b-0">Ajouter un nouveau bon de réparation</h3>
                                <form class="form-horizontal" method="post" action="/bon-reparations">
                                    <div class="form-group">
                                        <div class="col-md-6">
                                            <select name="camion.id" class="form-control">
                                            """),_display_(/*59.46*/for(camion <- camions) yield /*59.68*/ {_display_(Seq[Any](format.raw/*59.70*/("""
                                                """),format.raw/*60.49*/("""<option value=""""),_display_(/*60.65*/camion/*60.71*/.getId),format.raw/*60.77*/("""">"""),_display_(/*60.80*/camion/*60.86*/.getImmatriculation),format.raw/*60.105*/("""</option>
                                            """)))}),format.raw/*61.46*/("""
                                            """),format.raw/*62.45*/("""</select>
                                        </div>

                                        <div class="col-md-6">
                                            <select name="personnel.id" class="form-control">
                                            """),_display_(/*67.46*/for(personnel <- personnels) yield /*67.74*/ {_display_(Seq[Any](format.raw/*67.76*/("""
                                                """),format.raw/*68.49*/("""<option value=""""),_display_(/*68.65*/personnel/*68.74*/.getId),format.raw/*68.80*/("""">"""),_display_(/*68.83*/personnel/*68.92*/.getNom),format.raw/*68.99*/(""" """),format.raw/*68.100*/("""- """),_display_(/*68.103*/personnel/*68.112*/.getPrenom),format.raw/*68.122*/("""</option>
                                            """)))}),format.raw/*69.46*/("""
                                            """),format.raw/*70.45*/("""</select>
                                        </div>

                                        </div>
                                    <div class="form-group">

                                        <div class="col-md-6">
                                            <input name="reparateur" type="text" class="form-control" placeholder="Réparateur">
                                        </div>

                                        <div class="col-md-6">
                                            <input name="dateBonReparation" type="text"  pattern="[0-9]"""),format.raw/*81.104*/("""{"""),format.raw/*81.105*/("""2"""),format.raw/*81.106*/("""}"""),format.raw/*81.107*/("""-[0-9]"""),format.raw/*81.113*/("""{"""),format.raw/*81.114*/("""2"""),format.raw/*81.115*/("""}"""),format.raw/*81.116*/("""-[0-9]"""),format.raw/*81.122*/("""{"""),format.raw/*81.123*/("""4"""),format.raw/*81.124*/("""}"""),format.raw/*81.125*/(""""  class="form-control" placeholder="Date bon de réparation" required="required">
                                        </div>

                                    </div>

                                    <div class="form-group">
                                        <div class="col-md-12">
                                            <textarea name="motif" class="form-control" rows="5" placeholder="Motif"></textarea>
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

                    """),_display_(/*103.22*/if(reparations.size() > 0)/*103.48*/ {_display_(Seq[Any](format.raw/*103.50*/("""
                        """),format.raw/*104.25*/("""<div class="row">
                            <div class="col-sm-12">
                                <div class="white-box">
                                    <input type="search" class="light-table-filter form-control" data-table="order-table" placeholder="Recherche">
                                    <div class="table-responsive">
                                        <table class="table table-bordered order-table sortable" id="printTable">
                                            <thead>
                                                <tr class="active">
                                                    <th>DATE</th>
                                                    <th>CAMION</th>
                                                    <th>CHAUFFEUR</th>
                                                    <th>RÉPARATEUR</th>
                                                    <th>GÉNÉRER</th>
                                                    <th>IMPRIMER</th>
                                                    <th>MODIF</th>
                                                    <th>ACTIONS</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            """),_display_(/*123.46*/for(reparation <- reparations) yield /*123.76*/ {_display_(Seq[Any](format.raw/*123.78*/("""
                                                """),format.raw/*124.49*/("""<tr class="active">
                                                    <td>"""),_display_(/*125.58*/if(null != reparation.getDateBonReparation)/*125.101*/ {_display_(Seq[Any](format.raw/*125.103*/("""
                                                        """),_display_(/*126.58*/reparation/*126.68*/.getDateBonReparation.format("dd-MM-yyyy")),format.raw/*126.110*/("""
                                                    """)))}),format.raw/*127.54*/("""</td>
                                                    <td>"""),_display_(/*128.58*/reparation/*128.68*/.getCamion.getImmatriculation),format.raw/*128.97*/("""</td>
                                                    <td>"""),_display_(/*129.58*/reparation/*129.68*/.getPersonnel.getNom),format.raw/*129.88*/("""
                                                        """),format.raw/*130.57*/("""- """),_display_(/*130.60*/reparation/*130.70*/.getPersonnel.getPrenom),format.raw/*130.93*/("""</td>
                                                    <td>"""),_display_(/*131.58*/reparation/*131.68*/.getReparateur),format.raw/*131.82*/("""</td>
                                                    <td>
                                                        <a href="/bon-reparations/"""),_display_(/*133.84*/reparation/*133.94*/.getId),format.raw/*133.100*/("""/reference/"""),_display_(/*133.112*/reparation/*133.122*/.getReferenceImpressionBonReparation),format.raw/*133.158*/("""/generate" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Générer"> <i class="fa fa-pencil"></i> </a>
                                                    </td>
                                                    <td>
                                                        <a href="/rapport/download/Bon-Reparation/"""),_display_(/*136.100*/reparation/*136.110*/.getReferenceImpressionBonReparation),format.raw/*136.146*/("""" target="_blank" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Imprimer"> <i class="fa fa-print"></i> </a>
                                                    </td>
                                                    <td>"""),_display_(/*138.58*/reparation/*138.68*/.getMotif),format.raw/*138.77*/("""</td>
                                                    <td>
                                                        <a href="/bon-reparations/"""),_display_(/*140.84*/reparation/*140.94*/.getId),format.raw/*140.100*/("""" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Détail"> <i class="fa fa-pencil"></i> </a>
                                                        <a href="/bon-reparations/"""),_display_(/*141.84*/reparation/*141.94*/.getId),format.raw/*141.100*/("""/delete" data-toggle="tooltip" class="btn btn-info btn-outline" data-original-title="Supprimer" onclick="return window.confirm('Voulez vous supprimez ?');"> <i class="fa fa-remove"></i></a>
                                                    </td>
                                                </tr>
                                            """)))}),format.raw/*144.46*/("""
                                            """),format.raw/*145.45*/("""</tbody>
                                        </table>
                                        <button type="button" class="btn btn-default waves-effect waves-light m-b-5 convert"><i class="fa fa-print"></i> Exporter</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*152.22*/("""




                """),format.raw/*157.17*/("""</div>
                <footer class="footer text-center"> 2016 &copy;
                    Mell Plus Informatique. Designed by <a href="http://www.apkode.net">APKode.net</a> </footer>

            </div>
        </div>

        """),_display_(/*164.10*/foot()),format.raw/*164.16*/("""

    """),format.raw/*166.5*/("""</body>
</html>

"""))
      }
    }
  }

  def render(reparations:util.List[Reparation],camions:util.List[Camion],personnels:util.List[Personnel]): play.twirl.api.HtmlFormat.Appendable = apply(reparations,camions,personnels)

  def f:((util.List[Reparation],util.List[Camion],util.List[Personnel]) => play.twirl.api.HtmlFormat.Appendable) = (reparations,camions,personnels) => apply(reparations,camions,personnels)

  def ref: this.type = this

}


}
}

/**/
object bon_reparations extends bon_reparations_Scope0.bon_reparations_Scope1.bon_reparations
              /*
                  -- GENERATED --
                  DATE: Fri Sep 30 23:29:28 EDT 2016
                  SOURCE: /home/brabo/IdeaProjects/hydrocarbure-transport/app/views/bon_reparations.scala.html
                  HASH: 4647a1e8bb2f26698e6ebd87f1c42ea251d08f46
                  MATRIX: 874->19|1070->119|1098->121|1162->160|1188->166|1220->172|2021->946|2048->952|2090->966|2557->1406|2596->1436|2636->1438|2697->1471|2942->1689|2956->1694|2990->1707|3051->1740|3118->1776|3175->1806|3216->1838|3256->1840|3317->1873|3562->2091|3576->2096|3612->2111|3679->2147|3732->2172|4397->2810|4435->2832|4475->2834|4552->2883|4595->2899|4610->2905|4637->2911|4667->2914|4682->2920|4723->2939|4809->2994|4882->3039|5169->3299|5213->3327|5253->3329|5330->3378|5373->3394|5391->3403|5418->3409|5448->3412|5466->3421|5494->3428|5524->3429|5555->3432|5574->3441|5606->3451|5692->3506|5765->3551|6366->4123|6396->4124|6426->4125|6456->4126|6491->4132|6521->4133|6551->4134|6581->4135|6616->4141|6646->4142|6676->4143|6706->4144|7737->5147|7773->5173|7814->5175|7868->5200|9226->6530|9273->6560|9314->6562|9392->6611|9497->6688|9551->6731|9593->6733|9679->6791|9699->6801|9764->6843|9850->6897|9941->6960|9961->6970|10012->6999|10103->7062|10123->7072|10165->7092|10251->7149|10282->7152|10302->7162|10347->7185|10438->7248|10458->7258|10494->7272|10668->7418|10688->7428|10717->7434|10758->7446|10779->7456|10838->7492|11212->7837|11233->7847|11292->7883|11573->8136|11593->8146|11624->8155|11798->8301|11818->8311|11847->8317|12079->8521|12099->8531|12128->8537|12507->8884|12581->8929|13011->9327|13061->9348|13318->9577|13346->9583|13380->9589
                  LINES: 30->2|35->2|37->4|40->7|40->7|42->9|58->25|58->25|60->27|70->37|70->37|70->37|71->38|73->40|73->40|73->40|74->41|75->42|76->43|76->43|76->43|77->44|79->46|79->46|79->46|80->47|81->48|92->59|92->59|92->59|93->60|93->60|93->60|93->60|93->60|93->60|93->60|94->61|95->62|100->67|100->67|100->67|101->68|101->68|101->68|101->68|101->68|101->68|101->68|101->68|101->68|101->68|101->68|102->69|103->70|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|114->81|136->103|136->103|136->103|137->104|156->123|156->123|156->123|157->124|158->125|158->125|158->125|159->126|159->126|159->126|160->127|161->128|161->128|161->128|162->129|162->129|162->129|163->130|163->130|163->130|163->130|164->131|164->131|164->131|166->133|166->133|166->133|166->133|166->133|166->133|169->136|169->136|169->136|171->138|171->138|171->138|173->140|173->140|173->140|174->141|174->141|174->141|177->144|178->145|185->152|190->157|197->164|197->164|199->166
                  -- GENERATED --
              */
          